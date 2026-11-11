package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<>();
		
		int n = in.nextInt();
		
		for(int i=0;i<n;i++) {
			num.add(in.nextInt());
		}
		
		
		
		
		in.close();
	}
}
