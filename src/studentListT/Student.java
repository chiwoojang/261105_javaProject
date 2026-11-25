package studentListT;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Student {
	//  - 멤버변수 : 학번(기본키), 이름(필수), 전화번호(필수), 생년월일, 주소 수강과목[] (Subject[])
	private String studentNum;
	private String studentName;
	private String studentPhone;
	private String studentBirth;
	private String studentAddress;
	
	// 학생 1명의 수강신청 목록 배열
//	private Subject[] course;
	private List<Subject> subjects = new ArrayList<>();
	
//	private int index;  // 배열의 인덱스
	
	// 생성자
	public Student() {	
//		course = new Subject[5];
	}
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public Student(String studentNum, String studentName) {
		super();
		this.studentNum = studentNum;
		this.studentName = studentName;
		this.studentPhone = "010-1111-0000";
		this.studentBirth = "000101";
		this.studentAddress = "인천시";
		
//		course = new Subject[5];
	}
	
	// == method
	
	// 학생정보 출력 (학번, 이름, 전화번호)
	public void printStudent() {
		System.out.println(studentName + "(" + studentNum+") /" + studentPhone);
	}
	
	// 본인의 수강배열을 출력하는 메서드
	public void printCounse() {
		
		for(Subject c : subjects) {
			c.printSubject();
		}
		
	}
	
	//Controller에서 준 subject를 매개별수로 받아 내 수강배열에 추가하는 메서드
	public void addSubject(Subject s) {
		
		// 중복 안됨을 하고 싶다면...
//		if(subjects.contains(s)) {
//			System.out.println("이미 존재하는 과목입니다.");
//			return;
//		}
		
		subjects.add(s);
	}
	
	public void removeSubject(Subject s) {
		
		if(!subjects.remove(s)) {
			System.out.println("취소할 과목이 없습니다.");
			return;
		}
		System.out.println("수강취소 완료");
				

	}	
	
	// 오버로드
	public boolean removeSubject(String subjectCode) {
		Subject s = new Subject(subjectCode);
		return subjects.remove(s);
	}
	

	public String getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}

	public String getStudentBirth() {
		return studentBirth;
	}

	public void setStudentBirth(String studentBirth) {
		this.studentBirth = studentBirth;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Student [studentNum=" + studentNum + ", studentName=" + studentName + ", studentPhone=" + studentPhone
				+ ", studentBirth=" + studentBirth + ", studentAddress=" + studentAddress + ", subjects=" + subjects
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(studentNum);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(studentNum, other.studentNum);
	}

	
}
