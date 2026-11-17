package day10;

public class Product {
	// 제품 클래스
	// 판매제품명, 가격  //실제로는 재고, 납품처, 원산지, 원가, 마진률 등 다양한 정보를 담을 수 있다.
	
	
	// 나의 코딩
//	private String name;
//	private int price;
//	
//	// 생성자
//	public Product() {}
//	
//	public Product(String name,int price) {
//		this.name = name;
//		this.price = price;
//	}
//
//	@Override
//	public String toString() {
//		return "Product [name=" + name + ", price=" + price + "]";
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getPrice() {
//		return price;
//	}
//
//	public void setPrice(int price) {
//		this.price = price;
//	}
	
	//=== 강사 코딩 ====
	private String name;
	private int price;
	
	// 생성자
	public Product() {}
	
	public Product(String name,int price) {
		this.name = name;
		this.price = price;
	}
	
	// 객체 생성 이후 상품을 추가하는 메서드 별도 필요.... (편리성을 위해)
	public void insertProduct(String name,int price) {
		this.name = name;
		this.price = price;
	}
	
	

	@Override
	public String toString() {
		return "Product [" + name + ", " + price + "]";
	}

	// getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	

}
