package day08;

import java.util.Random;

public class Method04 {
	// 메서드 활용
	/* 1. 랜덤수(0~100) 정수 5개를 담는 배열을 생성하여 리턴하는 메서드
	 * 2. 정수 배열을 받아 평균값을 리턴하는 메서드
	 *   - 단, 정수 배열이 없거나, 갯수가 0이면 처리 불가 (평균을 처리할 수 없다 : 메인에서)
	 * 3. 정수 배열을 받아 출력하는 메서드
	 *   - 78 96 85 45 58
	 * 
	 * 	배열 생성 => 배열 출력 => 평균 출력 
	 * */
	
	// 멤버변수
	Random r = new Random();  // 여러 메서드 안에서 사용한다면.. 하나의 멤버변수를 만들어 공유해 씀
	
	/* 1. 랜덤수(0~100) 정수 5개를 담는 배열을 생성하여 리턴하는 메서드
	 * 매개변수 : 없음
	 * 메서드명 : getArr
	 * 리턴타입 : int[]
	 * */

	public int[] makeRandom() {
		int rnd[] = new int[5];
		for(int i=0;i < rnd.length;i++) {
//			rnd[i] = (int)(Math.random()*101);
			rnd[i] = r.nextInt(101);
		}
		return rnd;
	}
	
	/* 2. 정수 배열을 받아 평균값을 리턴하는 메서드
	 * 매개변수 : int[] arr
	 * 메서드명 : avg
	 * 리턴타입 : double
	 * */
	public double average(int[] arr) {
		// 예외처리 : arr 이 null || 길이가 0일 때 // -999999 리턴
		if(arr == null || arr.length<=0) {
			return -999999;
		}		
		int sum=0;
		for(int i : arr) {
			sum += i;
		}
		return (double)sum/arr.length;
	}
	
	
	/* 정수 배열을 받아 출력하는 메서드
	 * 매개변수 : int[] arr
	 * 메서드명 : print
	 * 리턴타입 : void
	 * */
	public void print(int[] arr) {
		if(arr==null) {
			return;
		}
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();  //줄바꿈
	}
	
	
	public static void main(String[] args) {
		// 객체생성
		Method04 m = new Method04();
		
		// 배열을 생성한다.
		int rnd[] = m.makeRandom();
		// 배열 출력
		m.print(rnd);	
		// 평균출력 (예외 출력 포함)
		double avg = m.average(rnd);
		if(avg==-999999) {
			System.out.println("평균을 구할 수 없습니다.");
		}else {
			System.out.println("평균 : " + avg);
		}

	}

}
