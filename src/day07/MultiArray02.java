package day07;

public class MultiArray02 {

	public static void main(String[] args) {
		// 2차원 배열 [5][3]
		/* 1 2 3
		 * 4 5 6
		 * 7 8 9
		 * 10 11 12
		 * 13 14 15
		 * */
		
		int[][] arr = new int[5][3];
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				count++;
				arr[i][j] = count;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("-----------");

		//int[][] arr = new int[5][3];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = (int)(Math.random()*90+10);
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
