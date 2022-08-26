package edu.kh.collection.model.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.event.ListDataEvent;

import edu.kh.collection.model.vo.Student;

public class MapService {
	
	/* Map: Key와 Value 한 쌍이 데이터가 되어 이를 모아둔 객체
	 * 
	 * - Key: Map에 저장된 데이터를 구분하는 용도
	 * -> Set의 특징을 지님(순서X,중복X,equals(),hashCode() 오버라이딩O)
	 * 
	 * - Value: Map에 실제 저장된 값을 의미
	 * -> List의 특징을 지님(중복O)
	 */

	public void ex1() {
		Map<Integer, String> map=new HashMap<Integer,String>();
		
		//map.put(key, value): Map에 추가
		map.put(1, "홍길동");
		map.put(2, "고길동");
		map.put(3, "김길동");
		map.put(4, "이길동");
		map.put(5, "박길동");
		map.put(6, "최길동");
		
		// key 중복 -> 덮어쓰기
		map.put(1, "이성호");
		
		// Value 중복
		map.put(7, "최길동");
		
		System.out.println(map);
	}
	
	public void ex2() {
		
		// Map은 언제 사용하면 좋은가?
		// 1) 재사용이 적은 VO를 대체하는 경우
		// 2) 한번에 다량의 데이터를 전달하는 경우 데이터의 명확한 구분을 위해서 사용
		
		// Student -> Map으로 변경해서 사용
		
		Student std=new Student();
		Map<String,Object> student=new HashMap<String,Object>();
		
		std.setName("홍길동");
		student.put("Name", "홍길동");
		
		std.setAge(15);
		student.put("Age", 15);
		
		std.setAddress("서울");
		student.put("Address", "서울");
		
		std.setGender('M');
		student.put("Gender", 'M');
		
		std.setScore(80);
		student.put("Score", 80);
		
		System.out.println(std);
		System.out.println(student);
		
		// value 각각 얻어와서 출력하기
		// KeySet(): Map에서 key부분만을 추출하여 Set형태로 반환
		
		// for/while/if문 작성 시 {}이 없다면 
		// 다음 한줄(다음 세미콜론까지)에만 영향을 미친다
		for(String key: student.keySet()) System.out.println(student.get(key));
						// Set<String>
	}
	
	public void ex3() {
		Map<String, Set<Integer>> map=new HashMap<>();
		// 타입 추론: 참조변수의 제네릭을 보고 생성되는 컬렉션 객체의 제네릭을 추측함
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("횟수 입력: ");
		int count=sc.nextInt();
		
		for(int i=1;i<=count;i++) {
			//TreeSet을 이용해서 로또 번호 생성
			Set<Integer>lotto=new TreeSet<>();
			
			while(lotto.size()<6) {
				int ran=(int)(Math.random()*45+1);
				lotto.add(ran);
			}
			map.put(i+"회", lotto);
		}
		for(String key:map.keySet()) {
			System.out.println(key+": "+map.get(key));
		}
	}
}
