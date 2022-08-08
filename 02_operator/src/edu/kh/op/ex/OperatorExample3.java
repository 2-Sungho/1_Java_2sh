package edu.kh.op.ex;

public class OperatorExample3 {

	public static void main(String[] args) {
		
		// 비교 연산자 : ==, !=, >, <, >=, <=
		
		// 두 개의 피연산의 크기를 비교하는 연산자
		// 결과는 항상 논리값 (true/false)
		// 복합기호에서 '='는 항상 오른쪽
		
		int a = 10;
		int b = 20;
		
		System.out.println(a==b); // false
		System.out.println(a!=b); // true
		System.out.println(a<b); // true
		System.out.println((a<b) != false); // true
	
		System.out.println("======================");
		
		
		System.out.println(4%2==0); // true
		// 4를 2로 나눴을때 나머지가 0과 같은가?
		
		System.out.println(222%2==0);
		// -> 나머지가(%) 0인 경우 == 나누어 떨어지는경우 == n의배수
		
		System.out.println("463984는 짝수인가? : "+(463984%2==0));
		System.out.println("463984는 짝수인가? : "+(463984%2!=1));
		
		System.out.println("463984는 3의 배수인가? : "+(463984%3==0)); 
				
		
	}

}
