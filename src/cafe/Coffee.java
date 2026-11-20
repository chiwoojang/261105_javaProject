package cafe;

public class Coffee {
	// 커피 클래스로 이하 옵션 추가할 경우 -> Americano, Latte, Mocha 에 상속된다.
	// 멤버변수 : 이름, 가격
	protected String name;
	protected int price;
	protected int num;
	protected int total;
	
	{
		name="에스프레소";
		price=2000;
	}
	
	// 생성자
	public Coffee() {}

	public String getName() {
		return name;
	}
	
	// method
	 
	
	// 구매가격 계산
	public int calcPrice(int num) {
		this.num = num;
		total = num*price;
		return num*price;
	}
	
	// 구매금액 출력
	public void printTotal() {
		System.out.println("합산가격을 출력한다.");
	}
	
	// getter, setter

	public void setName(String name,int price) {
		this.name = name;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	

	public int getTotal() {
		return total;
	}

	@Override
	public String toString() {
		return "Coffee [name=" + name + ", price=" + price + "]";
	}
	
	
	
	

}
