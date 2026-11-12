package day07;

public class Method01 {

	// 메서드 작성 위치
	/* 두 정수가 주어지면 두 수의 합을 리턴하는 메서드
	 * 매개변수 : int a, int b
	 * 메스드명 : sum
	 * 리턴타입 : int
	 * */
	public int sum(int a, int b) {
		return a+b;
	}
	
	/* 두 정수가 주어지면 두 수의 합을 출력하는 메서드
	 * 매개변수 : int a, int b
	 * 메스드명 : sumPrint
	 * 리턴타입 : void
	 * */
	public void sum2(int a, int b) {
		System.out.println(a+"+"+b+"="+(a+b));
	}
	
	/* 매개변수가 없는 케이스 / return 은 있는 케이스 
	 * 매개변수 : 없음
	 * 메스드명 : sum3
	 * 리턴타입 : int
	 * 	 * */
	public int sum3() {
		int a = 10;
		int b = 8;
		return a+b;
	}
	
	/* 매개변수도 없고, 리턴도 없다.
	 * 매개변수 : 없음
	 * 메스드명 : sum4
	 * 리턴타입 : void
	 * */
	public void sum4() {
		int a = 10;
		int b = 8;
		System.out.println(a+b);
	}
	
	
	public static void main(String[] args) {
		// 실행용 메인 메서드
		int num1 = 100;
		int num2 = 80;
		
		// 객체 생성 후 출력
		Method01 m = new Method01();
		int sum = m.sum(num1, num2);
		System.out.println(sum);
		m.sum2(num1, num2); // 출력구문 포함
		System.out.println(m.sum3());
		m.sum4();
	}
	
	// 메서드 작성 위치

}
