package day06;

import java.util.Arrays;

public class ArrayEx01 {

	public static void main(String[] args) {
		// 정부배열[5] 생성 후
		// 1~5까지 저장 => 출력
		
		int[] arr = new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]= i+1;
		}
		System.out.println(Arrays.toString(arr));
		
		// 섞기 = 자리바꿈(기존 자리의 값을 미리 임시공간에 보관)
		int tmp = arr[0]; //1을 다른 자리로 보관
		arr[0] = arr[2];  //1 => 3
		arr[2] = tmp;     //3 => 1
		System.out.println(Arrays.toString(arr));
		
		// 랜덤으로 번지를 선택해서 섞음. (번지는 arr의 갯수만큼 존재하는 번지 범위안에서)
		for(int i=0;i<arr.length;i++) {
			//번지를 랜덤으로 선택 (0~4)
			int index =(int)(Math.random()*arr.length);
			//교환
			int t = arr[i];
			arr[i] = arr[index];
			arr[index]=t;			
		}
		System.out.println(Arrays.toString(arr));
		
		// 다시 원래대로 정렬(선택정렬)
		// 오름차순 => 작은것부터 큰것순으로
		// 내림차순 => 큰것부터 작은것순으로
		/*[2, 3, 5, 1, 4]
		 * 1 3 5 2 4 -> pass1
		 * 1 2 5 3 4 -> pass2
		 * 1 2 3 4 5 -> pass3
		 * 1 2 3 4 5 -> pass4
		 * */
		// if(앞 > 뒤) {교환;}
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] < arr[j]) {  // > (오름차순) < (내림차순)
					//교환
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

		System.out.println("Arrays.sort(arr) : 오름차순 정렬");
		Arrays.sort(arr); // : 오름차순 - 내림차순은 제공 안함
		System.out.println(Arrays.toString(arr));

	}

}
