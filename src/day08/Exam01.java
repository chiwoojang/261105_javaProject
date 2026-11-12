package day08;

public class Exam01 {
	
	// 1. 랜덤수를 리턴하는 메서드 (1~45)  
	/* 매개변수 : 없음
	 * 메서드명 : rndLotto
	 * 리턴타입 : int
	 * */
	public int rndLotto() {
		return (int)(Math.random()*45+1);
	}
	
	// 2. 중목확인메서드 : 배열에 정수가 있는지 확인
	//  - 매개변수 (배열, 정수) 
	/* 매개변수 : 정수배열, 정수 => int[] arr, int num
	 * 메서드명 : isExit
	 * 리턴타입 : boollen
	 * */
	public boolean isExit(int[] arr,int num) {
		boolean b=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				b=true;
				break;
			}
		}
		return b;
	}
	
	// 3. 배열을 매개변수로 받아 랜덤수(1번메서드 호출)를 중복X(2번 메서드 호출) 채워주는 메서드
	/* 매개변수 : 정수배열 => int[] arr
	 * 메서드명 : fillNum
	 * 리턴타입 : void
	 * */
	public void fillNum(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int tmp = rndLotto();
			// 배열안에 존재하면, 다시 받는다.
			while(isExit(arr,tmp)) {
				tmp = rndLotto();
			}
			arr[i] = tmp;
		}
	}
	
	// 4. 배열을 출력하는 매서드
	//  - 사용자 번호 1 2 3 4 5 6
	//  - 당첨 번호 1 2 3 4 5 6 [7]
	/* 매개변수 : 정수배열 => int[] arr 
	 * 메서드명 : printLotto
	 * 리턴타입 : void
	 * */
	public void printLotto(int[] arr) {
		String p = "";
		for(int i=0;i<arr.length;i++) {
			p += i < 6 ? arr[i] + " " : "["+arr[i]+"]";
		}
		System.out.print(p);
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
	 * 메서드명 : rank
	 * 리턴타입 : void
	 * */
	public void rank(int[] user,int[] lotto) {
		int cntSame = 0;
		boolean isBonus = false;
		String strSame="";
		
		for(int i=0;i<user.length;i++) {
			for(int j=0;j<lotto.length;j++) {
				if(user[i]==lotto[j]) {
					if(j==lotto.length-1) { // 보너스 번호는 카운팅하지 않는다.
						isBonus = true;
					}else {
						cntSame++;
						strSame += user[i] + " ";
					}
				}
			}
		}
		strSame = strSame.trim();
		

		String r = "";
		switch(cntSame){
			case 6 :
				r = "1등";
				break;
			case 5 : 
				r = isBonus ? "2등" : "3등";
				break;			
			case 4 : 
				r = "4등";
				break;
			case 3 : 
				r = "5등";
				break;
			default :				
				r = "꽝";
		}
		System.out.println("일치번호 : " + strSame + " ("+cntSame+"개)" +(cntSame==5 && isBonus?" + 보너스":""));
		System.out.println("로또 결과 : " + r);
		
		
	}
	
	

	public static void main(String[] args) {
		// 로또 만들기
		/* - 사용자 번호 (6자리)
		 * - 당첨 번호 (7자리)
		 */
		Exam01 e01 = new Exam01();
		
		int user[] = new int[6];
		int lotto[] = new int[7];
		
		//user[] 를 받아보자
		e01.fillNum(user);
		e01.printLotto(user);
		//lotto[] 를 받아보자
		e01.fillNum(lotto);
		e01.printLotto(lotto);
		//등수를 표시해보자.
		e01.rank(user, lotto);
		
//		// 로또 결과 테스트
//		int user[] = {1,2,3,4,5,7};
//		int lotto[] = {1,2,3,4,5,6,7};
//		e01.rank(user, lotto);
		
	}

}
