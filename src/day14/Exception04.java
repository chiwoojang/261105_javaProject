package day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception04 {

	public static void main(String[] args) throws IOException {
		// IOException : Check Exception
		
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		
		System.out.println("글자를 입력하세요.");
		String name = "";
		name = br.readLine();
//		try {
//			name = br.readLine();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}  // == scan.next();
		System.out.println(name);
		
		
		//ir.close();

	}

}
