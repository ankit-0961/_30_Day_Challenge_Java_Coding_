package Day_7_Challenge;

import java.util.HashSet;
import java.util.Set;

public class Question_2_ {

	public static void main(String[] args) {
		String str ="Programming";
		
		Set<Character> set= new HashSet<>();
		
		str.chars()
		.mapToObj(c->(char)c)
		.filter(c-> !set.add(c))
		.forEach(System.out::println);

	}

}
