package day10;

import java.text.DecimalFormat;
import java.util.Scanner;


public class ReportMain {
	
	public static int[] rankReturn(double[] arr) {
		int[] rank = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			int r = 1;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					r++;
				}
			}
			rank[i] = r;
		}
		return rank;		
	}
	
	public static void main(String[] args) {
		// Report class 객체 생성 => 실행
		// 성적 산출 인원 > 3 (입력을 받겠음)
		// 이름, 국어, 영어, 수학 (입력)
		/* 이름  국어 영어 수학 합계 평균 등수 \t
		 * hong 89  85  78  00  00  00
		 * .
		 * .
		 * */
		// Report[] = new Report[count];
		// Report객체가 등어가는 배열
		// Report r = new Report("이름",78,89,45);
		// report[0] = r;
		
//		Report r = new Report("hong", 89,85,78);
//		System.out.println(r.toString());
		
		Scanner scan = new Scanner(System.in);
		
		// 성적산출 인원을 입력 받음
		int numStudent = 0;
		
		System.out.print("성적 산출 인원 > ");
		while(true) {
			numStudent = scan.nextInt();
			if(numStudent <= 0) {
				System.out.println("인원입력이 잘못되었습니다. 다시 입력하세요.");				
			}else {
				break;
			}			
		}
		
		// 성적 산출 인원만큼 학생정보 입력 받음. 이때 등수산출 위해 생성자로 생성된 평균값 배열을 별도로 받는다.
		Report[] r = new Report[numStudent];
		double[] arrAvg = new double[numStudent];
		
		System.out.println();
		for(int i=0;i<r.length;i++) {
			System.out.print((i+1)+"번학생 성적을 입력하세요.(학생명 국어 영어 수학) > ");
			String name = scan.next();
			int kor = scan.nextInt();
			int eng = scan.nextInt();
			int math = scan.nextInt();
			r[i] = new Report(name,kor,eng,math);
			arrAvg[i] = r[i].getAvg();
//			System.out.println(r[i].toString());
		}
		
		// 등수 연산하여 등수배열 부여
//		for(int i=0;i<r.length;i++) {
//			r[i].rankSet(arrAvg);
//		}
		
//		int[] arrRank = new int[r.length]; 
//		arrRank = rankReturn(arrAvg);
//		
//		// 학생들 랭크갱신
//		for(int i=0;i<r.length;i++) {
//			r[i].setRank(arrRank[i]);
//		}
		
		for(int i=0;i<numStudent;i++) {
			int r2 = 1;
			for(int j=0;j<numStudent;j++) {
				if(r[i].getAvg() < r[i].getAvg()) {
					r2++;
				}
			}
			r[i].setRank(r2);
		}
		
		
		// 학생정보 출력
		System.out.println("===================================");
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t등수");
		for(int i=0;i<r.length;i++) {
			String name = r[i].getName();
			int kor = r[i].getKor();
			int eng = r[i].getEng();
			int math = r[i].getMath();
			int sum = r[i].getSum();
			DecimalFormat d = new DecimalFormat("###.00");
			String avg = d.format(r[i].getAvg());
			int rank = r[i].getRank();
			System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"
					+sum+"\t"+avg+"\t"+rank);			
//			System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"
//					+sum+"\t"+avg+"\t"+arrRank[i]);			
		}
		
//		for(Report tmp : r) {
//			System.out.println(tmp); //toString을 위와 같이 바꿀 수 있음.
//		}
		
		
		scan.close();
	}

}
