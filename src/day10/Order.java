package day10;

import java.text.DecimalFormat;

public class Order {
	// 주문 클래스
	// 실제로 -> 날짜, 세금 
	// 상품명, 개수, 가격 (판매금액), 금액(개수*갸격)
	
	// 주문추가
	// 나의 코딩
	
//	private Product product;
//	private int count;
//	private int total;
//	
//	// 생성자
//	public Order() {}
//	
//	public Order(Product product,int count) {
//		this.product = product;
//		this.count = count;
//		this.total = product.getPrice()*count;
//	}
//
//	@Override
//	public String toString() {
//		DecimalFormat d = new DecimalFormat("#,###");
//		String strTotal = String.format("%7s",d.format(this.total));
//		String strPrice = String.format("%6s", d.format(this.product.getPrice()));
//		return (this.product.getName()+"\t"+this.count+"\t"+strPrice+"\t"+strTotal);
//	}
//	
//	// 주문 추가
//	public void add(int count) {
//		this.count += count;
//		this.total += product.getPrice()*count;		
//	}
//
//	public Product getProduct() {
//		return product;
//	}
//
//	public void setProduct(Product product) {
//		this.product = product;
//	}
//
//	public int getCount() {
//		return count;
//	}
//
//	public void setCount(int count) {
//		this.count = count;
//	}
//
//	public int getTotal() {
//		return total;
//	}
//
//	public void setTotal(int total) {
//		this.total = total;
//	}

	// 강사코딩
	private String name;
	private int price;
	private int count;
	private int total;
	
	public Order() {}
	public Order(Product p, int count) {
		this.name = p.getName();
		this.price = p.getPrice();
		this.count = count;
		this.total = price * count;
	}
	
	// 주문추가
	public void insertOrder(Product p, int count) {
		this.name = p.getName();
		this.price = p.getPrice();
		this.count = count;
		this.total = price * count;		
	}
	
	
	@Override
	public String toString() {
		return "[" + name + ", " + price + ", " + count + ", " + total + "]";
	}
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
