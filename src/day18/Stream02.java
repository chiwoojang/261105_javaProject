package day18;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Stream02 {

	public static void main(String[] args) {
		/*
		 * 		 * 중간연산 / 최종연사
		 * - 최종연산 (마지막에 한번만)
		 * - forEach() : 리스트를 순회하여 요소의 값을 얻어내는 역할
		 * - sum(), average(), max(), min(), count()
		 *   : 합계, 평균, 최대, 최소, 개수를 리턴
		 * - collect() : 스트림 내부에 남은 요소를 수집하여 원하는 형태로 변환
		 * - toList() : 리스트로 리턴
		 * - toArray() : 배열로 리턴
		 * - findFirst() : 조건에 일치하는 요소 중 가장 앞에 있는 요소를 리턴
		 * - findAny() : 조건에 일치하는 요소 중에 가장 먼저 탐색되는 요소를 리턴
		 * - anyMatch() : 조건에 일치하는 요소가 한라도 있으면 true 리턴
		 * - allMatch() : 모든 요소가 조건에 일치하면 true 리턴
		 * - noneMatch() : 조건에 일치하는 요소가 없다면 true 리턴
		 * ...
		 * - 중간연산 (여러본 중복 사용가능)
		 * - filter() : 조건에 맞는 결과를 필터링
		 * - distinct() : 중복 값 제거
		 * - map() : 요소를 원하는 값으로 변환 => 형변환 (엄청 많이 씀)
		 * - sorted() : 정렬(기본 오름차순)
		 * - peek() : 작업 실행 후 스트림 리턴
		 * - skip() : 스트림의 일부를 건너 뜀
		 * - limit() : 스트림의 일부를 잘라냄
		 * */
		
		List<Integer> list = new ArrayList<>();
		for(int i=1;i<=10;i++) {
			list.add((int)(Math.random()*20)+1);
		}
		System.out.println(list);
		
		list.stream().forEach(n->System.out.print(n+ " "));
		System.out.println();
		list.stream().distinct().forEach(n->System.out.print(n + " "));;
		
		System.out.println();
		list.stream().distinct()
		.sorted()
		.forEach(n->System.out.print(n + " "));;
		
		// 메서드 호출 방식
		// :: 클래스명::매서드명 / 객체명::메서드명
		// n -> n.toLowerCase() => String::toLowerCase 
		list.stream().forEach(System.out::println);  // () 안에 추가되는 것이 없어야 한다.
		
		// sum()
		// sum(), average()
		// int -> integer => boxed()
		// Integer -> int  => map을 사용하여 기본형 스트림으로 변형
		// mapToint, mapToDouble
		int sum = list.stream().mapToInt(n->n.intValue()).sum();
		System.out.println(sum);
		
		int sum2 = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum2);
		
		// 스트림 객체 생성 : 1회용
		Stream<Integer> stream01 = Stream.of(10,20,30,40,50);
		int total = stream01.mapToInt(Integer::intValue).sum();
		System.out.println(total);

	}

}
