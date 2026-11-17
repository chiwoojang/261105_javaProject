package day09;

public class Class03 {

	public static void main(String[] args) {
		// 클래스 생성
		// 학생이름, 국어점수, 영어점수, 수학점수를 객체로 하는 클래스 생성
		// 전부 private으로 하고 getter / setter 하나씩
		// 이름 (국어, 영어, 수학) => 출력메서드
		// 매서드를 호출하면 국어+영어+수학 리턴되는 => 합계매서드
		// 매서드를 호출하면 합계/3 으로 평균이 리턴되는 => 평균메서드
		// 각 getter/setter 생성
		
		StudentClass s = new StudentClass();
		s.setName("홍길동");
		System.out.println(s.getName());
		s.setKor(91);
		System.out.println(s.getKor());
		s.setEng(87);
		System.out.println(s.getEng());
		s.setMath(63);
		System.out.println(s.getMath());
		s.print();
		int sum = s.sum();
		System.out.println("sum: " + sum);
		double avg = s.avg();
		System.out.println("avg: " + avg);
		
		StudentClass[] studentArr = new StudentClass[10];
		studentArr[0] = new StudentClass();
		studentArr[0].setName("영이");
		studentArr[0].setKor(56);
		studentArr[0].setEng(89);
		studentArr[0].setMath(99);
		studentArr[0].print();

	}

}

class StudentClass{
	// 멤버변수
	private String name;  //학생명
	private int kor;      //국어점수
	private int eng;      //영어점수
	private int math;     //수학점수
//	private int sum;      // sum 은 종속적. 날 안씀. 만약 써야 한다면. setter가 없어야 함.
	
	// 생성자
	
	
	
	// 메서드
	// 일반적으로 getter / setter는 맨 마지막으로 몰아 두고
	// 의미가 있는 메서드를 먼저 작성함
	
	// 출력 메서드 
	// 매개변수 : 없음 , 리턴타입 : void
	public void print() {
		System.out.printf("%s (국어:%d , 영어:%d, 수학:%d)\n",this.name,this.kor,this.eng,this.math);
		System.out.println("합계: "+sum()+" / 평균: "+avg());
	}
	
	// 합계 구하기
	// 매개변수 : 없음, 리턴타입 : int
	public int sum() {
		return this.kor+this.eng+this.math;
	}
	
	// 평균 구하기
	// 매개변수 : 없음, 리턴타입 : double
	public double avg() {
		return (double)sum()/3;
	}
	
	
	// getter / setter는 일반적으로 만들어 두고  ==> 마우스 우클릭 / source / Generate getter and setter
	// 자동으로 만들 때는 최대한 멤버변수 등 교정 다 보고 마지막에 만드는 게 좋음
	// 이름이나 형 바꿀 때 주의
	// 나중에 필요없는 것들은 삭제함
	// 자동으로 만들어 주는 기능 있음 - 지금은 학습차 직접 씀
	
	// getter
	
	public String getName() {
		return this.name;
	}
	public int getKor() {
		return this.kor;
	}
	public int getEng() {
		return this.eng;
	}
	public int getMath() {
		return this.math;
	}
	
	// setter
	public void setName(String name) {
		if(name==null) {
			System.out.println("이름 입력이 잘못되었습니다.");
			return;
		}
		this.name = name;
	}
	public void setKor(int kor) {
		if(kor <0 || kor >100) {
			System.out.println("국어 점수 입력이 잘못되었습니다.");
			return;
		}
		this.kor = kor;
	}
	public void setEng(int eng) {
		if(eng <0 || eng >100) {
			System.out.println("영어 점수 입력이 잘못되었습니다.");
			return;
		}
		this.eng = eng;
	}
	public void setMath(int math) {
		if(math <0 || math >100) {
			System.out.println("수학 점수 입력이 잘못되었습니다.");
			return;
		}
		this.math = math;
	}
	
	
	
	
}
