package string;

import java.util.Scanner;

public class ReverseString {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		String str = "Hello";
//	    String rev = "";
//	    
//	    for(int i=str.length()-1;i>=0;i--){
//	        rev += str.charAt(i);
//	    }
//	    
//	    System.out.print(rev);
//	    
//	}
//}

	static String reverseString(String str){
		String empStr ="";
        for(int i=str.length()-1;i>=0;i--) {
        	empStr+=str.charAt(i);	
        }
			return empStr;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		
		System.out.println(reverseString(str));
		
		in.close();
	}
}
	
	
	
	
	