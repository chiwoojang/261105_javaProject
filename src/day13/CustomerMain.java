package day13;

public class CustomerMain {

	public static void main(String[] args) {
		// 백화점의 고객 등급
		/* - 일반고객(적립) / Gold고객(할인 + 적립) / VIP고객(할인 + 적립알파))
		 * 
		 * 고객 => Customer(부모클래스)
		 * - 멤버변수 : 고객ID, 고객명, 등급, 포인트(적립), 적립비율
		 * 
		 * - 일반고객(기본등급) - Silver
		 * - 기본 적립 비율 : 구매 금액의 1% 적립
		 * 
		 * - 등급체계
		 * Silver / Gold / VIP 
		 * - Silver : 제품 구매시 할인 0% / 구매금액의 1% 적립
		 * - Gold : 제품 구매시 할인 5% / 구매금액의 3% 적립
		 * - VIP :  제품 구매시 할인 10% / 구매금액의 5% 적립
		 * - VIP : 전담 상담사 멤버변수추가 (agentNum, agentName);
		 * 
		 * 1. 포인트 적립 계산 메서드
		 * - 구매 금액을 기준으로 포인트 계산 => 포인트 누적 적립
		 * - 할인 여부도 체크하여 구매 금액을 리턴
		 * 
		 * 2. 출력 메서드
		 * - 홍길동 님은 Gold 고객이며, 현재 포인트는 5000점 입니다.
		 * - 짱구님은 VIP 고객이며, 현재 포인트는 5000점입니다.
		 *   전담 상담사는 짱아이고, 번호는 1111 입니다. <- VIP만 추가
		 *   
		 *   
		 * */
		
//		Customer cs = new Customer("1","Jang");
//		System.out.println(cs.getGrade());
//		cs.pay(10000);
//		cs.pay(10000);
//		cs.pay(10000);
//		System.out.println(cs);
//		
//		CustomerGold cg = new CustomerGold("1","JangGold");
//		System.out.println(cg.getGrade());
//		cg.pay(10000);
//		cg.pay(10000);
//		cg.pay(10000);
//		System.out.println(cg);
//		
//		CustomerVip cv = new CustomerVip("1","JangVIP","01","점담자1");
//		System.out.println(cv.getGrade());
//		cv.pay(10000);
//		cv.pay(10000);
//		cv.pay(10000);
//		System.out.println(cv.toString());
//		
//		System.out.println("-------------------");
//		
//		Customer[] customers = new Customer[3];
//		customers[0] = cs;
//		customers[1] = cg;
//		customers[2] = cv;
//		for(Customer c : customers) {
//			c.printCustomer();
//		}
//		
//		System.out.println("-------------------");
//		for(Customer c : customers) {
//			if(c instanceof CustomerVip) {				
//				c.printCustomer();
//			}
//		}
//		
		
		Customer c = new Customer("111","홍길동");
		int price = c.calcPrice(10000);
		System.out.println("지불금액 : " + price);
		c.printCustomer();
		System.out.println("-----------------------");
		
		Customer[] customers = new Customer[10];
		customers[0] = c;
		customers[1] = new Customer("222","최순자");
		customers[2] = new CustomerGold("333","김영이");
		customers[3] = new Customer("444","복희");
		customers[4] = new CustomerVip("555","이순신","2","짱아");
		customers[5] = new CustomerGold("666","노영이");
		customers[6] = new Customer("777","금자씨");
		customers[7] = new CustomerVip("888","정자씨","4","친절이");
		customers[8] = new Customer("999","노홍철");
		customers[9] = new Customer("1000","금순이");
		
		System.out.println("-- 지불금액과 포인트 금액 계산 --");
		int price1 = 10000;
		for(int i=0; i<customers.length;i++) {			
			int p = customers[i].calcPrice(price1);
			System.out.println("지불금액 : " + p);
			customers[i].printCustomer();
			System.out.println();
		}
		
		
		price1 = 50000;
		for(int i=0; i<customers.length;i++) {			
			int p = customers[i].calcPrice(price1);
			System.out.println("지불금액 : " + p);
			customers[i].printCustomer();
			System.out.println();
		}
		
		// 다운 캐스팅
		// 상담사 짱아(1) => 철이(3)
		for(int i=0;i<customers.length;i++) {
			if(customers[i] instanceof CustomerVip) {
//				if(((CustomerVip)customers[i]).getAgentName().equals("짱아")){
//					((CustomerVip)customers[i]).setAgentName("철이");
//					((CustomerVip)customers[i]).setAgentNo("3");
//				}
				CustomerVip vip = (CustomerVip)customers[i];  // 참조복사해서 씀
				if(vip.getAgentName().equals("짱아")) {
					vip.setAgentName("철이");
					vip.setAgentNo("3");
				}
				
				// VIP List 출력됨.
				customers[i].printCustomer();
			}
		}
		
		

	}

}
