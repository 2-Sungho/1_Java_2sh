package edu.kh.variable.ex1;

public class VariableExample5 {

	public static void main(String[] args) {
		
		// crtl + alt + 방향키 
		
		/* 출력 메서드
		 * 
		 * system.out.print("내용")
		 * -> ()안의 내용 출력 (줄바꿈X)
		 * 
		 * system.out.println("내용")
		 * -> ()안의 내용 출력 (줄바꿈O)
		 * 
		 * system.out.printf("내용+패턴", 패턴에 들어갈 값)
		 * 
		 * */
		
		System.out.print("aaaaa");
		System.out.print("bbbbb");
		System.out.println("ccccc");
		System.out.println("ddddd");
		
		String name = "이성호";
		int age = 31;
		char gender = '남';
		double height = 170.0;
		boolean tf = true;
		// 이성호님은 31세 남성 , 키는 170.0cm 입니다 (true)
		System.out.println(name+"님은 "+age+"세 "+gender+"성 , "
				+ "키는"+height+"cm 입니다 ("+true+")");
		
		System.out.printf("%s님은 %d세 %c성 , 키는 %.1f입니다 (%b)\n"
				,name, age,gender, height, tf);
		// \n : 줄바꿈(개행)을 나타내는 탈출(escape)문자
		
		System.out.println("줄이 바뀌었나요?");
	}

}
