package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class SearchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<User> users = new ArrayList<>();
		users.add(new User("u1","홍길동",25));
		users.add(new User("u2","김길동",35));
		users.add(new User("u3","홍수아",47));
		users.add(new User("u4","권진현",38));
		users.add(new User("u5","장동민",29));
		
		// 1) 이름으로 검색
		Optional<User> findByName = SearchUtils.findFirstByField(users, User::getName, "홍길동");
		findByName.ifPresent(user -> System.out.println("유저 ID " + user.getId()));
		
		// 2) 나이로 검색
		Optional<User> findByAge = SearchUtils.findFirstByField(users, User::getAge, 35);
		User u = findByAge.orElse(null);
		System.out.println(u);
		
		
		Map<String,User> userMap = new HashMap<>();
		userMap.put("key1", users.get(0));
		userMap.put("key2", users.get(1));
		userMap.put("key3", users.get(2));
		userMap.put("key4", users.get(3));
		userMap.put("key5", users.get(4));
		
		Optional<User> findByName2 = SearchUtils.findFirstValueByField(userMap, User::getName, "김길동");
		findByName2.ifPresent(user->System.out.println(user.getName() + "유저 ID : "+user.getId()));
		
		

	}

}
