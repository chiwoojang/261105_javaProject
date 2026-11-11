package day05;

import java.util.Scanner;

public class Exam03T {

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
		//강사 버전
		
		Scanner scan = new Scanner(System.in);
		String[] choice = {"가위","바위","보"};
		
		System.out.println("가위바위보 시작~!!");
		
		while(true) {
			
			int comNum = (int)(Math.random()*3); //0~2까지
			
//		System.out.println(comNum + "/" + choice[comNum]);
			
			System.out.println("가위(0), 바위(1), 보(2), 종료(3) 중 선택 >");
			
			int myNum = scan.nextInt();
//		System.out.println(myNum + "/" + choice[myNum]);
			
			if(myNum==3) {
				System.out.println("종료합니다.");
				break;							
			}
			
			//입력 오류 조건
			if(myNum <0 || myNum >2) {
				System.out.println("입력오류입니다. 다시 선택해주세요.");
//				myNum = scan.nextInt();
				continue;
			}
			
			if(comNum==myNum) {
				System.out.print("com:"+choice[comNum] + "/ user:" + choice[myNum] + "=> ");
				System.out.println("무승부!!");
			}else {
				System.out.print("com:"+choice[comNum] + "/ user:" + choice[myNum] + "=> ");
				if(myNum==0) {
					//가위 보 유저승
					System.out.println(comNum==2?"유저 승":"유저 패");
				}else if(myNum==1) {
					//바위 가위 유저승
					System.out.println(comNum==0?"유저 승":"유저 패");
				}else {
					// myNum==2  바위(1) 유저승
					System.out.println(comNum==1?"유저 승":"유저 패");
				}
			}
		}
		
		
		scan.close();

	}

}
