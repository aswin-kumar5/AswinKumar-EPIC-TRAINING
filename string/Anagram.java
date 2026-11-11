package string;

import java.util.Scanner;

public class Anagram {

	static int index(String str,int i) {
		if(str.charAt(i)>='a' && str.charAt(i)<='z')
			return str.charAt(i) - 'a';
		else
			return str.charAt(i) -'A';
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		String str1 = in.next();
		String str2 = in.next();
		int[] freq = new int[26];
		
		for(int i=0;i<str1.length();i++) {
			int position = index(str1,i);
			freq[position]++;
		}
		
		for(int i=0;i<str2.length();i++) {
			int position = index(str2,i);
			freq[position]--;
		}
		
		for(int i=0;i<freq.length;i++) {
			if(freq[i]!=0) {
				System.out.println("Not a Anagram");
				return;
			}
		}
		
		System.out.println("Anagram");
		
		
		in.close();
	}
}
