package day08;

import java.util.Arrays;

public class Exam01T {
	
	//=============
	// 강사버전
	//==============
	
	// 메서드 오버로딩 조건
	// 매개변수의 개수 다름,
	// 매개변수의 순서가 다름
	
	// 1. 랜덤수를 리턴하는 메서드 (1~45)  
	// 매개변수 : 없음 / 리턴타입 : => 정수 => int / 메서드명 : makeRandom

	public int makeRandom() {
		return (int)(Math.random()*45)+1;
	}
	
	// 범위를 입력받아 해당 법위의 랜덤수를 리턴하는 메서드
	// 1~45 / 1~6 / 1~52 /
	// OverLoading
	public int makeRandom(int count, int start) {
		return (int)(Math.random()*count) + start;
	}
	
	public int makeRandom2(int begin, int end) {
		return (int)(Math.random()*(end-begin+1)) + begin;
	}

	
	
	// 2. 중목확인메서드 : 배열에 정수가 있는지 확인
	//  - 매개변수 (배열, 정수) 
	/* 매개변수 : 정수배열, 정수 => int[] arr, int num
	 * 메서드명 : isContains
	 * 리턴타입 : boolean
	 * */
	public boolean isContains(int[] arr, int num) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				return true;
			}
		}
		return false;
	}

		
	// 3. 배열을 매개변수로 받아 랜덤수(1번메서드 호출)를 중복X(2번 메서드 호출) 채워주는 메서드
	/* 매개변수 : 정수배열 => int[] arr
	 * 메서드명 : fillNum
	 * 리턴타입 : void
	 * */
	public void randomArray(int[] arr) {
		if(arr==null || arr.length<=0) {
			System.out.println("배열이 잘못 되었습니다.");
			return;
		}
		int i = 0;
		while(i < arr.length) {
			int random = makeRandom2(1,45);
			if(!isContains(arr,random)) {  //isContains(arr,random) == false 라는 형식은 잘 안씀
				arr[i] = random;
				i++;
			}
		}
	}
	
	
	
	// 4. 배열을 출력하는 매서드
	//  - 사용자 번호 1 2 3 4 5 6
	//  - 당첨 번호 1 2 3 4 5 6 [7]
	/* 매개변수 : 정수배열 => int[] arr 
	 * 메서드명 : printArray
	 * 리턴타입 : void
	 * */
	public void printArray(int[] arr) {
		if(arr==null || arr.length<=5) {
			System.out.println("배열이 잘못 되었습니다.");
			return;
		}
		for(int i=0;i<6;i++) {
			System.out.print(arr[i]+" ");
		}
		if(arr.length == 7) {
			System.out.print("[" + arr[arr.length-1]+"]");
		}
		System.out.println();
	}

	
	
	// 5. 당첨 확인하는 메서드
	// - 사용자번호, 당첨번호 받아서 등수를 리턴하는 메서드  (등수리턴 또는 출력 가능)
	/* - 6개 일치 = 1등 (순서 상관없음, 보너스 제외)
	 * - 5개 일치 + 보너스 번호 = 2등
	 * - 5개 일치 = 3등
	 * - 4개 일치 = 4등
	 * - 3개 일치 = 5등
	 * - 나머지는 꽝
	 * 
	 * */
	/* 매개변수 : 두개의 정수배열 => int[] user, int[] lotto
	 * 메서드명 : ranking
	 * 리턴타입 : int
	 * */
	public int ranking(int[] user, int[] lotto) {
		if(user==null || lotto==null || user.length<=0 || lotto.length <=0) {
			return -999999;
		}
		if(user.length >= lotto.length) {
				return -999999;
		}
		
		int count=0; // 일치 개수 카운트 (보너스는 제외)
		for(int i=0;i<user.length;i++) {
			if(isContains(user,lotto[i])) {
				count++;
			}
		}
		// 순위 확인
		switch(count) {
		case 6 : return 1;  //return은 break효과 포함
		case 5 : return isContains(user,lotto[lotto.length-1])? 2:3;
		case 4 : return 4;
		case 3 : return 5;
		default : return 0;
		}		
	}

	public static void main(String[] args) {
		// 로또 만들기
		/* - 사용자 번호 (6자리)
		 * - 당첨 번호 (7자리)
		 */
		Exam01T e = new Exam01T();
		
		int user[] = new int[6];
		int lotto[] = new int[7];
		
		e.randomArray(user);
		e.randomArray(lotto);
//		System.out.println(Arrays.toString(user));
//		System.out.println(Arrays.toString(lotto));
		System.out.println("--유저번호--");
		e.printArray(user);
		System.out.println("--당첨번호--");
		e.printArray(lotto);
		
		int ranking = e.ranking(user, lotto);
		if(ranking==-999999) {
			System.out.println("배열오류!!");
		}else if(ranking==0) {
			System.out.println("꽝!!");
		}else {
			System.out.println(ranking+"등 당첨!!");
		}
		

	}

}
