package string;

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * input: a6b2c10
		 * aaaaaabbcccccccccc
		 * a2bc5
		 * aabcbcbcbcbc
		 * 
		 */
		Scanner in = new Scanner(System.in);
		
		String str = in.next();
		String temp = "";
		String num = "";
		int l=0;
				
		while(l<str.length()) {
			
			while((str.charAt(l)<'0' || str.charAt(l)>'9')) {
				temp += str.charAt(l);
				l++;
			}
			
			while(l<str.length() && str.charAt(l)>='0' && str.charAt(l)<='9') {
				num += str.charAt(l);
				l++;
			}
			
			int count = Integer.parseInt(num);
			
			for(int i=0;i<count;i++) {
				System.out.print(temp);
			}
			temp = "";
			num = "";
			
		}
		
		
		
		in.close();
	}
}
