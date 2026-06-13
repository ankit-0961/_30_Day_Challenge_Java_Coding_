package Day_11_Challenge_;

public class Question_3_ {

	public static void main(String[] args) {
		
		
		String str="programming";
		
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j < str.length(); j++) {
				if(str.charAt(i)==str.charAt(j)) {
					System.out.println(str.charAt(i));
					break;
				}
			}
			
		}

	}

}
