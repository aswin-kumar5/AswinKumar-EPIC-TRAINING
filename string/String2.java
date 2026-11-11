package string;

import java.util.*;
import java.util.Scanner;

public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		
		ArrayList<Character> num = new ArrayList<>();
		ArrayList<Character> alphabets = new ArrayList<>();
		
		String out = "";
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='0' && str.charAt(i)<='9') {
				num.add(str.charAt(i));
			}else if((str.charAt(i)>='a' && str.charAt(i)<='z') || 
					(str.charAt(i)>='A' && str.charAt(i)<='Z')) {
				alphabets.add(str.charAt(i));
			}
		}
		
		Collections.sort(num);
//		alphabets.reversed();
		
		int dp = 0;
		int np = alphabets.size()-1;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='0' && str.charAt(i)<='9') {
				out += num.get(dp++);
			}else if((str.charAt(i)>='a' && str.charAt(i)<='z') || 
					(str.charAt(i)>='A' && str.charAt(i)<='Z')) {
				out += alphabets.get(np--);
			}else {
				out += str.charAt(i);
			}
		}
		
		System.out.println(out);
		
		in.close();
	}
}
