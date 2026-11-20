package day13;

public class Customer {
	// Customer 객체의 부모객체 - 기본은 Siver의 정보를 보유
	// 본 객체는 Gold, Vip 객체가 상속받아 사용한다.
	// 멤버변수 : 고객ID, 고객명, 등급, 포인트(적립), 적립비율
	private String id;
	private String name;
	private String grade;
	private int point;
	private double mileageRate;
	
	{
		grade = "Silver";
		mileageRate = 0.01; 
	}
	
	// 생성자
	public Customer() {}
		
	
	public Customer(String id, String name) {
		this.id = id;
		this.name = name;
	}



	// 메서드
	public int calcPrice(int price) {
		point += (int)price*mileageRate;
		return price;
	}

	
	// 결제시 처리해야 할 메서드 집합
	public void pay(int money) {
		addMileage(money);
		printCustomer();
	}
	
	// 포인트적립 메서드 => 포인트 계산하여 누적
	public void addMileage(int money) {
		point += money*mileageRate;
	}
	
	
	// 출력메서드
	public void printCustomer() {
		System.out.println(name +"님은 " + grade + " 고객이며, 현재 포인트는 "+point+"점 입니다.");
	}
	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public double getMileageRate() {
		return mileageRate;
	}

	public void setMileageRate(double mileageRate) {
		this.mileageRate = mileageRate;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", grade=" + grade + ", point=" + point + ", mileageRate="
				+ mileageRate + "]";
	}
	
	
	
	
}
