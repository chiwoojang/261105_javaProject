package day03;

import java.util.Scanner;

public class EXam02 {

	public static void main(String[] args) {
		// 연도를 숫자로 입력받아 어린이(13) , 청소년(19), 성인(나머지) 으로 구분
		// 어린이 5000원, 청소년 7000원, 성인 10000원 입장료 출력
		// ex) 2017 => 9살 어린이 입니다. 입장료는 5000원 입니다.
		// 2026 생년을 기준으로 2026-2017 => 나이
		// 생년의 유효한 값을 1900 ~ 2026 까지만 유효 => 이외는 유효하지 않은 연도로 출력
		// 기준에 넘어간 데이터는 다시 입력하라고 요청함 : 생년이 유효하지 않습니다. 다시 입력해 주세요. (1900~2026) >
		// 1명 기준으로 작성, 만약 가능하면 여러명 반복으로 입력 받아 처리
		
		Scanner scanner = new Scanner(System.in);
		// 생년월일 입력받는다. (유효하지 않으면 다시 입력 요청)
		char chIsStop; // 반복 실행 중지 여부
		do {
		
			System.out.println("태어난 연도를 입력해 주세요. (1900~2026) > ");
			int birthYear;
			while(true) {
				birthYear = scanner.nextInt();
				if(birthYear>=1900 && birthYear <=2026) {
					break;
				}else {
					System.out.println("생년이 유효하지 않습니다. 다시 입력해 주세요. (1900~2006)");
				}
			}
			
			// 어린이, 청소년, 성인 여부 판별하여 요금 설정
			int gijunYear = 2026;
			int age = gijunYear - birthYear;
			//System.out.println("나이" + age); //test
			int fee = age > 19 ? 10000 : age > 13 ? 7000 : 5000;
			String strGeneration = age > 19 ? "성인" : age > 13 ? "청소년" : "어린이";
			
			// 해당 요금 출력
			System.out.println(age +"살 " + strGeneration + "입니다. 입장료는 " + fee + "원 입니다.");
			
			// 계속 진행할 지 여부를 질의
			System.out.println("그만 할까요? 멈추려면 y 또는 Y를 입력하세요. > ");
			chIsStop = scanner.next().charAt(0);
			
		}while(chIsStop != 'y' && chIsStop !='Y');
		
		System.out.println("입장료 설명을 종료합니다.");
		
		scanner.close();

	}

}
