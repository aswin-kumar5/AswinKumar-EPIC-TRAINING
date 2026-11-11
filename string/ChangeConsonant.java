package string;

import java.util.Scanner;

public class ChangeConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		String consonant = "";
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' ||
					str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U'	) {
				consonant += str.charAt(i);
			}else {
				consonant += '#';
			}
		}
		
		System.out.println(consonant);
		
		in.close();
	}
}
