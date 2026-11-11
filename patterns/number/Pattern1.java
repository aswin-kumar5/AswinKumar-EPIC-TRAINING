package patterns.number;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
	
		String str = "1";
		String temp;
		
		for(int i=1;i<=n;i++) {
			
			System.out.println(str);
			temp = str;
			str = "";
			int count=1;
			for(int j=0;j<temp.length()-1;j++) {
				if( temp.charAt(j)== temp.charAt(j+1) )  {
					count++;	
				}else {
					str += count;
					str += temp.charAt(j);
					count=1;
				}
				
				
			}	
			str += count;
			str += temp.charAt(temp.length()-1);
		}
		
		in.close();
	}
}
