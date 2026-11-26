package genericsProductT;

import java.util.Objects;

public class Order<K,V extends Number> extends Product<K, V> {
	private int count;
	private int total;
	
	public Order(K menu, V price, int count) {
		super(menu,price);
		this.count = count;
		totalPrice();
	}
	
	public Order(Product<K,V> p,int count) {
		super(p.getMenu(),p.getPrice());
		this.count = count;
		totalPrice();
	}
	
	public Order(K menu) {
		super(menu);
	}
	
	// 출력 print()  메뉴 price 개수 total
	
	public void printOrder() {
		System.out.println(super.getMenu()+"("+super.getPrice()+"원) " + count +"개\t" + total + " 원");
	}
	
	
	public void totalPrice() {
		this.total = super.getPrice().intValue() * this.count;
	}
	
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
		totalPrice();
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	
//	@Override
//	public void setPrice(V price) {  // 만약 Order에서 Price 변경사항이 미미하게 발생할 경우는 변경
//		// TODO Auto-generated method stub
//		super.setPrice(price);
//		totalPrice();
//	}

	@Override
	public String toString() {
		return "Order [count=" + count + ", total=" + total + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(count);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order<?,?> other = (Order<?,?>) obj;
		return Objects.equals(menu,other.menu);
	}
	
	
	
}
