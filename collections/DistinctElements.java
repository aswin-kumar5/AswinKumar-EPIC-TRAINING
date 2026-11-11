package collections;

import java.util.Scanner;
import java.util.*;

public class DistinctElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> nums = new ArrayList<>();
		HashSet<Integer> dis = new HashSet<>();
		HashSet<Integer> dup = new HashSet<>();
		
		int n = in.nextInt();
		for(int i=0;i<n;i++) {
			nums.add(in.nextInt());
		}
		
		for(int i : nums) {
			if(!(dis.add(i))) {
				dup.add(i);
			}
		}
		
		nums.removeAll(dup);
		
		System.out.println(nums);
		
		in.close();
	}
}
