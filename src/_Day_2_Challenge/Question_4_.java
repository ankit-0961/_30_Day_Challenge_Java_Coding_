package _Day_2_Challenge;

import java.util.Arrays;
import java.util.List;

public class Question_4_ {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(10,20,30,40,50,30);
		
		long count=list.stream().count();
				
				System.out.println(count);

	}

}
