package day17;

public class InnerClass {

	public static void main(String[] args) {
		// InnerClass : 내부클래스
		/* 클래스 내부에 클래스를 선언할 경우
		 * - 외부 클래스가 직접 쓰려고(필요에 의해) 선언하는 경우가 많고, 다른 클래스에서 
		 *   해당 내부 클래스의 사용이 없고, 외부만(나만) 해당 클래스를 사용하려고 할 때
		 * - 중첩 클래스라고도함. 
		 * 
		 * 내부용이기 때문에 클래스를 private으로 선언하고 사용하는 것을 권장.
		 * 내부클래스는 외부 클래스가 생성 된 후 생성됨.
		 * 
		 * private이 아닌 내부클래스는 다른 외부에서 접근이 가능함.
		 * */
		
		Test test = new Test();
		test.usingClass();
		System.out.println("-------------------");
		// 내부 클래스 객체를 가져와서 직접 내부 메서드 호출
		test.getInClass().innerTest();  
		
		System.out.println("-------------------");
		// innerClass에 직접접근 => 잘 사용안함. => 따라서 private class.... 로 주로 생성함.
		Test.TestInner inClass = test.new TestInner();
		inClass.innerTest();

	}

}  

class Test{
	// 외부 클래스
	private int num=10;
	private static int sNum=20;
	private TestInner inClass;  //내부 클래스 객체를 저장할 멤버변수
	
	public Test() {
		inClass = new TestInner();  //내부에 생성되어 있어야 사용할 수 있다.
	}
	

	
	class TestInner{  // 꼭 필요한 나만의 클래스가 필요할 때만 사용
		//내부 클래스
		int innerNum = 100;
		static int innerSNum = 200;
	
		void innerTest() {
			System.out.println("testClass num : "+num);
			System.out.println("testClass sNum : "+sNum);
			System.out.println("innerTestClass innerNum :"+innerNum);
			System.out.println("innerTestClass innerSNum :"+innerSNum);
			
//			void innerMethod() {}  //메서드는 내부에 다른 메서드를 가질 수 없음.
		}
	}
	
	//TestInner 클래스의 내부 메서드를 호출하는 메서드
	public void usingClass() {
		// 내부 클래스 객체를 통해서 호출
		System.out.println("Test class 에서 호출됨.");
		inClass.innerTest();
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public TestInner getInClass() {
		return inClass;
	}

	public void setInClass(TestInner inClass) {
		this.inClass = inClass;
	}
	
	
}
