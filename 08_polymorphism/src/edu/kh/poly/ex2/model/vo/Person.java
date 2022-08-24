package edu.kh.poly.ex2.model.vo;

public class Person extends Animal {

	private String name;
	private int age;
	
	public Person() {} // 미작성시 컴파일러가 자동 추가
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public void breath() {
		System.out.println("코와 입으로 숨을 쉰다.");		
	}
	
}
