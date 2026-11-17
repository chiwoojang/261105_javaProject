package day10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		/* 키오스크
		 * product(상품) class : 상품명, 가격(판매금액)
		 * order(주문) class : 상품명, 개수, 가격(판매금액), 금액(개수*가격)
		 * 
		 * 
		 * */

		// Product[] menu = new Product[5] // => 상품 리스트
		// 임의의 상품등록
		// 주문 => order 객체 발생  => Order[] order = new Order[5];
		
		/* 1. 전체 제품 보여주기
		 * 2. 주문 > 제품명, 수량 입력받기
		 * 3. order 객체 생성 => 추가
		 * 4. 반복 주문 => 종료 키워드 생성 반복 주문이 가능하도록
		 * 5. order => 배열이 다 차면 배열 증가 (배열복사)
		 * 6. 주문 완료시 => 영수증 출력 (전체 주문내역 / 총지불금액)
		 * 
		 * ex)
		 * 김밥 2 3000 => 6000
		 * 라면 3 5000 => 15000
		 * 사이다 2 500 => 1000
		 * ---------------------
		 * 총 지불금액 22000
		 * */
		
		//나의 코딩
//		Scanner scan = new Scanner(System.in);
//		
//		Product[] menu = new Product[5];
//		menu[0] = new Product("라면",3000);
//		menu[1] = new Product("칫솔",2000);
//		menu[2] = new Product("햇반",5000);
//		menu[3] = new Product("껌",500);
//		menu[4] = new Product("핫바",10000);
//		
//		//메뉴판 출력
//		for(int i=0;i<menu.length;i++) {
//			if(menu[i]!=null) {				
//				System.out.print((i+1) + ") " + menu[i].getName() + "("+menu[i].getPrice()+") ");
//			}
//		}
//		System.out.println();
//		
//		// 주문을 받는다. (제품명 개수)
//		// Order 객체 배열을 생성한다. 기본 5개, index로 추적하며, 배열크기 넘으면 배열크기 증가복사
//		Order[] ord = new Order[5];
//		int index = 0;
//		
//		while(true) {
//			System.out.println("주문을 입력해 주세요. (상품번호, 개수 / 종료 시 0) > ");
//			int menuNum = scan.nextInt();
//			if(menuNum==0) {
//				break;
//			}
//			int numBuy = scan.nextInt();
//			
//			System.out.println(">"+menu[menuNum-1].getName() + ": " + numBuy + "개");
//			
//			// 중복 체크 => 중복품목은 기존 오더에 add
//			boolean isNew=true;
//			for(int i=0;i<index;i++) {
//				if(menu[menuNum-1].getName()==ord[i].getProduct().getName()) {
//					ord[i].add(numBuy);
//					isNew=false;
//				}
//			}
//			
//			// order를 신규로 추가해야 할 때의 프로세스
//			if(isNew) {				
//				// order 리스트 개수 체크 => 리스트 개수가 적으면 3개 증가
//				if(index == ord.length) {
//					Order[] temp = new Order[ord.length+3];
//					System.arraycopy(ord, 0, temp, 0, ord.length);
//					ord = temp;
//				}
//				
//				// order 배열에 추가
//				ord[index] = new Order(menu[menuNum-1],numBuy);
//				index++;			
//			}
//		}
//		
//		// 주문메뉴와 개수  단가  합계 및 총합계 출력
//		int total = 0;
//		DecimalFormat d = new DecimalFormat("#,###");
//		
//		System.out.println("주문메뉴\t수량\t단가\t합계");
//		for(int i=0;i<index;i++) {
//			System.out.println(ord[i].toString());
//			total += ord[i].getTotal();
//		}
//		
//		System.out.println("=================================");
//		System.out.println("총합계\t\t\t" + d.format(total));
//		
//		scan.close();
		
		Scanner scan = new Scanner(System.in);
		
		// 1. 판매할 상품등록 Product[]
		Product[] menu = new Product[5];
		// 1-2. 배열에 객체 생성 => 등록
		menu[0] = new Product("김밥", 3000);
		menu[1] = new Product("라면", 5000);
		menu[2] = new Product("사이다", 2000);
		menu[3] = new Product("콜라", 2000);
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
			
			if(ok=='n') {
				System.out.println("주문을 종료합니다.");
				break;
			}
			if(ok=='y') {
				// 처리
				// 메뉴를 출력
				for(int i=0;i<menu.length;i++) {
					System.out.println((i+1)+". "+menu[i]);
				}
				System.out.println("menu >");
				int menuNo = scan.nextInt();
				if(menuNo < 1 || menuNo > 5) {
					System.out.println("없는 주문번호입니다.");
					continue;
				}
				System.out.println("수량 >");
				int count = scan.nextInt();
				
				//메뉴 => menu[menuNo-1].getName / menu[menuNo-1].getPrice
				
				// 주문 객체 생성
				Order o = new Order(menu[menuNo-1],count);
				
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
				
		
	}

}
