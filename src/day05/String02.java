package day05;

import java.util.Arrays;

public class String02 {

	public static void main(String[] args) {
		// String method
		
		// toLowerCase() / toUpperCase() : 소문자 변화 / 대문자 변환
		// jpg, JPG, Jpg => jpg
		System.out.println("--toLowerCase()--");
		System.out.println("JPg".toLowerCase());  // 소문자로
		System.out.println("jpg".toUpperCase());  // 대문자로
		
		// isEmpty() : 값이 비었는지 확인 (공백도 있는 것으로 간주)
		// true / false
		System.out.println("--isEmpty()--");
		System.out.println(" ".isEmpty());
		
		// isBlank() : 값이 비었는지 확인 (공백도 비어 있는 것으로 간주)
		System.out.println("--isBlank()--");
		System.out.println(" ".isBlank());
		
		// trim() : 불필요한 공백 제거
		System.out.println("--trim--");
		System.out.println("     abc  def   ".trim());
		
		// replace() : 글자를 변환
		System.out.println("--replace--");
		//2026-11-09 => 2026/12/09
		System.out.println("2026-11-09".replace("-", "/"));
		
		// split() : 특정 값으로 분기하여 => 배열로 리턴
		String str = "apple,banana,kiwi,orange";
		System.out.println("--split--");
		String[] arr = str.split(",");
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString("1234".split("")));
		
		// 문자를 숫자로 변경 => Integer.parseInt()
		String num = "123";
		int num2 = Integer.parseInt(num);
		System.out.println(num2);
		
		// 숫자를 문자료 변경 String.valueOf()
		String num3 = String.valueOf(num2);
		System.out.println(num3);
		
		// instanceof : 같은 클래스인지 비교하는 연산자 (클래스 자료형만 가능)
		System.out.println(num3 instanceof String);
		
		
		

	}

}
