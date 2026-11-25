package studentListT;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentController implements StudentProgram{

	// 학생 (학생 등록을 하면 저장할 배열)
	private Map<String,Student> studentList = new HashMap<>();
	private int studentIndex;
	private Map<String,Subject> subjectList = new HashMap<>();
	
	public StudentController(){
		// 과목리스트
		subjectList.put("111",new Subject("111","JAVA","1강의장","4","월,수,금"));
		subjectList.put("222",new Subject("222","C언어","2강의장","4","월~금"));
		subjectList.put("333",new Subject("333","DB","3강의장","4","월,수"));
		subjectList.put("444",new Subject("444","javascript","4강의장","4","월,수,금"));
		subjectList.put("555",new Subject("555","HTML","5강의장","4","화목"));
		
		
		studentList.put("1",new Student("1","홍길동"));
		studentList.put("2",new Student("2","김영이"));
		
	}
	
	

	
	@Override
	public void insertStudent(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("학번 >");
		String num = scan.next();
		System.out.println("이름>");
		String name = scan.next();
		
		studentList.put(num,new Student(num,name));
		System.out.println("학생등록 완료");
		
		
	}

	@Override
	public void printStudentList() {
		// 학생 리스트 출력
		System.out.println("---- 전체 학생 리스트 ---");
		
		for(String sNum : studentList.keySet()) {
			studentList.get(sNum).printStudent();
		}
		
		printSubjectList();
		
	}
	


	@Override
	public void searchStudent(Scanner scan) {
		// 학번을 입력받아 해당 학생의 정보와 과목정보를 출력
		System.out.println("학번 >");
		String num = scan.next();
		
		if(studentList.containsKey(num)) {
			studentList.get(num).printStudent();
			
			if(studentList.get(num).getSubjects().size()>0) {
				for(Subject subject : studentList.get(num).getSubjects()) {
					subject.printSubject();
				}
			}else {
				System.out.println("등록된 과목이 없습니다.");				
			}
			
			return;
		}
		
		System.out.println("해당 학생이 없습니다.");
		
		
		
	}
	

	@Override
	public void insertSubject(Scanner scan) {
		// 수강신청
		
		// 학번을 입력받아 해당 학생의 정보와 과목정보를 출력
		System.out.println("학번 >");
		String num = scan.next();
		
		if(!studentList.containsKey(num)) {
			System.out.println("해당 학생이 없습니다.");
			return;			
		}
		
		// 수강 리스트를 출력
		printSubjectList();
		System.out.println("수강신청할 과목코드 >");
		String subjectNum = scan.next();
		
		if(!subjectList.containsKey(subjectNum)) {
			System.out.println("없는 과목입니다.");
			return;
		}
		
		studentList.get(num).addSubject(subjectList.get(subjectNum));
		
		System.out.println("수강신청 완료");
	}

	@Override
	public void deleteSubject(Scanner scan) {
		// 학번을 입력받아 해당 학생의 정보와 과목정보를 출력
		System.out.println("학번 >");
		String num = scan.next();
		
		if(!studentList.containsKey(num)) {
			System.out.println("해당 학생이 없습니다.");
			return;			
		}
		
		// 해당과목코드를 입력받아 수강 취소
		// 취소하는 번지를 삭제하고, 뒷쪽 값들을 앞으로 덮어쓰기
		
		System.out.println(studentList.get(num).getStudentName()+"님의 수강신청 내역");
		studentList.get(num).printCounse();
		
		System.out.println("취소할 과목번호>");
		String subjectCode = scan.next();
		
		// 과목코드를 주고, 본인의 수강신청배열에서 삭제 요청 메서드
		studentList.get(num).removeSubject(subjectList.get(subjectCode));
	}

	@Override
	public void printSubjectList() {
		// 과목 리스트 출력
		System.out.println("---- 과목리스트 ---");
		for(String k : subjectList.keySet()) {
			subjectList.get(k).printSubject();
		}
		System.out.println("----------------");
	}


	@Override
	public String toString() {
		return "StudentController [studentList=" + studentList + ", studentIndex=" + studentIndex + ", subjectList="
				+ subjectList + "]";
	}
	
}
