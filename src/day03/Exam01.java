package day03;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// up/down game
		// 1~50까지 중 램덤 수 하나를 컴퓨터가 생성 => user는 모름
		// user가 그 램덤수를 맞추는 게임
		/* 출력예시)
		 * 컴퓨터가 랜덤수를 생성했습니다.  (38 가정)
		 * 입력 > 30 => UP
		 * 입력 > 40 => DOWN
		 * 입력 > 38 => 정답!!(3회) => 종료
		 * 
		 * 랜덤수 > 유저수 UP!!
		 * 랜덤수 < 유저수 DOWN!!
		 * 랜덤수 == 유저수 정답!!
		 * 
		 * 
		 * */
		
		//사용자 입력 (콘솔입력)
		Scanner scan = new Scanner(System.in);
		
		//랜덤 수 1개를 받는다.
		int ran = (int)(Math.random()*50) + 1;		
		// System.out.println(ran);  //테스트 시 찍어 봄
		System.out.println("컴퓨터가 랜덤수를 생성했습니다.(1~50)");
		
		//필요한 변수 선언
		int cntTry = 0;  // 몇 횟에 맞추었는 지 카운팅
		boolean isRight = false;  //맞췄는지 파악
		
		do {
			
			cntTry++;
			
			System.out.println("입력 > ");
			int userNum = scan.nextInt();
			if(userNum==ran) {
				System.out.println("정답!!(" + cntTry + "회)");
				isRight = true;
			}else {
//				if(expect < ran) {
//					System.out.println("UP!!");  // 랜덤수가 유저입력값보다 크면 UP
//				}else { 
//					System.out.println("DOWN!!"); // 랜덤수가 유저입력값보다 작으면 DOWN
//				}	
				System.out.println(userNum < ran ? "UP!!" : "DOWN!!");
				
			}
			
		}while(!isRight);
		System.out.println("게임을 종료합니다.");		
		
		scan.close();
		
		
		// 몇개의 함정수를 받고, 해당 함정수를 고르면 폭발하는 식의 게임에 응용 가능 
		// 러시안룰렛, 악어게임 등
		

	}

}
