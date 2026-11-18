package day12;

public class Super01 {

	public static void main(String[] args) {
		// 상속 : 부모의 멤버를 자식에게 물려주는 것 (생성자, 초기화는 못 줌)
		/* - 멤버변수 / 멤버메서드만 상속 가능
		 * - 클래스의 확장 개념
		 * - 상속을 하는 이유 : 코드의 재사용, 중복 제거, 유지보수 유리
		 * 
		 * - class A(자식) extends B(부모){
		 *   구현
		 *   }
		 *   
		 * - 상속 키워드 : extends
		 * - 상속 받으면 부모의 멤버변수와, 부모의 메서드를 사용할 수 있다.
		 * - 부모의 접근제어자가 private이면 자식도 접근 불가능
		 * - 접근제어자 protected : 상속받는 자식에게 허용하는 제어자
		 * - 상속은 단일상속이 원칙
		 *   
		 * */
		B b = new B();  //부모 클래스 객체
		b.c = 10;
		b.d=20;
		b.e=30;
		b.print();
		
//		System.out.println(b);
		
		A a = new A();  //자식 클래스 객체
//		System.out.println(a);
		a.c = 1;
		a.d = 2;
		a.e = 3;
		a.print();
//		System.out.println(a);
		a.printA();
		System.out.println(a.c);

	}

}

class C extends B{
	
}

class A extends B{
	// 자식 클래스
	private int num1, num2;
	
	// 부모에게서 상속받은 멤버변수를 사용하기 위해서는
	// super.멤버변수 / super.메서드() 로 사용하기
	
	// 내 메서드 생성 printA
	public void printA() {
		// 부모의 멤버변수를 가져와서 출력
		System.out.println("--A객체에서 출력--");
		super.setA(111);
		super.setB(222);
		super.c = 333;
		System.out.println("a => "+super.getA());
		System.out.println("b => "+super.getB());
		System.out.println("c => "+super.c);
//		this.c = 100;
		
	}
	
	// 부모 print를 가져와서 내 멤버변수를 추가해서 출력
	// orverride(오버라이드) : 부모의 메서드를 재정의해 사용하는 것.
	// super : 부모의 값을 가져올 때 사용하는 키워드
	// this : 내 멤버를 지칭할 때 사용하는 키워드
	
	
	@Override
	public void print() { // 이 부분은 건드리지 말것
		// TODO Auto-generated method stub
		super.print();  //부모의 출력
		System.out.println("num1: "+num1+", num2:"+num2);
	}
	

	public int getNum1() {
		return num1;
	}


	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	@Override
	public String toString() {
		return "A [num1=" + num1 + ", num2=" + num2 + ", c=" + c + ", d=" + d + ", e=" + e + "]";
	}
		
}

class B{
	// 부모 클래스
	private int a,b;  // 나만 사용
	protected int c,d; // 자식도 가능
	public int e;
//	{
//		a=100;
//	}
	
	public void print() {
		System.out.print("a:"+a+" ");
		System.out.print("b:"+b+" ");
		System.out.print("c:"+c+" ");
		System.out.print("d:"+d+" ");
		System.out.print("e:"+e+" ");
		System.out.println();		
	}
	
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	
	@Override
	public String toString() {
		return "B [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", e=" + e + "]";
	}
		
	
}
