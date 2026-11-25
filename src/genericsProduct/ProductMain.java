package genericsProduct;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ProductController pc = new ProductController(scan);
		
		pc.run();
		
		scan.close();
	}

}
