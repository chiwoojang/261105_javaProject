package day14;

import java.util.ArrayList;
import java.util.List;

public class List01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();   // crtl + shift + o => import 일괄처리
		System.out.println(list);
		
		// add() : 요소추가
		list.add(100);
		list.add(10);
		list.add(30);
		list.add(0,60);  // index 0번지 값을 추가 => 밀림 (덮어쓰지 않음)
		System.out.println(list);
		
		// get(index) : index 번지의 요소 가져오기
		// list[0]
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		// set(index,값) : index 번지의 요소가 변경하기 
		list.set(0, 200);
		System.out.println(list);
		
		// remove(index) : index 번지의 요소 삭제
		// remove(object) : object 값을 삭제
		System.out.println(list.remove(0));
		System.out.println(list);
		
		Integer r = 100;
		System.out.println(list.remove(r));
		list.remove(r);
		
		// size() : list의 개수 => 배열의 length와 같은 으미
		System.out.println(list.size());
		
		// contains(object) : list에 object가 존재하는지 확인
		System.out.println(list.contains(10));
		
		// clear() : 리스트 비우기 (요소를 전부 삭제)
		list.clear();
		System.out.println(list);
		
		//isEmpty() : 리스트가 비었는지 확인
		System.out.println(list.isEmpty());
		
		

	}

}
