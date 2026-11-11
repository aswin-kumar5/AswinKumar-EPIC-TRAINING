package string;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		String name = "Aswin";
		String frndName = "Meenakshi";
		
		String s = String.join(" loves ",name,frndName);
		
		System.out.println(s);
		
		in.close();
		
	}

}
