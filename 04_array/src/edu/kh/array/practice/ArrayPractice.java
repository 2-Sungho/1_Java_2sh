package edu.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {
		
		int[] arr=new int[9];
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			arr[i]+=i+1;
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				sum+=arr[i];
			}
		}
		System.out.println("\n짝수 번째 인덱스 합: "+sum);
	}
	
	public void practice2() {
		
		int[] arr=new int[9];
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=arr.length-i;
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<arr.length;i++) {
			if(i%2==1) {
				sum+=arr[i];
			}
		}
		System.out.println("\n홀수 번째 인덱스 합: "+sum);
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수: ");
		int input=sc.nextInt();
		
		int[] arr=new int[input];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
			System.out.print(arr[i]+" ");
		}
	}
	
	public void practice4() { // ??
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr=new int[5];
		boolean flag=true;
		
		for(int i=0;i<arr.length;i++) {
			System.out.printf("입력 %d: ",i);
			arr[i]=sc.nextInt();
			}
		
		System.out.print("검색할 값: ");
		int input=sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			if(input==arr[i]) {
				System.out.println("인덱스: "+i);
			} else {
				System.out.println("일치하는 값이 없습니다.");
				flag=false;
				break;
			}
		}
	
	}
	
	public void practice5() { // ??
		
		Scanner sc = new Scanner(System.in);
		
	
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수: ");
		int input=sc.nextInt();
		
		int sum=0;
		
		int[] arr=new int[input];
		for(int i=0;i<arr.length;i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값: ",i);
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			sum+=arr[i];
		}
		System.out.println("\n총 합: "+sum);
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		String str=sc.nextLine();
		
		char[] num=str.toCharArray();
		
		for(int i=0;i<8;i++) {
			System.out.print(num[i]);
			}
		for(int i=8;i<num.length;i++) {
			num[i]='*';
			System.out.print(num[i]);
		}
	}
	
	public void practice8() { // ??
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("정수: ");
			int input=sc.nextInt();
					
			if(input%2==0||input<3) {
				System.out.print("다시 입력하세요.\n");
			} else {
				int[] arr=new int[input];
			}
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		int[] arr=new int[10];
		
		System.out.print("발생한 난수: ");
		
		for(int i=0;i<arr.length;i++) {
			int ran=(int)(Math.random()*10+1);
			arr[i]=ran;
			System.out.print(ran+" ");
		}
	}
	public void practice10() { // ??
		Scanner sc = new Scanner(System.in);
		
		int[] arr=new int[10];
		
		System.out.print("발생한 난수: ");
		
		for(int i=0;i<arr.length;i++) {
			int ran=(int)(Math.random()*10+1);
			arr[i]=ran;
			System.out.print(ran+" ");
		}
		
		int max=arr[0];
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("\n최대값: "+max);
		System.out.println("최소값: "+min);
	}
	
	public void practice11() { // ??
		int[] arr=new int[10];
		
		for(int i=0;i<arr.length;i++) {
			int ran=(int)(Math.random()*10+1);
			arr[i]=ran;
			for(int x=0;x<arr.length;x++) {
				if(arr[i]==ran)
				i--;
				break;
			}
			System.out.print(arr[i]+" ");
		}
	}
	
	public void practice12() {
		
		int[] lotto=new int[6];
		
		for(int i=0;i<lotto.length;i++) {
			int ran=(int)(Math.random()*45+1);
			lotto[i]=ran;
			
			for(int x=0;x<i;x++) {
				if(lotto[x]==ran) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
		
	}
	
	public void practice14() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요: ");
		int size=sc.nextInt();
		sc.nextLine();
		
		String[] arr=new String[size];
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(i+1+"번째 문자열: ");
			arr[i]=sc.nextLine();
		}
		System.out.println("더 값을 입력하시겠습니까?(Y/N)");
		String yn=sc.next();
		if(yn.equals("Y")) {
			System.out.print("더 입력하고 싶은 개수: ");
			int input=sc.nextInt();
			for(int i=0;i<input;i++) {
				System.out.print(i+1+size+"번째 문자열: ");
				arr[i]=sc.nextLine();
			} 
		}
		
	}
	
	public void practice15() {
		int[][] arr=new int[3][3];
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				System.out.printf("(%d,%d) ",row,col);
			}
			System.out.println();
		}
	}
	
	public void practice16() {
		
		int[][] arr= {{1,2,3,4},{5,6,7,8,},{9,10,11,12},{13,14,15,16}}; // 선언모르겟다
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				System.out.printf("%3d",arr[row][col]);
			}
			System.out.println();
		}
	}
	
	public void practice17() {
		
	}
	
	public void practice18() {
		int[][] arr=new int[4][4];
		
		for(int row=0;row<arr.length-1;row++) {
			for(int col=0;col<arr[row].length-1;col++) {
				int ran=(int)(Math.random()*10+1);
				arr[row][col]=ran; // 난수 대입
				arr[row][arr[row].length-1] += ran; // 각 행의 마지막 열
				arr[arr.length-1][col] += ran; // 각 열의 마지막 행
				arr[arr.length-1][arr[row].length-1] += ran; // 마지막 행,열
			}
		}
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				System.out.printf("%3d",arr[row][col]);
			}
			System.out.println();
		}
		
	}
}
