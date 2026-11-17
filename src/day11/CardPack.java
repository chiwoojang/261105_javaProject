package day11;

import java.util.Arrays;

public class CardPack {
	/* 52장의 Card 객체를 배열로 저장 pack
	 * ♥A~♥K / ◆A~◆K / ♣A~♣K /♠A~♠K
	 * 	 * */
	/* 멤버변수 : 52장의 Card 객체를 담을 수 있는 배열 + 번지
	 *  - 생성자 : pack의 초기값을 52장의 카드로 초기화
	 *  - 메서드
	 *  1. 카드를 섞는 기능
	 *  2. 플레이어에게 한장씩 나눠주는 기능
	 *  3. 카드를 초기화 기능 (나눠준 카드 회수)
	 */
	
	// 멤버변수
	private Card[] pack = new Card[52];  // 초기값 null
	private Card[] playerPack = new Card[52];
	
	// 카드가 배출된 위치 : 카드는 0 위치에서부터 지급하고, 회수 시 최근 나간 위치 부터 다시 채운다.
	// 카드가 배출되면 pack 에 해당 카드는 null 이 되고,
	// player 카드팩에 해당 카드가 입고되며,
	// 회수시 player 카드팩 카드가 pack의 index 번지까지 다시 채워진다.
	
	private int index=0; 
	
	// 생성자
	public CardPack() {
		String shape[] = {"♥","◆","♣","♠"};
		int count=0;
		for(int i=0;i<shape.length;i++) {
			for(int j=1; j<=13;j++) {
				Card c1 = new Card();
				c1.setShape(shape[i]);
				c1.setNum(j);
				this.pack[count]=c1;
				count++;
			}
		}		
	}
	
	// 메서드
	// 카드 섞기
	public void shuffle() {
		for(int i=0;i<pack.length;i++) {
			int r = (int)(Math.random()*52);
			Card tmp = pack[i];
			pack[i] = pack[r];
			pack[r] = tmp;			
		}
	}
	
	// 카드 나눠주기 - 1장의 카드를 나눠준다.
	public Card deal() {
		
		if(index==pack.length) {
//			System.out.println("나줘줄 카드가 없습니다.");
			return null;
		}		
		Card d = pack[index];
		pack[index] = null;
		index++;
		return d;
	}
	
	// 카드 회수하기
	public void gather(Card[] card) {
		for(int i=0;i<card.length;i++) {			
			if(index==0) {
				System.out.println("더 이상 회수할 카드가 없습니다.");
				return;
			}		
			--index;
			pack[index] = card[i];
		}
	}
	
	
	// pack 출력
	public void printPack() {
		for(int i=0;i<pack.length;i++) {
			if(pack[i]!=null) {				
				pack[i].print();
			}
		}
		System.out.println();
	}
	
//	@Override
//	public String toString() {
//		return "CardPack [pack=" + Arrays.toString(pack) + ", playerPack=" + Arrays.toString(playerPack) + "]";
//	}

	
	public Card[] getPack() {
		return pack;
	}

	
	
}
