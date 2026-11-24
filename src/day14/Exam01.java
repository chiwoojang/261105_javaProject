package day14;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

public class Exam01 {

	public static void main(String[] args) {
		// list를 생성하여 1~10까지 반복문을 이용하여 추가하고 => 출력
		// syso(list)말고 반복문으로 돌려서 출력
		
		// list 배열과 다르게 미리 칸을 준비하지 않음
		
		List<Integer> list = new ArrayList<>();
		for(int i=1; i<=10;i++) {
			list.add(i);
		}
		
		// list, set, map => index를 가지는 건 list 뿐
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("----- 향상된 for-------");
		
		// 향상된 for 를 사용하는 방법
		for(Integer i : list) {  //int 로 뽑으면 -> 컴파일러가 언박싱 자동으로 함.
			System.out.print(i + " ");
		}
		System.out.println();
		
		// Iterator (반복자) : index 가 없는 구조를 출력하기 위한 객체  (향상된 for 문 이전에 사용됨,인덱스 없는 객체에 대해)
		// set,map 같은 index가 없는 구조에서 사용
		// 순서와 상관없이 값을 가져올 수 있는 구문
		// 향상된 for문과 동일하게 동작
		System.out.println("----- Iterator-----------");
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) { // 요소가 있는 지 확인
			int tmp = it.next();  //요소값 가죠오기
			System.out.println(tmp);
		}
		
		// set, contains 
		
			
		// 1. index = 4 의 값을 11로 변경
		System.out.println(list.set(4, 11));   //변경 => 변경 전 값을 리턴
		System.out.println(list);
		
		// list에 1의 값이 있는지 확인
		System.out.println(list.contains(1));
		
		// indexOf(값) : 해당 값의 번지를 리턴 / 없으면 -1
		System.out.println(list.indexOf(10));
		
		list.clear();
		list.add(45);
		list.add(78);
		list.add(28);
		list.add(95);
		list.add(66);
		System.out.println(list);
		
		//정렬
		Collections.sort(list);  // 오름차순만 가능
		System.out.println(list);
		
		
		
		
		
//		Collections.shuffle(list);
//		System.out.println(list);
//		
//		Deque<Integer> stack = new ArrayDeque<>();
//		for(Integer i : list) {
//			stack.add(i);
//		}
//		System.out.println(stack);
//		System.out.println(stack.size());
//		
////		for(int i=0;i<stack.size();i++) {
////			System.out.print(stack.pop()+" ");
////		}
//		
//		System.out.println();
//		for(Integer i : stack) {
//			System.out.print(i + " ");
//		}
		
		

	}

}
