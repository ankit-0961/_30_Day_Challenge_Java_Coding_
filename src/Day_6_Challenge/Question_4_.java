package Day_6_Challenge;

public class Question_4_ {

	public static void main(String[] args) {
		String str ="madam";
		
		boolean result =str.equals(new StringBuilder(str).reverse().toString());
		
		System.out.println(result);

	}

}
