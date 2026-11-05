package day03;

import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {
		// 구구단을 출력
		/* 2*1 = 2
		 * 2*2 = 4
		 * ....
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		int dan = 2;
		for(int i=1;i<=9;i++) {
			int result = dan * i;
			System.out.println(dan+"*"+i+"="+result);
			//System.out.printf("%4d",result);
		}
		System.out.println();
		System.out.println("---------------------");
		
		// 단을 콘솔에서 입력받아 출력
		// scan 사용
		System.out.println("1~9 안의 단을 입력하세요.");
		dan = scan.nextInt();
		if(dan>=2 && dan <=9) {
			for(int i=1;i<=9;i++) {
				int result = dan * i;
				System.out.println(dan+"*"+i+"="+result);
				//System.out.printf("%4d",result);
			}
			System.out.println();
			System.out.println("---------------------");
		}
		scan.close();
		
		
		int i=1;  //내부 카운터 외부 설정 가능. 단, 초기화 부분 ;은 찍어야 됨
		for(;;) {  // 이런 식으로는 잘 안쓰나 ;; 안의 조건들은 생략이 가능 함.
			if(i<=5) {
				System.out.println(i);
				i++;
				break;
			}
		}
		
//		// 구구단 전체 출력
//		for(int i=2;i<=9;i++) {
//			for(int j=1;j<=9;j++) {
//				int result = i*j;
//				System.out.printf("%4d",result);
//			}
//			System.out.println();
//		}

	}

}
