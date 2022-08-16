package edu.kh.oop.basic;

// 클래스 : 객체가 되었을 때 가지고 있을 속성, 기능을 정의한 문서
public class LSH {

	// 객체가 가지고 있는 속성
	String name;
	int age;
	String birthday;
	
	// 캡슐화 예시
	private String password="1234";
	// 해당 클래스 내부에서 접근 가능하다는 뜻 외부에서 사용 불가
	
	// 객체가 가지고 있는 기능
	public void study() {
		System.out.println("공부하기");
	}
	
	public void eat() {
		System.out.println("밥먹기");
	}
	
	public void plus(int num1,int num2) {
		System.out.println("합: "+(num1+num2));
	}
	
	// 같은 프로젝트 내부 누구든,어디서든 접근 가능
	public void showPassword() {
		System.out.println("비밀번호: *** "+password+"***");
	}
}
