package string;

import java.util.Scanner;

public class ReverseString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		String rev = "";
		int n = str.length()-1;
		int len = n;
		
//		for(int i=n;i>=0;i--) {
//			if(str.charAt(i)==' ') {
//				int end = len;
//				for(int j=i+1;j<=end;j++) {
//					rev += str.charAt(j);
//				}
//				rev += ' ';
//				len = i-1;	
//			}
//		}
		
		int i=0;
		while(i<=len) {
			rev += str.charAt(i);
			i++;
		}
		
		System.out.println(rev);
		
		in.close();
	}
}
