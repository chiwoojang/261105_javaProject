package day02;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// 국어, 영어, 수학 점수를 입력 받아서 합계, 평균, pass 출력
		// 입력받은 점수는 0~100 범위 안에 있어야 함.
		// return; 리턴을 만나면 메서드를 빠져나오란 얘기
		
		//콘솔입력 객체 생성
		Scanner scanner = new Scanner(System.in);
		Exam01 exam01 = new Exam01();
		
		// 국어점수 받고, 이상점수일 경우 종료
		System.out.println("국어 점수를 입력하세요. >");
		int kor = scanner.nextInt();
//		if(kor < 0 || kor > 100) {
//			System.out.println("올바른 점수가 아닙니다. 종료합니다.");
//			return;
//		}
		if(! exam01.isValidScore(kor)) return;
		
		
		// 영어점수 받고, 이상점수일 경우 종료
		System.out.println("영어 점수를 입력하세요. >");
		int eng = scanner.nextInt();
		if(eng < 0 || eng > 100) {
			System.out.println("올바른 점수가 아닙니다. 종료합니다.");
			return;
		}
		
		// 수학점수 받고, 이상점수일 경우 종료
		System.out.println("수학 점수를 입력하세요. >");
		int math = scanner.nextInt();
		if(math < 0 || math > 100) {
			System.out.println("올바른 점수가 아닙니다. 종료합니다.");
			return;
		}
		
		scanner.close();
		
		// 정상점수를 이용해 합계와 평균 연산
		int total = kor + eng + math;
		double avg = (double) total/3;
		
		// 출력부 : 합계, 평균, pass 여부 출력
		System.out.println("총점 : " + total + " 평균 : " + avg);
		System.out.println(avg >= 60 ? "합격" : "불합격");		

	}
	
	public boolean isValidScore(int score) {
		if(score < 0 || score >100) {
			System.out.println("올바른 점수가 아닙니다. 종료합니다.");
			return false;
		}else {
			return true;
		}
			
	}

}
