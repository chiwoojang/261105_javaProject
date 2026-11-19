package studentManager;

public class Subject {
	private String subject;
	private String teacher="미지정";
	
	public Subject() {}
	public Subject(String subject) {
		this.subject = subject;
	}
	public Subject(String subject,String teacher) {
		this.subject = subject;
		this.teacher = teacher;
	}
	
	
	@Override
	public String toString() {
		return subject + "\t" + teacher;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	
	
}
