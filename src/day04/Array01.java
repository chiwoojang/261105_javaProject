package day04;

import java.util.Arrays;

public class Array01 {

	public static void main(String[] args) {
		// Array : 배열
		// 같은 타입의 같은 의미를 가지는 변수의 집합
		
		/* 기본 8개의 자료형(기본형 변수) 빼고는 전부 클래스자료형(참조형 변수)
		 *  new 키워드로 생성
		 *  배열 선언 방법
		 *   - 타입 배열명[]; // 아직 배열객체를 생성하지 않은 상태
		 *   - 타입[] 배열명; // 기본값은 null 할당
		 *   
		 *   타입[] 배열명 = new 타입[길이]; 
		 *   생성된 배열안의 변수값은 자동으로 초기화가 이루어 짐.
		 *   숫자타입 = 0 / 문자타입 = null
		 *   
		 *   int[] arr = new int[5];
		 *   int[] arr = new int[]{1,2,3,4,5,6};
		 *   int[] arr = {1,2,3,4,5,6}; // test할 때 많이 씀
		 *   
		 *   배열의 길이는 0 이상이어야 함. (- 는 허용안됨)
		 *   밸열의 index는 0부터 시작
		 *   배열[5] => 0 1 2 3 4 => 마지막번지는 [개수-1]
		 *   배열의 총길이 => length => 마지막 번지는 [length-1]
		 * */
		
		int[] arr; //null-stack에 생성- 선언만 객체는 X
		arr = new int[5]; // 선언한 변수에 객체 연결
		
		int[] arr1 = new int[5]; // 만든 5개 배열값은 0으로 초기화
		int[] arr2 = new int[] {1,2,3,4,5,6,7,8}; 
		int[] arr3 = {10,20,30,40,50};
		
		// 배열명[번지]
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println(arr2[3]);
		System.out.println(arr2[4]);
		//System.out.println(arr2[5]); : java.lang.ArrayIndexOutOfBoundsException:
		System.out.println("-----------------------");
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("arr2 length : " + arr2.length);

		//----------------
		// 변수명 = 값  arr[0] = 100;
		arr[0] = 100;
		arr[1] = 101;
		arr[2] = 200;
		arr[3] = 201;
		arr[4] = 300;
		//arr[5] = 340; : java.lang.ArrayIndexOutOfBoundsException:
		for(int i=0;i<arr.length;i++) {
			arr[i] = i+100;
		}
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		//---------------
		// arr4 [10] 칸을 가지는 int 배열을 생성
		// 1 ~10 까지 반복적으로 저장 => 출력
		
		System.out.println("-----------");
		int[] arr4 = new int[10];
		for(int i=0;i<arr4.length;i++) {
			arr4[i] = i+1;
			System.out.println(arr4[i]);
		}
		
		// Arrays.toString(배열) : 출력제공
		System.out.println(Arrays.toString(arr4));

	}

}
