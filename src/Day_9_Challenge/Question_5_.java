package Day_9_Challenge;

public class Question_5_ {

	public static void main(String[] args) {
		String str="programming";
		
		char ch='m';
		
		long count =str.chars()
				.filter(c -> c == ch)
				.count();
		
		System.out.println(count);

	}

}
