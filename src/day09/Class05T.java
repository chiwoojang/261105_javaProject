package day09;

import java.util.Arrays;

public class Class05T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV t = new TV();
		System.out.println(t.toString());
		t.power();
//		t.power();
		t.chUp();
		t.chUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		System.out.println(t.toString());
		t.pick();
		t.chDown();
		t.pick();
		t.pick();
		t.pick();
		t.favorList();
		t.chDown();
		t.pick();		
		t.chDown();
		t.pick();		
		t.chDown();
		t.pick();		
		t.chDown();
		t.pick();		
		t.chDown();
		t.pick();		
		System.out.println(t.toString());
		

	}

}

class TV{
	// 기능 : brand, power, ch(1~10), vol(0~10), favor[5]
	// vol : max 10 / 0 밑으로 못 감 (음소거 출력)
	// 채널 : 0 ~ 20 순환구조
	// 브랜드 출력
	
	/* 선호채널 등록
	 * 5개까지만 등록 가능
	 * 현재 채널을 선호채널로 등록
	 * 1. 선호채널 등록 메서드
	 *  - 현재채널 번호를 선호채널 배열에 넣기
	 * 2. 선호채널 리스트 보기
	 *  - 등록된 선호채널을 리스트로 출력
	 *  - 6개가 들어가면 오래된 채널 빼고 넣는다.
	 * */
	
	// 멤버변수
	private final String BRAND="LG";
	private boolean power;
	private int ch;
	private int vol;
	private int[] favor;
	private int index; //선호채널 인덱스  --> 멤버변수에 배열이 들어오면, index를 멤버변수에 1개씩 매칭시켜 주는 것이 일반적
	                   // 그렇지 않을 경우 매번 배열 상황을 체크해야 하는 번거로움이 발생
	                   // 배열이 늘어나면 해당 배열을 관리하는 인덱스를 멤버변수에 추가해 사용
	private int count;
	
	// 생성자
	public TV() {
//		this.BRAND="LG" = "LG"; // 중간에 바꿀 수 없는 값 == 상수 ==> final => 전부 대문자 => 생성자에서도 못 씀
		this.ch = 3;
		this.vol = 3;
		this.favor = new int[5];  //생성자로 객체 생성시 배열의 실 객체를 메모리에 올림
	}
	
	// 메서드
	// pick() 선호채널 등록 => 메서드를 한 번 호출하면 배열 1개 채워짐.
	// 번지로 사용할 변수가 필요함. => 메서드를 호출할 때마다 +1 증가
//	public void pick() {
////		int index = 0; // 호출 할 때마다 0번지로 변경
//		boolean check = false;
//		if(power) {
//			if(favor.length == index) {
//				// 더이상 등록될 자리가 없을 때
//				// 1. 0번지로 이동
//				index = 0;
//				
//			}
//			// 선호채널 중복방지
//			for(int i=0;i<favor.length;i++) {
//				if(favor[i]==ch) {
//					check = true;
//				}
//			}
//			if(!check) {
//				favor[index] = ch;
//				index++;  //선호채널 하나 등록
//				count++;  //선호채널 등록한 횟수
//				System.out.println(ch+"번 선호채널 등록완료!!");
//			}
//		}
//		
//	}
	
	public void pick() {
		//2. 배열을 늘려서 값을 더 추가
		boolean check = false;
		if(power) {
			
			if(index == favor.length) {
				// 2. 배열출 늘려서 추가
				int[] arr = new int[favor.length+3];  // 현재 배열의 3개 추가
				System.arraycopy(favor, 0, arr, 0, favor.length);
				// 배열의 주소 변경
				favor = arr;
				
			}
			// 선호채널 중복방지
			for(int i=0;i<favor.length;i++) {
				if(favor[i]==ch) {
					check = true;
				}
			}
			if(!check) {
				favor[index] = ch;
				index++;  //선호채널 하나 등록
				count++;  //선호채널 등록한 횟수
				System.out.println(ch+"번 선호채널 등록완료!!");
			}			
		}
	}
	
	// favorList() : 선호채널 리스트
	public void favorList() {
		// index의 위치에 따라 등록 개수 확인 확인
		System.out.println("--선호채널 리스트--");
		if(count==0) {
			System.out.println("등록된 선호채널이 없습니다.");
			return;
		}
		int cnt = count > index ? favor.length : index;
		
		for(int i=0; i<cnt;i++) {
			System.out.print(favor[i]+"  ");			
		}
		System.out.println();
	}
	
	// power on/off 
	public void power() {
		this.power = !this.power;
		if(this.power) {   // 줄바꿈으로 가독성을 높이는 case
			System
			.out
			.println(BRAND + "TV 전윈이 켜집니다.");
		}else {
			System.out.println(BRAND + "TV 전윈이 꺼집니다.");
		}
//		System.out.println(power ?                      // 줄바꿈으로 가독성을 높일 수 있다.
//				BRAND + "TV 전윈이 켜집니다." 
//				: BRAND + "TV 전윈이 껍집니다.");
	}
	
	// chUp() (1~10까지 순환구조)
	public void chUp() {
		if(power) {
			ch++;
			if(ch >10) {
				ch = 1;
			}
			System.out.println("ch:"+ch);
		}
	}
	
	// chDown() (1~10까지 순환구조)
	public void chDown() {
		if(power) {
			ch--;
			if(ch<1) {
				ch=10;
			}
			System.out.println("ch:"+ch);
		}
	}
	
	// volUp (1~10까지)
	public void volUp() {
		if(power) {
			vol++;
			if(vol>10) {
				vol = 10;
			}
			System.out.println("vol:"+vol);
		}
	}
	
	// volDown 
	public void volDown() {
		if(power) {
			vol--;
			if(vol <=0) {
				vol=0;
				System.out.println("음소거");
				return;
			}
			System.out.println("vol:"+vol);
		}
	}
	
	
	
	// toString :  멤버변수를 String 리턴  --> 일반적으로 필수적으로 만듬
	
	@Override
	public String toString() {
		return "TV [BRAND=" + BRAND + ", power=" + power + ", ch=" + ch + ", vol=" + vol + ", favor="
				+ Arrays.toString(favor) + "]";
	}

	// getter, setter
	
	public boolean getPower() {
		return power;
	}


	public void setPower(boolean power) {
		this.power = power;
	}

	public int getCh() {
		return ch;
	}

	public void setCh(int ch) {
		this.ch = ch;
	}

	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}

	public int[] getFavor() {
		return favor;
	}

	public void setFavor(int[] favor) {
		this.favor = favor;
	}
	

	
	
}
