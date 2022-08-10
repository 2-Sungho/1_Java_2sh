package edu.kh.control.loop.practice;

import java.util.Scanner;

public class LoopPractice {

	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요: ");
		int input=sc.nextInt();
		
		if(input<1) {
			System.out.println("1이상의 숫자를 입력해주세요.");
		} else {
			for(int i=1;i<=input;i++) {
				System.out.print(i+" ");
			}
		}	
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요: ");
		int input=sc.nextInt();
		
		if(input<1) {
			System.out.println("1이상의 숫자를 입력해주세요.");
		} else {
			for(int i=input;i>=1;i--) {
				System.out.print(i+" ");
			}
		}
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요: ");
		int input=sc.nextInt();
		
		int sum=0;
		
		for(int i=1;i<=input;i++) {
			System.out.print(i);
			if(i==input) {
				System.out.print("=");
			} else {
				System.out.print("+");
			}
			sum+=i;
		}
		System.out.println(sum);
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int input1=sc.nextInt();
		
		System.out.print("두번째 숫자: ");
		int input2=sc.nextInt();
		
		if(input1<1||input2<1) {
			System.out.println("1이상의 숫자를 입력해주세요.");
		} else if(input1>input2) {
			for(int i=input2;i<=input1;i++) {
				System.out.print(i+" "); 
			}
		} else {
			for(int x=input1;x<=input2;x++) {
				System.out.print(x+" ");
			}
		}
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자: ");
		int dan=sc.nextInt();
		
		for(int i=dan;i<=dan;i++) {
			System.out.println("====="+dan+"단=====");
			for(int x=1;x<=9;x++) {
				System.out.printf("%d * %d = %d \n",dan,x,dan*x);
			}
		}
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자: ");
		int input=sc.nextInt();
		
		if(input<2||input>9) {
			System.out.println("2~9 사이 숫자만 입력해주세요.");
		} else {
			for(int dan=input;dan<=9;dan++) {
				System.out.println("====="+dan+"단=====");
				for(int x=1;x<=9;x++) {
					System.out.printf("%d * %d = %d \n",dan,x,dan*x);
				}
			}
		}
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int input=sc.nextInt();
		
		for(int row=1;row<=input;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int input=sc.nextInt();
		
		for(int row=input;row>=1;row--) {
			for(int col=row;col>=1;col--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int input=sc.nextInt();
		
		for(int row=input;row>=1;row--) {
			for(int col=row;col>=1;col--) {
				System.out.print("1");
			}
			System.out.println();
		}
	
	}
	
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int input=sc.nextInt();
		
		for(int row=1;row<=input;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		input-=1;
		for(int row2=input;row2>=1;row2--) {
			for(int col2=row2;col2>=1;col2--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice11() {
			
	}
	
	public void practice12() {
		
	}
	
	public void practice13() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("자연수 하나를 입력하세요: ");
		int input=sc.nextInt();
		
		int count=0;
		
		for(int i=1;i<=input;i++) {
			if(i%2==0||i%3==0) {
				System.out.print(i+" ");
			}
			if(i%2==0&&i%3==0) {
				System.out.print("");
				count++;
			}
		}
		System.out.println("\ncount: "+count);
	}
	
}
		
