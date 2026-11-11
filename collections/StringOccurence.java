package collections;

import java.util.HashMap;
import java.util.Scanner;

public class StringOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		
		HashMap<Character,Integer> freq = new HashMap<>();
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(freq.containsKey(ch)) {
				int count = freq.get(ch);
				freq.put(ch, ++count);
			} else {
				freq.put(ch,1);
			}
		}
		
		for(int i=0;i<str.length();i++) {
			if(freq.get(str.charAt(i))!=0) {
				System.out.println(str.charAt(i) + ":" + freq.get(str.charAt(i)));
				freq.put(str.charAt(i),0);
			}
		}
		
		in.close();
	}
}
