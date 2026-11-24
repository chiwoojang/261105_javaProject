package day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListEx01 {

	public static void main(String[] args) {
		// 배열의 값을 리스트로 가져오기
		
		String[] arr1 = {"a","b","s","q","d","l"};
		String[] arr2 = {"c","s","z","s","l","u"};
		arr1[0] = "z";
		
		System.out.println("-- 배열 --");
		System.out.println(Arrays.toString(arr1));
		// 리스트 만들기
		List<String> list1 = new ArrayList<>();
		list1 = Arrays.asList(arr1);
		
		//list1.add("abc"); //UnsupportedOperationException
		// 지원하지 않는 작업을 요청했을 때 발생하는 예외
		System.out.println(list1.contains("b"));
		System.out.println("-- 복사한 리스트 --");  // 얕은 복사 -> 주소만 복사 -> 길이늘리기 등 못함
		System.out.println(list1);
		
		// 깊은 복사 : 실제 값을 리스트로 복사해 와서 리스트로 생성 -> 값을 직접 넣어 주는 것과 같음
		List<String> list2 = new ArrayList<String>(Arrays.asList(arr1));
		//list2.add(arr[i]); 가 실행된 효과
		
		list2.add("abc");
		System.out.println("-- 깊은 복사 --");
		System.out.println(list2);
		
		// 두개의 배열을 하나의 리스트로 합치기
		List<String> list3 = new ArrayList<String>(Arrays.asList(arr2));
		
		// addAll(list) : 모든 요소 추가
		list2.addAll(list3);
		System.out.println(list2);
		
		//정렬
		Collections.sort(list2);
		System.out.println(list2);

	}

}
