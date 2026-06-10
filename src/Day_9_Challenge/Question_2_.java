package Day_9_Challenge;

public class Question_2_ {

	public static void main(String[] args) {
		String str="madam";
		
		String rev ="";
		
		
		for (int i = str.length()-1; i >=0; i--) {
			rev+=str.charAt(i);
		}

		if (str.equals(rev)) {
			System.out.println("palindrone");
			
		}else {
			System.out.println("Not Palindrone");
		}
	}

}
