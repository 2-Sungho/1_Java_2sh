package edu.kh.inheritance.model.vo;

public class Student extends Person {
	
	// 자식 Student 클래스에
	// 부모 Person 클래스의 멤버(필드,메서드)를 상속
	
	// extends: 자식이 자기의멤버+부모의 멤버를 가지게되어 몸집이 커짐

//	private String name;
//	private int age;
	private int grade;
	private int classRoom;
	
	public Student() {
		// TODO Auto-generated constructor stub
		
		// Person(); 부모생성자 상속X
		
		//super(); // super 생성자
		// 부모의 생성자를 참조하기 위해 사용하는 생성자
		// 자식 생성자 내부 첫번째줄에만 사용가능
		
		// -> 자식 객체 생성 시 내부에 부모 객체를 생성할 때 사용
		// -> 자식 생성자 첫번째줄에 super()생성자 미작성시 컴파일러가 자동추가
	}
	
	public Student(String name,int age,int grade,int classRoom) {
		
		// 상속 받은 자식도 부모의 private 필드 직접접근불가
		// this.name=name;
		// this.age=age;
		
		// 방법1. 부모의 getter/setter 이용
//		super.setName(name);
//		super.setAge(age);
		
		// 방법2. super()생성자 이용
		super(name,age);
		
		this.grade=grade;
		this.classRoom=classRoom;
	}
	
	// alt+shift+s->r
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}
	
	// Person으로부터 상속받은 introduce() 메서드 오버라이딩(재정의)
	@Override
	public void introduce() {
//		System.out.println("이름: "+super.getName());
//		System.out.println("나이: "+super.getAge());
		super.introduce(); // 오버라이딩 되지 않은 부모의 introduce()메서드 호출
		System.out.println("학년: "+this.getGrade());
		System.out.println("반: "+this.getClassRoom());
		
		//오버로딩 : 매개변수 타입, 개수, 순서 1개라도 달라야 한다
		//오버라이딩 : 부모 메서드와 똑같이 작성하는게 보통
	}
	
	/* Annotation(@) : 컴파일러용 주석
	 * -> 컴파일러에게 해당 코드가 무엇을 의미하는지
	 * 아니면 해당 코드를 수행하기 전에 무엇을 해야하는지 등을 알려줌
	 * 
	 * - @Override
	 * 1) 컴파일러에게 해당 메서드는 오버라이딩 되었음을 알려줌
	 * 2) 오버라이딩이 가능한지, 잘못 작성되지 않았는지 검사
	 * */
	
}
