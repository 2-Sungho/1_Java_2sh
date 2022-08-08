package edu.kh.op.ex;

import java.util.Scanner;

public class OperatorExample1 {

	public static void main(String[] args) {
		
		// 산술 연산자 : + - * / %(모듈러: 나머지를 구하는 연산자)
		
		System.out.println("두 정수를 입력받아 산술 연산결과 출력하기");
		
		//스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력 1 : ");
		int input1 = sc.nextInt();
		
		System.out.print("정수입력 2 : ");
		int input2 = sc.nextInt();
		
		System.out.println(input1 + "+" + input2 + "=" + (input1+input2));
		
		System.out.printf("%d - %d = %d \n", input1,input2,(input1-input2));
		System.out.printf("%d * %d = %d \n", input1,input2,(input1*input2));
		System.out.printf("%d / %d = %d \n", input1,input2,(input1/input2));
		System.out.printf("%d %% %d = %d \n", input1,input2,(input1%input2));
		
		
		
	}
		
		
}
	
