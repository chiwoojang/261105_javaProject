package day03;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		// 반복문
		/* do{실행문;}while(조건식);
		 * 실행문을 먼저 실행하고, 조건식을 나중에 비교하는 구문
		 * for, while : 조건식이 맞지 않으면 한번도 실행을 못할 수 있음.
		 * do ~ while : 반드시 1번은 실행
		 * 
		 * 메뉴를 만들 때 많이 씀
		 * */
		int i = 1;
		do {
			System.out.println("실행문 실행!!");
			i++;
		}while(i<=5);

		// 한글자를 입력받아 출력 입력형식 : char
		// y를 입력하면 종료
		Scanner scan = new Scanner(System.in);
		char c = ' ';  //char c; 로 선언만 해도 됨. 나중에 넣을 거니까. 일반적으로는 선언만 함(연산에 사용하지 않을 경우).
		do {
			System.out.println("문자를 입력해 주세요 (y는 종료) > ");
			c = scan.next().charAt(0);
			scan.nextLine();  // 빈칸에 의한 반복실행 제거
			System.out.println(c);
		}while(c != 'y' && c != 'Y');
		System.out.println("입력 종료");
		
		scan.close();
	}

}
