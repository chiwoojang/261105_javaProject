package day05;

import java.util.regex.Pattern;

public class Exam02 {

	public static void main(String[] args) {
		// 주민등록번호를 참고하여 생년월일과 성별, 나이를 출력
		String regNum = "990101-1234567";  //1999년생 => 1(남), 2(여)
		//Strin regNum = "990101-1234567";  //2000년생 => 3(남), 4(여)
		
		//출력결과
		/* 생년월일 : 990101
		 * 성별 : 남
		 * 나이 : 28
		 * */
		
		int today = 2026;
		//System.out.println(regNum.charAt(regNum.indexOf("-")+1));
		String birthYear = regNum.substring(0,2);
		String birthDate = regNum.substring(0,6);
		char charSex = regNum.charAt(regNum.indexOf("-")+1);  //성별 구분 및 2000년대 분개 문자
		int age = 0;
		String strSex="";
		
		
		switch(charSex) {
		case '1' : case '2' : 
			age = today - (1900+Integer.parseInt(birthYear));
			strSex = charSex=='1'?"남자":"여자";
			break;
		case '3' : case '4' : 
			age = today - (2000+Integer.parseInt(birthYear));
			strSex = charSex=='3'?"남자":"여자";
			break;
			default :		
		}
		
		System.out.println("생년월일 : " + birthDate);
		System.out.println("성별 : " + strSex);
		System.out.println("나이 : " + age);
		
		
		// 강사 샘플
//		String rNum = regNum.substring(7,8);
//		char r = regNum.charAt(7);
//		
//		//String gender = (r=='1' || r=='3')?"남":"여";
//		String gender = (rNum.equals("1")||rNum.equals("3"))?"남":"여";
//		
//		int year2 = Integer.parseInt(birthYear);
////		if(r=='1'||r=='2') {
////			year2 = year2 + 1900;
////		}else {
////			year2 = year2 + 2000;
////		}
//		
//		year2 = (rNum.equals("1")||rNum.equals("2"))?year2+1900:year2+2000;
		
		
		
		
//		String email = "660315-8254357";
//		//String regex = "^[\\w\\.\\-]+@[\\w\\-]+(\\.[a-zA-Z]{2,})$";
//		String regex = "^\\d{2}[0-1][0-9][0-3][0-9]\\-[1-4]\\d{6}$";
//		boolean isValid = Pattern.matches(regex, email);
//		System.out.println(isValid);

	}

}
