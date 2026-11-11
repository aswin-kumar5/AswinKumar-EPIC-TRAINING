package string;

import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		String sub = in.nextLine();
		
		for(int i=0;i<=str.length()-sub.length();i++) {
			String temp = "";
			for(int j=i;j<sub.length()+i;j++) {
				temp += str.charAt(j);
			}
			
			if(sub.equals(temp)) {
				System.out.println("It's a Substring");
				return;
			}
			temp = "";
		}
		
		System.out.println("It's not a Substring");
		
		in.close();
	}
}
