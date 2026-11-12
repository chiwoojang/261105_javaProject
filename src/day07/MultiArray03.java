package day07;

import java.util.Arrays;
import java.util.Scanner;

public class MultiArray03 {

	public static void main(String[] args) {
		// 성적표
		/* 전체인원 > 3 (입력) ==> 인원수만큼 배열 생성
		 * 이름 국어 영어 수학 합계 평균 등수
		 * hong 89  78  88  00  00
		 * kim  85  74  86  00  00
		 * lee  95  48  66  00  00
		 * 
		 * 이름, 국어, 영어, 수학 점수를 입력받아 합계 평균 등수
		 * */
		// 각각의 필요한 배열을 따로생성 같은 번지의 학생은 같은 값으로 정의
//		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t등수");
//		System.out.printf("%.1f", 56.741235);
		
		Scanner scan = new Scanner(System.in);
		System.out.print("테스트 인원을 입력하세요 > ");
		int tester = scan.nextInt();
		int subject = 3;
		
		String[] name = new String[tester];
		int[][] score = new int[tester][subject];

		
		// 학생과 성적을 직접 입력
		for(int i=0; i<tester; i++) {
			System.out.print((i+1)+"번째 학생 이름 > ");
			name[i] = scan.next();
			scan.nextLine(); //빈칸 해소
			
			//직접받기
//			System.out.print("학생성적(국,영,수) > ");
//			for(int j=0;j<subject;j++) {
//				score[i][j] = scan.nextInt();
//			}
			//랜덤받기
			for(int j=0;j<subject;j++) {
				score[i][j] = (int)(Math.random()*101);
			}
			System.out.println("국 영 수 점수 : " + Arrays.toString(score[i]));
			
		}
		
		
		int sum[] = new int[tester];
		double avg[] = new double[tester];
		
		
		//합계 평균을 구함
		for(int i=0;i<score.length;i++) {
			sum[i] = 0;
			for(int j=0;j < score[i].length;j++) {
				sum[i] += score[i][j];
			}
			avg[i] = (double)sum[i]/score[i].length;
		}
		
		//등수를 구함
		int[] rank = new int[tester];
		
		for(int i=0;i<name.length;i++) {
			rank[i] = name.length;
			for(int j=0;j<name.length;j++) {
				if(i!=j) {
					if(avg[i] > avg[j]) {
						rank[i] -= 1;
					}
				}
			
			}
		}

		// 출력 결과 출력
		System.out.printf("%6s%6s%6s%6s%6s%6s%6s\n","이름","국어","영어","수학","합계","평균","등수");
		for(int i=0;i<name.length;i++) {
			System.out.printf("%7s",name[i]);
			for(int j=0 ; j < score[i].length; j++) {
				System.out.printf("%7d",score[i][j]);
			}
			System.out.printf("%7d",sum[i]);
			System.out.printf("%3s%.2f"," ",avg[i]);
			System.out.printf("%7d",rank[i]);
			System.out.println();
		}
	}

}
