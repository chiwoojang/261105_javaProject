package day18;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class StreamEx01 {

	public static void main(String[] args) {
		// class 생성
		
		// List<Student> list
		// 10명 학생 추가
		List<Student> list = new ArrayList<>();
		
		list.add(new Student("홍길동",89));
		list.add(new Student("장군이",99));
		list.add(new Student("김보라",79));
		list.add(new Student("유동근",75));
		list.add(new Student("유동근",96));
		list.add(new Student("김두삼",82));
		list.add(new Student("박하늘",80));
		list.add(new Student("한군선",68));
		list.add(new Student("마두식",57));
		list.add(new Student("문근영",86));
		
		
		// stream 구성하여 출력 => forEach()
		list.stream()
			.forEach(student -> System.out.println(student.getName()+ ": "+student.getScore()));
		System.out.println("---------------------");
		
		// 모든 학생의 점수 합계  sum() int로 변환
//		int sum = list.stream()
//			.map(Student::getScore)
//			.mapToInt(Integer::intValue)
//			.sum();
//		
//		int sum = list.stream()
//				.map(student -> student.getScore())  //Student 객체를 -> Student.getScore Interger 객체로 형변환
//				.mapToInt(Integer::intValue)  // Stream<Intger> -> IntegerStream로 형변환
//				.sum();		
		int sum = list.stream()
				.mapToInt(n -> n.getScore())  // Stream<Intger> -> IntegerStream로 형변환
				.sum();		
		System.out.println("합계 : " + sum);
		System.out.println("---------------------");
		
		// 모든 학생의 인원수 count()
		long c = list.stream().count();
		System.out.println("학생 수 : " + c);
		
		// 점수가 80점 이상인 학생 수 filter() count()
		long c2 = list.stream()
			.filter(student -> student.getScore() >= 80)
			.count();
		System.out.println("80점 이상 학생 수 : " + c2);
		
		
		// 이름순으로 정렬하여 출력
		System.out.println("--- 이름순 출력 ---");
		list.stream()
			.sorted()   // class 에서 Comparable Interface 직접 구현하면 쓸 수 있음.
			.forEach(student -> System.out.println(student.getName() + ": " + student.getScore()) );
		
		// 이름순으로 정렬하여 출력
		System.out.println("--- 이름순, 점수순 출력 출력 ---");
		list.stream()
		.sorted(Comparator.comparing(Student::getName).thenComparing(Student::getScore,Comparator.reverseOrder()))
		.forEach(student -> System.out.println(student.getName() + ": " + student.getScore()) );
		
		
		System.out.println("---- 점수순 출력 ---");
		// 점수 순으로 정렬하여 출력 (오름차순)
		list.stream()
		.sorted(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o2.getScore()-o1.getScore();
			}
			
		})
		.forEach(student -> System.out.println(student.getName() + ": " + student.getScore()) );
		

	}

}

class Student implements Comparable<Student>{
	private String name;
	private int score;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	public Student() {
		super();
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.getName());
//		return o.getName().compareTo(this.name);
	}
	
	
}


