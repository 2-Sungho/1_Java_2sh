package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("국어: ");
		int kor=sc.nextInt();
		
		System.out.print("영어: ");
		int eng=sc.nextInt();
		
		System.out.print("수학: ");
		int math=sc.nextInt();
		
		int sum=kor+eng+math;
		System.out.println("합계: "+sum);
		
		double avg=sum/3.0;
		System.out.println("평균: "+avg);
		
		String pass=((kor>=40&&eng>=40&&math>=40)&&avg>=60)?"합격":"불합격";
		System.out.println(pass);
		
		
		

	}

}