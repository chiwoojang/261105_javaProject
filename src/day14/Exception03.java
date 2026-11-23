package day14;

import java.util.Scanner;

public class Exception03 {

	public static void main(String[] args) {
		// 예외처리 연습
		// 두 정수와 연산자를 입력받아
		// + - * / % 의 연산결과를 리턴하는 메서드
		// / % 연산자일 경우 피연산자가 0이면 Exception 오류처리
		
		// 예외처리는 메서드에서 해도 됨.
		Scanner scan = new Scanner(System.in);
		
		Exception03 e = new Exception03();
//		e.run(scan);
		
		try {
			System.out.println(e.calc2(3, 0, "/"));
		} catch (Exception e2) {
			// TODO: handle exceptionsys
			System.out.println(e2.getMessage());
		}
		
		scan.close();
		

	}
	
	// 메서드는 직접 예외처리를 안하고, 그 예외를 나를 호출하는 호출자에게 넘겨줄 수 있음.
	// 예외 떠넘기기 : throws  => 메서드 선언문에 위치
	// method 자체에서는 예외처리를 하지 않고,
	// 나를 호출하는 호출하는 대상에게 예외처리를 넘기는 상태
	// 해당 조건에 예외를 발생 시킬 수 있음. : throw new => 예외 발생시키기
	
	// throws RuntimeException  => 내 메서드에 존재하는 예외 선언 => runtime 안해도 됨.
	public double calc2(int num1,int num2,String op) throws RuntimeException {
		double result = 0;
		
		if((op.equals("/")||op.equals("%"))&& num2==0) {
			throw new RuntimeException("num2는 0이 될 수 없습니다.");
		}
		switch(op) {
		case "+" : result = num1 + num2; break;
		case "-" : result = num1 - num2; break;
		case "*" : result = num1 * num2; break;
		case "/" : result = num1 / num2; break;
		case "%" : result = num1 % num2; break;
		default : 
			throw new RuntimeException(op + "는 산술 연산자가 아닙니다.");
		
		}
		
		
		
		
		return result;
	}
	

	// 두 정수와 연산자를 입력받아
	// + - * / % 의 연산결과를 리턴하는 메서드
	public void run(Scanner scan) {
		while(true) {
			System.out.println("두 정수를 입력하세요.");
			int[] num = new int[2];
			num[0] = scan.nextInt();
			num[1] = scan.nextInt();
			System.out.println("연산자를 입력하세요.");
			String op = scan.next();
			
//			operate(num[0],num[1],op);
//			System.out.println(operate(num[0],num[1],op));
			
			try {
				System.out.println(operate(num[0],num[1],op));				
			} catch (Exception e) {
				System.out.println("처리할 수 없습니다.");
				System.out.println(e.getMessage());
			}
			
			System.out.println("계속 할까요? (y/n)");
			if(!(scan.next().equalsIgnoreCase("y"))){
				break;
			}
		}
	}
	
//	public void operate(int num1,int num2,String op) {
//		switch(op) {
//		case "+" :
//			System.out.println(num1 + " + " + num2 + " = " + add(num1,num2));
//			break;
//		case "-" :
//			System.out.println(num1 + " - " + num2 + " = " + minus(num1,num2));
//			break;
//		case "*" :
//			System.out.println(num1 + " * " + num2 + " = " + multi(num1,num2));
//			break;
//		case "/" :
//			System.out.println(num1 + " / " + num2 + " = " + divide(num1,num2));
//			break;
//		case "%" :
//			System.out.println(num1 + " % " + num2 + " = " + mod(num1,num2));
//			break;
//		default :
//			System.out.println("연산자가 잘못되었습니다.");
//			break;
//			
//		}
//	}
	
	public String operate(int num1,int num2,String op) {
//		return switch(op) {
//		case "+" -> num1 + " + " + num2 + " = " + add(num1,num2);
//		case "-" -> num1 + " - " + num2 + " = " + minus(num1,num2);
//		case "*" -> num1 + " * " + num2 + " = " + multi(num1,num2);
//		case "/" -> num1 + " / " + num2 + " = " + divide(num1,num2);
//		case "%" -> num1 + " % " + num2 + " = " + mod(num1,num2);
//		default -> "연산자가 잘못되었습니다.";
//		};
		
		try {			
			return switch(op) {
			case "+" -> num1 + " + " + num2 + " = " + add(num1,num2);
			case "-" -> num1 + " - " + num2 + " = " + minus(num1,num2);
			case "*" -> num1 + " * " + num2 + " = " + multi(num1,num2);
			case "/" -> num1 + " / " + num2 + " = " + divide(num1,num2);
			case "%" -> num1 + " % " + num2 + " = " + mod(num1,num2);
			default -> "연산자가 잘못되었습니다.";
			};
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return "연산할 수 없습니다.";
		}
	}
	
	public int add(int num1,int num2) {
		return num1+num2;
	}
	
	public int minus(int num1,int num2) {
		return num1-num2;
	}
	
	public int multi(int num1,int num2) {
		return num1*num2;		
	}
	
	public double divide(int num1,int num2) {
//		try {			
//			return (double)num1/num2;
//		} catch (Exception e) {
//			System.out.println("0으로 나눌 수 없습니다.");
////			System.out.println(e.getMessage());
//			return -999999;
//		}
		return (double)num1/num2;
	}
	
	public int mod(int num1,int num2) {
//		try {
//			return num1%num2;			
//		} catch (Exception e) {
//			System.out.println("0으로 나눌 수 없습니다.");
////			System.out.println(e.getMessage());
//			return -999999;
//		}
		return num1%num2;			
	}
	
	
}
