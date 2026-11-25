package studentList;

public class Subject {
	// 멤버변수 : 과목번호(기본키), 과목명, 강의장, 시간, 요일...
	private String subjectCode;
	private String subjectName;
	private String subjectRoom;
	private String subjectTime;
	private String subjectWeek;
	
	// 기본생성자 - 빈거, 다 찬거
	public Subject() {}

	public Subject(String subjectCode, String subjectName, String subjectRoom, String subjectTime, String subjectWeek) {
		this.subjectCode = subjectCode;
		this.subjectName = subjectName;
		this.subjectRoom = subjectRoom;
		this.subjectTime = subjectTime;
		this.subjectWeek = subjectWeek;
	}
	
	// method
	
	// toString : 모든 멤버변수의 값을 확인하기 위한 용도 (검증 용도)
	// 과목정보 출력 메서드  --> toString 과 별개로 보기좋게 출력하는 용도로 필요함
	public void printSubject() {
		System.out.println(subjectCode+"."+subjectName+"("+subjectTime+"/"
						+subjectWeek+")=> "+ subjectRoom);
	}
	
	

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSubjectRoom() {
		return subjectRoom;
	}

	public void setSubjectRoom(String subjectRoom) {
		this.subjectRoom = subjectRoom;
	}

	public String getSubjectTime() {
		return subjectTime;
	}

	public void setSubjectTime(String subjectTime) {
		this.subjectTime = subjectTime;
	}

	public String getSubjectWeek() {
		return subjectWeek;
	}

	public void setSubjectWeek(String subjectWeek) {
		this.subjectWeek = subjectWeek;
	}

	@Override
	public String toString() {
		return "Subject [subjectCode=" + subjectCode + ", subjectName=" + subjectName + ", subjectRoom=" + subjectRoom
				+ ", subjectTime=" + subjectTime + ", subjectWeek=" + subjectWeek + "]";
	}
	
	
	
	
	
}
