package day16;

import studentManagerT.Student;

public class Generic01 {

	public static void main(String[] args) {
		// 제네릭 : Generics : 데이터의 타입을 나중에 결정하는 방식
		/* 클래스나 메서드를 생성할 때 어떤 객체가 들어와도 유연성 있는 객체를 생성하고 싶을 때
		 * 제네릭 타입으로 구현 => 나중에 실제 객체가 생성될 때 타입으 ㄹ확정하여 구현
		 * 
		 * 객체의 타입을 컴파일 할 때 체크가 가능하며, 타입의 안정성을 헤치지 않는 선에서
		 * 적당히 형변환 가능
		 * 
		 * T(type), E(element), K(Key), V(value)
		 * 
		 * 들어오는 타입에 대한 제한 키워드
		 * <?> : 모든 타입 가능 (화일드카드)
		 * <? extends U> : U와 그의 자식들만 가능 (상한 경계)
		 * <? super U> : U와 그의 조상들만 가능 (하한 경계)
		 * 
		 * */
		Test t = new Test();  // <>정의를 안하면 Object
		
		t.setItem(123);
		System.out.println(t.getItem());
		
		int sum = (int)t.getItem() + 100;
		System.out.println(sum);
		
		
		Test<String> t1 = new Test<String>();
		t1.setItem("123");
		System.out.println(t1.getItem().equals("123"));
		
		Test<Student> t2 = new Test<>();
		t2.setItem(new Student("111","홍길동"));
		t2.getItem().printStudent();
		
		

	}

}

class Test<T>{
	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
}
