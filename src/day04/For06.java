package day04;

public class For06 {

	public static void main(String[] args) {
		// for 연습
		// 줄 => i, 별 개수 => j
		// *****
		// *****
		// *****
		// *****
		// *****
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();			
		}
		
		System.out.println();
		System.out.println("---------------");
		
		//*     i=1, j=1
		//**    i=2, j=1,2
		//***   i=3, j=1,2,3
		//****  i=4, j=1,2,3,4
		//***** i=5, j=1,2,3,4,5
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");			
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("---------------");
		
		//***** i=1, j=1,2,3,4,5
		//****  i=2, j=1,2,3,4
		//***   i=3, j=1,2,3
		//**    i=4, j=1,2
		//*     i=5, j=1
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=6-i;j++) {
				System.out.print("*");			
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("---------------");
		
		//       *
		//      ***
		//     ***** 
		//    *******
		//   *********
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=4+i;j++) {
				System.out.print(j<=5-i?" ":"*");			
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("---------------");
		
		// *********
		//  *******
		//   *****
		//    ***
		//     *
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=10-i;j++) {
				System.out.print(j<i?" ":"*");			
			}
			System.out.println();
		}
		
	}

}
