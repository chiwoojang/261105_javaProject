package day15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Dictionary implements Word {

	
	Map<String, List<String>> voca = new HashMap<>();
	
	// 하나의 단어에 뜻이 여러개인 값을 저장하기 위한 클래스
//	private int no;
//	private String word;
//	private List<String> mean = new ArrayList<>();
//	
	private Map<String, String> dictionary=new HashMap<>();
	
	{
		dictionary.put("hello", "안녕하세요");
		dictionary.put("animal", "동물");
		dictionary.put("airplane", "비행기");
		dictionary.put("find", "찾다");
		dictionary.put("beautiful", "아름다운");
		
	}

	@Override
	public void insertWord(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("단어 > ");
//		scan.nextLine();
		String word = scan.next();
		System.out.println("뜻 > ");
		// 앞의 단어에서 입력한 enter가 입렵버퍼에 남아 있어서다음 nextLine()에 영향을 미침
		scan.nextLine(); // -> next() 이후 enter 값을 비워준다.
		// 뜻에 공백을 같이 포함하려면 nextLine();
		String meaning = scan.nextLine();
		dictionary.put(word, meaning);
		System.out.println("단어 등록 완료");
		
	}

	@Override
	public void searchWord(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("검색 단어를 입력해 주세요. > ");
		String word = scan.next();
		
		// word와 일치하는 단어
		if(dictionary.containsKey(word)) {  
			System.out.println(word + " : " + dictionary.get(word));
			return;
		}
		System.out.println("["+ word + "] 를 찾을 수 없습니다.");
		
		
//		// word를 포함한 단어
//		int count=0;
//		for(String key : dictionary.keySet()) {
//			if(key.contains(word)) {
//				System.out.println(key + " : " + dictionary.get(key));
//				count++;
//			}
//		}
//		if(count==0) {
//			System.out.println("["+ word + "] 를 찾을 수 없습니다.");
//		}
		
		
	}

	@Override
	public void modifyWord(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("단어> ");
		String word = scan.next();
		
		if(dictionary.containsKey(word)) {
			System.out.println("뜻 > ");
			scan.nextLine();
			String meaning = scan.nextLine();
			dictionary.put(word, meaning);	
			System.out.println("수정완료");
			return;
		}
		System.out.println("["+ word + "] 를 찾을 수 없습니다.");
	}

	@Override
	public void printWord() {
		// TODO Auto-generated method stub
		System.out.println("-- 단어장 --");
		int cnt = 0;
		for(String s : dictionary.keySet()) {
			cnt++;
			System.out.println(cnt+". "+ s + " : " +dictionary.get(s));
		}
		System.out.println("----------------------------");
		
	}

	@Override
	public void removeWord(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("삭제 단어를 입력해 주세요. > ");
		String word = scan.next();
		
		if(dictionary.remove(word)!=null) {  // 삭제한 단어가 없다면....			
			System.out.println("["+ word + "] 를 찾을 수 없습니다.");
			return;
		}
		System.out.println("삭제완료");
		
	}

}
