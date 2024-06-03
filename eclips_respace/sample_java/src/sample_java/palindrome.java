package sample_java;

public class palindrome {
	public static void Condition1(String Words) {
		
		StringBuilder SB = new StringBuilder();
		for(int i=Words.length()-1; i>=0; i--) {
			SB.append(Words.charAt(i));
		}
		
		if(Words.equalsIgnoreCase(SB.toString())){
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
		
	}
	public static void main(String[] args) {
		String User_input = "abc";
		Condition1(User_input);

	}

}
