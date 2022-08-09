package edu.kh.control.condition.practice;

import java.util.Scanner;

public class ConditionPractice {

	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한개 입력하세요: ");
		int input=sc.nextInt();
				
		if(input>0) {
			if(input%2==0) {
				System.out.println("짝수 입니다.");
			} else {
				System.out.println("홀수 입니다.");
			}
		} else {
			System.out.println("양수만 입력해주세요.");
		}
		
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수: ");
		int kor=sc.nextInt();
		System.out.print("수학점수: ");
		int math=sc.nextInt();
		System.out.print("영어점수: ");
		int eng=sc.nextInt();
		
		int sum=kor+math+eng;
		double avg=sum/3.0;
		
		if(kor>=40&&math>=40&&eng>=40&&avg>=60) {
			System.out.println("국어: "+kor);
			System.out.println("수학: "+math);
			System.out.println("영어: "+eng);
			System.out.println("합계: "+sum);
			System.out.println("평균: "+avg);
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격 입니다.");
		}
		
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력: ");
		int month=sc.nextInt();
		
		switch(month) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : 
			System.out.println(month+"월은 31일까지 있습니다."); break;
		case 2 : 
			System.out.println(month+"월은 28일까지 있습니다."); break;
		case 4 : case 6 : case 9 : case 11 : 
			System.out.println(month+"월은 30일까지 있습니다."); break;
		default : System.out.println(month+"월은 잘못 입력된 달입니다.");
		}
		
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해주세요: ");
		double height=sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해주세요: ");
		double weight=sc.nextDouble();
		
		
		double bmi=weight/(height*height);
		
		String result;
		
		if(bmi<18.5) {
			result="저체중";
		} else if(bmi<23) {
			result="정상 체중";
		} else if(bmi<25) {
			result="과체중";
		} else if(bmi<30) {
			result="비만";
		} else {
			result="고도 비만";
		}
				
		System.out.println("BMI 지수: "+bmi);
		System.out.println(result);
		
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수: ");
		double midTest=sc.nextInt(); // int로 입력받아도 대입 연산시 double로 자동형변환
		System.out.print("기말 고사 점수: ");
		double finTest=sc.nextInt();
		System.out.print("과제 점수: ");
		double homework=sc.nextInt();
		System.out.print("출석 횟수: ");
		double attendance=sc.nextInt();
		
		//각각의 점수를 비율에 맞게 변경
		midTest*=0.2;
		finTest*=0.3;
		homework*=0.3;
		//attendance*=5*0.2;
		
		System.out.println("============결과=============");

		
		if(attendance <= 14) {//14번 이하 출석했을 경우
			System.out.println("Fail [출석 횟수 부족 ("+(int)attendance+"/20)]");
		} else {// 출석 만족		
			System.out.printf("중간 고사 점수(20): %.1f \n",midTest);
			System.out.printf("기말 고사 점수(30): %.1f \n",finTest);
			System.out.printf("과제 점수(30): %.1f \n",homework);
			System.out.printf("출석 점수(20): %.1f \n",attendance);
		
		double sum=midTest+finTest+homework+attendance;
		
		System.out.printf("총점: %.1f \n",sum);
		
		if(sum>=70.0) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail [점수 미달]");
		}
	}
	}
	
	public void practice6(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수: ");
		double midTest=sc.nextInt();
		System.out.print("기말 고사 점수: ");
		double finTest=sc.nextInt();
		System.out.print("과제 점수: ");
		double homework=sc.nextInt();
		System.out.print("출석 점수: ");
		double attendance=sc.nextInt();
		
		midTest*=0.2;
		finTest*=0.3;
		homework*=0.3;
		
		System.out.println("=============결과=============");
		
		double sum=midTest+finTest+homework+attendance;
		
		if(attendance<=14) {
			System.out.printf("Fail [출석 횟수 부족(%d/20)]",(int)attendance);
		} else {
			System.out.printf("중간 고사 점수(20): %.1f \n",midTest);
			System.out.printf("기말 고사 점수(30): %.1f \n",finTest);
			System.out.printf("과제 점수(30): %.1f \n",homework);
			System.out.printf("출석 점수(20): %.1f \n",attendance);
			System.out.printf("총점: %.1f \n",sum);
		
		if(sum<70) {
			System.out.println("Fail [점수 미달]");
		} else {
			System.out.println("Pass");
		}
	}
	}
}
