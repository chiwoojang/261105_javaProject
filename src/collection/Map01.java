package collection;

import java.util.HashMap;
import java.util.Map;

public class Map01 {

	public static void main(String[] args) {
		// Map 연습
		Map<String,Integer> scores = new HashMap<>();
		
		// 신규값 입력
		scores.put("김길영", 87);
		scores.put("오한영", 98);
		scores.put("한철수", 68);
		scores.put("남길주", 78);
		scores.put("김주영", 83);
		scores.put("이한나", 87);
		scores.put("하로로", 99);
		scores.put("장필순", 63);
		scores.put("김남영", 77);
		
//		System.out.println(scores);
		
		// 데이터 조회
		int targetScore = scores.get("오한영");
		int tmpScore = scores.getOrDefault("한나라", 80);
		
		System.out.println("오한영 점수 : " + targetScore);
		System.out.println("한나라 (디폴트) : " + tmpScore);
		
		// 키, 값 존재 여부 확인
		System.out.println("김주영 존재 여부 : " + scores.containsKey("김주영"));
		System.out.println("100점 존재 여부 : " + scores.containsValue(100));
		
		// 조건부 추가
		scores.putIfAbsent("오한영", 68);
		scores.putIfAbsent("오송한", 85);
		System.out.println(scores);
		
		// 데이터삭제
		int c = scores.remove("김남영");
		System.out.println(c);
		
		

	}

}
