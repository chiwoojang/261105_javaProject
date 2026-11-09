package day05;

import java.util.Arrays;
import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		// 배열생성 
		// 5명의 점수를 입력받기 (0~100)
		// 합계와 평균을 출력
		// 입력값의 범위가 벗어나면 다시 입력받기
		
		Scanner scanner = new Scanner(System.in);
		
		int[] score = new int[5];
		int sum = 0;
		
		for(int i=0;i<score.length;i++) {
			System.out.println("점수를 입력해 주세요 (1~100) >");
			int tmpScore = scanner.nextInt();
			//점수가 잘못되었으면, 해당 i 번째 점수를 맞을 때까지 재입력 받는다.
			while(tmpScore <0 || tmpScore>100) {
				System.out.println("점수 범위가 잘못되었습니다. 다시 입력해 주세요. (1~100) >");
				tmpScore = scanner.nextInt();
			}			
			score[i] = tmpScore;
			sum += score[i];
		}
		System.out.println(Arrays.toString(score));
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (sum/(double)score.length));
		
		scanner.close();

	}

}
