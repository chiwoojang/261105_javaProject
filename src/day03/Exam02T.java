package day03;

import java.util.Scanner;
import java.util.function.IntToDoubleFunction;

public class Exam02T {

	//강사버전
	public static void main(String[] args) {
		// 연도를 숫자로 입력받아 어린이(13) , 청소년(19), 성인(나머지) 으로 구분
		// 어린이 5000원, 청소년 7000원, 성인 10000원 입장료 출력
		// ex) 2017 => 9살 어린이 입니다. 입장료는 5000원 입니다.
		// 2026 생년을 기준으로 2026-2017 => 나이
		// 생년의 유효한 값을 1900 ~ 2026 까지만 유효 => 이외는 유효하지 않은 연도로 출력
		// 기준에 넘어간 데이터는 다시 입력하라고 요청함 : 생년이 유효하지 않습니다. 다시 입력해 주세요. (1900~2026) >
		// 1명 기준으로 작성, 만약 가능하면 여러명 반복으로 입력 받아 처리
		
		// 한 가족(5명)의 입장료
		// 반복적인 생년을 입력받고 싶음. => 종료 키워드 => 종료 키워드 0
		// 반복이 종료되면 최종결제금액을 제시

		//Scanner
		Scanner scan = new Scanner(System.in);
		
		
		int totalFee = 0;
		int cntChild = 0;
		int cntTeen = 0;
		int cntAdult = 0;
		int[] fee = {5000,7000,10000};  // 요금 : 아이, 청소년, 어른
		int[] cntGen = {0,0,0};         // 입장객 수 : 아이, 청소년, 어른
		
		do {
			System.out.println("생년을 입력하시오.(0 종료)> ");
			int year = scan.nextInt();
			//System.out.println(year);
			int today = 2026;
			
			while(year!=0 && (year < 1900 || year > today)) {
				System.out.println("유효하지 않은 연도입니다.");
				System.out.println("다시 입력해 주세요. > ");
				year = scan.nextInt();
			}
			
			// year가 0이면 현재 반복문을 나간다.
			if(year==0) {
				break;
			}
			
			int age = today - year;
			//System.out.println(age);
			
			if(age <= 13) {
				System.out.println(age+"세 어린이입니다. 입장료는 " + fee[0] + "원 입니다.");
				totalFee += fee[0];
				//cntChild += 1;
				cntGen[0] += 1;
			}else if(age <= 19) {
				System.out.println(age+"세 청소년입니다. 입장료는 " + fee[1] + "원 입니다.");
				totalFee += fee[1];
				//cntTeen += 1;
				cntGen[1] += 1;
			}else {
				System.out.println(age+"세 성인입니다. 입장료는 " + fee[2] + "원입니다.");
				totalFee += fee[2];
				//cntAdult += 1;
				cntGen[2] +=1;
			}
			
			//System.out.println("현재 요금 > " + totalFee);
		}while(true);
		
//		System.out.println("성인:"+cntAdult+"명, 청소년:"+cntTeen+"명, 어린이:"+cntChild+"명으로 "
//				+ "전체 요금은 " + totalFee + "원 입니다.");
		System.out.println("성인:"+cntGen[2]+"명, 청소년:"+cntGen[1]+"명, 어린이:"+cntGen[0]+"명으로 "
				+ "전체 요금은 " + totalFee + "원 입니다.");
		scan.close();
	}

}
