package Day_5_Challenge;

public class Question_3_ {

	public static void main(String[] args) {
		
		String str ="madam";
		
		boolean result=
				str.equals(new StringBuilder (str)
						.reverse()
						.toString());
		
		System.out.println(result);
		

	}

}
