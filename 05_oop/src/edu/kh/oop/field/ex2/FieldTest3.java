package edu.kh.oop.field.ex2;

import edu.kh.oop.field.ex1.FieldTest;

public class FieldTest3 extends FieldTest {
// [접근제한자] [예약어] class 클래스명 [상속관계]
	public void ex() {
		
		FieldTest f=new FieldTest();
		
		System.out.println("다른 패키지");
		
		System.out.println(f.v1); // public
		
//		System.out.println(f.v2); // protected 
		// -> 다른 패키지, 상속X 
		
		System.out.println(v2);
		// 상속관계에서는 protected 직접 접근 가능
		
//		System.out.println(f.v3); // (default)
		// -> 다른 패키지
		
	}
}
