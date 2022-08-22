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
	
	
}
