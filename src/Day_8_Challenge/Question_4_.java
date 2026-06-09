package Day_8_Challenge;

public class Question_4_ {

	public static void main(String[] args) {
		String str="education";
		
		int count=0;
		
		str=str.toLowerCase();
		
		for (char ch:str.toCharArray()) {
			if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count++;
			}
		}
System.out.println(count);
	}

}
