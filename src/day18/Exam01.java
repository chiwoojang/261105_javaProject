package day18;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Exam01 {

	public static void main(String[] args) {
		// 여행비용 구하기
		// Customer 클래스 생성
		// 이름, 나이, 비용
		/* 여행비용은 15세 이상은 100만원, 15세 미만은 80만원 계산
		 * 5명의 가족이 패키지 여행을 떠난다고 가정했을 때
		 * 1. 비용을 계산 => 총 여행 비용 계산 => 출력
		 * 2. 고객 명단 => 이름순으로 정렬 => 출력(이름, 나이, 금액)
		 * 3. 20살 이상인 성인 명단 출력 => 나이순으로 정렬 => 출력
		 * 
		 * 예) 
		 * 이름 : 신형만  나이:40  비용:100
		 * 이름 : 봉미선  나이:35  비용:100
		 * 이름 : 짱구   나이 : 5  비용 : 80
		 * 이름 : 짱아   나이 : 3  비용 : 80
		 * 이름 : 힌둥이  나이 : 8  비용 : 80
		 * 
		 * 총 여행경비 : 000
		 * */
		
		List<Customer> customerList = new ArrayList<>();
		
		customerList.add(new Customer("신형만",40,100));
		customerList.add(new Customer("봉미선",35,100));
		customerList.add(new Customer("짱구",5,80));
		customerList.add(new Customer("짱아",3,80));
		customerList.add(new Customer("힌둥이",8,80));
		
		customerList.stream()
			.filter(n -> n.getAge() >=15)
			.sorted(new Comparator<Customer>() {

				@Override
				public int compare(Customer o1, Customer o2) {
					// TODO Auto-generated method stub
					return o2.getAge()-o1.getAge();
				}
			})
			.forEach(n -> System.out.println("이름 : " + n.getName() + " 나이 : " +n.getAge() + " 비용 : " +n.getCost()+ "만원"));
		
		customerList.stream()
			.filter(n -> n.getAge() < 15)
			.forEach(n -> System.out.println("이름 : " + n.getName() + " 나이 : " +n.getAge() + " 비용 : " +n.getCost()+ "만원"));
		
		System.out.println("---------------------------------");
		
		int sum = customerList.stream()
							.mapToInt(n -> n.getCost())
							.sum();
		System.out.println("총 여행경비 : " + sum + "만원");

	}

}

class Customer{
	private String name;
	private int age;
	private int cost;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public Customer(String name, int age, int cost) {
		super();
		this.name = name;
		this.age = age;
		this.cost = cost;
	}
	public Customer() {
		super();
	}
	
	
	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
		calcCost();
	}
	
	public void calcCost() {
		this.cost = age>=15 ? 100:80;
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", cost=" + cost + "]";
	}
	
	
}
