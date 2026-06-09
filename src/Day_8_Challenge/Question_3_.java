package Day_8_Challenge;

public class Question_3_ {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};

		int max=arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i]>max) {
				max=arr[i];
			}
		}
		
		System.out.println(max);
	}

}
