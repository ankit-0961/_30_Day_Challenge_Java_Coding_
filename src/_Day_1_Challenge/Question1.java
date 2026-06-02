package _Day_1_Challenge;

public class Question1 {

	public static void main(String[] args) {
	
		String str="Mishra";
		
		String rev="";
		
		for (int i = str.length()-1; i>=0; i--) {
			rev +=str.charAt(i);
		}

		System.out.println(rev);
	}

}
