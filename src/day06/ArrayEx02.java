package day06;

import java.util.Arrays;
import java.util.Collections;

public class ArrayEx02 {

	public static void main(String[] args) {
		// 정수배열[10] => 0~100까지 랜덤으로 채우기 => 출력
		// 오름차순으로 정렬 => 출력 (직접 적어 봄)
		//int arr[] = new int[10];
		Integer arr[] = new Integer[10];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*101);			
		}
		
		System.out.println(Arrays.toString(arr));
		
		//오름차순 정렬
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] > arr[j]) {
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		// Collections.reserseOrder() => Object
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr,Collections.reverseOrder());  //기본 자료형은 안됨
		System.out.println(Arrays.toString(arr));
		

	}

}
