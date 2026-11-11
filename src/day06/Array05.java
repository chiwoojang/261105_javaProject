package day06;

import java.util.Arrays;

public class Array05 {

	public static void main(String[] args) {
		// 숫자 5개를 입력할 수 있는 배열을 생성
		// 랜덤으로 0~100까지의 숫자를 입력
		// 합계 출력
		
		int[] arr = new int[5];
		int sum = 0;
		
		for(int i=1;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*101);
			sum += arr[i];
		}
		
		// 전체 보기 비교, 연산 X
		System.out.println(Arrays.toString(arr));
		System.out.println("합계 : " + sum);
//		System.out.println(Arrays.stream(num).sum());
//		System.out.println(Arrays.stream(num).min());
		
		// 비교, 연산 O
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("------------------");
		// 향상된 for
		// for(출력할리스트의자료형 임의변수갑 : 리스트){ }
		// 원본의 리스트를 하나씩 순차적으로 임의 변수값에 저장 => 처리문 실행
		// 값복사해 오기 때문에 원본을 변경 X
		sum = 0;
		for(int tmp : arr) {  
			System.out.println(tmp);
			if(tmp >=6) {
				sum += tmp;
			}
		}
		
		
		
	}

}
