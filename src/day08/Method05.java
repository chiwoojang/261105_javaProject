package day08;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import day07.Exam01T;

public class Method05 {
	
	// 배열을 받아 오름차순 정렬하는 메서드
	/* 매개변수 : 정수배열 => int[] arr
	 * 메서드명 : sortUp
	 * 리턴타입 : void
	 * */
	public void arraySort(int[] arr) {
		if(arr==null) {
			return;
		}
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}				
			}
		}
	}	
	// 배열을 받아 최대값을 리턴하는 메서드
	/* 매개변수 : 정수배열 => int[] arr
	 * 메서드명 : max
	 * 리턴타입 : int
	 * */
	public int arrayMax(int[] arr) {
		if(arr==null) {
			return -999999;
		}		
		int max = arr[0];
		for(int num : arr) {
			if(num>max) {
				max = num;
			}
		}
		return max;
	}
	
	// 배열을 받아 최소값을 리턴하는 메서드
	/* 매개변수 : 중수 배열 => int[] arr
	 * 메서드명 : min
	 * 리턴타입 : int
	 * */
	public int arrayMin(int[] arr) {
		if(arr==null) {
			return -999999;
		}		
		int min = arr[0];
		for(int num : arr) {
			if(num<min) {
				min = num;
			}
		}
		return min;
	}
	
	// 배열을 받아 합계, 평균, 최대, 최소 출력 메서드
	/* 매개변수 : 정수배열 => int[] arr
	 * 메서드명 : printStat
	 * 리턴타입 : void
	 * */
	public void printStat(int[] arr) {
		Exam01T e01 = new Exam01T();
		int sum = e01.sum(arr);
		double avg = e01.avg(arr);
		int max = arrayMax(arr);
		int min = arrayMin(arr);
		
		if(max==-999999 || min==-999999 || avg==-999999) {
			System.out.println("배열 오류!!");
		}else {
			System.out.printf("합계:%4d, 평균:%.2f, 최대:%3d, 최소%3d \n",sum,avg,max,min);
		}
	}
	
	// 메서드는 같은 이름의 메서드 가능. => 메서드 오버로딩
	// 오버로딩 저건
	// 매개변수가 달라야 함. (타입이 달라야 함, 개수가 달라야 함)
	
	
	public static void main(String[] args) {
		/*
		 * 1. 배열을 받아 출력하는 매서드  - 호출 가능
		 * 2. 배열을 받아 오름차순 정렬하는 메서드
		 * 3. 배열을 받아 합계, 평균, 최대, 최소를 출력하는 메서드
		 *   - 합계와 평균은 다른 메서드를 호출 Exam01
		 *   - 최대, 최소 하는 것 하나 작성
		 * */
		
		int[] arr = {34,56,87,67,97,67,45,90,89,59,77,59,86,100};
		
		Method04 m4 = new Method04();
		m4.print(arr);
		
		// 배열을 오름차순으로 정렬
		Method05 m5 = new Method05();
		m5.arraySort(arr);
		m4.print(arr);
		m5.printStat(arr);
		
//		// List로 받고, 람다식으로 필터링 후, 출력
////		List<String> names = List.of("Jangehee","Eunsoo","Younghoon","Bob","Jim");
//		List<String> names = new ArrayList<>();
//		names.add("Chelwon");
//		names.add("Bip");
//		names.add("SomeTong");
//		names.addAll(List.of("ddingdong","asdficd","nam","Nocking"));
//		names.stream()
//			.filter(name->name.length()>=5)
//			.forEach(name -> System.out.println(name));
//		
//		Map<String, Integer> map = new HashMap<>();
//		map.put("jang", 90);
//		map.put("hong", 85);
//		map.put("nam", 57);
//		
//		map.forEach((a,b)->{System.out.println(a+":"+b);}
//				);
		
		
	}

}
