package Day_11_Challenge_;

public class Question_2_ {

	public static void main(String[] args) {
		String str ="madam";
		
		String rev= new StringBuilder(str).reverse().toString();
		
		if (str.equals(rev)) {
			System.out.println("Palindrone");
		} else {

			System.out.println("Not Palindrone");
		}
		
		

	}

}
