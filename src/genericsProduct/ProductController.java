package genericsProduct;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductController implements ProductProgram {
	
	private final Scanner scan;
	// 메뉴를 저장하는 리스트
	private List<Product<String,Integer>> menu = new ArrayList<>();
	// 주문저장 리스트
	private List<Order<String,Integer>> order = new ArrayList<>();
	
	public ProductController(Scanner scan) {
		this.scan = scan;
	}
	
	{
		//메뉴를 몇가지 만들어 둔다.
		menu.add(new Product<String,Integer>("김밥",2000));
		menu.add(new Product<String,Integer>("라면",3000));
		menu.add(new Product<String,Integer>("참치덮밥",9000));
		menu.add(new Product<String,Integer>("디저트",3000));
		menu.add(new Product<String,Integer>("음료",1000));
	}
	
	// 메뉴 받고 작동
	public void run() {
		while(true) {
			System.out.println("--- 메뉴입력 ---");
			System.out.println("1.메뉴추가 | 2.메뉴보기 | 3.제품주문 | 4.주문내역보기 | 5.종료");
			try {
				int m = scan.nextInt();
				
				if(m==5) {
					break;
				}

				
				switch(m) {
				case 1 : insertMenu(); break;
				case 2 : printMenuList(); break;
				case 3 : orderMenu(); break;
				case 4 : printOrderList(); break;
				default : System.out.println("--잘못된 메뉴 입력--"); break;
				
				}
				
			} catch (Exception e) {
				System.out.println("허용되지 않는 값을 넣었습니다.");
				scan.nextLine();
				continue;
				
			}
			
		}
		System.out.println("--- 종료 ---");
	}
	
	
	
	@Override
	public void insertMenu() {
		// 같은 이름의 Product는 축 하나가 안되게 한다.
		System.out.println("---- 상품정보 ----");
		printMenuList();
		System.out.println("----------------");
		
		System.out.println("메뉴를 입력하세요 >");
		String m = scan.next();
		if(menu.contains(new Product<String,Integer>(m))) {
			System.out.println("-- 이미 있는 메뉴입니다. -- ");
			return;
		}
		System.out.println("가격을 입력하세요 >");
		Integer price = scan.nextInt();
		if(price <= 0) {
			System.out.println("-- 0이하의 가격 책정을 할 수 없습니다.");
			return;
		}
		
		menu.add(new Product<String,Integer>(m,price));
		
	}
	@Override
	public void printMenuList() {
		// TODO Auto-generated method stub
		int count=0;
		for(Product<String,Integer> p : menu) {
			count++;
			System.out.println(count+"."+p);
		}
		
	}
	
//	public boolean orderExist(Product<String,Integer> p) {
//		(Product)p
//		
//	}
	
	@Override
	public void orderMenu() {
		// TODO Auto-generated method stub
		// 같은 메뉴의 order가 있으면 수량 합산
		// 제품출력
		System.out.println("---- 상품정보 ----");
		printMenuList();
		System.out.println("----------------");
		System.out.println("주문하실 제품 번호를 입력하세요. > ");
		
		
		int menuNum = scan.nextInt();
		if(menuNum <1 || menuNum >menu.size()) {
			System.out.println("주문이 잘못 되었습니다.");
			return;
		}
		
		System.out.println("주문수량을 입력해 주세요. >");
		int buy = scan.nextInt();
		if(buy <= 0) {
			System.out.println("0개 이하로 주문할 수 없습니다.");
			return;
		}
		
		// 일단은 주문을 입력한다. 
		
//		order.add(new Order<String,Integer>(menu.get(menuNum-1),buy));
		
		
		// 향후 동일 주문이 있으면 기존 주문에 개수를 합침
		if(order.contains(new Order<String,Integer>(menu.get(menuNum-1).getMenu()))) {
//			System.out.println("--In the Process--");
			int index = order.indexOf(new Order<String,Integer>(menu.get(menuNum-1).getMenu())); 
			order.get(index).setCount(order.get(index).getCount()+buy);
			order.get(index).totalPrice();
		}else {
			order.add(new Order<String,Integer>(menu.get(menuNum-1),buy));			
		}
		
		
	}
	@Override
	public void printOrderList() {
		// TODO Auto-generated method stub
		System.out.println("--- 주문 내역 ---");
		int sum = 0;
		for(Order<String,Integer> o : order) {
			o.printOrder();
			sum += o.getTotal();
		}
		System.out.println("-----------------");
		System.out.println("총합계  :  " + sum + "원");
		
	}

}
