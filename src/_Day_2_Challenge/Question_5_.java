package _Day_2_Challenge;

import java.util.Arrays;
import java.util.List;

public class Question_5_ {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("Ankit","Aman","Amit");
		
		names.stream()
		     .map(String::toUpperCase)
		     .forEach(System.out::println);
		

	}

}
