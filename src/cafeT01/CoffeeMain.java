package cafeT01;

import java.util.Scanner;

public class CoffeeMain {

	public static void main(String[] args) {
		// cafe Main
		/* 프로그램 설계서 
		 * kiosk 
		 * - 메뉴명, 가격, 옵션, 옵션가격, 수량
		 * --------------------------------
		 * - 1.Coffee (에스프레소) => 2000  => 부모클래스 
		 * - 2.Americano => Coffee + 물(500) => 2500
		 * - 3.Latte => coffee + 우유(1000) => 3000
		 * - 4.Mocha => coffee + 초콜릿(1500) => 3500
		 * 
		 * 주문을 받아 Coffee[] 주문 정보 저장 => 영수증
		 * 
		 * 1. 아메리카노(2000)
		 * 2. 라떼 + 우유 (3000)
		 * 3. 모카 + 초콜릿(3500)
		 * 0. 주문완료 (영수증출력)
		 * 
		 * 1번 아메리카노 2개 주문
		 * 2번 라떼 2개 주문
		 * -영수증-
		 * 아메리카노 	2개 	2000  :  4000
		 * 라떼 		2개	3000  :  6000
		 *---------------------------
		 *총 지불금액 10000원	
		 * */
				
		Scanner scan = new Scanner(System.in);
		
		Coffee[] coffees = new Coffee[5];
		int index = 0;
		
		while(true) {
			System.out.println("주문을 선택해 주세요.");
			System.out.println("1. 아메리카노 (2000) + 물추가(500)");
			System.out.println("2. 라떼     (3000) + 우유추가(1000)");
			System.out.println("3. 모카     (3500) + 초콜릿추가(1500)");
			System.out.println("0. 주문종료");
			System.out.println("======================");
			
			int menu = scan.nextInt();
			if(menu==0) {
				break;
			}
			
			System.out.println("옵션을 추가하시겠습니까?(y/n)");
			String opt = scan.next().toLowerCase();
			boolean isAdd = opt.equals("y")?true:false;
			
			System.out.println("몇 잔을 주문하시겠습까?");
			int qty = scan.nextInt();
			if(qty <=0 ) {
				System.out.println("주문수량이 잘못 되었습니다. 다시 선택해 주세요.");
				continue;
			}
			
			//index초과 확인
			if(index==coffees.length) {
				Coffee[] tmp = new Coffee[index+3];
				System.arraycopy(coffees, 0, tmp, 0, index);
				coffees = tmp;
			}
			
			switch(menu) {
			case 1: 
				coffees[index] = new Americano(qty,isAdd);
				break;
			case 2: 
				coffees[index] = new Latte(qty,isAdd);
				break;
			case 3: 
				coffees[index] = new Mocha(qty,isAdd);
				break;
			default :
				continue;
			}
			index++;
		}
		
		// 영수증 출력
		
		int total = 0;
		for(int i=0;i<index;i++) {
			System.out.println(coffees[i].getDescription());
			total += coffees[i].getPrice();
		}
		System.out.println("--------------------------------");
		System.out.println("총액\t\t" + total);			
		
		scan.close();
	}

}
