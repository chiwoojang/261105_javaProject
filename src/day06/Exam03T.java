package day06;

import java.util.Arrays;
import java.util.Scanner;

public class Exam03T {

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
		//강사 버전
		
		int comNum[] = new int[3];
		int userNum[] = new int[3];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<comNum.length;i++) {
			comNum[i] = (int)(Math.random()*10);
			for(int j=0;j<i;j++) {
				if(comNum[i]==comNum[j]) {
					//중복 발생
					//변수 = 값 (저장)  / 0
					i--;  // i위치의 값 재생성  (다른 값이 나올 때 까지 반복 됨)
				}
			}
		}
//		System.out.println(Arrays.toString(comNum));
		
//		// Shuffle 방식 이용
//		int random[] = new int[10];
//		for(int i=0;i<random.length;i++) {
//			random[i] = i;
//		}
//		for(int i=0;i<random.length;i++) {
//			int r = (int)(Math.random()*10);
//			//교환
//			int t = random[i];
//			random[i] = random[r];
//			random[r] = t;
//		}
//		
//		System.arraycopy(random, 0, comNum, 0, 3);
//		System.out.println(Arrays.toString(comNum));
		
		// userNum 한 번에 받기 123 => 1 2 3
		// String으로 받아서 split "" => 한글자씩 잘라 배열로 리턴 (Integer.parseInt())
		while(true) {
			//userNum 입력
			System.out.println("숫자 입력(중복숫잩, 세자리만.)>");
			String myNum = scan.next();
			
			// 입력값에 대한 제한은 여기서...
			
			//한글자씩 나누어 배열에 저장
			String myArray[] = myNum.split("");
			for(int i=0;i < myArray.length;i++) {
				userNum[i] = Integer.parseInt(myArray[i]);
			}
			System.out.println(Arrays.toString(myArray));
			
			// 비교
			int stk = 0;
			int ball = 0;
			for(int i=0;i<comNum.length;i++) {
				for(int j=0;j<userNum.length;j++) {
					if(comNum[i]==userNum[j] && i==j) {
						//값이 같고, 위치도 같다면...
						stk++;
					}else if(comNum[i]==userNum[j] && i!=j) {
						ball++;
					}
				}
			}
			
			//출력
			if(stk==0 && ball==0) {
				System.out.println(" => out!!");
			}else {
				System.out.println(" => "+stk+"s "+ball+"b");
			}
			
			if(stk ==3) {
				System.out.println("정답!!");
				break;
			}
			
		}
		
		scan.close();

	}

}
