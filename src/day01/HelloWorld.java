package day01;

public class HelloWorld {

	public static void main(String[] args) {
		// 메서드 (method) == 함수 (function)
		// 실행을 담당 (콘솔 실행)
		// 주석 : 실행과 상관없는 영역
		/* 여러줄 주석을 쓸 수 있음
		 * 주석 : ctrl + / => 한 번 더 누르면 풀림
		 * 
		 * java 
		 * package=> class => method   (class 밖에 method 존재 못함 / 파이썬,javascript는 다름)
		 * 
		 * main : 실행을 담당
		 * println() : 괄호 안의 값을 콘솔 출력 (줄바꿈 자동 포함)
		 * print() : 괄호 안의 값을 콘솔 출력 (줄바꿈 X)
		 * 
		 * 마지막 끝처리 => ;
		 * 문자 : String 클래스를 사용
		 * */
		System.out.println(123+456);
		
		/* 숫자 : +, - (부호), 사칙연산
		 * 문자열 : " 문자는 모두 큰 따옴표로 묶는다 "
		 * 한굴자의 문자 : 'a' 작음 따옴표로 묶는다.
		 * 문자열, 한글자의 문자
		 * */
		System.out.println("Hello World");
		System.out.println('a');
		
		int number = 10, multiple=2;
		System.out.println(number*multiple);
		
		number = 30;
		System.out.println(number);
		
		String str = "abc";
		System.out.println(str);
		
		//-------------------------------
		
		byte b = 20;
		short s = 100;
		long l = 100L;    //접미사(선택) l//L  (소문자는 인식문제로 잘 안씀)
		float f = 1.1f;  //접미사(필수) f/F 써줌. 띄어쓰기 없음
		double d = 1.1;
		char c = 'a';   //"" 는 String으로 인식해 Error 발생
		
		
		
		
		
		
	}

}


