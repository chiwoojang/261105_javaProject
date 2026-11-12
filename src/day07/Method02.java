package day07;

public class Method02 {
	/* 메서드 => 기능을 정의하는 역할 (함수)
	 * 제급제어자 리턴타입 메스드명(매개변수){
	 * 	구현;
	 *  (return;)
	 * }
	 * 
	 * - 리턴타입 : 기능을 구현 후 결과로 반환하는 값의 타입
	 * - 매개변수 : 기능을 구현하기 위해 외부에서 받아와야 하는 값
	 * - 메서드명 : 의미있게 소문자로 작성(카멜케이스)
	 * */
	
	// 메서드 생성 영역
	// + - * / %
	// 두 정수를 주고(매개변수) 각 연산의 결과를 리턴하는 메서드
	
	/* 기능 : 더하기
	 * 매개변수 : int num1, int num2
	 * 메서드명 : sum
	 * 리턴타입 : int
	 * */
	public int sum(int num1,int num2) {
		return num1 + num2;
	}
	
	/* 기능 : 빼기
	 * 매개변수 : int num1, int num2
	 * 메서드명 : sub
	 * 리턴타입 : int
	 * */
	public int sub(int num1,int num2) {
		return num1 - num2;
	}
	
	/* 기능 : 곱하기
	 * 매개변수 : int num1, int num2
	 * 메서드명 : multi
	 * 리턴타입 : int 
	 * */
	public int multi(int num1,int num2) {
		return num1*num2;
	}
	
	/* 기능 : 나누기  (0으로 나눌때는 어떻게 처리할 것인가)
	 * 매개변수 : int num1, int num2
	 * 메서드명 : divide
	 * 리턴타입 : Double (null 값을 받을 거라서 Wrapper 객체 사용)
	 * */
	public Double div(int num1,int num2) {
		if(num2 !=0) {
			return (double)num1/num2;
		}else {
			return null;
		}			
	}
	
	/* 기능 : 나머지 (0으로 나눌때는 어떻게 처리할 것인가)
	 * 매개변수 : int num1, int num2
	 * 메서드명 : mod
	 * 리턴타입 : int
	 * */
	public int mod(int num1,int num2) {
		if(num2!=0) {
			return num1%num2;
		}else {
			return -1;
		}
	}
	
	
	public static void main(String[] args) {
		// 메서드 호출 영역
		int num1 = 10;
		int num2 = 3;
		
		Method02 m2 = new Method02();
		
		int sum = m2.sum(num1, num2);
		System.out.println("sum:" + sum);
		int sub = m2.sub(num1, num2);
		System.out.println("sub:" + sub);
		int multi = m2.multi(num1, num2);
		System.out.println("multi:" + multi);
		Double divide = m2.div(num1, num2);
		if(divide!=null) {
			System.out.println("divide:" + divide);
		}else{
			System.out.println("0으로 나눌 수 없습니다.");
		}
		int mod = m2.mod(num1, num2);
		if(mod != -1) {
			System.out.println("mod:"+mod);
		}else {
			System.out.println("0으로 나눌 수 없습니다.");
		}

	}

}
