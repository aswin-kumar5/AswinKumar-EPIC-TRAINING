package numbers;

import java.util.Scanner;
import java.util.HashSet;

public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int rem,sq=0;
		boolean isHappy=true;
		HashSet<Integer> nums = new HashSet<>();
		
		while(n!=1) {
			
			if(nums.contains(n)) {
				isHappy = false;
				break;
			}
			
			nums.add(n);
			
			while(n>0) {
				rem=n%10;
				sq+=(rem*rem);
				n=n/10;
			}
			
			n=sq;
		}
		
		if(isHappy) {
			System.out.println("Happy Number");
		}else {
			System.out.println("Not a Happy Number");
		}
		
		
		sc.close();
	}
}
