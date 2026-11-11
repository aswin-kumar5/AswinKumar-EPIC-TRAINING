package string;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int max=0;
		int count = 0;
		int a=0,b=0;
		for(int i=0;i<str.length();i++) {
			
			for(int j=i;j<str.length();j++) {
				
				if(str.charAt(j)=='1') {
					count++;
				}
				else {
					count--;
				}			
				if(count==0) {
					if(max<=j-i) {
						max = j-i;
						a=i;
						b=j;				
					}
				}
			}
		}
		
		System.out.println(max+1);
		for(int i=a;i<=b;i++) {
			System.out.print(str.charAt(i) + " ");
		}
		
		HashMap<Character,Integer> count = new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			
		}
		
		
		in.close();
	}
}
	
