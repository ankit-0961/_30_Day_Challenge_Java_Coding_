package Day_11_Challenge_;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Question_5_ {

	public static void main(String[] args) {
		
		String arr[]= {"1","2","3","4","5","5","7"};
		
		Set<String> set=new LinkedHashSet<>(Arrays.asList(arr));
		
		ArrayList<String> list=new ArrayList<>(set);
		
		System.out.println(list);

	}

}
