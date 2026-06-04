package Day_3_Challenge;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Question_4_ {

	public static void main(String[] args) {
		List<Integer> number =Arrays.asList(1,2,4,8,9,6,3);
		
		number.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(System.out::println);
		

	}

}
