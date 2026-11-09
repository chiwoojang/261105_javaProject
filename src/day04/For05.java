package day04;

public class For05 {

	public static void main(String[] args) {
		// 구구단
		int dan = 2;
		for(int i=1;i<=9;i++) {
			System.out.println(dan + "*" + i + "=" + (dan*i));
		}

		System.out.println("----------------------");
		// 2~9 단까지 찍어 보고 싶다.

		for(int i=2;i<=9;i++) {  //dan
			for(int j=1;j<=9;j++) {
				System.out.println(i + "*" + j + "=" + (i*j));				
			}
			System.out.println();		
		}
		
		System.out.println("-----------------------");
		
		/* 2*1=2  3*1=3  4*1=4 .....  9*1=9
		 * 2*2=4  3*3=6  4*2=8
		 * */
		
		for(int i=1;i<=9;i++) {
			for(int j=2;j<=9;j++) {
				//System.out.print(j + "*" + i + "=" + (i*j) + " ");
				System.out.printf("%1d*%1d=%2d%2s",j,i,j*i," ");
			}
			System.out.println();
		}
		
	}

}
