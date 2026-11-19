package studentManager;

import java.util.Scanner;

public class StudentController implements StudentProgram {
	
	private Student[] students = new Student[5];
	private Subject[] subjects = new Subject[5];
	private int stuIndex;
	private int subIndex=5;
	
	{
		subjects[0]=new Subject("AI풀스텍","강사1");
		subjects[1]=new Subject("한번에 보는 SpringBoot","강사2");
		subjects[2]=new Subject("HTML5, CSS 따라하기","강사1");
		subjects[3]=new Subject("누구나 쉽게보는 SQL","강사4");
		subjects[4]=new Subject("Java Design 기초","강사3");		
	}

	@Override
	public void insertStudent(Scanner scan) {
		// TODO Auto-generated method stub
		String name="";
		do {
			System.out.println("학생정보를 입력해 주세요.(나가기 0)");
			System.out.println("이름 >");
			name = scan.next();
			if(name.equals("0")) {
				return;
			}
			if(name=="") {
				System.out.println("이름은 필수항목입니다!!");
				continue;
			}
			System.out.println("전화번호 > ");
			String phone = scan.next();
			System.out.println("학원 > ");
			String academy = scan.next();
			System.out.println("지점 > ");
			String branch = scan.next();
			
			// 학생을 학생배열에 추가함
			// 배열이 꽉 차면 배열 크기를 늘림
			if(stuIndex==students.length) {
				// 늘림
				Student[] tmp = new Student[students.length+3];
				System.arraycopy(students, 0, tmp, 0, students.length);
				students = tmp;
			}
			
			Student tmpStu = new Student();
			tmpStu.setName(name);
			if(phone!=null) {
				tmpStu.setPhone(phone);
			}
			if(academy!=null) {
				tmpStu.setAcademy(academy);
			}
			if(phone!=null) {
				tmpStu.setBranch(branch);
			}
			//추가
			students[stuIndex]=tmpStu;
			stuIndex++;
		}while(!name.equals("0"));
		
	}

	@Override
	public void printStudentList() {
		// TODO Auto-generated method stub
		// 수강강좌에는 수강과목 개수 => student toString 수정
		
		System.out.println("학생번호\t학생이름\t전화번소\t학원명\t지점\t수강강좌");
		if(stuIndex==0) {
			System.out.println("수강자가 업습니다.");
			return;
		}
		for(int i=0; i<stuIndex;i++) {
			System.out.print((i+1)+".\t");
			System.out.println(students[i]);
		}
		
	}

	@Override
	public void printSubjectList() {
		// TODO Auto-generated method stub
		System.out.println("강좌번호\t강좌명\t강사");
		if(subIndex==0) {
			System.out.println("개설된 강좌가 업습니다.");
			return;
		}
		for(int i=0;i<subIndex;i++) {
			System.out.print((i+1)+".\t");
			System.out.println(subjects[i]);
		}
				
	}

	@Override
	public void searchStudent(Scanner scan) {
		// TODO Auto-generated method stub
		String name = "";
		String subject="";
		do {
			if(stuIndex==0) {
				System.out.println("수강신청자가 없습니다. 종료합니다.");
				return;
			}	
			
			System.out.println("무엇으로 검색할까요? (학생명->1, 강좌명->2, 나가기->0)");
			int searchType = scan.nextInt();
			if(searchType==0) {
				return;
			}
			if(searchType!=1&&searchType!=2) {
				System.out.println("검색타입 설정이 잘못되었습니다.");
				continue;
			}
			System.out.println(searchType==1?"검색할 학생명을 입력하세요(나가기 0)>"
					: "검색할 과목명을 입력해 주세요(나가기 0)");
			
			if(searchType==1) {				
				name = scan.next();
				if(name.equals("0")) {
					return;
				}
				int cnt = 0;
				System.out.println("학생번호\t학생이름\t전화번호\t학원명\t지점\t수강강좌");
				for(int i=0;i<stuIndex;i++) {
					if(students[i].getName().contains(name)) {
						System.out.print((i+1)+".\t");
						System.out.println(students[i]);
						cnt++;
					}
				}
				if(cnt==0) {
					System.out.println("----------"+name +"으로 검색결과가 없습니다.---------");
				}
			}else {
				subject = scan.next().toLowerCase();
				if(subject.equals("0")) {
					return;
				}
				int cnt = 0;
				System.out.println("학생번호\t학생이름\t전화번호\t학원명\t지점\t수강강좌");
				for(int i=0;i<stuIndex;i++) {
//					System.out.println("debug1");
					
					if(students[i].getIndex()>0) {
//						System.out.println("debug2");
						for(int j=0;j<students[i].getIndex();j++) {							
//							System.out.println("debug3");
							if(students[i].getSubject()[j].getSubject().toLowerCase().contains(subject)) {
								System.out.print((i+1)+".\t");
								System.out.println(students[i]);
								cnt++;
								break;
							}
						}
					}
				}
				if(cnt==0) {
					System.out.println("----------["+subject +"]로 검색결과가 없습니다.---------");
				}				
			}
			
			
			
		}while(!name.equals("0"));
		
		
	}

