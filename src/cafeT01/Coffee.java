package cafeT01;

public abstract class Coffee {
	// - 메뉴명, 가격, 옵션, 옵션가격, 수량
	protected String name;
	protected int basePrice;
	protected int quantity;
	
	public Coffee() {}
	public Coffee(String name, int price, int cnt) {
		this.name= name;
		this.basePrice = price;
		this.quantity = cnt;
	}
	
	public abstract int getPrice();
	
	public abstract String getDescription();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(int basePrice) {
		this.basePrice = basePrice;
	}
	public int getQuantity() {
		return quantity;
	}
	@Override
	public String toString() {
		return "Coffee [name=" + name + ", basePrice=" + basePrice + ", quantity=" + quantity + "]";
	}
	
	
	
}
