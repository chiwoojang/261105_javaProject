package day13;

public class Polymorphism01 {

	public static void main(String[] args) {
		// 다형성(polymorphism) : 다양한 객체로 형변환이 가능
		/* - 하나의 클래스(부모클래스)가 여러 자료형으로 구현 (자식클래스)되어 실행되는 형태
		 * - 코드는 같은데 들어오는 객체에 따라 다른 실행결과를 얻을 수 있다.
		 * - 다형성 잘 활용하면 유영하고, 확장성 있는, 유지보수가 편리한 코드를 만들 수 있음.
		 * 		 * 
		 * */
		
		Dog d = new Dog();
		d.move();
		d.walk();
		
		Tiger t = new Tiger();
		t.move();
		t.hunting();
		
		Eagle e = new Eagle();
		e.move();
		e.flying();
		
		Cat c = new Cat();
		c.move();
		
		Animal a = new Animal();
		a.move();
		
		System.out.println("--------------------");
		// 부모 타입으로 자식 객체를 생성하는 것이 가능
		//자식 고유의 메서드는 사용 불가능
		
		System.out.println("- 부모타입으로 자식객체 생성 -");
		Animal d2 = new Dog();
		d2.move();
//		d2.walk();
		
		Animal t2 = new Tiger();
		t2.move();
		
		System.out.println();
		// 자식타입으로 부모객체를 생성하는 것은 불가능
//		Dog a2 = new Animal(); // X
		
//		Animal c2 = new Cat();  // 상속 안받은 객체는 불가능
		
		// Animal의 객체들을 담을 수 있는 배열
		Animal[] ani = new Animal[5];
		ani[0] = d2;
		ani[1] = t2;
		ani[2] = new Eagle();
		ani[3] = d;  // 자동 업케스팅 가능
		ani[4] = t;  // 자동 업게스팅
		
		// 상속 안받은 객체는 불가능
		
		System.out.println("-- 부모배열 출력 --");
		for(int i=0;i<ani.length;i++) {
			ani[i].move();
		}
		
		// 자식의 고유메서드를 사용하고 싶으면....
		// 다운 캐스팅 가능. => 자식 메서드 사용할 수 있음.
		System.out.println("-- 다운캐스팅 --");
		//d2 : Animal => Dog
		Dog d_2 = (Dog)ani[0];
		d_2.walk();
		Tiger t_2=(Tiger)ani[1];
		t_2.hunting();
		
		// instanceof : 같은 클래스인지 확인하는 키워드
		System.out.println(ani[0] instanceof Tiger);
		
		for(int i=0; i<ani.length;i++) {
			if(ani[i] instanceof Dog) {
				((Dog)ani[i]).walk();
			}else if(ani[i] instanceof Tiger) {
				((Tiger)ani[i]).hunting();
			}else if(ani[i] instanceof Eagle) {
				((Eagle)ani[i]).flying();
			}else {
				System.out.println();
			}
			
		}
		
		System.out.println("-- 다형성 메서드 활용 --");
		Polymorphism01 p = new Polymorphism01();
		p.moveAnimal(d);
		
		for(int i=0;i<ani.length;i++) {
			p.moveAnimal(ani[i]);
		}
	}
	
	// main 메서드 뒷편
	public void moveAnimal(Animal animal) {
		animal.move();
	}

}

// Animal 상속을 안받은 객체
class Cat{

	public void move() {
		System.out.println("고양이는 살금살금  걷습니다.");
	}
}

class Tiger extends Animal{
	
	@Override
	public void move() {
		System.out.println("호랑이는 멋지게 걷습니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
}

class Eagle extends Animal{
	
	@Override
	public void move() {
		System.out.println("독수리는 날아다닙니다.");
	}
	
	public void flying() {
		System.out.println("독수리는 하늘을 날아다니며 사냥합니다.");
	}
}

class Dog extends Animal{

	@Override
	public void move() {
		System.out.println("강아지는 콩콩 걷습니다.");
	}
	
	public void walk() {
		System.out.println("강아지는 아침 저녁으로 산책을 합니다.");
	}
	
}

class Animal{
	public void move() {
		System.out.println("동물이 움직인다.");
	}
}

