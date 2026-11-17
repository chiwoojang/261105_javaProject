package day09;

public class Class02 {
	/* 클래스
	 * - 클래스의 구성요소 : 멤버 변수, (멤버)메서드, 생성자
	 * - 멤버변수 생성자 메서드 순서로 구성
	 * 
	 * 
	 * 클래스 : 객체를 생성하기 위한 설계도
	 * 객체 : 클래스로부터 생성된 제품(Object)
	 * 메서드 : 제품의 기능 (Object가 할 수 있는 일)
	 * 멤버변수 : 제품의 속서(공통의 메서드에서 필요로 하는 값들을 저장 속성)
	 * 
	 * 프린트 클래스
	 * - 속성(멤버변수) : 제조사, 제품명, 종류, 저장변수등....
	 * - 기능(메서드) : 인쇄, 복사, 스캔, 택스
	 * 
	 * 클래스는 다른 클래스와 겹치지 않게 정의
	 * - 하나의 파일안에 여러개의 클래스를 정의할 수 있다.
	 * - 연습용 일때만 사용
	 * 
	 * 내부클래스 : 다른 클래스 내부에 클래스를 정의 (가능은 하나 잘 쓰진 않음)
	 * 
	 * 접근제어자
	 * - public : 모두사용가능
	 * - protected : 나 + 패키지 + 자식 (상속시 사용)
	 * - (default) : 나 + 패키지  (생략되어 있으면 default임)
	 * - private : 나
	 * 
	 * 1. 한 파일에 하나의 클래스를 생성 -> 일반적이다.
	 * 2. 클래스에서 public을 붙일 수 있는 클래스는 파일명과 == 클래스명 같을 경우만 가능
	 * 3. 접근제어자는 클래스, 메서드, 멤버변수 모두에서 사용
	 * 4. 메서드는 public - 일반적
	 * 5. 멤버변수는 private - 일반적
	 * 6. 멤버변수가 private 이면 다른 클래스에서 접근 금지
	 * 7. 멤버변수를 다른 클래스에 접근 가능하도록 하려면 => 메서드를 별도 생성 사용
	 *    (getter / setter)  -> 보통 한 세트로 만듬
	 *    - getter : 값을 가져올 때 (사용할 때)
	 *    - setter : 값을 저장할 때 (변경할 때)
	 *   객체 선언 > 생성 = new
	 *   클래스명 객체명 = new 생성자();
	 *   클래스명 객체명;  ==> null
	 *   
	 *  매서드 사용방법 (static 안붙은 일반(객체) 메서드)
	 *  - 같은 클래스 내부에서 호출 할 경우 => 메서드명();
	 *  - static 있거나 다른 클래스에서 호출 할 경우 
	 *    => 객체를 만들어서 선언 후 객체명.메서드(); 으로 사용
	 *    
	 *  class 클래스명{
	 *    - 클래스명은 반드시 대문자로 시작
	 *    - 한 패키지 안에서 같은 클래스는 X
	 *        
	 *   
	 * */
	
	public static void main(String[] args) {
		Test t = new Test();
		t.print();
		t.print(10,20);		
		int x = t.getX();
		System.out.println(x);
		int y = t.getY();
		System.out.println(y);
		t.setX(100);
		t.setY(200);
		t.print();
	}
}

class Test{
	// 가능 - 학습용으로만
	// 멤버변수
	// 초기값을 설정하지 않아도 컴파일러에 의해 사동 설정
	// 정수 => 0 / 문자,객체 => null
	// 생성자가 기본으로 초기값을 생성
	// 멤버변수는 클래스 내 모든 메서드가 공유하여 사용
	// 멤버변수는 매개별수로 전달할 필요가 없음.
	// 메서드 내부에서 멤버변수를 사용할 경우 다른 매개변수나, 일반변수와 차별하기 위해 this.
	// 매개변수와 멤버변수를 구분하기 위해 멤버변수에 this.멤버변수
	private int x;  //x=0 같이 초기화 잘 안함
	private int y;
	
	// 생성자  : 일단 자동으로 주는 생성자 씀
	
	// 메서드
	// print 메서드
	// (x,y)
	public void print() {
		System.out.println("("+this.x+","+this.y+")");
	}
	
	public void print(int x,int y) {  //일반적으로 매개변수와 멤버변수의 관계성 명확하기 위해 매개변수는 멤버변수가 같이 씀
		this.x = x;
		this.y = y;
		print();
	}
	
	// getter / setter 한 세트  -> 어느 멤머변수를 오픈할 지는 설계자 마음.
	// (규칙) get멤버변수명 / set멤버변수명 : 카멜케이스
	// number -> getNumber / setNumber
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
}
