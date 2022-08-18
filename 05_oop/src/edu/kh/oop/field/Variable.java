package edu.kh.oop.field;

public class Variable {

	/* 지역 변수 : 필드를 제외하고, {} 내에서 선언된 변수
	 * 해당 {}내에서만 사용가능하고, {}종료 시 사용 불가
	 * 
	 * public void ex(){
	 * int num; // ex()메서드의 지역변수
	 * 
	 * for(int i=0;i<10;i++){
	 * 초기식 i는 for문의 지역 변수
	 * num;// 사용가능
	 * 	} 
	 *  i; // for문 밖의 변수 -> 에러
	 * }
	 * num; // ex()의 밖의 변수 -> 에러
	 */ 
	
	/* 필드(field)==멤버 변수(Member Variable) !=전역 변수
	 * 1. 인스턴스 변수 : static이 없는 변수, 인스턴스 생성 시 heap영역에 생성되는 변수
	 * 2. 클래스(static) 변수 : static이 있는 변수
	 *                        프로그램 실행 시 static영역에 생성될 때
	 *                        클래스.변수명으로 생성되는 변수
	 * */
}
