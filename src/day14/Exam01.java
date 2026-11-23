package day14;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

public class Exam01 {

	public static void main(String[] args) {
		// list를 생성하여 1~10까지 반복문을 이용하여 추가하고 => 출력
		// syso(list)말고 반복문으로 돌려서 출력
		List<Integer> list = new ArrayList<>();
		for(int i=1; i<=10;i++) {
			list.add(i);
		}
		
		for(Integer i : list) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		// 1. index = 4 의 값을 11로 변경
		list.set(4, 11);
		System.out.println(list);
		
		// list에 1의 값이 있는지 확인
		System.out.println(list.contains(1));
		
		Collections.shuffle(list);
		System.out.println(list);
		
		Deque<Integer> stack = new ArrayDeque<>();
		for(Integer i : list) {
			stack.add(i);
		}
		System.out.println(stack);
		System.out.println(stack.size());
		
//		for(int i=0;i<stack.size();i++) {
//			System.out.print(stack.pop()+" ");
//		}
		
		System.out.println();
		for(Integer i : stack) {
			System.out.print(i + " ");
		}

	}

}
