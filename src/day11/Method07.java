package day11;

public class Method07 {

	public int sum(int ...num) {
		// ...num => 배열로 인식  // 하지만 배열을 넣을 순 없다.
		int result = 0;
		for(int tmp : num) {
			result += tmp;
		}
		return result;
	}
	public static void main(String[] args) {
		// 가변인자 메서드
		// - 매개변수의 개수가 고정되어 있지 않을 경우 ... (스프레드 연산자)
		Method07 m = new Method07();
		System.out.println(m.sum(1,2,3,4,5,6,7,8));
		
	}
}
