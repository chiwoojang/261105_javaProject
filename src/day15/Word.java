package day15;

import java.util.Scanner;

public interface Word {
	// 단어장 Map
	// 1. 단어 등록 | 2. 단어 검색 | 3. 단어수정 | 4. 전체단어출력 | 5. 단어삭제 | 6. 종료
	
	void insertWord(Scanner scan);
	void searchWord(Scanner scan);
	void modifyWord(Scanner scan);
	void printWord();
	void removeWord(Scanner scan);
}
