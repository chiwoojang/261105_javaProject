package day03;

import java.util.Scanner;

public class DoWhile02 {

	public static void main(String[] args) {
		// 메뉴 만들기
		// 1. 저장하기 | 2. 새로만들기 | 3. 종료하기
		
		Scanner scan = new Scanner(System.in);
		
		int menu=0;
		do {
			System.out.println("1. 저장하기 | 2. 새로만들기 | 3. 종료하기");
			System.out.println("menu > ");
			menu = scan.nextInt(); // 메뉴 입력
			
			switch(menu) {
			case 1 :
				//저장하기 기능을 구현
				System.out.println("저장했습니다.");
				break;
			case 2 :
				// 새로만들기 기능을 구현
				System.out.println("새로 만들었습니다.");
				break;
			case 3 :
				// 종료
				System.out.println("종료!");
				break;
				default :
					System.out.println("메뉴에 없습니다.");
			}
						
		}while(menu != 3);
		System.out.println("프로그램을 종료합니다.");
		scan.close();
	}

}
