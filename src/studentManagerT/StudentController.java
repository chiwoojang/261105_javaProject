package studentManagerT;

import java.util.Arrays;
import java.util.Scanner;

public class StudentController implements StudentProgram{

	// 학생 (학생 등록을 하면 저장할 배열)
	private Student[] studentList = new Student[5];
	private int studentIndex;
	// 과목배열 (학원에서 수강 가능한 과목 배열) = 메뉴처럼 과목을 선택할 수 있게
	private Subject[] subjectList = new Subject[5];
	
	public StudentController(){
		// 과목리스트
		//(String subjectCode, String subjectName, String subjectRoom, 
		//String subjectTime, String subjectWeek) 
		subjectList[0]=new Subject("111","JAVA","1강의장","4","월,수,금");
		subjectList[1]=new Subject("222","C언어","2강의장","4","월~금");
		subjectList[2]=new Subject("333","DB","3강의장","4","월,수");
		subjectList[3]=new Subject("444","javascript","4강의장","4","월,수,금");
		subjectList[4]=new Subject("555","HTML","5강의장","4","화목");
		
		studentList[0] = new Student("1","홍길동");
		studentList[1] = new Student("2","김영이");
		studentIndex = 2;
	}
	
	
	// 학번을  매개변수로 받아서, 학생리스트를 보고 해당 번지를 리턴해 주는 메서드
	public int indexSearch(String num) {
		for(int i=0;i<studentIndex; i++) {
			if(studentList[i].getStudentNum().equals(num)) {
				return i;
			}
		}
		return -1;
	}
	
	@Override
	public void insertStudent(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("학번 >");
		String num = scan.next();
		System.out.println("이름>");
		String name = scan.next();
		
		// 이미 등록한 학생인지 확인
		int indexNumber = indexSearch(num);
		if(indexNumber!=-1) {
			System.out.println("이미 등록한 학생입니다.");
			return;
		}
		
		if(studentList.length==studentIndex) {
			// 배열이 꽉 찾다면
			Student[] sTemp = new Student[studentIndex+3];
			System.arraycopy(studentList, 0, sTemp, 0, studentIndex);
			studentList = sTemp;
		}
		
		Student s = new Student(num,name);
		studentList[studentIndex] = s;
		studentIndex++;
		System.out.println("학생등록 완료");
//		printStudentList();
		
	}

	@Override
	public void printStudentList() {
		// 학생 리스트 출력
		System.out.println("---- 전체 학생 리스트 ---");
		for(int i=0;i<studentIndex;i++) {
			studentList[i].printStudent();
		}
		
		printSubjectList();
		
	}
	


	@Override
	public void searchStudent(Scanner scan) {
		// 학번을 입력받아 해당 학생의 정보와 과목정보를 출력
		System.out.println("학번 >");
		String num = scan.next();
		
		int indexNumber = indexSearch(num);
		if(indexNumber==-1) {
			System.out.println("해당 학생이 없습니다.");
			return;
		}
		studentList[indexNumber].printStudent();
		if(studentList[indexNumber].getCourse()==null) {
			System.out.println("등록된 과목이 없습니다.");
			return;
		}
		// 검색한 학생의 등록된 코스배열 출력요청
		studentList[indexNumber].printCounse();
		
		
	}
	
	// 수강코드번호를 주고 해당 번호의 객체를 리턴하는 메서드
	public Subject searchSubjectCode(String num) {
		for(int i=0;i<subjectList.length;i++) {
			if(subjectList[i].getSubjectCode().equals(num)) {
				return subjectList[i];
			}
		}
		return null;
	}

	@Override
	public void insertSubject(Scanner scan) {
		// 수강신청
		
		// 학번을 입력받아 해당 학생의 정보와 과목정보를 출력
		System.out.println("학번 >");
		String num = scan.next();
		
		int indexNumber = indexSearch(num);
		if(indexNumber==-1) {
			System.out.println("해당 학생이 없습니다.");
			return;
		}
		
		// 수강 리스트를 출력
		printSubjectList();
		System.out.println("수강신청할 과목코드 >");
		String subjectNum = scan.next();
		
		Subject s = searchSubjectCode(subjectNum);
		if(s==null) {
			System.out.println("없는 과목입니다.");
			return;
		}
		
		studentList[indexNumber].addSubject(s);
		studentList[indexNumber].printCounse();
		System.out.println("수강신청 완료");
	}

	@Override
	public void deleteSubject(Scanner scan) {
		// 학번을 입력받아 해당 학생의 정보와 과목정보를 출력
		System.out.println("학번 >");
		String num = scan.next();
		
		int indexNumber = indexSearch(num);
		if(indexNumber==-1) {
			System.out.println("해당 학생이 없습니다.");
			return;
		}
		
		// 해당과목코드를 입력받아 수강 취소
		// 취소하는 번지를 삭제하고, 뒷쪽 값들을 앞으로 덮어쓰기
		
		System.out.println(studentList[indexNumber].getStudentName()+"님의 수강신청 내역");
		studentList[indexNumber].printCounse();
		
		System.out.println("취소할 과목번호>");
		String subjectCode = scan.next();
		
		// 과목코드를 주고, 본인의 수강신청배열에서 삭제 요청 메서드
		studentList[indexNumber].removeSubject(subjectCode);
	}

	@Override
	public void printSubjectList() {
		// 과목 리스트 출력
		System.out.println("---- 과목리스트 ---");
		for(Subject s : subjectList) {
			s.printSubject();
		}
		System.out.println("----------------");
	}

	@Override
	public String toString() {
		return "StudentController [studentList=" + Arrays.toString(studentList) + ", studentIdex=" + studentIndex
				+ ", subjectList=" + Arrays.toString(subjectList) + "]";
	}

	
}
