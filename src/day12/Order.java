package day12;

public class Order extends Product {

	// product => name, price
	private int count;
	private int total;
	
	public Order() {}
	
	public Order(Product p, int count) {
		super.name = p.getName();
		super.price = p.getPrice();
		this.count = count;
		this.total = super.price * count;
	}
	
	public Order(String name,int price,int count) {
		super(name,price);
//		super.setName(name);
		this.count = count;
		this.total = super.getPrice()*this.count;
	}
	
	// 주문추가
	public void insertOrder(Product p, int count) {
		super.name = p.getName();
		super.price = p.getPrice();
		this.count = count;
		this.total = price * count;		
	}
	
	
	@Override
	public String toString() {
		return "["+super.name + "\t" + super.price + "\t" + count + "\t" + total+"]";
	}

	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}	
}
