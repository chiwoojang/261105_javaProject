package day18;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {5,6,7,8,4,6,4,23,24,6,7,9,10};
		
		//스트림으로 구성하여 중복제거하고, 정렬하여, 짝수만 출력
		Arrays.stream(arr)
			.distinct()
			.sorted()
			.filter(n->n%2==0)
			.forEach(System.out::println);
		
		// 스트림으로 구성하여, 중복제거하고, 정렬하여, 홀수만 배열로 리턴
		int[] result = Arrays.stream(arr)
				.distinct()
				.sorted()
				.filter(n->n%2==1)
				.toArray();
		System.out.println(Arrays.toString(result));
		
		// 스트림으로 구성하여, 중복제거하고, 정렬하여, 홀수만 리스트로 리턴
		List<Integer> result2 = Arrays.stream(arr)
				.distinct()
				.sorted()
				.filter(n->n%2==1)
				.boxed()
				.collect(Collectors.toList());
		System.out.println(result2);

	}

}
