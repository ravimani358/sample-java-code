package sample_java;
public class first_letter_caps {
	
	public static void condition1(String user_given_words) {
		String [] words = user_given_words.split(" ");
		
		StringBuilder sb = new StringBuilder();
		
		for(String word : words) {
			char letter = Character.toUpperCase(word.charAt(0));
			String balance_words = word.substring(1);
			sb.append(letter);
			sb.append(balance_words);
			sb.append(" ");
		}
		System.out.println(sb);
		
	}
	
	public static void main(String[] args) {
		String user_given = "hello world";
		condition1(user_given);
		

	}

}
