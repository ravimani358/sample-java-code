package sample_java;

import java.util.ArrayList;

public class Count_Characters {
	public static void condition1(String words) {
				
		ArrayList<Character> word_storage = new ArrayList<Character>();
		
		for(int i=0; i<words.length();i++) {
			for(int j=0; j<words.length();j++) {
				if(words.charAt(i) ==words.charAt(j)) {
					word_storage.add(words.charAt(i));
				}
			}
			
		}
		
		for(char letter : word_storage) {
			System.out.println(letter);
		}
	}
	
	public static void main(String[] args) {
		String User_given_input = "RTR";
		condition1(User_given_input);
	}

}
