package day01;

public class If {

	public static void main(String[] args) {
		// 조건문 : if, switch
		// 삼항연산자 : 조건 선태 연산자
		// if (조건식) 조건식이 참이면 실행
		// 처리문이 1줄이면 {} 생략
		// crtl + shife + f => 자동정렬 맞춤 (툴마다 다름)

		int number = 10;

		if (number % 2 == 0) {
			// 조건식이 참일 때 실행하는 구문
			// 삼항연산자에는 실행문을 넣을 수 없다.
			System.out.println("짝수");
		}

		if (number % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}

		// number가 0보다 크면 양수
		// number가 0보다 작으면 음수
		// 나머지는 0

		if (number > 0) {
			System.out.println("양수");
		} else if (number < 0) {
			System.out.println("음수");
		} else {
			System.out.println("0");
		}

		{
			// scope(소코프) : 해당 값이 영향을 미치는 범위 => 스택내 메모리공간의 지점의 시작과 끝
		}
	}

}
