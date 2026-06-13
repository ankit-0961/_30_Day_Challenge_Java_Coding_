package Day_11_Challenge_;

public class Question_4_ {

	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,90,80};
		
		int max=arr[0];
		
		for(int num:arr) {
			if (num>max) 
				max=num;
				
			
			
		}
		System.out.println(max);
	}

}
