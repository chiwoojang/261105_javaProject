package day15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary implements Word {
	
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
		System.out.println("단어 뜻 을 입력해 주세요. > ");
		String word = scan.next();
		String meaning = scan.next();
		dictionary.put(word, meaning);
		scan.nextLine();
		
	}

	@Override
	public void searchWord(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("검색 단어를 입력해 주세요. > ");
		String word = scan.next();
		
		// word와 일치하는 단어
		if(dictionary.containsKey(word)) {  
			System.out.println(word + " : " + dictionary.get(word));
		}else {
			System.out.println("["+ word + "] 를 찾을 수 없습니다.");
		}
		
		
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
		
		scan.nextLine();
		
	}

	@Override
	public void modifyWord(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("단어 뜻 을 입력해 주세요. > ");
		String word = scan.next();
		String meaning = scan.next();
		
		if(dictionary.containsKey(word)) {
			dictionary.put(word, meaning);		
		}else {
			System.out.println("["+ word + "] 를 찾을 수 없습니다.");
		}
		scan.nextLine();
	}

	@Override
	public void printWord() {
		// TODO Auto-generated method stub
		for(String s : dictionary.keySet()) {
			System.out.println(s + " : " +dictionary.get(s));
		}
		
	}

	@Override
	public void removeWord(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("삭제 단어를 입력해 주세요. > ");
		String word = scan.next();
		if(dictionary.containsKey(word)) {
			dictionary.remove(word);
		}else {
			System.out.println("["+ word + "] 를 찾을 수 없습니다.");
		}
		scan.nextLine();
		
	}

}
