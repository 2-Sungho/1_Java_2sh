package edu.kh.oop.basic;

public class BasicRun {

	public static void main(String[] args) {

		LSH 이성호 = new LSH();
		// heap 영역에 LSH 클래스에 정의된 내용을 이용하여
		// LSH 객체를 생성(할당)

		// 객체가 가지고 있는 속성 출력
		System.out.println("이름: "+이성호.name);
		System.out.println("나이: "+이성호.age);
		System.out.println("생일: "+이성호.birthday);
		
//		System.out.println(이성호.password);
		//The field LSH.password is not visible
		
		// 객체가 가지고 있는 기능 수행
		이성호.eat();
		이성호.study();
		이성호.plus(10, 20);
		
		// 비밀번호를 볼 수 있는 기능을 호출==간접 접근 방법
//		이성호.showPassword();
		
	}

}