	@Override
	public void insertSubject(Scanner scan) {
		// TODO Auto-generated method stub
		// 수강신청자 선택(수강신청자 번호/회원조회에서 알아왔다 가정) -> 수강리스트 보여주기
		// 수강리스트 선택하기
		// 학생의 수강리스트 채우기 (공간이 부족하면 늘려서)
		System.out.println("학생검색이 필요한가요? (y/n) > ");
		String search = scan.next().toLowerCase();
		if(search.equals("y")) {			
			searchStudent(scan);
		}
		System.out.println("수강신청 할 학생번호를 선택해 주세요.>");
		int stuNo = scan.nextInt();
		// 잘못 입력되면 처리
		if(stuNo<1 || stuNo > stuIndex) {
			System.out.println("== 해당 학생이 없습니다. 다시 선택하세요. ==");
			return;
		}
		
		System.out.println(students[stuNo-1].getName() + "학생을 선택하셨습니다. 현재 수강내역입니다.");
		students[stuNo-1].subjectList();
		System.out.println("==============================");
		System.out.println("아래 과목에서 수강신청 해 주세요.");
		System.out.println("==============================");
		printSubjectList();
		System.out.println("==============================");
		
		int subNo=0;
		do {			
			System.out.println("수강할 강좌 번호를 입력해 주세요. (나가기 0) >");
			subNo = scan.nextInt();
			
			if(subNo<1 || subNo > subIndex) {
				System.out.println("해당 과목이 존재하지 않습니다.");
				continue;
			}
			
			students[stuNo-1].insertSubject(subjects[subNo-1]);
		}while(subNo!=0);
		
		
		
	}

	@Override
	public void deleteSubject(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("학생검색이 필요한가요? (y/n) > ");
		String search = scan.next().toLowerCase();
		if(search.equals("y")) {			
			searchStudent(scan);
		}
		
		System.out.println("수강취소 할 학생번호를 선택해 주세요.>");
		int stuNo = scan.nextInt();
		// 잘못 입력되면 처리
		if(stuNo<1 || stuNo > stuIndex) {
			System.out.println("해당 학생이 없습니다. 다시 선택하세요.");
			return;
		}
		
		
		System.out.println(students[stuNo-1].getName() + "학생을 선택하셨습니다. 현재 수강내역입니다.");
		
		int subNo=0;
		do {
			//수강목록 출력
			students[stuNo-1].subjectList();
			// 취소할 과목이 없으면 "수강내역이 없다고 하고, 나옴"
			if(students[stuNo-1].getIndex()==0) {
				return;
			}
						
			System.out.println("취소할 수강강좌 번호를 입력하세요.(나가기 0) >");
			subNo = scan.nextInt();
			if(subNo<1 || subNo > students[stuNo-1].getIndex()) {
				System.out.println("수강번호 입력이 잘못되었습니다. 다시 업력하세요.");
				continue;
			}
			
			students[stuNo-1].deleteSubject(subNo);
			
		}while(subNo!=0);
		
		
		
	}

}
