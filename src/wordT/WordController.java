package wordT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class WordController {
	
	private final Scanner scan;
	private List<Word> wordBook = new ArrayList<>();
	
	
	public WordController(Scanner scan) {
		this.scan = scan;
//		wordAdd();
		String word="dog";
		List<String> mean=new ArrayList<>();
		mean.add("개");
		mean.add("개과 동물");
		mean.add("강아지");
		
		Word w = new Word(word,mean);
		
		String word2 = "cat";
		List<String> mean2 = new ArrayList<>();
		mean2.add("고양이");
		mean2.add("야옹이");
		mean2.add("호랑이과 동물");
		
		Word w2 = new Word(word2,mean2);
		
		
		wordBook.add(w);
		wordBook.add(w2);
		
		List<String> mean3 = new ArrayList<>(Arrays.asList("호랑이","어흥이"));
		wordBook.add(new Word("tiger",mean3));
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
			} catch (InputMismatchException e) {
				
				System.out.println("입력이 잘못되었습니다.");
				scan.nextLine();  // 입력버퍼 지우기
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
//				System.out.println("다시 입력해 주세요.");
				scan.nextLine();
			}
		}
	}
	
	public List<String> returnList(String str,String sep){
		String[] arrMean = str.split(sep);
		List<String> listMean = new ArrayList<>();
		for(int i=0;i<arrMean.length;i++) {
			listMean.add(arrMean[i]);
		}
		return listMean;
	}
	
	private void insertWord() {
		// String 단어 / List<String> 뜻1, 뜻2 ...
		
		System.out.println("단어 >");
		String word = scan.next();
		
		//입력받은 단어가 이미 있는 단어인지 확인
		if(wordBook.contains(new Word(word))) {
			System.out.println("이미 존재하는 단어입니다.");
			return;
		}
		
		scan.nextLine(); // 이전 입력 Enter 값 지움
				
		
		List<String> mean=new ArrayList<>();
		while(true) {
			System.out.println("뜻 > (종료:0");
			// 뜻에 띄어쓰기 포함
			String m = scan.nextLine();
			if(m.equals("0")) {
				break;
			}
			mean.add(m);
		}
		
		wordBook.add(new Word(word,mean));
		System.out.println("단어 등록 완료!!");
		
		
//		System.out.println("단어 > ");
////		scan.nextLine();
//		String word = scan.next();
//		scan.nextLine(); // -> next() 이후 enter 값을 비워준다.
//		
//		//만약 word가 존재하면 단어 존재 -> 나가기
//		if(wordBook.contains(new Word(word))) {
//			System.out.println("-- 존재하는 단어입니다.--");
//			return;
//		}
//		
//		System.out.println("뜻 (뜻 추가 ::, 줄바꿈 \\n) >");
//		// 앞의 단어에서 입력한 enter가 입렵버퍼에 남아 있어서다음 nextLine()에 영향을 미침
//		// 뜻에 공백을 같이 포함하려면 nextLine();
//		String meaning = scan.nextLine();
//
//		List<String> listMean = returnList(meaning,"::");
//		wordBook.add(new Word(word,listMean));
//		System.out.println("단어 등록 완료");		
			
	}

	private void removeWord() {
		// TODO Auto-generated method stub
		// list remove(index) => 값을 리턴 / remove(Object) => boolean 리턴
		System.out.println("단어 > ");
		String word = scan.next();
		scan.nextLine(); // -> next() 이후 enter 값을 비워준다.		
		//만약 word가 존재하면 단어 존재 -> 나가기
//		if(wordBook.remove(new Word(word))) {
//			System.out.println("삭제 되었습니다.");;
//			return;
//		}
//		System.out.println("-- 찾는 단어가 없습니다. --");		
		boolean ok = wordBook.remove(new Word(word));
		System.out.println(ok?"삭제완료!!":"없는 단어입니다.");
		
	}
	private void printWord() {
		// Word를 정렬하여 출력
		
		wordBook.sort(null);  // 이미 클래스에서 구현 완료 -> Comparable 인터페이스 구현
		Collections.sort(wordBook); // 내부 구현에 따라 정렬
		
//		wordBook.sort(new Comparator<Word>() { // 클래스에서 구현이 안낼 경우 
//
//			@Override
//			public int compare(Word o1, Word o2) {
//				// TODO Auto-generated method stub
//				return (o1).getWord().compareTo(((o2).getWord()));				
//			}
//			
//		});
		
		System.out.println("--- 단어장 ---");
		
		for(Word w : wordBook) {
//			w.printWord();
			w.printMean();
		}
		
		
	}
	private void modifyWord() {
		System.out.println("단어 > ");
		String word = scan.next();
		scan.nextLine(); // -> next() 이후 enter 값을 비워준다.		
		//만약 word가 존재하면 단어 존재 -> 나가기
		int index = wordBook.indexOf(new Word(word));
		
		/* 수정할 단어 입력 받기
		 * 해당 Word를 wordBook에서 검색 => index
		 * get(index) 단어 가져오기
		 * 뜻 리스트 보여주기 
		 * 몇 번 뜻을 수정할 지 숫자로 받기 => no-1 (mean 번지)
		 * 변경할 뜻 입력 받기
		 * getMean => 뜻 가져오기 / setMean(no-1, 새뜻)
		 * 
		 * */
		if(index==-1) {
			System.out.println("없는 단어 입니다.");
			return;
		}
		wordBook.get(index).printMean();
		System.out.println("변경할 의미 번호를 입력>");
		int no = scan.nextInt();
		if(no <= 0 || no>wordBook.get(index).getMean().size()) {
			System.out.println("없는 번지 입니다. 다시 시도");
			return;
		}
		System.out.println("변경 뜻 입력 >");
		scan.nextLine();
		String changeMean = scan.nextLine();
		wordBook.get(index).getMean().set(no-1, changeMean);
		
		System.out.println("수정 완료!!");
		
//		// 존재하면 수정 진행
//		if(index!=-1) {
//			System.out.print("기존 :");
//			wordBook.get(index).printMean();
//			System.out.println();
//			System.out.println("수정할 의미를 입력하세요.(뜻 추가 ::, 줄바꿈 \\n) > ");
//			String meaning = scan.nextLine();
//			List<String> listMean = returnList(meaning,"::");
//			
//			wordBook.set(index, new Word(word,listMean));
//			
//			return;
//		}
//		
//		System.out.println("-- 찾는 단어가 없습니다. --");		
	}
	
	
	
	private void searchWord() {
		System.out.println("단어 > ");
		String word = scan.next();
		scan.nextLine(); // -> next() 이후 enter 값을 비워준다.		
		//만약 word가 존재하면 단어 존재 -> 나가기
		int index = wordBook.indexOf(new Word(word));
		// 검색어가 없으면 -1
		if(index!=-1) {
//			System.out.println("---------------------");
			wordBook.get(index).printMean();
			return;
		}
		System.out.println("-- 찾는 단어가 없습니다. --");
		
	}
	
}	
