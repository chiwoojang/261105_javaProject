package day14;

import java.util.Arrays;
import java.util.Scanner;

public class Exception06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		Exception06 e = new Exception06();
		
		e.run(scan);
		
		scan.close();
		
		
		

	}
	
	/* 배열의 길이(size)를 입력받아 해당 길이의 배열을 생성
	 * 랜덤(start~count)으로 값을 채워 리턴하는 메서드
	 * (Math.random()*count) + start
	 * - count가 0보다 작거나 같다면 예외 발생
	 * - size가 0보다 작거나 같아면 예외 발생
	 * 
	 * 매개변수 : size, count, start 
	 * 
	 *  *  
	 * */
	public void run(Scanner scan) {
		while(true) {
			System.out.println("배열 크기, 랜덤 크기, 랜덤 시작값 을 입력하세요.>");
			int size = scan.nextInt();
			int count = scan.nextInt();
			int start = scan.nextInt();
			
			try {				
				int[] arr = new int[size] ;
				arr = arrRandom(size,count,start);
				System.out.println(Arrays.toString(arr));
			} catch (Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			
		
			System.out.println("계속 진행할까요? (y/n) > ");
			if(scan.next().equalsIgnoreCase("n")) {
				break;
			}
			
			System.out.println("종료!!");
		}
		
	}
	
	
	public int[] arrRandom(int size,int count, int start) throws RuntimeException {
		
		if(size <=0) {
			throw new RuntimeException("배열의 크기는 0이하일 수 없습니다.");
		}
		
		if(count <=0) {
			throw new RuntimeException("랜덤수 범위가 0 이하일 수 없습니다.");
		}
		
		int[] result = new int[size];
		
		for(int i=0;i<size;i++) {
			result[i] = (int)(Math.random()*count) + start;
		}
		
		
		return result;
	}

}
