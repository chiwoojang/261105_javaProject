package day11;

public class Card {
	// 숫자 : 1~13  1(A), 11(J), 12(Q), 13(K)
	// 모양 : ♥, ◆, ♣, ♠  // ㅁ+한자 키 
	
	
	/*
	 * ex) ♥A, ♥5, ♣11 => ♣J / !2 => ♥2
	 * 범위에 없는 모양이면 => ♥
	 * 범위에 없는 숫자면 => 1 => A
	 * 
	 */
	
	/* 멤버변수 : 숫자(num), 모양(shape)
	 * - getter/setter
	 * - toString
	 * - 출력메서드 (숫자가 입력되면 A J Q K 가 입력되면 영어로 변경해서 출력)
	 * 
	 * 
	 */
	
	// 멤버변수
	private int num;
	private String shape;
	
	// 생성자
	public Card() {
		this.num = 1;
		this.shape = "♥";
	}
	
	// 출력
	public void print() {
		String strNum = "";
		switch(num) {
		case 1:	strNum = "A";	break;
		case 11: strNum = "J";	break;
		case 12: strNum = "Q";	break;
		case 13: strNum = "K";	break;
		default:
			strNum = String.valueOf(this.num);
		}
		System.out.print(this.shape+strNum+" ");
	}

	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		if(num<1 || num >13) {
			this.num = 1;
			return;
		}
		this.num = num;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		if(!"♥◆♣♠".contains(shape)) {
			this.shape = "♥";
			return;
		}
		this.shape = shape;
	}
	
	
}
