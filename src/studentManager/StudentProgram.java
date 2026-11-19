package studentManager;

import java.util.Scanner;

public interface StudentProgram {
	/*
	 *  1. 학생 등록
2. 학생 리스트 출력
3. 학생 검색(학생정보, 수강정보)
4. 학생 선택 => 수강신청(한 학생에 대한 수강 등록)
5. 학생 선택 => 수강취소(한 학생이 등록한 수강 취소)
	 * */
	void insertStudent(Scanner scan);
	void printStudentList();
	void searchStudent(Scanner scan);
	void insertSubject(Scanner scan);
	void deleteSubject(Scanner scan);
	void printSubjectList();
	
}
