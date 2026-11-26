package word;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class WordController {
	
	private final Scanner scan;
	private List<Word> wordBook = new ArrayList<>();
	
	
	public WordController(Scanner scan) {
		this.scan = scan;
		wordAdd();
	}
	
	public void wordAdd() {
		wordBook.add(new Word("eat",List.of("먹다","먹이다")));
		wordBook.add(new Word("do",List.of("하다","적당하다")));
		wordBook.add(new Word("make",List.of("만들다","이루다","적당하다")));
		wordBook.add(new Word("beautiful",List.of("아름다운","멋진")));
		wordBook.add(new Word("hard",List.of("단단한","어려운")));		
	}
	
	public void run() {
		
		while(true) {
			
			try {
				
				System.out.println("==== 단어장 메뉴 ===");
				System.out.println("1. 단어 등록 | 2. 단어 검색 | 3. 단어수정 | 4. 전체단어출력 | 5. 단어삭제 | 6. 종료");
				int menu = scan.nextInt();
				
				switch(menu) {
				case 1 : insertWord();break;
				case 2 : searchWord();break;
				case 3 : modifyWord();break;
				case 4 : printWord();break;
				case 5 : removeWord();break;
				case 6 : System.out.println("종료");return;
				default : System.out.println("메뉴에 없습니다.");break;
				}
//			scan.nextLine();
			} catch (InputMismatchException e) {
				
				System.out.println("입력이 잘못되었습니다.");
				scan.nextLine();  // 입력버퍼 지우기
			}
			catch (Exception e) {
				System.out.println("다시 입력해 주세요.");
				scan.nextLine();
			}
		}
	}
	
	public List<String> returnList(String str,String sep){
		String[] arrMean = str.split(sep);
		List<String> listMean = new ArrayList<>();
		for(int i=0;i<arrMean.length;i++) {
//			String strMean = arrMean[i].replace("\\n",System.lineSeparator());
			listMean.add(arrMean[i]);
		}
		return listMean;
	}
	
	private void insertWord() {
		// TODO Auto-generated method stub
		System.out.println("단어 > ");
//		scan.nextLine();
		String word = scan.next();
		scan.nextLine(); // -> next() 이후 enter 값을 비워준다.
		
		//만약 word가 존재하면 단어 존재 -> 나가기
		if(wordBook.contains(new Word(word))) {
			System.out.println("-- 존재하는 단어입니다.--");
			return;
		}
		
		System.out.println("뜻 (뜻 추가 ::, 줄바꿈 \\n) >");
		// 앞의 단어에서 입력한 enter가 입렵버퍼에 남아 있어서다음 nextLine()에 영향을 미침
		// 뜻에 공백을 같이 포함하려면 nextLine();
		String meaning = scan.nextLine();
//		String[] arrMean = meaning.split("::");
//		List<String> listMean = new ArrayList<>();
//		for(int i=0;i<arrMean.length;i++) {
//			listMean.add(arrMean[i]);
//		}
		List<String> listMean = returnList(meaning,"::");
		wordBook.add(new Word(word,listMean));
		System.out.println("단어 등록 완료");		
			
	}

	private void removeWord() {
		// TODO Auto-generated method stub
		System.out.println("단어 > ");
//		scan.nextLine();
		String word = scan.next();
		scan.nextLine(); // -> next() 이후 enter 값을 비워준다.		
		//만약 word가 존재하면 단어 존재 -> 나가기
		if(wordBook.remove(new Word(word))) {
			System.out.println("삭제 되었습니다.");;
			return;
		}
		System.out.println("-- 찾는 단어가 없습니다. --");		
		
	}
	private void printWord() {
		// Word를 정렬하여 출력
		
		wordBook.sort(new Comparator<Word>() {

			@Override
			public int compare(Word o1, Word o2) {
				// TODO Auto-generated method stub
				return (o1).getWord().compareTo(((o2).getWord()));				
			}
			
		});
		
		for(Word w : wordBook) {
			w.printWord();
		}
		
		
	}
	private void modifyWord() {
		System.out.println("단어 > ");
//		scan.nextLine();
		String word = scan.next();
		scan.nextLine(); // -> next() 이후 enter 값을 비워준다.		
		//만약 word가 존재하면 단어 존재 -> 나가기
		int index = wordBook.indexOf(new Word(word));		
		// 존재하면 수정 진행
		if(index!=-1) {
			System.out.print("기존 :");
			wordBook.get(index).printMean();
			System.out.println();
			System.out.println("수정할 의미를 입력하세요.(뜻 추가 ::, 줄바꿈 \\n) > ");
			String meaning = scan.nextLine();
			List<String> listMean = returnList(meaning,"::");
			
			wordBook.set(index, new Word(word,listMean));
			
			return;
		}
		
		System.out.println("-- 찾는 단어가 없습니다. --");		
	}
	private void searchWord() {
		System.out.println("단어 > ");
//		scan.nextLine();
		String word = scan.next();
		scan.nextLine(); // -> next() 이후 enter 값을 비워준다.		
		//만약 word가 존재하면 단어 존재 -> 나가기
		int index = wordBook.indexOf(new Word(word));
		if(index!=-1) {
			System.out.println("---------------------");
			wordBook.get(index).printWord();
			return;
		}
		System.out.println("-- 찾는 단어가 없습니다. --");
		
	}
	
}	
