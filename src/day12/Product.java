package day12;

public class Product {
	protected String name;
	protected int price;
	
	// 생성자
	public Product() {} //필수-제외 시 에러날 가능성 높음
	                    // 매개변수를 받는 생성자를 만든다면 기본생성자 꼭 만들것. 자주 쓰게 됨.
	
	public Product(String name,int price) { // 매개변수 생성자는 선택
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
		return name + ":" + price;
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
