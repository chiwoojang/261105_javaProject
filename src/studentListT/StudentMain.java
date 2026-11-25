package studentListT;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		StudentControllerT sc = new StudentControllerT();
		
		int menu = 0;
		do {
			System.out.println("--선택--");
			System.out.println("1.학생등록 | 2. 학생리스트 | 3. 학생조회");
			System.out.println("4.수강신청 | 5. 수강취소  | 6. 종료 ");
			System.out.println("선택>");
			
			try {
				
				menu = scan.nextInt();
				
				switch(menu) {
				case 1:
					sc.insertStudent(scan);
					break;
				case 2:
					sc.printStudentList();
					break;
				case 3:
					sc.searchStudent(scan);
					break;
				case 4:
					sc.insertSubject(scan);
					break;
				case 5:
					sc.deleteSubject(scan);
					break;
				case 6:
					System.out.println("종료!!");
					break;
				default: System.out.println("잘못된 메뉴입니다.");
				}
			} catch (Exception e) {
				System.out.println("입력이 잘못되었습니다.");
				scan.nextLine();
			}
		}while(menu!=6);
		
		scan.close();		

	}

}
