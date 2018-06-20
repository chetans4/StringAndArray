package org.chetan.array.main;

public class ArrayMain {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,0};
		for(int i = 0; i < arr.length; i++){
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]+arr[j] == 10){
					System.out.println("Combination for 10 is : "+arr[i]+" + "+arr[j]+" = 10");
				}
			}
		}
		
		
	}
}
