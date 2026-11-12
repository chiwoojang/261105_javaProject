package day07;

import java.util.Scanner;

public class Exam01T {
	
	// 합계 메서드 분리
	// 숫자배열을 입력 받아서 배열의 합계를 리턴
	/* 매개변수 : 숫자배열 => int[] arr
	 * 메서드명 : sum
	 * 리턴타입 : 합계 => int
	 * */
	public int sum(int[] arr) {
		int sum = 0;
		for(int i : arr) {
			sum += i;
		}
		return sum;
	}
	
	// 평균 메서드 분리
	// 숫자배열을 입력 받아서, 배열의 평균 리턴
	/* 매개변수 : 숫자배열 => int[] arr
	 * 메서드명 : avg
	 * 리턴타입 : double
	 * */
	public double avg(int[] arr) {
		// 합계 / arr.length;
		if(arr == null) {
//			System.out.println("처리할 수 없습니다.");
			return -9999999;    //나올 수 없는 명시적인 값 (협의)
		}
		if(arr.length <=0) {
//			System.out.println("0으로 나눌 수 없습니다.");
			return -9999999;    //나올 수 없는 명시적인 값 (협의)
		}
		return sum(arr) / (double)arr.length;
	}
	
	// 문자배열을 입력 받아서, 숫자배열로 리턴하는 메서드
	/* 매개변수 : 문자배열 => String[] str
	 * 메서드명 : toNum
	 * 리턴타입 : 정수배열
	 * */
	public int[] toNum(String[] str) {
		int[] num = new int[str.length];
		if(str == null || str[0]==null) {
			System.out.println("배열을 처리할 수 없습니다.");
			return num;
		}
		for(int i=0;i<num.length;i++) {
			num[i] = Integer.parseInt(str[i]);
		}
		return num;
	}
	
	// 문자배열, 숫자 배열을 입력받아서 문자배열이 값을 숫자배열로 채우는 메서드
	/* 매개변수 : 문자배열, 숫자배열
	 * 매서드명 : toNum2
	 * 리턴타입 : void
	 * */
	public void toNum2(String[] str,int[] num) {	// 에러처리를 꼼꼼히 해야 함	
		if(str == null || str[0]==null || num==null || str.length <=0 
				|| num.length <=0) {
			System.out.println("배열을 처리할 수 없습니다.");
			return;  // 끊는다.
		}
		
		// 문자배열보다 숫자배열의 길이가 다를 때
		if(str.length != num.length) {
			System.out.println("배열을 처리할 수 없습니다.");
			return;
		}
		for(int i=0;i<str.length;i++) {
			num[i] = Integer.parseInt(str[i]);					
		}
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
		
		do {
			System.out.println("숫자를 입력해 주세요.(0 또는 음수면 종료) >");
			String number = scan.next();
			
			// 종료조건
			if(Integer.parseInt(number) <=0) {
				System.out.println("종료");
				break;
			}
			
//			if(number.equals("0") || number.charAt(0)=='-') {}
			
			String str[] = number.split("");
//			int[] num = new int[str.length];
			
//			int sum = 0;
//			for(int i=0;i<str.length;i++) {
//				num[i] = Integer.parseInt(str[i]);
//				sum += num[i];
//			}
			
			// 메서드 호출
			Exam01T e = new Exam01T();
			
			
			// method 연습
//			int[] num = e.toNum(str);   // 문자배열을 주고 숫자배열로 리턴
			int[] num = new int[str.length];
			e.toNum2(str, num);
			int sum2 = e.sum(num);
			double avg2 = e.avg(num);
			if(avg2==-9999999) {
				System.out.println("나눌 수 없습니다.");
				return;
			}
			
			//출력
//			for(int i=0;i<num.length;i++) {
//				System.out.print(num[i]+(i<num.length-1?"+":""));
//			}
			
			// split : 나누기 / join : 배열 => string
			// String.join("구분자",배열)
			String p = String.join(" + ",str);
			System.out.println(p);
//			System.out.println();
//			System.out.println("합계:"+sum+" / 평균: "+(sum/(double)num.length));
			System.out.println("합계:"+sum2+" / 평균: "+avg2);
			
		}while(true);
		
		scan.close();
	}

}
