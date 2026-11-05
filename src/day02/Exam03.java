package day02;

import java.util.Random;

public class Exam03 {

	public static void main(String[] args) {
		// 국어, 영어, 수학 점수를 램덤으로 생성 (0~100)
		// 각 점수 출력 합계, 평균, pass
		// pass 80 이상이면 상 / 60점 이상이면 중 / 나머지는 하
		
		// 5명의 값을 출력
		
		//랜덤 숫자 받을 객체 생성
		Random random = new Random();
		
		for(int i=1; i <= 5;i++) {
			
			// 100 점 이내의 랜덤 점수 받음
			int kor = random.nextInt(101);
			int eng = random.nextInt(101);
			int math = random.nextInt(101);
			
			// 성적 출력
			System.out.println(i + "번 학생 성적");
			System.out.println("국어 : " + kor + ", 영어 : " + eng +  ", 수학 : " + math);
			
			// 합계와 평균 연산
			int total = kor + eng + math;
			double avg = (double)total/3;
			
			// 합계 평균 출력
			System.out.println("합계 : " + total + ", 평균 : " + avg);
			
			// 상,중,하 분류 출력
			System.out.println(avg >=80?"상":avg >=60?"중":"하");
			System.out.println();
		}

	}

}
