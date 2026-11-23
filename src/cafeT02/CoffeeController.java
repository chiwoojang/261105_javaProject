package cafeT02;

import java.util.Scanner;

public class CoffeeController{
	private final Scanner scan;
	private Coffee[] orders;
	private int index;
	
	
	public CoffeeController(Scanner scan) {
		this.scan = scan;
		this.orders = new Coffee[5];
		this.index = 0;
	}
	
	// 메뉴 선택 => 원래 main 실행
	public void run() {
		while(index < orders.length) {
			System.out.println("--커피메뉴--");
			System.out.println("1. 아메리카노(2000원 / 물 추 + 500가");
			System.out.println("2. 라떼(3500원 / 우유 추 + 1000가");
			System.out.println("3. 모카(3500원 / 초코 추 + 1500가");
			System.out.println("0. 주문완료 / 영수증 출력");
			System.out.println("선택 > ");
			int menu = scan.nextInt();
			if(menu == 0) {
				break;
			}
			if(menu < 1 || menu >3) {
				System.out.println("잘못된 선택입니다. 다신 선택하세요.");
				continue;
			}
			
			System.out.println("수량 > ");
			int cnt = scan.nextInt();
			
			
			System.out.println("추가 옵션을 선택하시겠습니까? (y/n)");
//			char add = scan.next().charAt(0);
//			boolean addOption = (add=='y')?true:false;
			//equalsIgnoreCase 대소문자 구별 안함
			boolean addOption = scan.next().equalsIgnoreCase("y");
			
			// 선택한 옵션 menu, cnt, option 여부
			// 해당 값을 주고, Coffee 클래스 리턴	
			
			Coffee coffee = createCoffee(menu,cnt,addOption);
			// 다형성 : coffee 타입의 배열에 자식 객체 저장
			orders[index] = coffee;
			index++;
			System.out.println(" => "+coffee.getDescription() + "  수량:"+cnt
					+"금액 : " + coffee.getPrice());
		}
		printCoffee();
	}
	
	public Coffee createCoffee(int menu,int cnt, boolean addOption) {
//		switch(menu) {
//		case 1: return new Americano(cnt,addOption); 
//		case 2: return new Latte(cnt,addOption); 
//		case 3: return new Mocha(cnt,addOption); 
//			default: System.out.println("잘못된 메뉴입니다.");
//		}
		
		// 화살표 방식 (많이 사용하는 추세 jdk8, jdk11 못씀, jdk14 이후부터 가능)
		return switch(menu) {
		case 1 -> new Americano(cnt,addOption);
		case 2 -> new Latte(cnt,addOption);
		case 3 -> new Mocha(cnt,addOption);
		default -> null;
		};
	}
	
	// 영수증 출력
	public void printCoffee() {
		System.out.println("---------- 주문 영수증 --------");
		if(orders.length==0) {
			System.out.println("주문내역 없습니다.");
			return;			
		}
		int sum = 0;
		for(int i=0;i<index;i++) {
			sum += orders[i].getPrice();
			System.out.println((i+1)+"."+orders[i].getDescription()+ "  수량:"+orders[i].quantity
					+"금액 : " + orders[i].getPrice());
		}
		System.out.println("----------------------------");
		System.out.println("총 결제 금액 : "+sum); 
	}
}
