package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("정수입력: ");
		int input1=sc.nextInt();
		
		String result = (input1==0)?"0":(input1>0?"양수":"음수");
		//String result=input1>0?"양수입니다.":"음수입니다.";
		
		System.out.println(result+" 입니다.");
		
		
	}

}
