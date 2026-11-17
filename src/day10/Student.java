package day10;

import java.util.Arrays;

public class Student {
	/* 학생정보를 관리하기 위한 클래스 생성
	 * 학생의 기본정보 : 이름, 전화번호, 주소, 생년월일
	 * 학원정보 : 학원명 = "더조은" (final), 지점
	 * 수강정보 : 수강과목[], 기간[](26.11.02 ~ 27.05.17)  => 여러개
	 *          수강과목은 여러과목을 들을 수 있다. [5] / 시간 [5]  (일단, 클래스로는 안 만들고 배열로만 처리)
	 *          같은 번지는 같은 값으로 인지
	 * ex) 홀길동, 010-1111-2222, 인천, 000505
	 *     더종느, 인천지점
	 *     AI풀스텍, 26.11.02 ~27.05.17
	 *     JAVA, 26.10.01 ~ 26.11.01
	 * 1. 과목추가등록 메서드 
	 *    - 수강과목이 5개를 넘어가면 배열을 늘려서 처리
	 * 2. 각 정보를 출력하는 메서드
	 *    - 수강정보를 출력할 때 수강정보가 없다면.. => 수간정보가 없습니다. (출력)               
	 * */
	
	// 멤버변수
	private String name;
	private String phone;
	private String address;
	private String birth;
	private final String ACADEMY="더조은"; //final : 회사명, 브랜드, 로고 등
	private String branch="부평";
	private String[] courses = new String[5];
	private String[] terms = new String[5];
	
	// 멤버변수에 배열이 존재한다면 index 별수를 함께 쓰는 것이 편리
	private int index=0;
//	private int count=0;
	
	// 생성자
	public Student() {}  //기본 생성자
	
	public Student(String name) {
		this.name = name;
	}

	public Student(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public Student(String name, String phone, String address, String birth) {
//		this.name = name;
//		this.phone = phone;
		this(name,phone);   // 이런케이스가 많음.
		this.address = address;
		this.birth = birth;
	}

//	public Student(String name, String phone, String address, String birth, String branch) {
//		super();   // 조상의 생성자를 호출, 써야하면 꼭 써야 함. (써도 되고, 안써도 되는데....)
//		this.name = name;
//		this.phone = phone;
//		this.address = address;
//		this.birth = birth;
//		this.branch = branch;
//	}
	
	public Student(String name,String phone, String address, String birth, String barnch) {
		// 생성자 호출 가능  this()
		this(name, phone);    // 이렇게도 씀. 실무에서 자주 만남.
		this.address = address;
		this.birth = birth;
		this.branch = branch;		
	}
			
	// 메소드
	
	// 과정을 추가
	public void addCourse(String course,String term) {
		// 과목을 담을 배열크기가 작으면 +3칸 정도 늘려 재배정
//		System.out.println(index+";"+this.course.length);
		if(index == this.courses.length) {
			String[] tmp1 = new String[this.courses.length+3];
			String[] tmp2 = new String[this.terms.length+3];
			System.arraycopy(this.courses, 0, tmp1, 0, this.courses.length);
			System.arraycopy(this.terms, 0, tmp2, 0, this.terms.length);
			//기존 배열의 참조 변수에 객체 덮어쓰기
			this.courses = tmp1;
			this.terms = tmp2;
		}
		this.courses[index] = course;
		this.terms[index] = term;
		index++;
	}
	
	// 학생정보 출력
	public void infoStudent() {
		System.out.println("===== 학생정보 =====");
		System.out.println("성명: " + this.name 
				+ ",전화번호: " + this.phone 
				+ ",주소: " + this.address
				+ ",생년월일: " + this.birth);
	}
	
	// 학원정보 출력
	public void infoAcademy() {
		System.out.println("===== 학원정보 =====");
		System.out.println("학원명: " + this.ACADEMY
				+ ",지점: " + this.branch);
	}
	
	// 수강과목 정보 출력
	public void infoCourse() {  // 메서드에서는 else 를 잘 안씀.
		if(index<=0) {
			System.out.println("수강과목이 없습니다.");
			return;
		}
		System.out.println("===== 수강정보 =====");
		for(int i=0;i<index;i++) {
			System.out.println(courses[i] + "(" + terms[i]+")");
		}
	}
	
	
	public void infoCourse(String search) {  // 수강과목명 검색기능 오버로딩
		if(index<=0) {
			System.out.println("수강과목이 없습니다.");
			return;
		}		
		int count=0;
		System.out.println("===== 수강정보 =====");
		for(int i=0;i<index;i++) {
			if(courses[i].toLowerCase().contains(search.toLowerCase())) {				
				System.out.println(courses[i] + "(" + terms[i]+")");
				count++;
			}
		}
		if(count==0) {
			System.out.println("검색정보가 없습니다.");
			return;
		}		
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", phone=" + phone + ", address=" + address + ", birth=" + birth + ", ACADEMY="
				+ ACADEMY + ", branch=" + branch + ", course=" + Arrays.toString(courses) + ", term="
				+ Arrays.toString(terms) + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String[] getCourse() {
		return courses;
	}

	public void setCourse(String[] course) {
		this.courses = course;
	}

	public String[] getTerm() {
		return terms;
	}

	public void setTerm(String[] term) {
		this.terms = term;
	}

	public String getACADEMY() {
		return ACADEMY;
	}

	public int getIndex() {
		return index;
	}
	
	
	
}
