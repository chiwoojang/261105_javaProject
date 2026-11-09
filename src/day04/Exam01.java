package day04;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		/* --- menu ---
		 * 1. + | 2. - |3. * |4. / |5. % | 6. 종료
		 * 
		 * menu > 1
		 * 두 수를 입력 > 2 3
		 * 결과 => 2 + 3 = 5
		 * 
		 * 종료를 누를때까지 반복
		 * 
		 * 두번째 값이 0인 경우 / % 연산은 연산할 수 없음. (0으로 나눌 수 없습니다.) => 값을 다시 받진 않는 걸로
		 * */
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("메뉴를 입력해 주세요.");
			System.out.println("1. + | 2. - |3. * |4. / |5. % | 6. 종료");
			System.out.print("메뉴 > ");
			int menu = scanner.nextInt();
			scanner.nextLine(); //공백자료 지우기
			
			if(menu==6) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else if(menu <1 || menu >6) {
				System.out.println(" 잘못된 메뉴입니다. 다시 입력해 주세요.");
				continue;
			}
			
			System.out.print("두 정수를 공백구분해 입력해 주세요. > ");
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			scanner.nextLine(); //공백자료 지우기
			
			
			if(num2==0 && (menu==4 || menu==5)) {
				System.out.println("/ % 연산은 0으로 나눌 수 없습니다.");
				continue;
			}
			
			int result=0;
			String strOp="";
			switch(menu) {
			case 1 :
				result = num1 + num2;
				strOp = "+";
				break;
			case 2 :
				result = num1 - num2;
				strOp = "-";
				break;
			case 3 :
				result = num1 * num2;
				strOp = "*";
				break;
			case 4 :
				result = num1 / num2;
				strOp = "/";
				break;
			case 5 :
				result = num1 % num2;
				strOp = "%";
				
				break;
				default :
			}
			System.out.println(num1+strOp+num2+"="+result);
			System.out.println();
			
			
		}
		
		scanner.close();

	}

}
