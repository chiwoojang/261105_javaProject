package day11;

public class Class06 {

	public static void main(String[] args) {
		/* 객체를 생성할 때 값을 초기화 하는 방법
		 * - 기본값, 명시적 초기값, 초기화 블럭, 생성자
		 * 
		 *  1. 기본값 : 멤버변수를 선언하면 컴파일러가 기본적으로 주는 값
		 *     정수 = 0, 객체 = null, boolean=false  (안 줘도 컴파일러가 기본값 세팅)
		 *  2. 명시적 초기값 : 내가 직접 값을 명시해 주는 값
		 *  	brand="LG";
		 *  3. 초기화 블럭 : { 초기값 지정 } => 멤버변수 초기화
		 *  4. 생성자 : 객체를 생성할 때 호출하여 초기값을 지정
		 *  	new 겍체 생성 시 딱 1번만 호출
		 *  
		 *  초기값 우선순위
		 *  기본값 < 명시적 초기값 < 초기화 블럭 < 생성자 (가장 우선순위 높음)
		 * */
		
		Student s = new Student("홍길동");
		System.out.println(s.toString());

	}

}

class Student{
	private final String GIGUM="부평"; // 2. 명시적 초기값
	private String name;  // null
	private int age;      // 0
	private String birth;
	
	{
		// 3. 초기화 블럭 영역 => 잘 안 씀 
		this.name = "미상";
		this.age = 20;
		this.birth="없음";
	}
	
	public Student(String name) {
		this.name = name;
		this.age = age;
	}
	
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [GIGUM=" + GIGUM + ", name=" + name + ", age=" + age + ", birth=" + birth + "]";
	}
	
	
}
