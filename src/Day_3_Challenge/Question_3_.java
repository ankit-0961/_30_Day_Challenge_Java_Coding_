package Day_3_Challenge;

import java.util.Arrays;
import java.util.List;

public class Question_3_ {

	public static void main(String[] args) {
		List<Integer> number=Arrays.asList(1,3,4,2,5,7,8);
		
		number.stream()
		.sorted()
		.forEach(System.out::println);

	}

}
