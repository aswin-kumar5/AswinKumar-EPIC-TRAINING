package string;

import java.util.Scanner;

public class StringCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int symbol = str.length()/2+1;
		
		
//		int symbol=0;		
//		for(int i=0;i<str.length();i++) {
//			if(str.charAt(i)<0 || str.charAt(i)>9) {
//				symbol = i;
//			}
//		}
		
		int res = str.charAt(0) - '0';
		int i=1;
		
		while((i<=str.length()/2) && symbol<str.length()) {
			char ch = str.charAt(symbol);
				switch(ch) {
					case '+':
						res +=   str.charAt(i) - '0';
						break;
					case '-':
						res -=   str.charAt(i) - '0';
						break;
					case '*':
						res *=   str.charAt(i) - '0';
						break;
					case '/':
						res /=   str.charAt(i) - '0';
						break;
					case '%':
						res %=   str.charAt(i) - '0';
						break;
				}
				symbol++;
				i++;
		}
		
		System.out.println(res);
		in.close();
	}
}
