package string;

import java.util.Scanner;

public class SearchCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		char ch = in.next().charAt(0);
		
		for(int i=0;i<str.length();i++) {
			if(ch == str.charAt(i)) {
				System.out.println("Found");
				return;
			}
		}
		
		System.out.println("Not Found");
		
		in.close();
	}
}
