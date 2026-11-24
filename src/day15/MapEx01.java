package day15;

import java.util.Scanner;

public class MapEx01 {

	public static void main(String[] args) {
		// map을 활용한 단어장 프로그램 작성
		// 단어 : 뜻 => hello : 안녕
		// 1. 단어 등록 | 2. 단어 검색 | 3. 단어수정 | 4. 전체단어출력 | 5. 단어삭제 | 6. 종료
		
		Scanner scan = new Scanner(System.in);
		WordController wc = new WordController(scan);
		
		wc.run();
		
		scan.close();

	}

}


