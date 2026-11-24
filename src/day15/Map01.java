package day15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map01 {

	public static void main(String[] args) {
		// Map : 값을 쌍으로 저장 key : value
		// - key는 중복 불가능, value는 중복가능
		// - HashMap
		Map<String, Integer> map = new HashMap<>();
		
		// put() 추가
		map.put("사과", 1500);
		map.put("수박", 30000);
		map.put("배", 2500);
		map.put("귤", 500);
		System.out.println(map);
		map.put("귤", 1000);  // 덮어씀, 중복불가 => value 갱신
		System.out.println(map);
		
		
		// get(key) => value를 리턴
		System.out.println(map.get("사과"));
		
		// keySet() : 키만 Set으로 리턴
		System.out.println(map.keySet());
		// values() -> List
		System.out.println(map.values());
		
		//entrySet() : key=value를 한묶음으로 Set 리턴
		System.out.println(map.entrySet());
		
		//containsKey(key) : 해당 키가 존재하는 지 확인 true / false
		System.out.println(map.containsKey("사과"));
		System.out.println(map.size());
		
		// 출력
		for(String key : map.keySet()) {
			System.out.println(key + ":" + map.get(key));
		}
		
		// iterator
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key + ":" + map.get(key));
		}
		
		// remove(key) => value / remove(key,value) => boolean  리턴
		System.out.println(map.remove("사과", 1500));
		System.out.println(map);
		System.out.println(map.remove("귤"));
		System.out.println(map);
		
		// clear()
		map.clear();
		System.out.println(map);
		System.out.println(map.isEmpty());
		
		
		
		
		

	}

}
