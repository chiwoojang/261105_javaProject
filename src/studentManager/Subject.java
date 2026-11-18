package studentManager;

public class Subject {
	private String subject;
	private String teacher;
	
	@Override
	public String toString() {
		return "Subject [subject=" + subject + ", teacher=" + teacher + "]";
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
