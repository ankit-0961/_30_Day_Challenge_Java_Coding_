package Day_6_Challenge;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Question_2_ {

	public static void main(String[] args) {
		String str="aabbcddee";
		
		Character result =str.chars()
				.mapToObj(c ->(char)c)
				.collect(Collectors.groupingBy(
						Function.identity(),
						LinkedHashMap::new,
						Collectors.counting()))
				.entrySet()
				.stream()
				.filter(e -> e.getValue()==1)
				.map(Map.Entry::getKey)
				.findFirst()
				.orElse(null);
		
		System.out.println(result);

	}

}
