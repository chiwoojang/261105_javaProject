package day15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class List02 {

	public static void main(String[] args) {
		// 리스트를 생성하여 과일 5가 정도 저장하고 => 출력 (향상된 for)
		
		
		List<String> fruits = new ArrayList<>();
		
		fruits.add("사과");
		fruits.add("복숭아");
		fruits.add("수박");
		fruits.add("참외");
		fruits.add("망고");
		
		
		System.out.println("------ 향상된 for 출력 -------");
		for(String fruit : fruits) {
			System.out.println(fruit);
		}
		
		System.out.println("------ Iterator 출력 -------");
		// Iterator로 출력
		Iterator<String> it = fruits.iterator();  //형식을 주지 않으며 Object로 인식
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		// 1. 내 리스트에 '사과'가 있으면 '사과판매' / 없으면 '재고없음' 출력
		System.out.println("--------------------------");
		System.out.println(fruits.contains("구아바")?"구아바판매":"재고없음");
		if(fruits.indexOf("사과")!=-1) {
			System.out.println("사과판매");
		}else {
			System.out.println("재고없음");
		}
		
//		Map<String,Integer> fruitsMap = new HashMap<>();
//		
//		for(String fruit : fruits) {
//			fruitsMap.containsKey(fruit)?fruitsMap.put(fruit,fruitsMap.get(fruit)+1)
//					:fruitsMap.put(fruit, 1)); 
//			
//		}
		
		

	}

}
