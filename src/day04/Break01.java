package day04;

public class Break01 {

	public static void main(String[] args) {
		// break : 반복문을 빠져 나오는 키워드
		/* 조건문(if)을 동반하여 조건이 맞을 때 빠져나오도록 설계
		 * 
		 * continue : pass, skip 개념  -> 일반적으로는 잘 사용하지 않음 (특별 케이스만 pass)
		 * 
		 * return : 메서드를 빠져나오는 키워드
		 * */
		
		for(int i=1;i<=10;i++) {
			if(i==5) {
				break;
			}
			System.out.println(i);
		}
		
		for(int i=1;i<=10;i++) {
			if(i%2==1) {
				continue;
			}
			System.out.println(i);
		}
		
		int i=0,j=0,k=0;
		
		// 반복문이 중첩일 경우 break는 나를 감싸고 있는 가장 안쪽의 반복문만 벗어남
		// 반복문에 이름을 붙일 수 있음.
		// break 이름; => 이름 붙은 반복문을 벗어날 수 있음.
		a: for(;;) {   //break 할 상위 위치를 지정할 수 있다. <이름:>  /// 특수 케이스
			i++;
			for(;;) {
				j++;
				for(;;) {
					k++;
					System.out.println("i:"+i+", j:"+j+", k:"+k);
					if(k==10) {
						break a;
					}
				}
			}
		}
		System.out.println("반복 후 처리....");

	}

}
