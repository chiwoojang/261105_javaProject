package day15;

import java.util.Scanner;

public class WordController {
	private final Scanner scan;
	
	public WordController(Scanner scan) {
		this.scan = scan;
	}
	
	public void run() {
		Dictionary dic = new Dictionary();
		while(true) {

			try {
				
				System.out.println("==== 단어장 메뉴 ===");
				System.out.println("1. 단어 등록 | 2. 단어 검색 | 3. 단어수정 | 4. 전체단어출력 | 5. 단어삭제 | 6. 종료");
				int menu = scan.nextInt();
				
				switch(menu) {
				case 1 : dic.insertWord(scan);break;
				case 2 : dic.searchWord(scan);break;
				case 3 : dic.modifyWord(scan);break;
				case 4 : dic.printWord();break;
				case 5 : dic.removeWord(scan);break;
				case 6 : System.out.println("종료");return;
				default : System.out.println("메뉴에 없습니다.");
				}
			} catch (Exception e) {
				System.out.println("입력이 잘못되었습니다.");
				scan.nextLine();
			}

		}
//		
	}
}
