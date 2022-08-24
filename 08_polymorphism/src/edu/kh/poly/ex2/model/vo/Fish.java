package edu.kh.poly.ex2.model.vo;

public class Fish extends Animal {
	// Animal 상속시 오류 발생
	// -> The type Fish must implement(구현) the inherited abstract method Animal.breath()
	
	private int fin; // 지느러미 개수
	
	public Fish() {
		super(); // 자식객체 내부의 부모 부분을 만들 때 부모의 생성자를 참조해서 생성
	}
	
	public int getFin() {
		return fin;
	}

	public void setFin(int fin) {
		this.fin = fin;
	}

	// 상속받은 breath() 메서드 오버라이딩
	@Override
	public void breath() {
		System.out.println("아가미 호흡을 한다.");
	}
	
}
