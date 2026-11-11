package string;

import java.util.Scanner;

public class CopyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		String cpyStr = "";
		
		for(int i=0;i<str.length();i++) {
			cpyStr += str.charAt(i);
		}
		
		System.out.println(cpyStr);
		
		
		
		in.close();
	}
}
