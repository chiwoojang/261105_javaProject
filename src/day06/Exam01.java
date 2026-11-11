package day06;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// 파일명을 저장하고 있는 배열
		// 검색어를 입력하면 해당 검색어를 포함하고 있는 파일을 출력
		// 검색어를 포함하는 파일이 없다면 => 일치하는 항목이 없습니다.
		// String search = scan.next(); // 한 단어 입력
		// 대소문자 구분 안함
		
		String[] filename = {
				"이것이자바다.java","java의 정성.java","array.txt",
				"array.java","String.txt","StringMeghod.jpg",
				"ArrayMethod.jpg","method.png","javaMethod.png"
		};
		
		Scanner scan = new Scanner(System.in);
		
		// 입력받음, 대소문자 구별을 없애기 위해 소문자로 전환해 받음
		System.out.print("검색어 입력 > ");
		String search = scan.next();  //scan.next().toLowerCase() 로 바로 소문자 받을 수 있음
		search = search.toLowerCase();  
		//System.out.println(search);
		
		// 파일명 배열에서 하나씩 파일명을 가져와 소문자로 전환 후
		// 검색문자열이 포함되어 있으면 출력  contains
		int count=0;
		for(String file : filename) {
			if(file.toLowerCase().contains(search)) {
				System.out.println(file);
				count++;
			}
		}
		if(count==0) {  // 찾는 파일명이 없으면 출력 (count=0)
			System.out.println("일치하는 항목이 없습니다.");
		}else {
			System.out.println("검색결과 : "+count+"개");
		}
		scan.close();
		
	}

}
