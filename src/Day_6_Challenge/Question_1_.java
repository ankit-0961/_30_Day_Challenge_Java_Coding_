package Day_6_Challenge;

import java.util.HashSet;
import java.util.Set;

public class Question_1_ {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,4,2,3,1,5};
		
		Set<Integer> set =new HashSet<>();
		
		Set<Integer> duplicates =new HashSet<>();
		
		for(int  num: arr) {
			if (!set.add(num)) {
				duplicates.add(num);
				
			}
		}
		
		System.out.println(duplicates);

	}

}
