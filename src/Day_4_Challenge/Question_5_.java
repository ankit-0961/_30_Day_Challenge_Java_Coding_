package Day_4_Challenge;

import java.util.Arrays;
import java.util.List;

public class Question_5_ {

	public static void main(String[] args) {
		List<Integer> salaries =Arrays.asList(40000,30000,50000,3000);
		
		Integer highestSalary=salaries.stream()
				.max(Integer::compareTo)
				.get();
		
		System.out.println(highestSalary);

	}

}
