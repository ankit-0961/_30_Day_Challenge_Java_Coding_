package _Day_2_Challenge;

import java.util.Arrays;
import java.util.List;

public class Question_3_ {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("Ankit","Amit","Rahul");

		String first=names.stream()
				          .findFirst()
				          .get();
		
		System.out.println(first);
	}

}
