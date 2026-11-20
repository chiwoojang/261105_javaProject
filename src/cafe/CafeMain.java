package cafe;

public class CafeMain {

	public static void main(String[] args) {
		/* cafe Main
		 * 프로그램 설계서
		 * kiosk 
		 *  - 메뉴명, 가격, 옵션, 옵션가격, 옵션수량, 수량
		 *  -----------------------------------
		 *  - 1. Coffee (에스프레소) => 2000 => 부모클래스
		 *    - 2. Americano => Coffee + 물(옵션 500) => 2500
		 *    - 3. Latte => coffee + 우유(1000) => 3000
		 *    - 4. Mocha => coffee + 초콜릿(1500) => 3500
		 *    
		 * 주문을 받아 Coffee[] 주문 정보 저장 => 영수증
		 * 
		 * 1. 아메리카노(2000)
		 * 2. 라떼 + 우유(3000)
		 * 3. 모카 + 초콜릿 (3500)
		 * 0. 주문완료 (영수증출력)
		 * */
		
		Coffee c = new Coffee();
		System.out.println(c);
		
		Americano a = new Americano();
		System.out.println(a);
		a.printMenu();
		a.setAdd(true);
		a.calcPrice(2);
		a.printTotal();
		
		Latte l = new Latte();
		System.out.println(l);
	
		Mocha m = new Mocha();
		System.out.println(m);
		
		
		Coffee[] coffees = new Coffee[4];
		coffees[0] = new Americano();
		((Americano)coffees[0]).calcPrice(1, false);
		coffees[1] = new Latte();
		((Latte)coffees[1]).calcPrice(2, false);
		coffees[2] = new Mocha();
		((Mocha)coffees[2]).calcPrice(3, false);
		coffees[3] = new Americano();
		((Americano)coffees[3]).calcPrice(3, true);
		
//		coffees[3] = new Americano();
//		((Americano)coffees[0]).calcPrice(1, true);
//		coffees[4] = new Americano();
//		((Americano)coffees[0]).calcPrice(1, true);
		
		System.out.println("커피\t\t단가\t수량\t합계");
		int total = 0;
		for(Coffee coffee : coffees) {
			coffee.printTotal();
			total += coffee.getTotal();
		}
		System.out.println("총액\t\t" + total);
	}

}
