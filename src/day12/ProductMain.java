package day12;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 1. 판매할 상품등록 Product[]
		Product[] menu = new Product[5];
		// 1-2. 배열에 객체 생성 => 등록
		menu[0] = new Product("김밥", 3000);
		menu[1] = new Product("라면", 5000);
		menu[2] = new Product("사이다", 2000);
		menu[3] = new Product("어묵", 4000);
		menu[4] = new Product("공기밥", 1000);
		
		// 1-3. 객체를 생성 후 => insertProduct를 호출 => 배열에 등록
//		Product p = new Product();
//		p.insertProduct("1111", 1000);
//		menu[4] = p;
		
		// 2. 주문을 담을 Order[] 생성
		Order[] order = new Order[5];
		int cnt = 0;
		
		char ok='y';  // y/n
		while(ok!='n') {
			System.out.println("주문하시겠습니까? (y/n)");
			ok = scan.next().charAt(0);
			
			if(ok=='n' || ok=='N') {
				System.out.println("주문을 종료합니다.");
				break;
			}
			if(ok=='y' || ok=='Y') {
				// 처리
				// 메뉴를 출력
				for(int i=0;i<menu.length;i++) {
					System.out.println((i+1)+". "+menu[i]);
				}
				
				// 메뉴 입력
				System.out.println("menu >");
				int menuNo = scan.nextInt();
				if(menuNo < 1 || menuNo > 5) {
					System.out.println("없는 주문번호입니다.");
					continue;
				}
				// 수량입력
				System.out.println("수량 >");
				int count = scan.nextInt();
				
				//메뉴 => menu[menuNo-1].getName / menu[menuNo-1].getPrice
				
				// 주문 객체 생성
//				Order o = new Order(menu[menuNo-1],count);
				String name = menu[menuNo-1].getName();
				int price = menu[menuNo-1].getPrice();
				Order o = new Order(name,price,count);
				
				
				// 3. 주문 배여링 꽉 찼는지 확인
				if(order.length == cnt) {
					// 3-1. 새배열 생성
					Order[] tmp = new Order[order.length+3];
					// 3-2. 배열복사
					System.arraycopy(order, 0, tmp, 0, order.length);
					
					// 3-3. 배열주소 변경
					order = tmp;
				}
				order[cnt] = o;
//				System.out.println(order[cnt]);
				cnt++;
				
				
			}else {
				System.out.println("y/n만 선택해주세요.");
			}
			
							
		}
		// 4. 주문 내역 출력
		System.out.println("-- 주문내역 출력 --");
		int sum = 0;
		for(int i=0; i<cnt;i++) {
			System.out.println(order[i]);
			sum += order[i].getTotal();
		}
		if(cnt==0) {
			System.out.println("주문내역이 없습니다.");
		}
		System.out.println("=====================");
		System.out.println("총 주문금액 : " + sum);
		
		scan.close();

	}

}
