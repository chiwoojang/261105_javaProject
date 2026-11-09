package day04;

public class For04 {

	public static void main(String[] args) {
		// 약수 : 나누어서 떨어지는 수의 집합
		/* 6의 약수 : 1, 2, 3, 6 
		 * 6%1==0
		 * 6%2==0
		 * 6%3==0
		 * 6%4==2
		 * 6%5==1
		 * 6%6==0
		 * */

		int number = 30;
		int counter = 0;
		// for 1 ~ number 까지 반복
		// number % i == 0 => 출력
		for(int i=1;i<=number;i++) {
			if(number%i==0) {
				System.out.print(i + " ");
				counter++;
			}			
		}
		System.out.println("\n약수 개수 : "+counter);
		
		System.out.println("--------------------");
		
		// 공약수 : 두 수의 공통된 약수
		/* 6, 12의 공약수
		 * 6 : 1,2,3,6
		 * 12 : 1,2,3,4,6,12
		 * 공약수 : 1,2,3,6
		 * 공약수 중 가장 큰 수 = 최대공약수 => 6
		 * */
		
		int num1 = 6;  // num1 % i == 0
		int num2 = 12; // num2 % i == 0
		int maxYacksu = 0;
		
		for(int i=1; i <= Math.min(num1, num2); i++) {
			if(num1%i==0 && num2%i==0) {
				//System.out.println(i);
				if(i>maxYacksu) {
					maxYacksu = i;
				}
			}
		}
		System.out.println("최대공약수 : " + maxYacksu);
		
		//역으로 내려오면 빠르네. 첫번째 만나는 약수에서 빠져 나옴. 최대공약수
		for(int i=num1;;i--) {  //break로 빠질 거라 조건식을 생략
			if(num1%i==0 && num2%i==0) {
				maxYacksu = i;
				break;
			}
		}
		System.out.println("최대공약수 : " + maxYacksu);
		
		//----------------------
		// 배수 : 1부터 값을 곱해서 나오는 값
		// 10의 배수 : 10,20,30,...
		// 15의 배수 : 15, 30, 45, ....
		// 공배수 : 두 수의 공통된 배수 => 30, 60, 90
		// 최소 공배수 : 30
		// 10*1, 10*2, 10*3 ...
		// 15*1, 15*2, 15*3 ...
		
		num1 = 6;
		num2 = 13;
		int seedNum = Math.min(num1, num2);
		int baesu = 0;
		
		for(int i=1;;i++) {
			baesu = seedNum*i;
			if(baesu%num2==0) { 
				break;
			}
		}
		System.out.println("최소공배수 : " + baesu );
		
		// 다른 방식 (배웠던 반복문 활용)
		int n1 = 8;
		int n2 = 10;
		
		for(int i=n1;;i= i+n1) {
			if(i%n1==0 && i%n2==0) {
				System.out.println("최소공배수 : " + i);
				break;
			}
		}
	}

}
