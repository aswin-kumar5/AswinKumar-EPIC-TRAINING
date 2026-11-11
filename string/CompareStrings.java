package string;

import java.util.Scanner;

public class CompareStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		String str1 = in.nextLine();
		String str2 = in.nextLine();
		int valStr1=0,valStr2=0;
		
		for(int i=0;i<str1.length();i++) {
			valStr1 += str1.charAt(i);
		}
		
		for(int i=0;i<str2.length();i++) {
			valStr2 += str2.charAt(i);
		}
		
		if(valStr1 == valStr2) {
			System.out.println("Both String are Equal");
		}else if(valStr1 > valStr2) {
			System.out.println("String 1 is Greater");
		}else if(valStr1 < valStr2) {
			System.out.println("String 2 is Greater");
		}
		
		in.close();
	}
}
