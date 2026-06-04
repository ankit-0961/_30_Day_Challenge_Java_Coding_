package Day_3_Challenge;

import java.util.Arrays;
import java.util.List;

public class Question_1_ {

	public static void main(String[] args) {
		List<Integer> number=Arrays.asList(90,20,40,30,60);

		
		int max= number.stream()
		.max(Integer::compare)
		.get();
		
		System.out.println(max);
	}

}
