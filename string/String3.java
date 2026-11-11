package string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class String3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		StringBuilder str = new StringBuilder(in.nextLine());
		
		List<Character> num = new ArrayList<>();
		List<Character> alph = new ArrayList<>();
		
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				num.add(str.charAt(i));
			}else if(Character.isAlphabetic(str.charAt(i))) {
				alph.add(str.charAt(i));
			}
		}
		
		Collections.sort(num);
		Collections.reverse(alph);
		
		int n = 0;
		int c = 0;
		
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				str.setCharAt(i, num.get(n++));
			}else if(Character.isAlphabetic(str.charAt(i))) {
				str.setCharAt(i, alph.get(c++));
			}
		}
		
		System.out.println(str);
		
		in.close();
	}

}
