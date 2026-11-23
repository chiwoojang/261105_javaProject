package day14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collection01 {

	public static void main(String[] args) {
		// Collection Framework : 표준화된 방식의 자료구조
		/* List, Set, Map => 인터페이스 반드시 구현 클래스로 객체를 생성
		 * 배열처럼 데이터를 묶어서 관리할 때 사용
		 * - 다형성을 이용한 객체지향식 설계를 통해 표준화된 방식으로 제공
		 * - 이미 구현되어 있는 API를 사용하면 되기 때문에 익히고 설계하는 시간이 줄어든다.
		 * - 재사용 촉진 
		 * - 컬렉션 프레임워크에서 저장할 수 있는 데이터는 오로지 객체(Object)
		 *   (기본 8개 자료형은 사용 불가)
		 *   즉, int나 double 같은 자료형은 Integer, Double 같은 형태의 레퍼클래스로 Boxing하여 사용
		 *   
		 * List, Set => 저장 데이터가 1개
		 * Map => 저장 데이터가 2개 key:value
		 * 
		 * List (배열과 동일)
		 * - 같은 타입의 값을 하나씩 저장
		 * - index를 가진다. (순서를 보장, 중복 허용)
		 * - 배열대신에 가장 많이 사용하는 구조
		 * 
		 * Set
		 * - 같은 타입의 값을 하나씩 저장
		 * - index가 없음. (순서를 보장 안함. 중복 X)
		 * - 중복값이 들어오면 덮어쓰기
		 * 
		 * Map
		 * - 값을 두개씩 저장 key : value 쌍으로 묶어서 저장
		 * - index는 없지만 key가 index 역할을 함
		 * - key는 중복저장 불가능. value는 중복저장 가능
		 * - key가 중복되면, 덮어씀.
		 * - 물건: 가격, 학생: 성적, 아이디:비밀번호
		 * 
		 * Wrapper Class (래퍼 클래스)
		 * 기본 타입에 대응되는 클래스 타입의 값을 래퍼 클래스
		 * 기본타입    클래스 타입
		 * int 			Integer
		 * char			Character
		 * double 		Double
		 * long 		Long
		 * byte			Byte
		 * boolean		Boolean
		 * float		Float
		 * short 		Short
		 * 
		 * 기본타입 => 클래스 타입 (박싱 : boxing)
		 * 클래스타입 => 기본타입 (언박싱 : unboxing)
		 * 
		 * - 래퍼클래스는 산술연산을 위해 정의된 클래스가 아님.
		 * - 연산을 위해서는 언박싱으로 기본자료형으로 풀어야 연산이 가능.
		 * - 객체는 값만 참조할 수가 없기 때문에 그 안에 저장된 값은 직접 변경 불가능
		 * - 연산을 해야할 경우 언박싱 해서 기본타입으로 변경 후 연산 => 다시 박싱   (내부적인 움직임)
		 * 
		 * List<클래스타입> 객체명 = new 구현클래스명<클래스타입>();
		 * 
		 * List => ArrayList(조회), LinkedList(추가,삭제) ...
		 * Set => HashSet, TreeSet(정렬) ...
		 * Map => HashMap, TreeMap...
		 * */
		
		// 부모기준으로 생성
		List<Integer> list = new ArrayList<Integer>();
		
		// 자식기준으로 생성
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		// 클래스명 생략 가능 => Object
		ArrayList list3 = new ArrayList();
		
		// 선언시 클래스 지정 => new 객체 생성시 클래스타입은 생략가능
		List<Integer> list4 = new ArrayList<>();  // 가장 많이 사용
		
		// Set
		Set<Integer> set = new HashSet<>();
		
		// Map : 2개의 자료를 쌍으로 저장
		Map<String, Integer> map = new HashMap<>();
		
		
	}

}
