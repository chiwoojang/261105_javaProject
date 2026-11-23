package cafeT02;

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
}


class Americano extends Coffee{
	

	private int extra_price = 500;
	private boolean extraWater;
	
	public Americano (int cnt, boolean extra) {
		super("아메리카노",2000,cnt);
		this.extraWater = extra;
	}
	
	
	@Override
	public int getPrice() {
		
		return (basePrice+(extraWater?extra_price:0))*quantity;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return extraWater? name+"(+초코추가)" : name;
	}
	

}

class Latte extends Coffee{
	
	private int extra_price = 1000;
	private boolean extraMilk;
	
	public Latte (int cnt, boolean extra) {
		super("라떼",3500,cnt);
		this.extraMilk = extra;
	}
	

	@Override
	public int getPrice() {
		
		return (basePrice+(extraMilk?extra_price:0))*quantity;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return extraMilk? name+"(+우유추가)" : name;
	}
	
}

class Mocha extends Coffee{
	
	private int extra_price = 1500;
	private boolean extraChocolate;
	
	public Mocha (int cnt, boolean extra) {
		super("모카",3500,cnt);
		this.extraChocolate = extra;
	}
	
	
	@Override
	public int getPrice() {
		
		return (basePrice+(extraChocolate?extra_price:0))*quantity;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return extraChocolate? name+"(+초코추가)" : name;
	}
	
}
