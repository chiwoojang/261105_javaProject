package day13;

public class CustomerVip extends Customer{
	// Customer 멤버변수 상속 : 고객ID, 고객명, 등급, 포인트(적립), 적립비율
	// 추가변수 : 할인비율, 전담 상담사 ID, 전담 상담사 이름
	// Override => pay() -> 할인처리 추가  / print -> VIP 멤버로 출력
	// 신규메서드 : 할인금액 연산
	
	private double discountRate;
	private String agentNo;
	private String agentName;
	
	
	{
		discountRate = 0.10;
	}
	
	// 생성자
	public CustomerVip() {
		super.setGrade("VIP");
		super.setMileageRate(0.05);
	}

	public CustomerVip(String id,String name) {
		this();
//		super.setGrade("VIP");
//		super.setMileageRate(0.05);		
		super.setId(id);
		super.setName(name);
	}
	
	
	
	public CustomerVip(String id,String name,String agentNo, String agentName) {
		this();
//		super.setGrade("VIP");
//		super.setMileageRate(0.05);		
		super.setId(id);
		super.setName(name);
		this.agentNo = agentNo;
		this.agentName = agentName;
	}

	// 메서드
	
	
	
	// 할인금액 반환
	public int discountMoney(int money) {
		return (int)(money*(1-discountRate));
	}
	
	@Override
	public int calcPrice(int price) {
		// 부모 메서드 오버라이딩
		// 금액을 그래로 리턴
		super.calcPrice(price);
		return (int)(price*(1-discountRate));
	}

	@Override
	public void pay(int money) {
		money = discountMoney(money);
		addMileage(money);
		printCustomer();
	}
		

	@Override
	public void printCustomer() {
		// TODO Auto-generated method stub
		super.printCustomer();
		System.out.println(" - 전담상담사는 " + agentName + " 이고, 번호는 "+agentNo+" 입니다.");
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public String getAgentNo() {
		return agentNo;
	}

	public void setAgentNo(String agentNo) {
		this.agentNo = agentNo;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	@Override
	public String toString() {
		return "CustomerVip [discountRate=" + discountRate + ", agentNo=" + agentNo + ", agentName=" + agentName
				+ ", toString()=" + super.toString() + "]";
	}

//	@Override
//	public String toString() {
//		return "CustomerVip [discountRate=" + discountRate + ", agentNo=" + agentNo + ", agentName=" + agentName + "]";
//	}
	
	
}
