package Day_9_Challenge;

import java.util.HashSet;

public class Question_4_ {

	public static void main(String[] args) {
		int arr[] = {1,2,3,1,2,3,5};
		
		HashSet<Integer> set =new HashSet<>();

		for (int num :arr) {
			if (!set.add(num)) {
				System.out.println(num);
			}
		}
	}

}
