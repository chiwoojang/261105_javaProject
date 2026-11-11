package day06;

import java.util.Arrays;
import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// 야구게임
		/* 컴퓨터가 랜덤으로 3자리의 숫자를 생성
		 * 각 자리의 숫자는 0~9 까지 중 랜덤숫자 => 중복 불가능
		 * 배열로 저장
		 * 
		 * 유저는 3자리를 맞추는 게임
		 * 위치와 숫자가 맞으면 strike
		 * 숫자만 맞으면 ball  (위치는 맞지 않을 때)
		 * 자리도 숫자도 없으면 out
		 * 
		 *  ex) com : 1 2 3
		 *  user : 1 9 8  => 1s
		 *  user : 2 3 8  => 2b
		 *  user : 1 3 2  => 1s 2b
		 *  user : 1 2 5  => 2s
		 *  user : 1 2 3  => 정답!! break;
		 *  user : 7 8 9  => out!!
		 * */
		int comNum[] = new int[3];
		int userNum[] = new int[3];
		
		
		Scanner scan = new Scanner(System.in);
		
		// comNum 3개를 생성함
		int comChoice[] = new int[10];
		int cntCom = 0;
		while(cntCom < 3) {
			// 임의의 숫자 1개르 받는다.
			int rnd = (int)(Math.random()*10);
			if(comChoice[rnd]==0) {
				comChoice[rnd]=1;
				comNum[cntCom]=rnd;
				cntCom++;
			}
		}
//		System.out.print("com : ");
//		System.out.println(Arrays.toString(comNum));
		
		int round = 0;
		while(true) {			
			// 유저에게 3개의 숫자를 받아 userNum 배열을 완성
			round++;
			System.out.println("0~9 숫자 3개를 중복없이 입력해 주세요");
			
			//정상입력이 아니면 정상입력 받을 때까지 반복
			while(true) {				
				for(int i=0;i<userNum.length;i++) {
					userNum[i] = scan.nextInt();
				}
				
				//0~9 숫자를 중복없이 넣어야 함. 아니면 다시 숫자입력 받음.
				boolean isValid = true;
				a: for(int i=0;i<userNum.length-1;i++) {
					for(int j=i+1;j<userNum.length;j++) {
						if(userNum[i]==userNum[j]) {
							isValid = false;
							System.out.println("같은 값을 입력하셨습니다. 다시입력하세요.");
							break a;
						}else if((userNum[i]<0 || userNum[j]<0)||(userNum[i]>9||userNum[j]>9)) {
							isValid = false;
							System.out.println("0~9 범위를 벗어난 수입니다. 다시입력하세요.");
							break a;
						}
					}
				}
				if(isValid) {
					break;
				}
			}
//			System.out.print("me : ");
//			System.out.println(Arrays.toString(userNum));
			
			// 2중 for문을 통해 값이 같은지 확인 후 위치도 같은 지 확인해 ball, strike 개수 확인
			int strike = 0;
			int ball = 0;
			
			for(int i=0;i<userNum.length;i++) {
				for(int j=0;j<comNum.length;j++) {
					if(userNum[i]==comNum[j]) { // 값이 같다면
						if(i==j) { // 위치까지 같다면  strike 증가
							strike++;
						}else { // 위치는 다르다면 ball 증가
							ball++;
						}					
					}
				}
			}
			
			// strike==3 일 경우 게임 종료
			// strike==0 && ball==0 일 경우 out 출력하고 다시 입력
			// 이외에는 *s *b 로 표시
			if(strike==3) {
				System.out.println("정답 !! 게임 종료 ("+round+"회)");
				break;
			}else if(strike==0 && ball==0) {
				System.out.println("out!!");
			}else {
				String strResult = strike > 0? strike+"s":"";
				strResult += ball > 0?" " +ball+"b":"";
				System.out.println(strResult);
			}			
		}
		
		
		
		scan.close();

	}

}
