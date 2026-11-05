package day03;

import java.util.Random;
import java.util.Scanner;

public class For02 {
		
	public static void main(String[] args) {
		// for문을 사용하여 1~100까지의 합계 출력
		
		int sum = 0;  // local variable (지역변수:메서드 안에서 사용하는 변수) : 반드시 초기화
		for(int i=1; i<=100; i++) {
			sum += i;
		}
		System.out.println("합계 : " + sum);
		
		// for문을 사용하여 1~100까지의 짝수합, 홀수합을 출력
		int sumEven = 0;
		int sumOdd = 0;
		for(int i=1; i<=100;i++) {
			if(i%2==0) {
				sumEven += i;
			}else {
				sumOdd += i;
			}
		}
		System.out.println("짝수 합 : " +sumEven);
		System.out.println("홀수 합 : " +sumOdd);
	
		// for문이 입력받은 n의 배수의 합을 구함
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("100이내의 배수값 입력 : ");
		//int baesu = scanner.nextInt();
		int baesu = (int)(Math.random()*10)+1;
		
		int sumBaesu = 0;
		
		for(int i=1; i<=100; i++) {
			if(i%baesu==0) {
				sumBaesu += i;
			}
		}
		System.out.println(baesu + "의 배수 합계 : " + sumBaesu);		
		
		// for 1~10까지의 랜덤수를 5번 출력 및 합산
		Random random = new Random();
		int sumRandom = 0;
		for(int i=0;i<5;i++) {
			//int rand = (random.nextInt(10)+1);
			int rand = (int)(Math.random()*10) + 1;
			System.out.print(rand + " ");
			sumRandom += rand;
		}
		System.out.println();
		System.out.println("랜덤 수 합계 : " + sumRandom);

	}

}
