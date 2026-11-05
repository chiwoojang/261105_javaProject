package day02;

import java.util.Random;

public class Math01 {

	public static void main(String[] args) {
		// Math 클래스 : 수학과 관련된 기능을 제공하는 클래스
		// Math.round(값) : 반올림 (정수로 반올림 => 소수자리수 0)  / 서버사이드에서는 거의 안 함
		// Math.floor(값) : 버림 => 소수자리수 0
		// Math.ceil(값) : dhffla => 소수자리수 0
		
		// Math.random() : 0~1사이의 아무수 => double
		
		double number = 3.145159;
		
		long pi = Math.round(number); // return long
		System.out.println(pi);
		
		// 실수의 기본자료형은 double, 정수의 기본자료형은 int
		
		int r = (int)Math.round(number);  //이런 식으로 많이 씀. 형변환은 Math에서 많이 씀.
		
		// floor()
		int floorNum = (int)Math.floor(number);  // return double
		
		// ceil()
		int ceilNum = (int)Math.ceil(number);  // return double
		
		// random() => return double
		double ran = Math.random()*10;
		System.out.println(ran);
		
		// 1~10까지 1자리를 랜덤 선택
		int random = (int)(Math.random()*10) + 1;  //형변환이 * 연산보다 우선하는 점 주의 따라서, 멀티플 () 로 묶어 줘야 함
		System.out.println(random);
		
		// (int)(Math.random()*count) + start  //count : 수의 개수 , start : 시작값
		// 주사위 값 (1~6) => (int)(Math.random()*6) + 1
		System.out.println("주사위 값 랜덤");
		System.out.println((int)(Math.random()*6) + 1);
		// 로또 번호 (1~45) => (int)(Math.random()*45) + 1
		System.out.println("로또 값 랜덤");
		System.out.println((int)(Math.random()*45) + 1);
		
		// Random() 클래스도 존재 new Random()
		Random random1 = new Random();
		//random1.nextInt(10); // int 자료형으로 랜덤 값을 리턴   nextInt(count) + start
		System.out.println(random1.nextInt(10)+1);
		
		// Math.max(값1,값2) / Math.min(값1,값2)
		System.out.println(Math.max(10,20));
		System.out.println(Math.min(10,20));
		
		
	}

}
