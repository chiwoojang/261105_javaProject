package day02;

public class Exam03_t {

	public static void main(String[] args) {
		// 국어, 영어, 수학 점수를 램덤으로 생성 (0~100)
		// 각 점수 출력 합계, 평균, pass
		// pass 80 이상이면 상 / 60점 이상이면 중 / 나머지는 하
		
		// 5명의 값을 출력
		// 강사본
		
		// (int)(Math.random()*count) + start;
		// Random class 사용시 => random.nextInt(count) + start
		int kor = (int)(Math.random()*100);
		int eng = (int)(Math.random()*100);
		int math = (int)(Math.random()*100);
		
		int total = kor + eng + math;
		double average = (double)total/3;
		
		String pass = "";
		
		if(average >= 80) {
			pass = "상";
		}else if(average >= 60) { // (average >= 60 && average < 80) 이라 쓸 필요 없음 이미 average < 80 달고 내려움
			pass = "중";			
		}else {
			pass = "하";
		}
		
		System.err.println("국어: " + kor + " 영어: " + eng + " 수학: " + math);
		System.out.println("합계: " + total + ", 평균:" + average + ", pass: "+pass);
		
		//for문 사용 5명의 데이터 출력
		
		for(int i=0; i<5; i++) {
			kor = (int)(Math.random()*100);
			eng = (int)(Math.random()*100);
			math = (int)(Math.random()*100);
			
			total = kor + eng + math;
			average = (double)total/3;
			
			pass = "";
			
			if(average >= 80) {
				pass = "상";
			}else if(average >= 60) { // (average >= 60 && average < 80) 이라 쓸 필요 없음 이미 average < 80 달고 내려움
				pass = "중";			
			}else {
				pass = "하";
			}
			
			System.out.println((i+1)+". 학생");
			System.err.println("국어: " + kor + " 영어: " + eng + " 수학: " + math);
			System.out.println("합계: " + total + ", 평균:" + average + ", pass: "+pass);		
			System.out.println("---------------------------");
		}
		
		

	}

}
