package sample_java;

import java.util.ArrayList;

public class dummy1 {

    public static void condition(String user_input) {
    	String[] str = user_input.split(" ");
    	int vowels  =0;
    	int total_char=0;
    	StringBuilder result = new StringBuilder();
    	
    	for(int i=0; i<user_input.length();i++) {
    		if(user_input.charAt(i) == 'a' || user_input.charAt(i) == 'e' || 
    		   user_input.charAt(i) == 'i'|| user_input.charAt(i) == 'o' || user_input.charAt(i) == 'u') {
    			vowels ++;
    		}else {
    			total_char++;
    		}
    	}
    	System.out.println(str.length);
    }

    public static void main(String[] args) {
        condition("hello world");
    }
}
