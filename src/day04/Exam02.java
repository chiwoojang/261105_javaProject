package day04;

import java.util.Scanner;

public class Exam02 {

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
		Scanner scanner = new Scanner(System.in);
		
		String[] strMenu = {"과자","라면","사탕","젤리"};
		int[] price = {2000,3000,500,500};
		int[] cntBuy = new int[4];
		
		while(true) {
			System.out.println("-- menu --");
			System.out.println("1.과자(2000원) | 2.라면(3000원) | 3.사탕(500원) | 4.젤리(500원) | 5. 종료");
			int menu = scanner.nextInt();
			scanner.nextLine();
			
			if(menu==5) {
				break;
			}else if(menu <1 || menu>4) {
				System.out.println("메뉴에 없습니다. 다시 입력해 주세요");
				continue;
			}else {
				cntBuy[menu-1] += 1;
			}
		}
		
		// 메뉴를 다 고르면 결산자료를 출력함
		// 구매한(cntBuy[i]>0) 인 경우 해당 항목과 중간합계 출력
		// 중간합계 값을 모두 합친 최종결산을 최종적으로 출력함
		System.out.println("결산");
		System.out.println("---------------");
		int total = 0;
		for(int i=0; i< strMenu.length;i++) {
			if(cntBuy[i] >0) {
				int itemTotal = price[i]*cntBuy[i];
//				System.out.println(strMenu[i] + " " + cntBuy[i] + "개   " + itemTotal + "원");
				System.out.printf("%6s %2d개 %6d원\n",strMenu[i],cntBuy[i],itemTotal);
				total += itemTotal;
			}
		}
		System.out.println("--------------");
//		System.out.println("총금액 " + total);
		System.out.printf("%11s%6d원\n","총금액 ",total);
		
		scanner.close();
	}

}
