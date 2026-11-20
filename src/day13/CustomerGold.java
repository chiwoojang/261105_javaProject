package day13;

public class CustomerGold extends Customer {
	// Customer 멤버변수 상속 : 고객ID, 고객명, 등급, 포인트(적립), 적립비율
	// 추가변수 : 할인비율
	// Override => pay() -> 할인처리 추가  / print -> Gold 멤버로 출력
	// 신규메서드 : 할인금액 연산
	
	private double discountRate;
	
	{
		discountRate = 0.05;
	}
	
	// 생성자
	public CustomerGold() {
		super.setGrade("Gold");
		super.setMileageRate(0.03);
	}

	public CustomerGold(String id,String name) {
		this();
//		super.setGrade("Gold");
//		super.setMileageRate(0.03);		
		super.setId(id);
		super.setName(name);
	}
	
	// 메서드
	
	// 할인금액 반환
	public int discountMoney(int money) {
		return (int)(money*(1-discountRate));
	}
	
	@Override
	public void pay(int money) {
		money = discountMoney(money);
		addMileage(money);
		printCustomer();
	}
	


	@Override
	public int calcPrice(int price) {
		// 부모 메서드 오버라이딩
		// 금액을 그래로 리턴
		super.calcPrice(price);
		return (int)(price*(1-discountRate));
	
	}

	public double getDiscountRate() {
		return discountRate;
	}


	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	@Override
	public String toString() {
		return "CustomerGold [discountRate=" + discountRate + ", toString()=" + super.toString() + "]";
	}

//	@Override
//	public String toString() {
//		return "CustomerGold [discountRate=" + discountRate + "]";
//	}
	
	
	
	
	
	
}
