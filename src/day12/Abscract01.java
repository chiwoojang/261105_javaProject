package day12;

public class Abscract01 {

	public static void main(String[] args) {
		// 추상 클래스 = 미완성 클래스
		// 추상 클래스의 키워드 : abstract 
		// 추상 클래스는 추상 메서드를 포함하는 클래스
		// 추상 메서드는 선언부만 있고, 구현부가 없는 메서드 
		// 객체 생성이 불가능
		
		Dog2 d = new Dog2("뽀삐","강아지");
		d.printInfo();
		d.howl();
		d.eating("고기");
		
//		Animal2 a = new Animal2();  => 추상 클래스는 객체 생성 불가능
		Animal2 a = (Animal2) d;  // 자식 클래스를 casting 해서는 받을 수 있넹.
		a.printInfo();

	}

}

//
class Dog2 extends Animal2{
	
	private String eat;
	
	public Dog2() {}
	public Dog2(String name,String category) {
		this.name = name;  // protected로 멤버변수 상속받으면 super. -> this. 로 받아도 됨
//		super.name = name;
		super.category = category;		
	}

	@Override
	void howl() {
		// TODO Auto-generated method stub
		System.out.println(name+"의 울음소리 멍멍");
	}

	@Override
	void eating(String eat) {
		// TODO Auto-generated method stub
		this.eat = eat;
		System.out.println(name+"은 "+eat+"를 좋아해요.");
	}
	
}

// 같은 패지지에 같은 이름의 클래스가 있으면 안됨.
// abstracg : 상속용
abstract class Animal2{
	protected String name;
	protected String category;
	
	public void printInfo() {
		System.out.println(name+"("+category+")");
	}
	
	//추상메서드
	abstract void howl();
	abstract void eating(String eat);
}