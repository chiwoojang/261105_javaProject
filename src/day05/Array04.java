package day05;

import java.util.Arrays;

public class Array04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {23,4,556,46,35,356,42,8,5,24};
		
		// 합계와 평균 출력
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];			
		}
		
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+(sum/(double)arr.length));
		
		// 가장 큰 값, 가장 작은 값
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		
		//Math.max(a,b), Math.min(a,b)를 이용해 최대, 최소값 출력
		max = arr[0];
		min = arr[0];
		for(int i=0;i<arr.length;i++) {
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);

		
		String str = "this is a simple test";
//		for(int i=0;i<str.length();i++) {
//			System.out.print(str.charAt(i));
//		}
//		System.out.println();
//		System.out.println(str.toUpperCase());
//		System.out.println(str.indexOf("is"));
//		System.out.println(str.substring(3,6));
//		System.out.println(str.contains("ab"));
//		String res = str.replace("simple", "difficult");
//		System.out.println(res);
//		res = str.replaceAll("is","Is");
//		System.out.println(res);
//		String[] arrStr = str.split(" ");
//		System.out.println(Arrays.toString(arrStr));
//		String strJoin = String.join("-", arrStr);
//		System.out.println(strJoin);
	}

}
