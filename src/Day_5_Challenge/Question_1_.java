package Day_5_Challenge;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Question_1_ {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(10,20,30,10,90,30);
		
		Integer secondHighest=
				list.stream()
				    .distinct()
				    .sorted(Comparator.reverseOrder())
				    .skip(1)
				    .findFirst()
				    .orElse(null);
		
		System.out.println(secondHighest);

	}

}
