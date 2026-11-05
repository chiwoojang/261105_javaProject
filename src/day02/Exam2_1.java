package day02;

import java.util.Scanner;

public class Exam2_1 {

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
		
		// 숫자 2개를 외부에서 입력받는 경우
		System.out.println("첫번째 정수 > ");		
		int num1 = scanner.nextInt();
		
		//빈칸 에러 방지
		scanner.nextLine();		
		
		System.out.println("두번째 정수 > ");
		int num2 = scanner.nextInt();		
		
		System.out.println("연산자를 입력하세요 (+ - * / %) >");
		String calc = scanner.next();
		
		scanner.close();
		
		// calc가 String 일 경우는 calc.equals() 함수로 연산자를 평가해야 함
		// String 의 경우 객체이기 때문에 == 연산자 등으로 평가할 수 없음
		if(calc.equals("+")) {
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		} else if(calc.equals("-")) {
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		} else if(calc.equals("*")) {
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		} else if(calc.equals("/")) {
			System.out.println(num1 + " / " + num2 + " = " + ((double)num1 / num2));
		} else if(calc.equals("%")) {
			System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
		} else {
			System.out.println(calc + "는 연산할 수 없는 연산자 입니다.");
		}
		
		//swith 사용
		try {
			int result = 0;
			switch(calc) {
			case "+" :
				result = num1 + num2;
				break;
			case "-" :
				result = num1 - num2;
				break;
			case "*" :
				result = num1 * num2;
				break;
			case "/" :
				result = num1 / num2;
				break;
			case "%" :
				result = num1 % num2;
				break;
				default :
			}
			
			// char 의 경우 calc == '+' 의 형태로 쓸 수 있음, String 의 경우는 String.equals()로 씀
			if(calc.equals("+") || calc.equals("-")|| calc.equals("*")
					|| calc.equals("/")|| calc.equals("%")) {
				System.out.println(num1 + calc + num2 + "=" + result);
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally {
			//System.out.println("");
		}
		
		
	}
}
