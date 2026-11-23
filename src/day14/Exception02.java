package day14;

import java.util.Scanner;

public class Exception02 {

	public static void main(String[] args) {
		// 자주 발생하는 런타임 예외들
		/* - ArithmaticException : by Zero : 0 으로 나누었을 때 발생
		 * - ArrayIndexOutOfBoundsException:  Index 5 out of bounds
		 * - NullPointerException : 객체의 값이 null일 때 발생
		 * - ClassCaseException : 다운 캐스팅이 잘못되었을 경우
		 * - InputMismatchException : 입력값이 맞지 않을 경우 => 콘솔 입력 시 발생 (화면이 생기면 있기 어렵다.)
		 * */
		
		int arr[] = new int[5];
//		System.out.println(arr[5]);  //ArrayIndexOutOfBoundsException:  Index 5 out of bounds
		
		int arr2[] = null;
//		System.out.println(arr2[0]);  // NullPointerException: Cannot load from int array
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 입력 >");
		try {			
			int num = scan.nextInt();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("입력값이 잘못되었습니다.");
//			System.out.println(e.getMessage());
		}
		
		scan.close();
		

	}

}
