package day14;

public class CustomException01 {

	public static void main(String[] args) {
		// PasswordException
		PasswordTest pt = new PasswordTest();
		
		String password1 = null;
		String password2 = "abc";
		String password3 = "abcdefg";
		String password4 = "abcd1234";
		String password5 = "abcd123!!";
		
		try {
			pt.setPassword(password5);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("test종료");
	}

}

class PasswordTest{
	/* - 비밀번호는 null 일 수 없음.
	 * - 길이는 5자 이상
	 * - 영문자, 숫자, 특수문자 1개이상 포함 => 정규표현식
	 * - 정규표현식 RegExp : ^(?=.*[A-Za-z])(?=.*\d)(?=.*[@$!%*#?&^()_\-+=\[\]{}|\\;:'",.<>/?~`]).+$ 
	 * 
	 * */
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		// exception 조건을 처리
		if(password==null) {
			throw new PasswordException("비밀번호는 null 일 수 없습니다.");
		}
		if(password.length()<5) {
			throw new PasswordException("비밀번호의 길이가 5자 미만입니다.");			
		}
		if(!password.matches("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&^()_\\-+=\\[\\]{}|\\\\;:'\",.<>/?~`]).+$")) {
			throw new PasswordException("비밀번호 형식이 맞지 않습니다.");
		}
		
		this.password = password;
	}
	

}
