package sample_java;

import java.util.ArrayList;

public class remove_duplicate {

	public static void condition1() {
		int arr [] = {1,1,2,42,3};
		ArrayList<Integer> arr1 = new ArrayList<>();
		
		for(int i=0; i<arr.length;i++) {
			boolean isDuplicate = false;
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					isDuplicate = true;
					break;
				}
			}
			
            if (!isDuplicate) {
                arr1.add(arr[i]);
            }
		}
		
		System.out.println(arr1);
	}
	
	
	
	public static void main(String[] args) {
		condition1();

	}

}
