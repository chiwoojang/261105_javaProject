package day01;

public class Switch {

	public static void main(String[] args) {
		// 조건문 : if, switch 
		/* switch(변수/식){
		 * 	  case 값1 : 실행문; break;
		 * 	  case 값2 : 실행문; break;
		 * 	  case 값3 : 실행문; break;
		 *    ...
		 *    default : 실행문;
		 * }
		 * 
		 * 
		 * break : 실행중인 구문을 강제로 빠져나오게 하는 구문 (조건문을 동반)
		 * */
		
		int number = 6;
		
		switch(number%2) {
		case 0 : 
			System.out.println("짝수");
			break;
		case 1 : 
			System.out.println("홀수");
			break;
		default :
			System.out.println("이상한 수");
		}
		
		// 주사위는 1~6 숫자 나옴 이를 num 라고 가정한다.
		// switch 문을 이용하여, num 칸 전진함 
		int num = 5;
		switch(num) {
		case 1:
			System.out.println("1칸 전진");
			break;
		case 2:
			System.out.println("2칸 전진");
			break;			
		case 3:
			System.out.println("3칸 전진");
			break;			
		case 4:
			System.out.println("4칸 전진");
			break;			
		case 5:
			System.out.println("5칸 전진");
			break;			
		case 6:
			System.out.println("6칸 전진");
			break;			
		default :
			System.out.println("없는 숫자입니다.");
			break;			
		}
		
		
		int num2 = 3;
		switch(num2) {
		case 1 : case 2: case 3 : case 4 : case 5 : case 6 :
			System.out.println(num2 + "칸 전진");
			break;
		default :
			System.out.println(num2 + "는 없는 숫자입니다.");
		}
		
		int [] dices = {1,7,3,12,5,6};
		for (int dice : dices) {
			switch(dice) {
			case 1 : case 2: case 3 : case 4 : case 5 : case 6 :
				System.out.println(dice + "칸 전진");
				break;
			default :
				System.out.println(dice + "는 없는 숫자입니다.");
			}
		}
		
		int month = 3;
		switch(month) {
		case 3: case 4: case 5:
			System.out.println(month + "월은 봄입니다.");
			break;
		case 6: case 7: case 8:
			System.out.println(month + "월은 여름입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println(month + "월은 가울입니다.");
			break;
		case 12: case 1: case 2:
			System.out.println(month + "월은 겨울입니다.");
			break;
			default :
				System.out.println(month + "월은 존재하지 않습니다.");		
		}
		
		
		
	}

}
