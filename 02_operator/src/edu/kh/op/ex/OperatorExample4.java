package edu.kh.op.ex;

public class OperatorExample4 {

	public static void main(String[] args) {
		
		// 논리 연산자 : &&(AND), ||(OR)
		
		// &&(AND) : 둘 다 true 이면 true, 나머진 false
		// ~와, 그리고(~이고), ~이면서, ~부터~까지, ~사이
		
		int a = 101;
		// a는 100이상 이면서 짝수인가? 
		boolean result1 = a>=100; // a는 100이상 ? true
		boolean result2 = a%2==0; // a는 짝수 ? false
		
		System.out.println("a는 100이상이면서 짝수인가?: "+(result1&&result2));
		
		int b = 5;
		//b는 1부터 10 사이의 정수인가?
		boolean result3 = b>=1 && b<=10;
		boolean result4 = b%1==0;
		
		System.out.println("b는 1부터 10사이의 정수인가?: "+(result3&&result4));
		
		// ||(OR) : 둘 다 false 이면 false, 나머진 true
		// 또는, ~거나, ~이거나
		
		int c = 10;
		//c는 홀수이거나 10을 초과한 수인가?
		
		System.out.print("C는 홀수 이거나 10을 초과한 수인가: ");
		System.out.println((c%2==1) || (c>10));
		
		int d = 20;
		//d는 1부터 100사이 숫자 또는 음수인가?
		
		boolean result5 = (d>=1&&d<=100)||d<0;
		System.out.println(result5); // true
	
		System.out.println("==================");
		
		// 논리 부정 연산자 : !(NOT)
		// 논리 값을 반대로 바꾸는 연산자
		System.out.println("!result5: "+!result5); // true->false
		
		int e = 3;
		boolean result6 = e>=1&&e<5; // e는 1이상 5미만
		boolean result7 = e<1||e>=5; //e는 1미만 5이상
		
		System.out.println(!result6==result7);
		
		
		
	}

}
