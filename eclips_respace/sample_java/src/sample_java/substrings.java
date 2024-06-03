package sample_java;

import java.util.ArrayList;

public class substrings {
	
	public static void condition1(String words) {
		int word_length = words.length();
		
		//String [] word_storage = new String [word_length;
		
		ArrayList<String> word_storage = new ArrayList<String>();
		
		for(int i=0; i<word_length; i++) {
			word_storage.add(words.charAt(i), words);
		}
		if(word_length%2!=0) {
			words.charAt(word_length%2);
			
			//word_storage.add();
		
		}
		
}		
	
	
	public static void main(String[] args) {
		String user_given_words = "abc";
		condition1(user_given_words);

	}

}
