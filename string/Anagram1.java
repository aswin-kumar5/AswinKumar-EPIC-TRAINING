package string;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram1 {

	static boolean CheckAnagram(char[] str1,char[] str2) {
		if(str1.length!=str2.length) {
			return false;
		}
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		for(int i=0;i<str1.length;i++) {
			if(str1[i]!=str2[i]) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		String str1 = in.next();
		String str2 = in.next();
		
		if(CheckAnagram(str1.toCharArray(),str2.toCharArray())) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not a Anagram");
		}
		
		in.close();
	}
}
