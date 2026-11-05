package day02;

import java.util.Scanner;


public class Input01 {

	public static void main(String[] args) {
		// input class
		// console input : 콘솔에서 값을 입력받는 것을 의미
		// Scanner 클래스 : 

		
		
		
		//값의 형식 변환을 편리하게 해주는 클래스
		// 클래스는 객체를 생성해야 사용할 수 있다. => new 키워드를 사용
		
		// 기본 자료형 => 타입 변수 = 값;  int num = 1;
		// 클래스 자료형 => 클래스명 객체명 = new 클래스명(값-필수는 아님-);
		
		Scanner scan = new Scanner(System.in);  
		
		// 입력을 받을 때 scan.메서드
		// scan.next() : 한 문자만 입력(한단어) , 공백 미포함 => String
		// scan.nextLine() : 여러 단어를 입력, 공배 포함 => String
		// scan.nextInt() : 정수입력 => int
		// scan.next자료형 : 해당 자료형으로 입력을 받음 => 자료형
		
		System.out.println("이름을 입력해 주세요 > ");
		String name = scan.next();
		System.out.println("이름 : " + name);
		
		// 나머지 데이터를 버리는 작업 (다음 입력에 영향을 받지 않을 목적)
		scan.nextLine();   //저장되는 곳 없어 공중분해-가비지 컬렉터가 해결
		
		System.out.println("점수를 입력해 주세요 >");
		int score = scan.nextInt();
		System.out.println("점수 : " + score);
		
		scan.nextLine();
		
		// 숫자를 하나 입력받아서 짝수인지 홀수인지 출력
		System.out.println("짝수 / 홀수 판별기 숫자 입력해 주세요 > ");
		int number = scan.nextInt();
		System.out.println(number%2==0?"짝수":"홀수");
		
		// char : 아스키 코드의 한글자 입력
		// scan.next().charAt(위치) : 입력받은 단어의 첫글자만 아스키 코드로 변환 => char
		// 항상 모든 시작위치는 0부터
		System.out.println("한글자만 입력하시오 >");
		char ch = scan.next().charAt(0);
		System.out.println("입력받은 글자 > " + ch);
		
		
		scan.close();

	}

}
