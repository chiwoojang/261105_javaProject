package day03;

public class While02 {

	public static void main(String[] args) {
		// 1~50까지 짝수만 출력하고 싶다.
		/* 2 4 6 8 10
		 * 12 14 16 18 20
		 * 22 24 26 28 30
		 * ........
		 * 42 44 46 48 50 
		 * */
		int displayNum = 5;  // 한줄 출력 개수
		int limitNum = 50;   // 출력 범위 
		
		int i = 1;  // 1~50까지 카운트
		int j = 0;  // 5개가 한 줄에 출력되었는 지 파악
		while(true) {
			if(i%2==0) {
				System.out.printf("%4d",i);
				j++;  
			}
			i++;
			if(j==displayNum) {  //5개가 출력되었으면 0 으로 리셋하고, 다음 줄 이동
				j=0;
				System.out.println();
			}
			if(i>limitNum) {
				break;
			}
		}
		
		// ================== 강사 버전 ================
		// 10, 20, 30, 40, 50 => 10의 배수면 enter
		i=1;
		while(i<=50) {
			if(i%2==0) {				
				System.out.print(i+" ");
				if(i%10==0) { //밖으로 빼도 됨
					System.out.println();
				}
			}
			i++;
		}
		
		// 5번 출력하면 enter => 출력 count 변수가 필요
		i=1;
		int count = 0;
		while(i<=50) {
			if(i%2==0) {
				System.out.print(i + " ");
				count++;
			}
			if(count==5) {
				System.out.println();
				count = 0;
			}
			i++;
		}

	}

}
