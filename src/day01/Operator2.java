package day01;

public class Operator2 {

	public static void main(String[] args) {
		// kor, eng, math 점수를 변수에 저장하고
		// 세 점수의 합과, 평균을 출력
		int kor = 45;
		int eng = 78;
		int math = 45;
		
		// 합계를 변수로 선언
		int total = kor + eng + math;
		
		// 평균을 변수로 선언
		double avg = total / (double)3;
		
		System.out.println("합계 : " + total);
		System.out.println("평균 : " + avg);
		
		// 삼항연산자를 이용하여 avg가 60이상이면 합격 아니면 불합격
		System.out.println(avg >= 60 ? "합격" : "불합격");
		
		String pass = avg >=60 ? "합격" : "불합격";
		System.out.println(pass);

	}

}
