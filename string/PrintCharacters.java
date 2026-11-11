package string;

import java.util.Scanner;

public class PrintCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		String empStr = "";
		
		for(int i=0;i<str.length();i++) {
			empStr += str.charAt(i);
			empStr += " ";
		}
		
		System.out.println(empStr);
		
		in.close();
	}
}
