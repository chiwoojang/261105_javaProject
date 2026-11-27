package wordT;

import java.util.Scanner;

public class WordMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		WordController wc = new WordController(scan);
		
		wc.run();
		
		scan.close();
		
	}

}
