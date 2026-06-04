package _Day_2_Challenge;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question_2_ {

	public static void main(String[] args) {
	List<Integer> list=Arrays.asList(1,2,3,4,2,1,6,7);
	
	Set<Integer> set=new HashSet<Integer>();
	
	
	list.stream()
	.filter(n->!set.add(n))
	.forEach(System.out::println);
	
	

	}

}
