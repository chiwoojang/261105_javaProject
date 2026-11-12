package day07;

public class MultiArray01 {

	public static void main(String[] args) {
		// 다차원 배열
		/* 배열타입[행] 배열명 = 1차원 배열 {1,2,3}
		 * 배열타입[행][열] 배열명 = 2차원 배열 {{1,2,3},{4,5,6}} (표)
		 * 배열타입[면][행][렬] 배열명 = 3차원 배열 {{{1,2,3},{4,5,6}}}
		 * */

		int[][] arr = {
				{1,2,3},  //0
				{4,5,6}   //1
		}; // 2행 3열
		
		System.out.println(arr[0][0]); //1
		System.out.println(arr[0][1]); //2
		System.out.println(arr[0][2]); //3
		System.out.println(arr[1][0]); //1
		System.out.println(arr[1][1]); //2
		System.out.println(arr[1][2]); //3
		
		System.out.println("------");
		
		int count=0;
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j < arr[i].length;j++) {
				count++;
				arr[i][j] = count+10;
				System.out.print(arr[i][j]+" ");
			}			
			System.out.println();
		}
		
	}

}
