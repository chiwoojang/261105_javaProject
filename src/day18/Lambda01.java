package day18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class Lambda01 {

	public static void main(String[] args) {
		// 람다식 : 이름이 없는 익명함수를 간결하게 표현하는 문법 (jdk 8 도입)
		// 기본 문법 (매개변수) -> {구현 또는 반환값}
		// 매개변수의 타입 생략, 리턴 타입 직접 적어주진 않음.
		// 매개변수의 타입을 컴파일러가 문맥을 통해 추론
		// 매개변수가 1개명 () 생략가능
		// 실행문도 1줄이면 {} 생략가능 (return도 생략가능)
		// a -> a+1;
		
		// lambda : 외부 자료의 부수적인 영향을 주지 않도록 구현된 방식
		// stream : 자료의 대상과 상관없이 동일한 연산을 수행할 수 있도록 구성해주는 반복자
		// - 앞의 메서드 연산의 리턴값이 다음 메서드의 매개변수가 되는 형태
		// - 메서드 체이닝 기법
		
		/* (a,b) -> {return a+b}
		 * (a) -> {return a+1;}
		 * a -> {return a+1;}
		 * - 실행문이 1줄이면 return 생략가능
		 * a -> a+1;  // a> return a+1; => 오류 남(return 써서)
		 * (a,b) -> a+b;
		 * */
		
		String email = "abcd@naver.com";
		String result = email.substring(0, 5).concat("111");
		System.out.println(result);
		
		List<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(1);
		list.add(12);
		list.add(6);
		list.add(8);
		list.add(7);
		
		System.out.println(list);
		for(int i : list) {
			System.out.println(i);
		}
		
		// forEach
		System.out.println("--forEach--");;
		list.forEach(n -> System.out.println(n));
		
		Consumer<Integer> method01 = (n)->{
			System.out.print(n+" ");
		};
		System.out.println("Consumer를 구현한 출력");
		list.forEach(method01);
		
		// Consumer : lambda에서 사용되는 함수형 인터페이스
		// Biconsumer : item 2개를 받아서 처리
		// Function ...
		// 굳이 구현해서 쓰지 않음. (번거로움)
		
		Map<String, Integer> map = new HashMap<>();
		map.put("hong", 78);
		map.put("jang", 88);
		map.put("Kim", 85);
		map.put("Park", 92);
		map.put("Yeun", 65);
		
		for(String key : map.keySet()) {
			System.out.println(key + ":" + map.get(key));
		}
		
		System.out.println("--forEach--");
		map.forEach((k,v)->{System.out.println(k+":"+v);});
		
		// 함수형 인터페이스 구현
		Number sum = (a,b) -> {
			return a+b;
		};
		
		int s = sum.add(100, 200);
		System.out.println(s);

	}

}

// 람다용 함수형 인터페이스 생성 => @FunctionalInterface

@FunctionalInterface
interface Number{
	// 메서드는 1개
	int add(int a, int b);
}

