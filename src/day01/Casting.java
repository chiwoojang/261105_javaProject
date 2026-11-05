package day01;

public class Casting {

	public static void main(String[] args) {
		// casting : 자료의 형태 변환
		// a = b;  두 변수의 자료형이 맞지 않으면 오류
		// 자동 자료형 변환 : auto casting
		// byte < short < int < long
		// float < double
		// 명시적 자료형 변환  :  변수값 앞에 (타입)변수
		
		byte b = 11;
		int a = b;  // auto casting
		int aa = 200;
		byte c = (byte)aa;  //명시적 casting 요구  (큰 사이즈는 작은 사이즈에 auto casting 불가)
		
		System.out.println(c);
		
		long l = a;
		
		double d = 3.14159;
		int pi = (int)d;
		
		System.out.println(d);
		System.out.println(pi);   //소수점 버림
		
		int number = 100;
		double num = number;
		System.out.println(num);  // .0가 생김
		
		
		//----------------------
		
		// 문자를 숫자로 : String -> int 
		// "123" => 123
		String str = "123";
		System.out.println(str + 10);
		
		// 기본 8 자료형 클래스 타입의 타입이 존재
		// 추가 기능 제공 (래퍼 클래스 : Wrapper class)
		// int -> Integer / long -> Long / char -> Character / 이외는 첫글자만 대문자
		// float -> Float / double -> Double / boolean -> Boolean 
		// byte -> Byte / short -> Short
		// 형태를 바꿔주는 것을 parsing 이라 하고, 이 기능 수행하는 도구를 parser 라 함
		
		int strNumber = Integer.parseInt(str);
		System.out.println(strNumber + 10);
		

	}

}
