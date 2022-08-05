package edu.kh.variable.ex1;

public class VariableExample3 {

	//main 메서드 : 자바 애플리케이션 실행 시 반드시 필요한 구문
	public static void main(String[] args) {
		
		// ** 변수 명명 규칙 **
		// 1. 대소문자가 구분되며 길이 제한이 없다 (띄어쓰기X)
		// 2. 예약어를 사용하면 안된다
		// 3. 숫자로 시작하면 안 된다
		// 4. 특수문자는 '_' 와 '$'만을 허용한다 (잘 사용하지 않음)
		// - $는 내부클래스 사용 시 자동으로 붙는 기호(직접 사용 X)
		// - _는 상수 단어 구분 외에는 사용하지 않는다
		// 5. 여러 단어 이름은 단어의 첫 글자를 대문자로 한다
		// 단, 첫 시작글자는 소문자, 개발자들 간의 관례
		// 참고 : 변수명은 언어 제한이 없다
		// 코드 공유 시 글자 깨짐이 발생할 수 있어 한글 사용은 권장하지 않는다
		
		// ** 변수는 하나의 데이터만 보관 가능하다
		int iNum = 30;
		System.out.println(iNum);
		iNum = 100;
		System.out.println(iNum);
		
		// 문자열 자료형 String
		// 기본 자료형 X, 참조형
		
		// String의 리터럴 : 문자열
		// String의 리터럴 표기법 : ""
		String str1;
		str1 = "안녕하세요"; // str1 변수의 초기화(최초 값 대입)
		System.out.println(str1);
		
		str1 = "String도 기본 자료형 변수처럼 값을 변경할 수 있습니다";
		System.out.println(str1);
		
		
		// 변수 선언과 동시에 초기화
		String name = "이성호";
		int age = 31;
		char gender = '남';
		
		System.out.println("=====================");
		
		System.out.println(age + 10); // 숫자+숫자= 두 숫자의 합
		System.out.println(name + "입니다"); // 문자열+문자열 = 이어쓰기
		System.out.println(name + age); // 문자열+숫자 = 이어쓰기
		
		System.out.println(age + 10 + name); // 숫자+숫자+문자열 = 숫자합+문자열
		System.out.println(name + age + 10); // 문자열 + 숫자 + 숫자 = 이어쓰기
		// 왼쪽에서 오른쪽으로 순서대로 더하기
		
		//이성호님은 31세 남성입니다.
		System.out.println(name+"님은 "+age+"세 "+gender+"성입니다.");
		
		System.out.println("=====================");
		
		//상수(final) : 항상 같은 수 변하지않는 값
		// java에서는 한번 값을 기록하면 값을 값을 바꿀수 없는 변수

		int num2 = 200;
		num2 = 300; // 새로 대입 가능
		
		//상수(대문자로 표기, 여러 단어면 _로 구분)
		final int CONSTANT_NUMBER = 100000;
		// 마지막으로 값을 대입하는 변수 = 다시는 값을 대입 받지 않겠다
		// = 변하지 않는 수(상수)
		
		//CONSTANT_NUMBER = 10000;
		
		System.out.println(CONSTANT_NUMBER);
		
		// 상수 예제
		final int UP = 10;
		final int DOWN = -10;
		final int INIT = 0;
		
		int num3 = INIT;
		System.out.println(num3); // 0
		
		num3 = num3 + UP;
		System.out.println(num3); // 10
		
		num3 = num3 + DOWN*3;
		System.out.println(num3); // -20
		
		
	}
}
