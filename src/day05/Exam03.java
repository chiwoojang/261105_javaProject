package day05;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		/* 가위바위보 게임
		 * 컴퓨터와 유저가 가위바위보 게임을 진행
		 * 컴퓨터는 랜덤으로 지정 0 1 2 중 선택
		 * 가위 = 0, 바위=1, 보 =2
		 * 
		 * 유저도 input 0 1 2 중 선택
		 * 
		 * ex) com = 0 / me = 0
		 * com(가위) / me(가위) => 무승부
		 * com=0 / me = 1
		 * com(가위) / me(바위) => me 승리
		 * 
		 * 유저의 입력값 중 0 1 2 외의 다른값이 입력되면 입력오류 => 다시 입력
		 * */
		
		Scanner scanner = new Scanner(System.in);
		String[] strChoice = {"가위","바위","보"};
		
		// 컴퓨터가 랜덤한 숫자를 발생
		int computer = (int)(Math.random()*3);
		
		System.out.println("0: 가위, 1: 바위, 2: 보");
		System.out.println("가위바위 보를 선택하세요 >");
		
		// 내가 가위바위 보를 입력
		int me = scanner.nextInt();
		while(me < 0 || me > 2) {
			System.out.println("입력 오류입니다. 다시 입력해 주세요.");
			me = scanner.nextInt();
		}
		
				
		// 승부 연산 및 출력
		//int[][] result = int[3][3];
		System.out.println("com("+strChoice[computer]+") / me("+strChoice[me]+") => " + "승부결과");
		
		scanner.close();
		
		

	}

}
