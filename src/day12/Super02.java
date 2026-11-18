package day12;

public class Super02 {

	public static void main(String[] args) {
		// 출력용 클래스
		
		Dog d = new Dog("뽀삐","강아지");
		d.printInfo();
		d.howl();
		
		Cat c = new Cat("양순이","고양이");
		c.printInfo();
		c.howl();
		
		Tiger t = new Tiger("호돌이","호랑이"); 
		t.printInfo();
		t.howl();
		
		Animal a = (Animal)new Tiger("호호호");
		a.printInfo();
		a.howl();

		System.out.println("--------------");
		Animal[] animals = new Animal[3];
		animals[0] = (Animal)d;
		animals[1] = (Animal)c;
		animals[2] = (Animal)t;
		animals[2].howl();
		
	}

}

// 자식클래스
class Tiger extends Animal{
	
	// 부모 생성자를 호출
	public Tiger(String name,String category) {
		// 부모 생성자를 호출 할 수 있고,
		super(name,category);
		
	}
	
	public Tiger(String name) {
		super(name,"호랑이");
	}
	
	@Override
	public void howl() {
		// TODO Auto-generated method stub
		super.howl();
		System.out.println("어흥!!");
	}
	
	public void cry() {
		
	}
}
class Cat extends Animal{
	
	// 부모 생성자를 호출
	public Cat(String name,String category) {
		// 부모 생성자를 호출 할 수 있고,
		super(name,category);

	}
	
	@Override
	public void howl() {
		// TODO Auto-generated method stub
		super.howl();
		System.out.println("야옹!!");
	}
}

class Dog extends Animal{
	
	
	// 부모 생성자를 호출
	public Dog(String name,String category) {
		// 부모 생성자를 호출 할 수 있고,
		super(name,category);
		
		// 부모 setter를 쓸 수도 있음.
//		super.setName(name);
//		super.setCategory(category);
	}

	@Override
	public void howl() {
		// TODO Auto-generated method stub
		super.howl();
		System.out.println("멍멍!!");
	}
	
	
}


// 부모클래스
class Animal{
	private String name;     // 이름
	private String category; // 종
	
	// 생성자
	public Animal() {};
	public Animal(String name,String category) {
		this.name = name;
		this.category = category;
	}
	
	// 출력메서드
	public void printInfo() {
		System.out.println("이름:"+name+"("+category+")");
	}
	
	// 울음소리 출력 메서드  => 자식이 구현하도록 남겨 둠
	public void howl() {
		System.out.println(name+"의 울음소리");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", category=" + category + "]";
	}	
		
}