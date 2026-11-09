package day05;

public class Menu {
	
	private int menuNum;
	private String name;
	private int price;
	private int count;
	
	public Menu(int menuNum,String name,int price) {
		this.menuNum = menuNum;
		this.name = name;
		this.price = price;
		this.count = 0;		
	}
	
	public void buyCount(int num) {
		this.count += num;
	}


	public void setMenuNum(int menuNum) {
		this.menuNum = menuNum;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setCount(int count) {
		this.count=count;
	}
	
	public int getMenuNum() {
		return this.menuNum;
	}
	public String getName() {
		return this.name;
	}
	public int getPrice() {
		return this.price;
	}
	public int getCount() {
		return this.count;
	}

	
}
