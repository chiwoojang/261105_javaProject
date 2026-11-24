package day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListEx02T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 숫자를 입력받아 이르스트로 출력
		 * 출력 => 전체 합계
		 * 입력 형식 String => String[] => list<Integer>
		 * 47,85,96,45,78,36,15 enter
		 * 
		 * */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("점수 입력(,로 구분) >");
		String number = scan.next();
		
		
		String[] num = number.split(",");
		Integer[] arr = new Integer[num.length];
		for(int i=0;i<num.length;i++) {
			arr[i] = Integer.parseInt(num[i]);
		}
		System.out.println("-- 숫자배열 --");
		System.out.println(Arrays.toString(arr));
		
		
		int sum = 0;
		List<Integer> list = new ArrayList<>();
		// add()
		
		for(String n : num) {
			int score = Integer.parseInt(n);
			list.add(score);
			sum += score;
		}
		
		System.out.println("-- 숫자리스트 --");
		System.out.println(list);
		System.out.println(sum);
		
		System.out.println("-- 숫자리스트2 --");
		List<Integer> list2 = new ArrayList<>(Arrays.asList(arr));  // int 배열은 안 됨, Integer 배열 됨.
		System.out.println(list2);
		

	}

}
