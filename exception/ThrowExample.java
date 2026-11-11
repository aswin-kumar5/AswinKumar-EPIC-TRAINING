package exception;

import java.util.Scanner;

public class ThrowExample {
	
		int checkAge(int age) throws ArithmeticException{
        
			return 10/age;      
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
	    ThrowExample m = new ThrowExample();
	    while(true){
	        int age = in.nextInt();
	        
    	    try{
    	        m.checkAge(age);
    	        System.out.println(m.checkAge(age)+" Is Valid");
    	        break;
    	    }
    	    catch(Exception e){
    	        System.out.println("Enter the Valid Age");
    	    }
	    }
	    
	}
}
