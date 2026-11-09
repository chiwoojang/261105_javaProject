package day04;

import java.util.Scanner;

public class Exam02T {

	public static void main(String[] args) {
		/*-- menu --
		 * 1.과자(2000원) | 2.라면(3000원) | 3.사탕(500원) | 4.젤리(500원) | 5. 종료
		 * 
		 * menu > 1
		 * 과자 1개를 선택했습니다. 2000원 (출력)
		 * menu > 2
		 * 라면 1개를 선택했습니다. 3000원
		 * menu > 5
		 * 
		 * 과자 2개  4000원
		 * 라면 1개  3000원
		 * ----------
		 * 총금액 7000원
		 * 
		 * 종료를 누를때까지 반복
		 * 
		 * 1~5를 벗어난 메뉴는 다신 입력
		 * */
		
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		int count1 = 0; //1번 메뉴의 개수
		int count2 = 0; //1번 메뉴의 개수
		int count3 = 0; //1번 메뉴의 개수
		int count4 = 0; //1번 메뉴의 개수
		int sum = 0;
		
		do {
			System.out.println("--menu--");
			System.out.println("1.과자(2000원) | 2.라면(3000원) | 3.사탕(500원) | 4.젤리(500원) | 5. 종료");
			System.out.println("menu >> ");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1: 
				System.out.println("과자 1개 선택 (2000원)");
				count1++;
				break;
			case 2: 
				System.out.println("라면 1개 선택 (3000원)");
				count2++;
				break;
			case 3: 
				System.out.println("사탕 1개 선택 (500원)");
				count3++;
				break;
			case 4: 
				System.out.println("젤리 1개 선택 (500원)");
				count4++;
				break;
			case 5: System.out.println("종료합니다.");break;
			default:System.out.println("잘못된 메뉴!!");
			}
			
		}while(menu !=5);

		sum = (count1*2000) + (count2*3000) + (count3*500) + (count4*500);
		System.out.println("총 금액 : ");
		System.out.println("과자 (2000원) * "+count1+"="+(count1*2000));
		System.out.println("라면 (2000원) * "+count1+"="+(count2*3000));
		System.out.println("사탕 (2000원) * "+count1+"="+(count3*500));
		System.out.println("젤리 (2000원) * "+count1+"="+(count4*500));
		System.out.println("-------------------------------");
		System.out.println("총금액               :  "+sum);
	}

}
