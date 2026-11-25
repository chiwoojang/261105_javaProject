package practice;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;

public class SearchUtils {
	
	public static <T,V> Optional<T> findFirstByField(
			List<T> list,
			Function<T,V> fieldExtractor,
			V keyword
	){
		if(list==null||fieldExtractor==null) {
			return Optional.empty();			
		}
		
		return list.stream()
				.filter(Objects::nonNull)
				.filter(item->Objects.equals(fieldExtractor.apply(item), keyword))
				.findFirst();		
	}
	
	public static <K,E,F> Optional<E> findFirstValueByField(
			Map<K,E> map,
			Function<E,F> fieldExtractor,
			F keyword
	){
		if(map==null||fieldExtractor==null) {
			return Optional.empty();
		}
		
		return map.values().stream()
				.filter(Objects::nonNull)
				.filter(value->Objects.equals(fieldExtractor.apply(value),keyword))
				.findFirst();
				
	}
}
