package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class TargetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> li = new ArrayList<>();
		
		int n = in.nextInt();
		
		for(int i=0;i<n;i++) {
			li.add(in.nextInt());
		}
		
		int target = in.nextInt();
		int num = in.nextInt();
		boolean isFound = false; 
		
		for(int i=0;i<n;i++) {
			if(li.contains(target-num)) {
				System.out.println(target-num);
				isFound = true;
				break;
			}
		}
		
		if(!isFound) {
			System.out.println("No Element Achieve the Target");
		}
		
		
		
		in.close();
		
		
		
	}
}
