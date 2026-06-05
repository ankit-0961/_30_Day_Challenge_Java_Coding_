package Day_4_Challenge;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question_1_ {

	public static void main(String[] args) {
		List<Integer> list =Arrays.asList(1,1,3,4,2,3,4,5,6);
		
		Set<Integer> set=new HashSet<>();
		
		list.stream()
		.filter(n->!set.add(n))
		.forEach(System.out::println);
		
	}

}
