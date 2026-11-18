package studentManager;

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
			System.arraycopy(s, 0, tmp, 0, subject.length);
			this.subject = tmp;
		}		
		// subject 추가하고 index++ 
		this.subject[index] = s;
		index++;
	}
	
	
	// 수강신청 취소 -> 수강리스트에 index+1 번호를 받아 해당 index 부분 앞, 뒤 부분만 떼어내 새 배열 주고 다시 링크
	// 삭제 후 해당 index 이후
	public void deleteSubject(int i) {
		// 만약 수강신청에 없는 번호일 경우 삭제 안함
		
		// 삭제하고 새 배열 할당
	}
	
	
}
