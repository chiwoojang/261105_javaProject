package cafeT02;

import java.util.Scanner;

public class CoffeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		CoffeeController cc = new CoffeeController(scan);
		
		cc.run();
		
		scan.close();
		
	}

}
