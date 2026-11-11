package string;

import java.util.Scanner;

public class DistinctCharacters {

	static int index(String str,int i) {
		if(str.charAt(i)>='a' && str.charAt(i)<='z')
			return str.charAt(i) - 'a';
		else
			return str.charAt(i) - 'A';
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		String str = in.next();
		int[] freq = new int[26];
		
		for(int i=0;i<str.length();i++) {
			int position = index(str,i);
			freq[position]++;
		}
		
		for(int i=0;i<str.length();i++) {
			int position = index(str,i);
			if(freq[position]==1) {
				System.out.println(str.charAt(i));
				freq[position]=0;
			}
		}
		
		in.close();
	}
}
