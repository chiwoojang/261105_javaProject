package day09;

public class Class05 {

	public static void main(String[] args) {
		
		Tv tv = new Tv("삼성Q");
		tv.tvInfo();
		tv.power();
		tv.tvInfo();
		tv.tvStatus();
		tv.chUp();
		tv.chDown();
		tv.volUp();
		tv.favorAdd();
		tv.chUp();
		tv.favorAdd();
		tv.chUp();
		tv.favorAdd();
		tv.chUp();
		tv.favorAdd();
		tv.chUp();
		tv.favorAdd();
		tv.chUp();
		tv.favorAdd();
		tv.chUp();
		tv.favorAdd();
		tv.favorDel(2);
		tv.chUp();
		tv.favorAdd();
		tv.favorDel(0);
		tv.favorMod(2);
		tv.chUp();
		tv.favorMod(3);
		tv.setCh(18);
		tv.tvStatus();
		tv.favorAdd();
		tv.setCh(18);
		tv.tvStatus();
		

	}

}

class Tv{
	// 기능 : brand, power, ch, vol, favor[]
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
	private String brand;
	private boolean power;
	private int ch;
	private int vol;
	private int[] favor;
	
	// 생성자
	public Tv(){
		favor = new int[5];
		ch = 3;
		vol = 3;
	}
	
	public Tv(String brand) {
		this.brand = brand;
		favor = new int[5];
		ch = 3;
		vol = 3;
	}
	
	// power  on, off
	public void power() {
		power = !power;
		powerPrint();
	}
	
	public void powerPrint() {
		System.out.println(power?"ON":"OFF");
	}
	
	// TV 정보
	public void tvInfo() {
		System.out.println("브랜드: "+brand);
	}
	
	public void tvStatus() {
		if(power) {
			System.out.println("ch: "+ch+", vol: "+vol);			
		}else {
			System.out.println("Power OFF");
		}
	}
	
	// ch 변경  chUp(), chDown() 0~20번 순환구조
	public void chUp() {
		if(power) {
			ch = ch>=20?1:++ch;
			tvStatus();
		}
	}
	
	public void chDown() {
		if(power) {
			ch = ch<=1?20:--ch;
			tvStatus();
		}
	}
	
	// vol 변경 volUp(), volDown() 0~10까지 0-> 음소거 표시 10->더 이상 올라가지 않음
	public void volUp() {
		if(power) {
			vol = vol<10?++vol:vol;
			tvStatus();
		}
	}
	public void volDown() {
		if(power) {
			vol = vol>0?--vol:vol;
			tvStatus();
		}
	}
	
	/* 선호채널
	 * 선호채널 등록(맨 처음것을 교체), 선호채널 삭제, 선호채널 변경, 선호채널 보기
	 * */
	public void favorList() {
		for(int i=0;i<favor.length;i++) {
			System.out.print((i+1)+"):"+(favor[i]==0?"-":favor[i])+" ");
		}
		System.out.println();
	}
	
	public void favorAdd() {
		for(int i=0;i<favor.length;i++) {
			if(favor[i]==0) {
				favor[i] = ch;
				break;
			}else if(i==favor.length-1){
				System.arraycopy(favor,1, favor, 0, favor.length-1);
				favor[i] = ch;
			}
		}
		favorList();
	}
	
	public void favorDel(int favorNum) {
		if(favorNum < 1 || favorNum > favor.length) {
			System.out.println("1~5번 선호채널 선택");
			return;
		}
		favor[favorNum-1] = 0;
		favorList();
	}
	
	public void favorMod(int favorNum) {
		if(favorNum < 1 || favorNum > favor.length) {
			System.out.println("1~5번 선호채널 선택");
			return;
		}

		for(int i=0;i<favor.length;i++) {
			if(favor[i]==ch) {
				System.out.println("이미 등록된 번호입니다.");
				return;
			}
		}
		favor[favorNum-1] = ch;	
		favorList();
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

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
