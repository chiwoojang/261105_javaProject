package collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class List01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("fineapple");
		fruits.add("pear");
		System.out.println(fruits);
		
		System.out.println(fruits.get(0));
		System.out.println(fruits.size());
		System.out.println("fruits는 비어있는가?" + fruits.isEmpty());
		
		for(String s : fruits) {
			System.out.println(s);
		}
		
		System.out.println("fruits에는 banana가 있는가? " + fruits.contains("banana") );
		System.out.println("fruits에 바나나는 몇번째 있는가? " + fruits.indexOf("banana") );
		fruits.set(fruits.indexOf("banana"),"orange");
		System.out.println(fruits);
		
		fruits.remove("orange");
		System.out.println(fruits);
		
			
		fruits.clear();
		System.out.println(fruits);
		
		List<Integer> scores = new ArrayList<>(List.of(85,65,78,98,87,85,68,55));
		
		scores.sort(Comparator.naturalOrder());
		System.out.println(scores);
		scores.sort(Comparator.reverseOrder());
		System.out.println(scores);

		scores.removeIf(score -> score < 60);
		System.out.println(scores);
		
		System.out.println(scores.subList(0, 3));
		System.out.println(scores);
		
		Integer[] scoreArray = scores.toArray(new Integer[0]);
		System.out.println(scoreArray.length);
		
		
		
		
		

	}

}
