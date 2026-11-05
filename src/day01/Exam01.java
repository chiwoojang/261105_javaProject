package day01;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// %는 나머지를 나타내는 연산자
		// number 의 수가 짝수인지 홀수인지 출력

		Scanner scanner = new Scanner(System.in);
		
		int number = 10;
		
		while(number!=0) {
			
			System.out.print("정수를 입력해 주세요(Exit:0) : ");			
			number = scanner.nextInt();
			
	//		int number = 8;
	//		int residue = 0;
					
			
			String evenOrOdd = (number%2)==0?"짝수":"홀수";
			System.out.println(evenOrOdd);
			
	//		residue = number%2;
	//		System.out.println("나머지 : " + residue);
		
		}
		
		System.out.println("프로그램 종료");
	}

}
