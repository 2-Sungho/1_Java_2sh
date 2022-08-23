package edu.kh.poly.ex1.model.vo;

public class Truck extends Car {

	private double weight; // 적재량
	
	public Truck() {}

	public Truck(int wheel,int seat,String fuel,double weight) {
		super(wheel,seat,fuel);
		this.weight=weight;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return super.toString()+"/적재중량: "+weight;
	}
	
	public void loading() {
		System.out.println("물건을 실을 수 있다.");
	}
}
