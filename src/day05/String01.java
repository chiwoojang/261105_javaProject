package day05;

public class String01 {

	public static void main(String[] args) {
		// String class : 문자열을 다루기 위한 클래스 => 참조자료형
		// class : 해당 기능을 가지고 있는 정의서
		// 클래스 타입의 객체명 = new 클래스();
		// String 원낙 자주쓰는 클래스라서 기본 자료형처럼 제공
		// String str = new String(); //가능하지만 잘 쓰지 않음
		
		String str = "abc d efg h";
		// String은 한 문자열을 배열로 넣었다 생각
		// length : 총길이  => 공백포함
		System.out.println(str.length());
		
		// 배열처럼 index를 가짐 = 0부터 시작
		// charAt(index) : index 번지의 문자를 반화 => char
		System.out.println("--charAt()--");
		System.out.println(str.charAt(1));
		
		//subString : 원하는 문자를 추출
		System.out.println("--subString--");
		System.out.println(str.substring(6));  //시작값만 주면 거기서부터 끝까지
		System.out.println(str.substring(6, 9));  //endindex(미포함) 전까지
		
		// equals() : 두 문자가 같은지 비교 (대소문자 구분)
		// 참조 자료형에서 == 는 주소가 같은지 비교
		// true / false 리턴
		System.out.println("--equals()--");
		System.out.println(str.equals("abs"));
		System.out.println(str.substring(0, 3).equals("abc"));
		System.out.println("abc".equals(str.substring(0,3)));
		
		
		// indexOf() : 문자의 위치(index)를 찾아주는 기능
		// 한 문자열에 같은 단어가 여러개라면 처음 위치하는 index를 리턴
		// 찾는 문자가 없다면 -1 리턴
		// 시작 위치를 정할 수 있음.
		str = "abc h abc d";
		System.out.println("--indexOf--");
		System.out.println(str.indexOf("abc"));
		System.out.println(str.indexOf("abc",3));
		System.out.println(str.indexOf("z"));  //-1
		
		// lastIndexOf() : 뒤에서부터 찾음
		System.out.println("--lastIndexOf--");
		System.out.println(str.lastIndexOf("c"));  //8
		
		// ex) email 에서 id만 추출
		String email = "abcdefg@gmail.com";
		int idx = email.indexOf("@");
		if(idx != -1) {
			System.out.println(email.substring(0,idx));
			System.out.println(email.substring(idx+1));
		}
		String[] info = email.split("@");
		System.out.println(info[0] + ":" + info[1]);
		
		// compareTo() : str.compareTo("str2")
		// 사전순으로 기준값이 비교값보다 앞에 있으면 -, 같으면 0, 뒤에 있으면 +
		// 문자정렬시 사용
		System.out.println("---compareTo()--");
		System.out.println("z".compareTo("c"));
		
		// contains() : 해당 문자를 포함하고 있는지 확인 true/false
		System.out.println("--contains()--");
		System.out.println(str.contains("abc"));
		
		// concat() : 이어붙이기 (+ 연결연산자와 같은 의미)  // + 연산자가 안되는 경우가 있음
		System.out.println("--concat()--");
		System.out.println("abc".concat("def"));
		System.out.println("abc"+"def");
		
		
	
		

	}

}
