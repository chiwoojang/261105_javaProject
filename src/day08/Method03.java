package day08;

public class Method03 {
	/* 변수의 종류
	 * 지역변수 : 메서드 안에서 사용 (일반변수)
	 * 매개변수 : 메서드에서 전달 받는 변수
	 * 멤버변수 : 클래스의 속성 (클래스 안에서 사용)
	 * 
	 * 모든 변수의 스코프는 {   } 
	 * 
	 * ----------------------
	 * 
	 * 변수가 어떤 것을 저장하느냐에 따라 분류
	 * 일반변수 : 값을 저장  => 기본 8 자료형
	 * 참조변수 : 주소를 저장 => 그외
	 * 
	 * */
	
	int a;  // 멤버변수
	
	/* 정수 하나를 입력받아 해당 정수의 구구단을 출력
	 * 매개변수 : 정수 -> int a
	 * 메서드명 : gugudan
	 * 리턴타입 : void
	 * */
	
	public void gugudan(int a) {
		for(int i=1;i<10;i++) {
			System.out.println(a+"*"+i+" = " + (a*i));
		}
	}
	
	/* 정수 하나를 입력받아 해당 정수의 구구단을 돌려줌
	 * 매개변수 : 정수 -> int a
	 * 메서드명 : gugudan2
	 * 리턴타입 : int[]
	 * */
	
	public int[] gugudan2(int a) {
		int[] num = new int[9];
		for(int i=0;i<num.length;i++) {
			num[i] = a*(i+1);
		}
		return num;
	}
	
	/* 정수 하나를 입력받아 해당 정수의 구구단 정수배열에 넣어 돌려 줌
	 * 매개변수 : 정수, 정부 배열 -> int a, int[] arr
	 * 메서드명 : gugudan3
	 * 리턴타입 : void
	 * */
	
	public void gugudan3(int a,int[] arr) {
		for(int i=0;i<=arr.length;i++) {
			arr[i] = a*(i+1);
		}
	}	
	
	
	public static void main(String[] args) { // String[] args => 매개변수 
		/*
		 * 
		 * */
		int number = 0;  //지역변수
		
		// 구구단 출력하는 메서드
		Method03 m = new Method03();
//		m.gugudan(4);
		
//		Object a = 1;
//		boolean c = (a instanceof Integer);
//		System.out.println(c);
		
//		// gugudan2
//		int seed2 = 2;
//		int[] gugu2 = m.gugudan2(seed2);
//		for(int i=0;i<gugu2.length;i++) {
//			System.out.println(seed2+"*"+(i+1)+" = " + gugu2[i]);
//		}
		
		// 구구단 메서드를 활용하여, 전체 구구단 출력
		for(int i=2;i<=9;i++) {
			m.gugudan(i);
		}
		
		
	}

}
