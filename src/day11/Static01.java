package day11;

public class Static01 {

	public static void main(String[] args) {
		// static : 전역변수  / 전역메서드 (클래스 변수, 클래스 메서드) => 객체 없이 사용가능 => 왠만하면 잘 안씀. 꼭 필요할 때만
		// 멤버변수 (객체의 변수, 객체의 메서드)
		/* 전역변수는 모든 객체에 공통으로 이용이 가능
		 * 프로그램이 실행되면서 바로 메모리에 올라가서 ~ 프로그램이 종료할 때까지 같이 소멸
		 *  - 객체 생성없이 클래스가 만들어지면서 생성
		 *  - 객체 생성없이 클래스.변수명 / 클래스.메서드명() 호출 가능
		 *  - 객체를 사용 후 사용해도 무관하나, 굳이 그렇게 사용하지 않음. (노란밑줄)
		 *  - 클래스의 멤버변수, 메서드에서 하나의 멤버변수가 모든 객체에 공유되어야 할 때
		 *  
		 *  
		 * static이 안붙은 메서드/멤버변수 => 객체 변수/객체 메서드
		 *  - 각 객체를 통해 생성되고, 초기화 되고, 사용된다.
		 *  - 객체를 생성하지 않으면(new) 생성되지 않고, 사용될 수 없다.
		 *  - 객체명.변수명 / 객체명.메서드명()
		 *  - 각 객체마다 독립적으로 존재
		 *  
		 * 클래스의 멤버와 객체의 멤버는 생성되는 시점이 다르다.
		 * 객체의 멤버 => new가 실행되면 생성
		 * 클래스의 멤버 => 클래스가 생성되면 (내가 작성하는 시점)
		 * 사용되는 시점도 다르다.
		 * 
		 * 객체의 멤버는 클래스가 생성되고, 객체 생성(new) 후 사용이 가능
		 * 클래스의 멤버는 클래스가 생성되면 바로 사용 가능.
		 * 
		 *  - 클래스 멤버는 클래스 멤버변수 / 클래스 메서드 둘 다 사용 가능
		 *  - 객체의 멤버는 클래스 멤버에서 사용이 불가능. (객체 생성이 안되었을 수 있기 때문에...)
		 *  - static이 붙은 메서드에서 일반메서드(안붙은 애들) 호출 불가능
		 *  
		 *  
		 * */
		// 클래스가 다를 때 클래스명.메서드명()
		System.out.println(Method08.factorial(5));
		TV t = new TV(); // 반드시 객체를 생성해야 호출 가능
		t.printBrand();  // 객체 메서드 호출방법
		TV.printBrand2(); // static 메서드 호출방법 클래스명.메서드명()
		t.printBrand2();  // 객체명.static메서드()  -> 가능은 하지만 잘 안씀.

	}

}

class TV{
	private boolean power;
	static final String BRAND = "LG";
	
	public void printBrand() {  // 객체 메서드
		System.out.println(BRAND);  // static 변수
		System.out.println(power);  // 객체멤버변수
	}
	
	public static void printBrand2() {  // 객체 메서드
		System.out.println(BRAND);  // static 변수
//		System.out.println(power);  // 객체멤버변수 (X)
	}
	
}
