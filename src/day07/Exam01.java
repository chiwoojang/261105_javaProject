package day07;

import java.util.Arrays;
import java.util.Scanner;


public class Exam01 {
	
	/* 기능 : 정수형식 문자값이 들어간 문자배열을 정수배열로 리턴함
	 * 매개변수 : 문자배열 
	 * 메서드명 : toIntArray
	 * 리턴타입 : 정수배열
	 * */
	
	public int[] toIntArray(String[] str) {
		int[] arrInt = new int[str.length];
		for(int i=0;i<arrInt.length;i++) {
			arrInt[i] = Integer.parseInt(str[i]);
		}
		return arrInt;
	}
	
	/* 기능 : 정수형 배열을 받아 합계,평균을 리턴하는 함수
	 * 매개변수 : 정수배열 
	 * 메서드명 : arrStat
	 * 리턴타입 : 문자배열
	 * */
	public String[] stat(int[] arr) {
		int sum = 0;
		double avg=0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		avg = (double)sum/arr.length;
		
		String[] result = new String[2];
		result[0] = String.valueOf(sum);
		result[1] = String.valueOf(avg);
		return result;
	}
	

	public static void main(String[] args) {
		/* 숫자를 입력받아 입력받은 숫자의 합계와 평균을 출력
		 * 12345 => 1+2+3+4+5  => 합계 / 평균 출력
		 * String 으로 입력받아 한자리 수로 분해
		 * 789456 => 7+8+9+4+5+6
		 * 
		 * 반복(0 또는 음수를 입력하면 종료)
		 * 
		 * ex) 숫자를 입력하세요(0 또는 음수는 종료) >
		 * 
		 * */

		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("숫자를 입력하세요(0 또는 음수는 종료) > ");
			String myNum = scan.next();
			// 0 또는 음수기호 들어가면 나가기
			if(myNum.equals("0") || myNum.contains("-")) {
				System.out.println("종료합니다.");
				break;
			}
			
			String regex = "[0-9]+";
			if(!myNum.matches(regex)) {
				System.out.println("숫자이외의 값은 들어갈 수 없습니다.");
				continue;
			}
			
			// 각 숫자를 분기하여 배열로 받는다.
			String[] strNum = myNum.split("");
//			System.out.println(Arrays.toString(strNum));
			
			Exam01 ex = new Exam01();
			
			// 문자(정수)배열을 정수형 배열로 전환
			int[] intNum = ex.toIntArray(strNum);
			System.out.println(Arrays.toString(intNum));
			
			// 정수배열의 통계(합계, 평균) 연산 및 출력
			String[] strStat = ex.stat(intNum);
			System.out.println("합계 : " + strStat[0] + ", 평균 : " + strStat[1]);
			
			
			
		}
		
		scan.close();
	}

}
