package Day_7_Challenge;

import java.util.HashSet;
import java.util.Set;

public class Question_1_ {

	public static void main(String[] args) {
		
		String str ="abccbdd";
		
		Set<Character> set= new HashSet<>();
		
		Character result= str.chars()
				.mapToObj(c-> (char)c)
				.filter(c -> !set.add(c))
				.findFirst()
				.orElse(null);
		
		System.out.println(result);

	}

}
