package cafe;

public class Latte extends Coffee {
	private String option;
	private int optionPrice;
	private int unitPrice;
	private boolean isAdd;
	
	
	{
		name = "라떼";
		option="우유";
		optionPrice = 1000;
		isAdd=false;
	}
	
	// 생성자
	public Latte(){
		super();
		calcUnitPrice();
	}
	
	public int calcUnitPrice() {
		unitPrice=isAdd? price + optionPrice*2: price+optionPrice;
		return unitPrice;
	}
	
	public void printMenu() {		
		System.out.println(name+" + "+ option + " ("+(price+optionPrice)+")");
	}
	
	public int calcPrice(int num,boolean isAdd) {
		this.isAdd = isAdd;		
		this.num = num;
		total = calcUnitPrice()*num;
		return total;
	}
	

	@Override
	public int calcPrice(int num) {
		this.num = num;
		total = calcUnitPrice()*num;
		return total;
	}



	@Override
	public void printTotal() {
		// TODO Auto-generated method stub
		calcPrice(num);
		System.out.println(name+(this.isAdd?"(옵션추가)":"")+"\t\t"+calcUnitPrice()+"\t"+num+"\t"+total);
	}	

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	public int getOptionPrice() {
		return optionPrice;
	}

	public void setOptionPrice(int optionPrice) {
		this.optionPrice = optionPrice;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public boolean isAdd() {
		return isAdd;
	}

	public void setAdd(boolean isAdd) {
		this.isAdd = isAdd;
	}

	@Override
	public String toString() {
		return "Latte [option=" + option + ", optionPrice=" + optionPrice + ", unitPrice=" + unitPrice + ", isAdd="
				+ isAdd + "]";
	}
	
	
	
	
}
