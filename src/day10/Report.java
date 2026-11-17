package day10;

public class Report {
	// 한 사람의 설적 클래스
	// 메버변수 : 이름, 국어, 영어, 수학, 합계, 평균, 등수
	// 생성자 : 이름, 국어 영어, 수학 => 매개변수로 등록
	// 기본생성자도 같이 오버로딩 해서 생성
	// 합계, 평균 계산
	// # : 해당 자리수가 있으면 출력 없으면 안함. 
	// 0 : 필수, 해당 자리수가 없으면 0으로 출력
	// 출력 => 평균은 소수점 2자리 DecimalFormat("###.00")	
	// DecimalFormat("##.00") => 객체명.format(avg)
	
	// 멤버변수
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private double avg;
	private int rank;
	
	// 생성자
	public Report() {	}
	
	public Report(String name,int kor,int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
//		this.sum = sum();
//		this.avg = avg();
		sum();
		avg();
	}
	
	// 메서드
	
	// 합계 
	public void sum() {
		this.sum = kor+eng+math;
	}
	
	// 평균
	public void avg() {
		this.avg = (double)sum/3;
	}
	
	// 등수설정
	public void rankSet(double[] arr) {
		int r = 1;
		for(int i=0;i<arr.length;i++) {
			if(this.avg<arr[i]) {
				r++;
			}
		}
		this.rank = r;
	}

	// toString
	@Override
	public String toString() {
		return "Report [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum=" + sum + ", avg="
				+ avg + ", rank=" + rank + "]";
	}
	
	// getter, setter	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}
	
	public double getAvg() {
		return avg;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	


	
	
}
