package day14;

public class Exception01 {

	public static void main(String[] args) {
		// Exception : 예외를 담당하는 클래스
		/* 자바는 크게 세가지로 예외처리
		 * Error / Exception (Checked / Unchecked)
		 * - Error : 개발자가 복구할 수 없는 심각한 오류 (코드에 문제가 아닌 외부 요인 원인)
		 * - Exception : 개발자의 코드에 의해 발생하는 경우 (개발자가 코드를 수정할 수 있음)
		 * 
		 * - Checked : 컴파일 시점에서 일어나는 예외
		 *   --> IOException / SQLException / FiledNotFoundException ...
		 * - Unchecked : 문법적인 오류는 없으나(컴파일 시점에서는 문제 되지 않음)
		 *    실행되는 시점에서 발생되는 예외
		 *   --> 그외...
		 *   
		 *   --> 실행시(Unchecked) 발생할 수 있는 예외 들
		 *     . RunTimeException
		 *     . 문제가 발생될 때를 대비해서 미리 막을 수 있는 대응코드(예외처리)를 해 줘야 함.
		 *     . 예외처리를 통해 비정상 종료를 막을 수 있음.
		 *     . 예외가 발생되면 발생 시점부터 코드는 정지 => 예외문구 출력(빨간글씨)
		 *     . 예외처리를 하게 되면 => 예외가 발생되는 시점부터 코드는 중지되나
		 *     . 예외처리 구문 이후는 정상 처리 됨. (정상종료 가능)
		 *     
		 * try ~ catch
		 * try ~ catch ~ finally
		 * 
		 * - try : 예외가 발생할 가능성이 있는 구문을 작성
		 * - catch : try 구문에서 발생한 예외를 처리
		 * - finally : try 구문 이후에 반드시 실행되어야 할 문구가 있다면 작성(생략 가능)
		 * */
		
		int a = 10;
		int b = 0;
		
		//ArithmeticException  / by Zero....
//		System.out.println(a/b);
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		
		try {
			System.out.println("try 안의 영역");
			System.out.println(a+b);
			System.out.println(a-b);
			System.out.println(a*b);
			//예외발생 영역
			System.out.println(a/b);
			System.out.println(a%b);
			
		} catch (Exception e) {
			// 예외 발생 시만 처리
			System.out.println("catch 안 영역");
			// 예외 발생 여부를 알리는 출력
			System.out.println(e.getMessage()); // => / by Zero(syso. 미포함) 
			e.printStackTrace();  // 예외문구를 출력 (syso 포함)
			System.out.println("0으로 나누었습니다.");
		}
		
		System.out.println("try 바깥 영역");
		System.out.println("이후 실행되는 영역");
		

	}

}
