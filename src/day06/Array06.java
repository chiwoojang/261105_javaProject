package day06;

import java.util.Arrays;

public class Array06 {

	public static void main(String[] args) {
		// 10개의 숫자를 가지는 배열
		// 0 ~ 100까지 랜덤수를 배열에 저장 => 출력
		// 합계, 평균, 최대, 최소 출력
		int[] arr = new int[10];
		
		// 입력을 받는다.
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*101);
		}
		System.out.println(Arrays.toString(arr));
		
		// 초기화
		int max=arr[0];
		int min=arr[0];
		int sum=0;
		
		// 원본을 건드릴 필요가 없으므로, 향상된 for 문을 사용해 간단히 작성
		for(int tmp : arr) {
			//max
//			if(tmp > max) {
//				max = tmp;
//			}
//			//min
//			if(tmp < min) {
//				min = tmp;
//			}
			
			max = Math.max(max, tmp);
			min = Math.min(min, tmp);
			//sum
			sum += tmp;
		}
		double avg=(double)sum/arr.length;
		
		System.out.println("합계: " + sum + ", 평균: "+avg+", 최대: " + max + ", 최소: " + min);
		

	}

}
