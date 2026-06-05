package Day_4_Challenge;

public class Question_3_ {

	public static void main(String[] args) {
		String str="madam";
		
		String reverse=new StringBuilder(str)
				.reverse()
				.toString();
		
		System.out.println(str.equals(reverse));

	}

}
