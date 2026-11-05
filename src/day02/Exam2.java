package day02;

import java.util.Random;
import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		// 정수 2개와 연산자 1개를 입력받는다. 두 정수의 연산 결과를 출력
		// 2 3 + => 2 + 3 = 5
		// 2 3 - => 2 - 3 = -1
		// 입력 가능한 연산자는 + 1 * / %
		// 이외의 연산자가 오면 계산할 수 없으니 빠져 나감
		// 연산자 입력 => String(equals) char
		
		// 연산자를 받음 
		Scanner scanner = new Scanner(System.in);		
		
//		// 숫자 2개를 랜덤으로 받는다.
//		Random random = new Random();
//		int num1 = random.nextInt(100);
//		int num2 = random.nextInt(100);
//		System.out.println("num1 : " + num1 + ",num2 : "+num2);
		
//		// 띄어 쓰기로 입력 받으면 하나씩 나눠 받을 수 있음
//		System.out.println("두 정수를 띄어쓰기로 입력 > ");
//		int n1 = scanner.nextInt();
//		int n2 = scanner.nextInt();
		
		
		// 숫자 2개를 외부에서 입력받는 경우
		System.out.println("첫번째 정수 > ");		
		int num1 = scanner.nextInt();
		
		//빈칸 에러 방지
		scanner.nextLine();		
		
		System.out.println("두번째 정수 > ");
		int num2 = scanner.nextInt();		
		
		System.out.println("연산자를 입력하세요 (+ - * / %) >");
		char calc = scanner.next().charAt(0);
		
		scanner.close();
		
		// 연산자가 주어진 연산자 안에 있을 경우 연산 출력 
		// 연산자가 없으면 계산 안 됨 출력
		// String "" , char 은 '' 로 구별
		
		String result = "0";
		switch(calc) {
		case '+' :
			result = (num1+num2) + "";
			System.out.println(num1 + " + " + num2 + " = " + result);
			break;
		case '-' :
			result = (num1-num2) + "";
			System.out.println(num1 + " - " + num2 + " = " + result);
			break;
		case '*' :
			result = (num1*num2) + "";
			System.out.println(num1 + " * " + num2 + " = " + result);
			break;
		case '/' :   //0으로 나눌 수 없어야 함
			if(num2==0) {
				System.out.println("0으로 나눌 수 없습니다.");
			}else {
				result = ((double)num1/num2) + "";
				System.out.println(num1 + " / " + num2 + " = " + result);
			}
			break;
		case '%' :   //0으로 나눌 수 없어야 함.
			if(num2==0) {
				System.out.println("0으로 나눌 수 없습니다.");
			}else {			
				result = (num1%num2) + "";
				System.out.println(num1 + " % " + num2 + " = " + result);
			}
			break;
			default :
				System.out.println("해당 연산자는 연산할 수 없습니다.");
			
		}
		
		
		
	}

}
