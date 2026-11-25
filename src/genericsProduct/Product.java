package genericsProduct;

import java.util.Objects;

public class Product<K,V extends Number> {
	/*
	 * Generics 키오스크 프로그램Generics

class
Product - 제네릭
 - 멤버변수 : K menu, V price
Order extends Product
 - 멤버변수 : (menu, price) count, total
ProductController
 - 멤버변수 : 메뉴를 저장하는 리스트, 주문을 저장하는 리스트
 - 메서드
    - 기본 메뉴 생성자에서 추가
  1. 메뉴추가
  2. 메뉴출력
  3. 주문
  4. 주문내역출력(영수증출력)

ProductMain
 - 1.메뉴추가 | 2.메뉴보기 | 3.제품주문 | 4.주문내역보기 | 5.종료
	 * */
	
	protected K menu;
	protected V price;
	
	
	
	public Product() {
	}
	
	public Product(K menu, V price) {
		this.menu = menu;
		this.price = price;
	}
	
	public Product(K menu) {
		this.menu = menu;
	}
	
	
	public K getMenu() {
		return menu;
	}
	public void setMenu(K menu) {
		this.menu = menu;
	}
	public V getPrice() {
		return price;
	}
	public void setPrice(V price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return menu + ":" + price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(menu);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(menu, other.menu);
	}
	
	

}
