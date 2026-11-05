package day01;

public class Exam2 {

	public static void main(String[] args) {
		// kor, eng, math 세 점수를 입력하고, 합계와 평균을 출력
		// 각 점수는 0~100 사이여야 함 => 이외 점수가 나오면 점수가 잘못되었습니다.
		// pass : 평균이 60점 이상이면 합격 아니면 불합격 : if 문 이용
		
		int kor = 45;
		int eng = 90;
		int math = 100;
		
		int sum = 0;
		double avg = 0.0;
		
		if((kor >=0 && kor <= 100)&&(eng >=0 && eng <=100)&&(math >=0 && math <=100)) {
			sum = kor + eng + math;
			avg = sum/(double)3;
			
			//System.out.println("점수 합계 : " + sum + " 점, 평균 : " + avg);
			System.out.printf("점수 합계 : %d점, 평균 : %.1f점 \n", sum, avg);
			if (avg >= 60) {
				System.out.println("귀하의 점수는 합격입니다.");
			}else {
				System.out.println("귀하의 점수는 불합격입니다.");
			}
			
		} else {
			System.out.println("점수가 잘못 입력 되었습니다.");
		}
		
		//배열을 이용한 조건식 검출 처리
		//본 처리과정은 과목이 늘어날 경우 각 과목점수에 오류가 발생할 수 있는 점을 감안 반복문으로 처리해 검수할 수 있도록 처리함
		System.out.println("Case 2 결과");
		boolean isNormal = true;
		sum = 0;
		int[] scores = {kor,eng,math};
		for(int i=0; i<scores.length; i++) {
			if (scores[i] < 0 || scores[i] > 100) {
				isNormal = false;
				break;
			} else {
				sum += scores[i];
			}
		}
		if(isNormal) {
			avg = sum/(double)scores.length;
			System.out.printf("점수 합계 : %d점, 평균 : %.1f점 \n", sum, avg);
			if (avg >= 60) {
				System.out.println("귀하의 점수는 합격입니다.");
			}else {
				System.out.println("귀하의 점수는 불합격입니다.");
			}			
		}else {
			System.out.println("점수가 잘못 입력 되었습니다.");			
		}
		
		//강사 해설
		//switch는 1:1 대응이 될 때, 그 외의 True, false 문제는 if로 대응
		//int kor2=-78, eng2=89, math2 = 45;
		
		int kor2 = 78;
		int eng2 = 89;
		int math2 = 50;
		
		// 1. 각 점수가 조건에 맞는지 확인 (type1)
		// 조건에 맞다면 계산하시오.
		
		if((kor2 >=0 && kor2 <=100) &&  (eng2 >=0 && eng2 <=100) &&(math2>=0 && math2<=100)) {
			//계산
			int total = kor2 + eng2 + math2;
			double avg2 = (double)total/3;
			System.out.println("total : " + total + " average : " + avg2);
			if (avg2 >=60) {
				System.out.println("합격");
			}else {
				System.out.println("불합격");
			}
			System.out.println(avg2>=60?"합격":"불합격");
			
		}else {
			System.out.println("점수가 잘못 입력되었습니다.");
		}
		
		// 2. 각 점수의 조건이 맞지 않으면 계산하지 마시오. (type2)
		if((kor2 >100 || kor2 <0) || (eng2 >100 || eng2 <0) || (math2 >100 || math2 <0)) {
			// 계산 불가
			System.out.println("점수가 잘못 입력되었습니다.");
		}else {
			//계산
			int total = kor2 + eng2 + math2;
			double avg2 = (double)total/3;
			System.out.println("total : " + total + " average : " + avg2);
			System.out.println(avg2>=60?"합격":"불합격");			
		}
		
		
	}

}
