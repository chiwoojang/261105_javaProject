package day11;

public class Method08 {

	// fact : 숫자를 입력받아 1~숫자까지 곱한 값을 리턴하는 메서드
//	public int fact(int num) {
//		if(num<=1) {
//			return 1;
//		}else {
//			int total = 1;
//			for(int i=2;i<=num;i++) {
//				total *= i; 
//			}
//			return total;
//		}
//	}
	
//	public long fact(int num) {
//		if(num <=1) {
//			return 1;			
//		}		
//		return num*fact(num-1);
//	}
	public int fact(int num) {
		if(num <0) {
			return 0;
		}
		if(num ==0 || num==1) {
			return 1;
		}
		int result = 1;
		for(int i=1;i<=num;i++) {
			result *= i;
		}
		return result;
	}
	
	// 재귀매서드로 변경  ==> 특별한 경우 빼고는 잘 안씀
	public static int factorial(int num) {
		if(num <0) {
			return 0;
		}
		if(num ==0 || num==1) {
			return 1;
		}
		
		return num*factorial(num-1); //5*4*3*2*1
	}
	
	public static void main(String[] args) {
		// 재귀메서드 : 메서드 안에 자신의 매서드를 호출하는 메서드  => 끝이 정해져 있을 때만 사용 가능
		// ! : 팩토리얼 (예시)
		// 1부터 자신의 수까지 곱한 값을 리턴
		/* 0! => 1
		 * 1! => 1
		 * 2! = 1*2
		 * 3! => 1*2*3
		 * 4! => 1*2*3*4
		 * 5! => 1*2*3*4*5
		 * 
		 * */
		Method08 m = new Method08();
		System.out.println(m.fact(5));
		System.out.println(m.factorial(5));
	}

}
