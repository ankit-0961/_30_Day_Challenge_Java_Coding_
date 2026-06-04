package Day_3_Challenge;

import java.util.Arrays;
import java.util.List;

public class Question_2_ {

	public static void main(String[] args) {
		List<Integer> number=Arrays.asList(20,30,40,60,10);
		
		int min =number.stream()
               
				.min(Integer::compare)
				.get();
				System.out.println(min);
	}

}
