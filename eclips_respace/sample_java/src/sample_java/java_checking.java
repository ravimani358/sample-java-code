package sample_java;

public class java_checking {
	
	public static void condition1 (){
        int given_num=20;
        
        for(int i=1; i<=given_num; i++){ 
        	int count=0;
        	for(int j=1; j<=i; j++) {
        		if(i%j==0) {
        			count++;
        		}
        	}
        if(count ==2) {
        	//System.out.println(i);
        }
        }
	}
	
	public static void condition2(int user_given_number) {
        int given_num=user_given_number;
        
        for(int i=1; i<=given_num; i++){ 
        	int count=0;
        	for(int j=1; j<=i; j++) {
        		if(i%j==0) {
        			count++;
        		}
        	}
        if(count ==2) {
        	System.out.println(i);
        }
        }
	}
	
	public static void condition3(int user_given_number) {
		int number = 10;
		int square = (int) Math.pow(number, user_given_number);
		int prime_number_input = square-1;
        int given_digit_max_number=0;
        
        for(int i=1; i<=prime_number_input; i++){ 
        	int count=0;
        	for(int j=1; j<=i; j++) {
        		if(i%j==0) {
        			count++;
        		}
        	}
            if(count ==2) {
            	//System.out.println(i);
            	given_digit_max_number=i;
            }
        }
        System.out.println(given_digit_max_number);
	}

	public static void main(String []args){
		//condition1();
		//condition2(20);
		condition3(3);
	}
}
