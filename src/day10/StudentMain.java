package day10;

public class StudentMain {

	public static void main(String[] args) {
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
		 *               
		 * */
		
		Student s = new Student();
		System.out.println(s.toString());
		s.infoStudent();
		s.infoAcademy();
		s.infoCourse();
		
		Student s1 = new Student("이한솔", "010-5555-5555", "인천", "000505", "북인천");
		Student s2 = new Student("정승환", "010-5555-5555", "인천", "000505", "북인천");
		Student s3 = new Student("이민희", "010-5555-5555", "인천", "000505", "북인천");
		Student s4 = new Student("나스닥", "010-5555-5555", "양서구", "000505", "북인천");
		Student s5 = new Student("다다우", "010-5555-5555", "구리시", "000505", "북인천");
		Student s6 = new Student("필승한", "010-5555-5555", "인천", "000505", "북인천");
		s2.infoStudent();
		s2.infoAcademy();
		s2.infoCourse();
		s2.addCourse("AI풀스택", "26.11.02 ~ 27.05.17");
		s2.addCourse("Java", "26.11.02 ~ 27.05.17");
		s2.addCourse("Spring", "26.11.02 ~ 27.05.17");
		s2.addCourse("HTML", "26.11.02 ~ 27.05.17");
		s2.addCourse("Python", "26.11.02 ~ 27.05.17");
		s2.addCourse("JavaScript", "26.11.02 ~ 27.05.17");
		s2.infoCourse();
		
		s2.infoStudent();
		s2.infoCourse();
		
		
		Student[] student = new Student[6];
		student[0] = s1;
		student[1] = s2;
		student[2] = s3;
		student[3] = s4;
		student[4] = s5;
		student[5] = s6;
		
//		for(int i=0;i<student.length;i++) {
//			System.out.println(student[i]);
//		}
		
		// 인천사는 학생만 출력 - 학원정보, 학생정보
		for(int i=0; i<student.length;i++) {
			if(student[i].getAddress()!=null && student[i].getAddress().equals("인천")) {
				student[i].infoAcademy();
				student[i].infoStudent();				
			}
		}
			
		
		// AI풀스택 과정을 수강하는 학생만 출력 - 학생정보,수강정보
		for(Student st : student) {
			for(String course : st.getCourse()) {
				if(course !=null && course.contains("AI풀스택")) {
					st.infoStudent();
					st.infoCourse();
					break;
				}
			}
		}
		
//		int cnt = 0;
//		while(cnt < student.length) {
//			for(int i=0;i<student[cnt].getIndex();i++) {
//				if(student[cnt].getCourse()[i].contains("AI풀스택")) {
//					student[cnt].infoStudent();
//					student[cnt].infoCourse();
//				}
//			}
//			cnt++;
//		}
		
		
		
		
//		s2.infoStudent();
//		s2.infoAcademy();
//		s2.infoCours();		
		
		
	}

}
