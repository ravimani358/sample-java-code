package sample_java;

public class vowels {

	public static void condition1() {
		String given_word = "hello world";
		String vowels = "AEIOU";
		int consonants = 0;
		int vowels_count =0;
		int OperationsRequired = 0;
		
		
		for(int i=0; i<given_word.length();i++) {
			given_word.charAt(i);
			//Character.toUpperCase(given_word.charAt(i));
			for(int j=0; j<vowels.length();j++) {
			if(Character.toUpperCase(given_word.charAt(i))==vowels.charAt(j)) {
				vowels_count++;
				}
			}
				
		}
		consonants = given_word.replace(" ", "").length() - vowels_count;
		OperationsRequired = consonants - vowels_count;
		System.out.println(OperationsRequired);
	}
	
	public static void main(String[] args) {
		condition1();

	}

}
