package day17;

public class AnonymousClass01 {

	public static void main(String[] args) {
		// AnonymousClass : 익명클래스 => 내부클래스 일종
		/* 이름이 없는 클래스
		 * 객체를 생성할 일이 없고, 한번 쓰면 버려지는 객체 (일회용객체)
		 * 
		 * - 인터페이스를 사용하여 객체를 생성할 경우
		 * - 구현 메서드의 개수가 적고,
		 * - 인터페이스의 구현 외 다른 구현이 없고, 멤버변수도 없고
		 * - 일회용 사용
		 * 
		 * 일반적으로 메서드 매개변수로 구현 객체가 필요한 경우 사용되는 케이스
		 * 
		 * */
		
		AnonymousClass01 a = new AnonymousClass01();
		
		// Power 구현체를 만들어서 객체 생성 후 매개변수 전달
//		TV t = new TV();
//		a.tvPower(t);
		
		
		// 익명클래스로 구현화는 방법
		a.tvPower(new Power() {

			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				System.out.println("전원 ON");
				
			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				System.out.println("전원 OFF");
				
			}
			
		});
		

	}
	
	public void tvPower(Power p) {
		p.turnOn();
		System.out.println("TV가 정상 작동중입니다.....");
		p.turnOff();
	}

}

interface Power{
	void turnOn();
	void turnOff();
}

//class TV implements Power{
//
//	@Override
//	public void turnOn() {
//		// TODO Auto-generated method stub
//		System.out.println("LG TV On");
//		
//	}
//
//	@Override
//	public void turnOff() {
//		// TODO Auto-generated method stub
//		System.out.println("LG TV Off");
//		
//	}
//	
//}