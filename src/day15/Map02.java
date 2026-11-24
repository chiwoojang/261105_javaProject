package day15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 과목 / 점수 를 저장하는 map을 생성
		// 과목, 점수 => 입력 받아 map 추가
		// 종료 키워드가 나올 때까지 반복 (1=계속, 0=종료)
		// 출력, 합계, 평균 출력
		
		Scanner scan = new Scanner(System.in);
		
		Map<String, Integer> map = new HashMap<>();
		int sum = 0;
		int count = 0;
//		double avg = 0;
		
		while(true) {
			try {
				
				System.out.println("과목과 점수를 입력해 주세요. > ");
				String subject = scan.next();
				int score = scan.nextInt();
				
				if(map.keySet().contains(subject)) {
					System.out.println("이미 입력한 과목입니다.");
					continue;
				}
				map.put(subject, score);
				
				sum += score;
				count++;
				
				System.out.println("계속 할까요? (1=계속, 0=종료)");
				if(scan.nextInt()!=1) {
					break;
				}
			} catch (Exception e) {
				System.out.println("입력이 잘못 되었습니다.");
				scan.nextLine();  //입력 버퍼 비워주기
			}
		}
		
		System.out.println(map);
		System.out.println("합계 : " + sum + ", 평균 : " + (count>0?((double)sum/count):"--"));
		
		sum = 0;
		for(String key : map.keySet()) {
			System.out.println(key + ":" + map.get(key));
			sum += map.get(key);
		}
		System.out.println("합계 : " + sum + ", 평균 : " + (map.size()>0?((double)sum/map.size()):"--"));
		
		
		scan.close();

	}

}
