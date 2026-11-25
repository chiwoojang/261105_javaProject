package studentListT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentControllerT implements StudentProgram {
	
	// 학생목록을 저장하는 리스트
	private List<Student> studentList = new ArrayList<>();
	// 수강신청을 위한 과목 목록 리스트
	private List<Subject> subjectList = new ArrayList<Subject>();
	
	public StudentControllerT() {
		// 과목리스트
		subjectList.add(new Subject("111","JAVA","1강의장","4","월,수,금"));
		subjectList.add(new Subject("222","C언어","2강의장","4","월~금"));
		subjectList.add(new Subject("333","DB","3강의장","4","월,수"));
		subjectList.add(new Subject("444","javascript","4강의장","4","월,수,금"));
		subjectList.add(new Subject("555","HTML","5강의장","4","화목"));
		
		
		studentList.add(new Student("1","홍길동"));
		studentList.add(new Student("2","김영이"));		
	}
	
	@Override
	public void insertStudent(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("학번 >");
		String num = scan.next();
		System.out.println("이름 >");
		String name = scan.next();
		
		// 학번을 이용하여 이미 등록된 학생인지 검색
		if(studentList.contains(new Student(num))) {  // hash(), equals() 오버라이드 되어 있어야 함.
			System.out.println("이미 등록된 학생입니다.");
			return;
		}
		
		studentList.add(new Student(num,name));		
		
	}
	
	// 과목 리스트 출력
	public void printSubject() {
		System.out.println("-- 과목목록 --");
		for(Subject s : subjectList) {
			s.printSubject();
		}
	}

	@Override
	public void printStudentList() {
		// 전체 학생 리스트 출력
		System.out.println("--- 학생 명단 ---");
		for(Student s : studentList) {
			s.printStudent();
		}
		System.out.println("----------------");
	}

	@Override
	public void searchStudent(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("학번 >");
		String num = scan.next();
		// contains (있는 지 여부) / indexOf
		int index = studentList.indexOf(new Student(num));
		if(index==-1) {
			System.out.println("검색 학생이 없습니다.");
			return;
		}
		studentList.get(index).printStudent();
		//학생 수강정보
		studentList.get(index).printCounse();
	}

	@Override
	public void insertSubject(Scanner scan) {
		// 학번을 입력받아 있는 학생인지 확인 => 그 학생에게 수강정보를 입력받아 전달
		System.out.println("학번 >");
		String num = scan.next();
		// contains (있는 지 여부) / indexOf
		int index = studentList.indexOf(new Student(num));
		if(index==-1) {
			System.out.println("검색 학생이 없습니다.");
			return;
		}
		
		// 수강 신청 리스트 출력
		printSubject();
		
		// 신청할 과목번호 입력
		System.out.println("수강신청할 과목번호 >");
		String subjectNum = scan.next();
		Subject s = new Subject(subjectNum);
		int subIndex = subjectList.indexOf(s);
		if(subIndex==-1) {
			System.out.println("해당 과목코드는 존재하지 않습니다.");
			return;
		}
		studentList.get(index).addSubject(subjectList.get(subIndex));
		
//		studentList.get(index).getSubjects().add(subjectList.get(subIndex));

	}

	@Override
	public void deleteSubject(Scanner scan) {
		// 학번검색 후 => 나의 수강신청 목록 => 삭제할 수강번호 선택 => 삭제
		System.out.println("학번 >");
		String num = scan.next();
		// contains (있는 지 여부) / indexOf
		int index = studentList.indexOf(new Student(num));
		if(index==-1) {
			System.out.println("검색 학생이 없습니다.");
			return;
		}
		
		studentList.get(index).printCounse();
		System.out.println("삭제할 과목 번호 >");
		String subjectCode = scan.next();
		boolean ok = studentList.get(index).removeSubject(subjectCode);
		
		System.out.println(ok?"취소완료":"해당과목이 없습니다.");
		
	}

	@Override
	public void printSubjectList() {
		// TODO Auto-generated method stub
		
	}

}
