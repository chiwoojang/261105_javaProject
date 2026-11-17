package day09;

public class Class04 {

	public static void main(String[] args) {

		Car c = new Car("카니발", 2025);
//		c.setName("그랜저");
//		c.setYear(2020);
		c.printInfo();
		c.setSpeedMax(200);
		c.power();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.power();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();

		
		
//		c.power();
////		System.out.println(c.getPower());
////		c.power();
////		System.out.println(c.getPower());
////		c.power();
////		System.out.println(c.getPower());
////		c.setSpeed(50);
//		c.speedUp();
//		System.out.println(c.getSpeed());
//		c.speedDown();
//		c.speedUp();
//		c.speedDown();
//		c.speedDown();
//		c.power();
	}

}

class Car{
	// 기능 : 시동켜기, 시동끄기, 속도up, 속도down
	// power, speed
	// name, year  => 연산에 쓸 거면 숫자, 아니면 문자
	private String  name;
	private int year;
	private boolean power;
	private int speed;
	private int speedMax;
	
	// 생성자 - 멤버변수 아래
	/* 객체를 생성할 때 (new) 초기값을 지정해 주는 역할
	 * 기본생성자 : 컴파일러가 자동으로 제공  (컴파일시 생성자가 없으면...)
	 *  - object = null / 숫자=0 / boolean = false
	 *  - 다른 생성자가 존재하면 자동으로 주지 않음.
	 * 기본생성자는 사용자가 직접 생성 가능
	 * 생성자는 여러개 생성 가능 (생성자 오버로딩)
	 * 생성자 오버로딩 조건 : 매개변수 개수가 다르거나, 타입이 다르거나 해야 함
	 * 생성자 이름은 클래스이름과 동일 
	 * 생성자는 리턴타입이 없는 매서드와 같은 구조. (리턴타입 자료가 아얘 없음)
	 * public 클래스명(매개변수){
	 * 	 멤버변수 설정;
	 * }
	 * */
	// 기본생성자
	public Car() {}
		
	// 매개변수로 이름과 연식을 받아서 제공
	public Car(String name,int year) {
		this.name = name;
		this.year = year;
	}
	
	// 출력메서드
	public void printInfo() {
		System.out.println(name+"(년식:"+year+")");
	}
	
	// 시동 켜기(끄기)
	public void power() {  //speed가 0일 때 꺼점.  // 토글링
//		if(this.power) { //시동이 켜져 있으면
//			// 속도가 0 이면 시동 끔, 아니면 시동 끌 수 없음 출력
//			if(this.speed==0) {
//				this.power=false;
//				System.out.println("시동이 꺼졌습니다.");
//			}else {
//				System.out.println("달리는 중엔 시동을 끌 수 없습니다.");
//				return;
//			}
//		}else {			
//			this.power = true;
//			System.out.println("시동이 켜졌습니다.");
//		}
		if(speed==0) {
			power = !power;
			powerPrint();
		}else {
			System.out.println("ERROR!!");
		}
	}
	
	// power 출력메서드
	public void powerPrint() {
//		if(power) {
//			System.out.println("ON");
//		}else {
//			System.out.println("OFF");
//		}
		System.out.println((power?"ON":"OFF") + "/ " + speed);
	}
	// speedUp
	public void speedUp() {	// 시동이 켜 있어야 스피드 증가, 상한선 200
		if(this.power) {
			if(this.speed+20 <= 200) {				
				this.speed += 20;			
			}else {
				this.speed = this.speedMax;
//				System.out.println("스피드는 상한인 "+ speedMax+"를 초과할 수 없습니다.");
			}
			System.out.println("speed: " +speed);
		}else {
			System.out.println("시동이 꺼져 있습니다.");
		}
	}
	
	// speedDown
	public void speedDown() { // 시동이 0 밑으로 못 감.
		if(this.power) {
			if(this.speed-20 >= 0) {				
				this.speed -= 20;
			}else{
				this.speed = 0;	
//				System.out.println("자동차가 이미 멈추어 섰습니다.");
			}
			System.out.println("speed: " + this.speed);
		}else {
			System.out.println("시동이 꺼져 있습니다.");			
		}
			
	}
	
	// getter / setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean getPower() {
		return power;
	}

//	public void setPower(boolean power) {
//		this.power = power;
//	}

	public int getSpeed() {
		return speed;
	}

//	public void setSpeed(int speed) {
//		this.speed = speed;
//	}

	public int getSpeedMax() {
		return speedMax;
	}

	public void setSpeedMax(int speedMax) {
		this.speedMax = speedMax;
	}
	
	
}