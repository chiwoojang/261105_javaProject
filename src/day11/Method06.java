package day11;

public class Method06 {
	
	// method
	public int sum(int num1,int num2) {
		return num1 + num2;
	}
	
	public double sum(double num1,double num2) {
		return num1 + num2;
	}
	
	public int sum(int num1, int num2, int num3) {
		return num1+num2+num3;
	}

	public static void main(String[] args) {
		// 메서드 오버로딩 : 
		/* 동일한 이름의 메서드를 여러개 만드는 방법
		 * - 동일한 기능을 매개변수의 개수가 다른, 매개변수의 타입이 다른 경우에 사용
		 * - 오버로딩의 조건
		 * 1. 매개변수의 개수가 다를 것.
		 * 2. 매개변수의 타입이 다를 것.
		 * 리턴은 상관없음. 매개변수의 이름도 상관없음. 
		 * */
		Method06 m = new Method06();
		System.out.println(m.sum(3.2, 4.5));

	}

}
