package string;

import java.util.Scanner;

public class NextAlphabet {

	static String result(String str) {
		
		String res = "";
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			if(ch>='a' && ch<='z') {
				int val = ch - 'a' + 1 ;
				res += (char) ( val % 26 + 'a'- 32 );
			}
			else {
				int val = ch - 'A' + 1 ;
				res += (char) ( val % 26 + 'A'+ 32 );
			}
//			if(ch=='z' || ch=='Z') {
//				res += (char)((int) ch-25);
//			}else {
//				res += (char)((int) ch+1);
//			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();

		System.out.println(result(str));
		
		in.close();
	}
}
