package day05;

import java.util.Arrays;
import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 배열
//		int arr[] = new int[5];
//		
//		// 사용자의 입력
//		for(int i=0;i<arr.length;i++) {
//			System.out.println("점수 입력 >");
//			arr[i] = scan.nextInt();
//			System.out.println(arr[i]);
//		}
		
//		System.out.println(Arrays.toString(arr));
		
		//-----------------------------
		// 0 ~ 100 사이의 점수를 랜덤으로 입력
		
		int arr2[] = new int[10];
		int sum=0;
				
		for(int i=0;i < arr2.length;i++) {			
			arr2[i] = (int)(Math.random()*101);
			sum += arr2[i];
		}
		
		System.out.println(Arrays.toString(arr2));
		System.out.println("총합계:"+sum);
		System.out.println("평균:" +(sum/(double)arr2.length));
		
		scan.close();
		

	}

}
