package sample_java;

import java.util.ArrayList;

public class common_elements {

	public static void condition1() {
		int arr1 [] = {1,2,3,4,5,6};
		int arr2 [] = {5,2,6,8,9};
		ArrayList<Integer> arr = new ArrayList<>();
		
		for (int i=0; i<arr1.length;i++) {
			for (int j=0; j<arr2.length;j++) {
				if(arr1[i] == arr2[j]) {
					arr.add(arr1[i]);
					break;
				}
			}
		}
		System.out.println(arr);
		
	}
	
	public static void main(String[] args) {
		condition1();
		

	}

}
