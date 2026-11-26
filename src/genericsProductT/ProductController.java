package genericsProductT;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ProductController{
	
	private final Scanner scan;
	// 메뉴를 저장하는 리스트
	private List<Product<String,Integer>> menuList = new ArrayList<>();
	// 주문저장 리스트
	private List<Order<String,Integer>> orderList = new ArrayList<>();
	
	public ProductController(Scanner scan) {
		this.scan = scan;
		addMenu();
	}
	
	public void addMenu(){
		// 기본 메뉴 추가
		menuList.add(new Product<String,Integer>("김밥",2000));
		menuList.add(new Product<String,Integer>("라면",3000));
		menuList.add(new Product<String,Integer>("참치덮밥",9000));
		menuList.add(new Product<String,Integer>("디저트",3000));
		menuList.add(new Product<String,Integer>("음료",1000));
	}
	
//	{
//		//메뉴를 몇가지 만들어 둔다.
//		menuList.add(new Product<String,Integer>("김밥",2000));
//		menuList.add(new Product<String,Integer>("라면",3000));
//		menuList.add(new Product<String,Integer>("참치덮밥",9000));
//		menuList.add(new Product<String,Integer>("디저트",3000));
//		menuList.add(new Product<String,Integer>("음료",1000));
//	}
	
	// 메뉴 받고 작동
	public void run() {
		while(true) {
			System.out.println("test");
			System.out.println("--- 메뉴입력 ---");
			System.out.println("1.메뉴추가 | 2.메뉴보기 | 3.제품주문 | 4.주문내역보기 | 5.종료");
			try {
				int m = scan.nextInt();
				
				if(m==5) {
					System.out.println("종료!!");
					break;
				}

				
				switch(m) {
				case 1 : insertMenu(); break;
				case 2 : printMenu(); break;
				case 3 : orderPick(); break;
				case 4 : orderPrint(); break;
				default : System.out.println("--잘못된 메뉴 입력--"); break;
				
				}
				
			} catch (InputMismatchException e) {
				System.out.println("입력타입이 넣었습니다.");
				scan.nextLine();
				
			}catch (Exception e) {
				e.printStackTrace();
				scan.nextLine();
				
			}
			
		}
	}
	
	
	
	public void insertMenu() {
		
		// 같은 이름의 Product는 축 하나가 안되게 한다.
		System.out.println("---- 상품정보 ----");
		printMenu();
		System.out.println("----------------");
		
		System.out.println("메뉴를 입력하세요 >");
		String m = scan.next();
		if(menuList.contains(new Product<String,Integer>(m))) {
			System.out.println("-- 이미 있는 메뉴입니다. -- ");
			return;
		}
		System.out.println("가격을 입력하세요 >");
		Integer price = scan.nextInt();
		if(price <= 0) {
			System.out.println("-- 0이하의 가격 책정을 할 수 없습니다.");
			return;
		}
		
		menuList.add(new Product<String,Integer>(m,price));
		System.out.println("-- 메뉴추가 완료 --");
		
	}
	public void printMenu() {
		// TODO Auto-generated method stub
		int cnt=0;
		for(Product<String,Integer> p : menuList) {
			cnt++;
			System.out.println(cnt+"."+p);
		}
		
	}
	
//	public boolean orderExist(Product<String,Integer> p) {
//		(Product)p
//		
//	}
	
	public void orderPick() {
		// TODO Auto-generated method stub
		// 같은 메뉴의 order가 있으면 수량 합산
		// 제품출력
		System.out.println("---- 상품정보 ----");
		printMenu();
		System.out.println("----------------");
		System.out.println("주문하실 제품 번호를 입력하세요. > ");
		int no = scan.nextInt();
		System.out.println("수량 > ");
		int count = scan.nextInt();
		
		//기존에 메뉴가 존재한다면... 수량만 추가
		Order<String,Integer> p = new Order<String,Integer>(menuList.get(no-1).getMenu());
		
		int orderIndex = this.orderList.indexOf(p);
		if(orderIndex != -1) {
			// 기존 메뉴 가져오기 => 수량을 가져와서 => 추가수량을 더하고 => 다시 수량을 set(계산)
			int addCount = orderList.get(orderIndex).getCount()+count;
			orderList.get(orderIndex).setCount(addCount);
			System.out.println("추가주문 완료!!");
			return;
		}		
		
		// 없다면 다 추가.
		Product<String,Integer> p2 = menuList.get(no-1);
		Order<String,Integer> o = new Order<String,Integer>(p2,count);
		orderList.add(o);
		System.out.println("--주문완료--");
		
		
		
//		int menuNum = scan.nextInt();
//		if(menuNum <1 || menuNum >menuList.size()) {
//			System.out.println("주문이 잘못 되었습니다.");
//			return;
//		}
		
//		System.out.println("주문수량을 입력해 주세요. >");
//		int buy = scan.nextInt();
//		if(buy <= 0) {
//			System.out.println("0개 이하로 주문할 수 없습니다.");
//			return;
//		}
//		
//		// 일단은 주문을 입력한다. 
//		
////		order.add(new Order<String,Integer>(menu.get(menuNum-1),buy));
//		
//		
//		// 향후 동일 주문이 있으면 기존 주문에 개수를 합침
//
//		int index = orderList.indexOf(new Order<String,Integer>(menuList.get(menuNum-1).getMenu())); 
//		if(index!=-1) {
////			System.out.println("--In the Process--");
//			orderList.get(index).setCount(orderList.get(index).getCount()+buy);
//			orderList.get(index).totalPrice();
//		}else {
//			orderList.add(new Order<String,Integer>(menuList.get(menuNum-1),buy));			
//		}
		
		
	}
	public void orderPrint() {
		// TODO Auto-generated method stub
		System.out.println("--- 주문 내역 보기 ---");
		int sum = 0;
		for(Order<String,Integer> o : orderList) {
			o.printOrder();
			sum += o.getTotal();
		}
		System.out.println("-----------------");
		System.out.println("총합계  :  " + sum + "원");
		
	}

}
