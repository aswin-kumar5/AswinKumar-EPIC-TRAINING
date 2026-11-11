package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<>();
		
		int n = in.nextInt();
		
		for(int i=0;i<n;i++) {
			num.add(in.nextInt());
		}
		
		
		for(int i=0;i<num.size();i++) {
			if(num.contains(num.get(i)) && (num.indexOf(num.get(i))!=i)){
				num.remove(i);
				i--;
			}
		}
		
		System.out.println(num);
		
		
		in.close();
	}

}
