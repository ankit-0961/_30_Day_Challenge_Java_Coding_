package _Day_1_Challenge;

import java.util.Iterator;

public class Question5 {

	public static void main(String[] args) {
	
		int arr[]= {10,20,30,2,3};
		
		int min=arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println(min);
				
		

	}

}
