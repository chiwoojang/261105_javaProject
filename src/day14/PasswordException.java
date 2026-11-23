package day14;

public class PasswordException extends IllegalArgumentException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/* 사용자 정의 exception 생성
	 * IllegalArgumentExceptio : 매개변수를 잘못 사용되었을 때 발생하는 exception
	 * 사용자 지정 익셉션을 정의시 발생 시키고자 하는 익셉션을 상속 받아 사용
	 * */
	
	public PasswordException(String message) {
		super(message);
	}

}
