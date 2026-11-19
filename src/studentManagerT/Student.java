package studentManagerT;

import java.util.Arrays;

public class Student {
	//  - 멤버변수 : 학번(기본키), 이름(필수), 전화번호(필수), 생년월일, 주소 수강과목[] (Subject[])
	private String studentNum;
	private String studentName;
	private String studentPhone;
	private String studentBirth;
	private String studentAddress;
	
	// 학생 1명의 수강신청 목록 배열
	private Subject[] course;
	private int index;  // 배열의 인덱스
	
	// 생성자
	public Student() {	
		course = new Subject[5];
	}

	public Student(String studentNum, String studentName) {
		super();
		this.studentNum = studentNum;
		this.studentName = studentName;
		this.studentPhone = "010-1111-0000";
		this.studentBirth = "000101";
		this.studentAddress = "인천시";
		
		course = new Subject[5];
	}
	
	// == method
	
	// 학생정보 출력 (학번, 이름, 전화번호)
	public void printStudent() {
		System.out.println(studentName + "(" + studentNum+") /" + studentPhone);
	}
	
	// 본인의 수강배열을 출력하는 메서드
	public void printCounse() {
		for(int i=0;i<index;i++) {
			course[i].printSubject();
		}
	}
	
	//Controller에서 준 subject를 매개별수로 받아 내 수강배열에 추가하는 메서드
	public void addSubject(Subject s) {
		if(course.length == index) {
			Subject[] tmp = new Subject[index+3];
			System.arraycopy(course, 0, tmp, 0, index);
			course = tmp;
		}
		
//		for(int i=0;i<index;i++) {
//			if (course[i].getSubjectCode().equals(s.getSubjectCode())) {
//				System.out.println("이미 수강중인 과목입니다.");
//			}
//		}
		
		course[index] = s;
		index++;
	}
	
	public void removeSubject(String subjectCode) {
		// 수강코드를 매개변수로 받아 course 배열에서 삭제하는 메서드
		int cnt = -1;
		for(int i=0;i<index;i++) {
			if(course[i].getSubjectCode().equals(subjectCode)) {
				cnt=i;
				break;
			}
		}
		if(cnt==-1) {
			System.out.println("찾는 과목이 없습니다.");
		}
		// index를 찾았다면...
		// 삭제 : cnt 번지부터 index-1까지 뒷번지 값을 앞으로 옮기는 작업
		for(int i=cnt;i<index-1;i++) {
			course[i] = course[i+1];
		}
		// 마지막번지는 null처리
		course[index-1] = null;
		index--;
		System.out.println("수강취소 완료!!");
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

	public Subject[] getCourse() {
		return course;
	}

	public void setCourse(Subject[] course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [studentNum=" + studentNum + ", studentName=" + studentName + ", studentPhone=" + studentPhone
				+ ", studentBirth=" + studentBirth + ", studentAddress=" + studentAddress + ", course="
				+ Arrays.toString(course) + ", index=" + index + "]";
	}


	
	
	
		
	
}
