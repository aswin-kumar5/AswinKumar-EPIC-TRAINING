package string;

import java.util.Scanner;

public class MergeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		String str1 = in.nextLine();
		String str2 = in.nextLine();
		String mergeStr = "";
		
		for(int i=0;i<str1.length();i++) {
			mergeStr += str1.charAt(i);
		}
		
		for(int i=0;i<str2.length();i++) {
			mergeStr += str2.charAt(i);
		}
		
		System.out.println(mergeStr);
		
		in.close();
	}
}
