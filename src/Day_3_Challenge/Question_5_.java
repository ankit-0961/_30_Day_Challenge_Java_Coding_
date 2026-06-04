package Day_3_Challenge;

import java.util.Arrays;
import java.util.List;

public class Question_5_ {

	public static void main(String[] args) {
		
		List<Integer> number=Arrays.asList(1,4,5,6,0);
		
		int sum=number.stream()
		.mapToInt(Integer::intValue)
		.sum();
		
		System.out.println(sum);
		

	}

}
