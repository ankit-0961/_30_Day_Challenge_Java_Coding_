package Day_9_Challenge;

public class Question_1_ {

	public static void main(String[] args) {
		
		String str ="Ankit";
		String rev ="";
		
		
		for (int i = str.length() -1; i >=0; i--) {
			rev+=str.charAt(i);
		}

		System.out.println(rev);
	}

}
