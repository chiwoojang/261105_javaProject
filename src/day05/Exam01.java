package day05;

import java.util.Scanner;

public class Exam01 {

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
		 * 
		 * 각 배열의 같은 번지는 같은 값
		 * */
		
		Scanner scan = new Scanner(System.in);		
		
		String strMenu[] = {"과자","라면","사탕","젤리"};
		int price[] = {2000,3000,500,500};
		int count[] = new int[strMenu.length];
		int menu = 0;
		
		//System.out.println(menu[0]+"("+price[0]+"원)");
		
		do {
			System.out.println("--menu--");
			System.out.println("1.과자(2000원) | 2.라면(3000원) | 3.사탕(500원) | 4.젤리(500원) | 5. 종료");
			System.out.println("menu >> ");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1: case 2 : case 3 : case 4 :
				System.out.println(strMenu[menu-1]+" 1개 선택 ("+price[menu-1]+"원)");
				count[menu-1]++;
				break;
			case 5: System.out.println("종료합니다.");break;
			default:System.out.println("잘못된 메뉴!!");
			}
			
		}while(menu !=5);

		int sum = 0;
		System.out.println("총 금액 : ");
		for(int i=0;i<strMenu.length;i++) {
			if(count[i]>0) {
				int subSum = price[i] * count[i];
				System.out.println(strMenu[i]+"("+price[i]+"원) *"+count[i]+"="+subSum);
				sum += subSum;
			}
		}
		System.out.println("-------------------------------");
		System.out.println("총금액               :  "+sum);
		

		scan.close();
				
	}
	
}


