package studentManager;

import java.util.Arrays;

public class Student {
	//   - 멤버변수 : 이름(필수), 전화번호(필수), 학원이름, 지점, 수강과목[] (Subject[])
	private String name;
	private String phone;
	private String academy;
	private String branch;
	private Subject[] subject = new Subject[5];
	private int index;  //subject를 추적하는 index -> 수강신청 및 취소 시 처리
	
	// 생성자
	public Student() {}
	public Student(String name,String phone) {
		this.name = name;
		this.phone = phone;
	}
	public Student(String name,String phone,String academy, String branch) {
		new Student(name,phone);
		this.academy = academy;
		this.branch = branch;
	}
	
	// 메서드
	// 수강신청 리스트 보기
	public void subjectList() {
		// index=0 일 경우 => 수강신청 내역이 없다 출력
		if(index==0) {
			System.out.println("수강신청 내역이 없습니다.");
			return;
		}
		
		// index > 0 => 리스트 출력
		for(int i=0;i<index;i++) {
			System.out.println((i+1)+"."+this.subject[i].getSubject()+"("+this.subject[i].getTeacher()+")");
		}		
	}
	
	// 수강신청 추가
	public void insertSubject(Subject s) {
		// index가 꽉 차면 +3개 늘려준다.
		if(index==subject.length) {
			Subject[] tmp = new Subject[subject.length+3];
			System.arraycopy(subject, 0, tmp, 0, subject.length);
			this.subject = tmp;
		}		
		// subject 추가하고 index++ 
		this.subject[index] = s;
		index++;
	}
	
	
	// 수강신청 취소 -> 수강리스트에 index+1 번호를 받아 해당 index 부분 앞, 뒤 부분만 떼어내 새 배열 주고 다시 링크
	// 삭제 후 해당 index 이후 복사하고,
	// index를 1개 줄임(앞으로 이동)
	public void deleteSubject(int i) {
		// 만약 수강신청에 없는 번호일 경우 삭제 안함

		Subject[] tmp = new Subject[subject.length];
		if(i==1) {
			System.arraycopy(subject, 1, tmp, 0, index-1);
		}else if(i==index) {
			System.arraycopy(subject, 0, tmp, 0, index-1);
		}else {
			System.arraycopy(subject, 0, tmp, 0,i-1);  // 앞을 채우고,
			System.arraycopy(subject, i, tmp, i-1, index-i);
		}
		subject = tmp;
		index--;
				
		// 삭제하고 새 배열 할당
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
	public String getAcademy() {
		return academy;
	}
	public void setAcademy(String academy) {
		this.academy = academy;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Subject[] getSubject() {
		return subject;
	}
	
	public int getIndex() {
		return index;
	}
	@Override
	public String toString() {
		return name + "\t" + phone + "\t" + academy + "\t" + branch
				+ "\t" + index + "과목";
	}
	public void setSubject(Subject[] subject) {
		this.subject = subject;
	}
	
	
}
