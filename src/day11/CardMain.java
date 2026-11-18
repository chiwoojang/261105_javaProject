package day11;

public class CardMain {

	public static void main(String[] args) {
		// 모양 : ♥, ◆, ♣, ♠  // ㅁ+한자 키		
		/* Card c = new Card() => ♥A
		 * ex) ♥A, ♥5, ♣11 => ♣J / !2 => ♥2
		 * 범위에 없는 모양이면 => ♥
		 * 범위에 없는 숫자면 => 1 => A
		 * 
		 */
		//=========== 강사코드 ==============
		CardPack cp = new CardPack();
//		System.out.println(cp);
		
//		cp.getPack()[0].print();
		
		System.out.println("딜러가 카드를 섞고 있습니다.");		
		cp.shuffle();
		System.out.println(cp);
		
		System.out.println("Player1 카드 pick");
		cp.pick().print();
		System.out.println();
		
		System.out.println("Player2 카드 pick");
		cp.pick().print();
		System.out.println();
		
		System.out.println("Player3 카드 pick");
		cp.pick().print();
		System.out.println();
		
		System.out.println("Player4 카드 pick");
		cp.pick().print();
		System.out.println();
		
		cp.init();
		System.out.println(cp);
		
		Card[] player1 = new Card[4];
		int player1Index = 0;
		Card[] player2 = new Card[4];
		int player2Index = 0;
		Card[] player3 = new Card[4];
		int player3Index = 0;
		Card[] player4 = new Card[4];
		int player4Index = 0;
		
		player1[player1Index] = cp.pick();
		player1[player1Index].print();
		player1Index++;
		
		
		
		
		

		//============ 내 코드 ==============
//		// 카드팩 생성
//		CardPack p = new CardPack();
////		p.getPack()[23].print();
////		p.printPack();
//		System.out.println("딜러가 카드를 섞고 있습니다.");
//		p.shuffle();
////		p.printPack();
//		
//		// 카드 섞기
//		
//		Card[] player = new Card[4];
//		// player 4명
//		System.out.println("딜러가 카드를 나누고 있습니다.");
//		System.out.println("plyaer1 카드 pick");
//		player[0] = p.deal();
////		player[0].print();
////		System.out.println();
////		p.printPack();
////		System.out.println();
//		System.out.println("plyaer2 카드 pick");
//		player[1] = p.deal();
////		player[1].print();
////		System.out.println();
////		p.printPack();
//		//메서드 호출
//		System.out.println("plyaer3 카드 pick");
//		player[2] = p.deal();
////		player[2].print();
////		System.out.println();
////		p.printPack();
//		//메서드 호출
//		System.out.println("plyaer4 카드 pick");
//		player[3] = p.deal();
////		player[3].print();
////		System.out.println();
////		p.printPack();
//		//메서드 호출
//		
//		System.out.println("Player1 Card open!!");
//		//메서드 호출
//		player[0].print();
//		System.out.println();
//		
//		System.out.println("Player2 Card open!!");
//		//메서드 호출
//		player[1].print();
//		System.out.println();
//		
//		System.out.println("Player3 Card open!!");
//		//메서드 호출
//		player[2].print();
//		System.out.println();
//		
//		System.out.println("Player4 Card open!!");
//		//메서드 호출
//		player[3].print();
//		System.out.println();
//		
//		//카드 회수하기
//		p.gather(player);
////		p.printPack();
//		
//		p.shuffle();
////		p.printPack();
		
//		
//		Card c = new Card();
//		c.print();
//		c.setNum(8);
//		c.setShape("♠");
//		c.print();
//		
//		System.out.println("---------------");
		
		
//		Card[][] arrCard = new Card[4][13];
//		for(int i=0;i<arrCard.length;i++) {
//			String shape="♥";
//			switch(i) {
//			case 0:
//				shape="♥";
//				break;
//			case 1:
//				shape="◆";
//				break;
//			case 2:
//				shape="♣";
//				break;
//			case 3:
//				shape="♠";
//				break;
//			}
//			for(int j=0;j<arrCard[i].length;j++) {
//				Card tmp = new Card();
//				tmp.setShape(shape);
//				tmp.setNum(j+1);
//				arrCard[i][j] = tmp;
//				arrCard[i][j].print();
//				System.out.print(" ");
//			}
//			System.out.println();
//		}
		
//		String shape[] = {"♥","◆","♣","♠"};
//		for(int i=0;i<shape.length;i++) {
//			for(int j=1; j<=13;j++) {
//				Card c1 = new Card();
//				c1.setShape(shape[i]);
//				c1.setNum(j);
//				c1.print();
//			}
//			System.out.println();
//		}
		
		

	}

}
