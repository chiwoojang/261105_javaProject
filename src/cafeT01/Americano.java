package cafeT01;

public class Americano extends Coffee {
	private int extra_price = 500;
	private boolean extraWater;
	
	public Americano(int cnt, boolean extraWater) {
		super("아메리카노", 2000, cnt);
		this.extraWater = extraWater;
		
	}
	
	public int getUnitPrice() {
		return (basePrice+extra_price*(extraWater?1:0));
	}
	
	@Override
	public int getPrice() {
		return getUnitPrice()*quantity;
	}

	@Override
	public String getDescription() {
		return name+(extraWater?"(+)":"")+"\t"+quantity+"개  "+getUnitPrice() + "  :  " + getPrice();
	}

	public int getExtra_price() {
		return extra_price;
	}

	public void setExtra_price(int extra_price) {
		this.extra_price = extra_price;
	}

	public boolean isExtraWater() {
		return extraWater;
	}

	public void setExtraWater(boolean extraWater) {
		this.extraWater = extraWater;
	}

	@Override
	public String toString() {
		return "Americano [extra_price=" + extra_price + ", extraWater=" + extraWater + ", name=" + name
				+ ", basePrice=" + basePrice + ", quantity=" + quantity + "]";
	}
	
	

}
