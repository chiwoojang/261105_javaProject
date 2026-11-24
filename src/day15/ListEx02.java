package day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListEx02 {

	public static void main(String[] args) {
		/* 숫자를 입력받아 이르스트로 출력
		 * 출력 => 전체 합계
		 * 입력 형식 String => String[] => list<Integer>
		 * 47,85,96,45,78,36,15 enter
		 * 
		 * */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력해 주세요 (23,45,34....) >");
		String s = scan.nextLine();
		String[] arrS = s.split(",");
//		System.out.println(Arrays.toString(arrS));
		
		// 입력값이 Integer List 변환과정에서 예외처리가 발생할 수 있어 처리
		try {
			ListEx02 li = new ListEx02();
			List<Integer> scores = new ArrayList<>();
//			for(String tmp : arrS) {
//				scores.add(Integer.parseInt(tmp));
//			}
			// 함수를 활용해 봄
			scores = li.toIntegerList(arrS);
			
//			List<Integer> scores2 = li.toIntegerList(arrS);
//			System.out.println(scores2);
			
			System.out.println(scores);
			
			// 향상된 for
			int sum = 0;
			for(int score : scores) {
				sum += score;
			}
			
			System.out.println("합계점수 : " + sum);
			
			// Iterator
			sum = 0;
			Iterator<Integer> it = scores.iterator();
			while(it.hasNext()) {
				sum += it.next();
			}
			System.out.println("합계점수 : " + sum);
			
			// 함수를 사용해 봄
			System.out.println("합계점수 : " + li.add(scores));
			
			// 정렬
			Collections.sort(scores);
			System.out.println(scores);
			System.out.println("최소값 : " + scores.get(0) + ", 최대값 : " + scores.get(scores.size()-1));
			
		} catch (Exception e) {
			System.out.println("숫자만 입력해 주세요.");
	
		}
		
		
		
		scan.close();

	}
	
	public int add(List<Integer> list){
		int sum=0;
		
		for(int i : list) {
			sum += i;
		}
		
		return sum;
	}
	
	public List<Integer> toIntegerList(String[] arr){
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			list.add(Integer.parseInt(arr[i].trim()));
		}
		
		return list;
	}

}
