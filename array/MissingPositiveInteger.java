package array;

import java.util.*;

public class MissingPositiveInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int largest=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		int sum=0,asum=0;
		for(int i=1;i<=largest;i++) {
			sum+=i;
		}
		
		for(int i : arr) {
			if(i>0)
				asum += i;
		}
		
		System.out.println(sum-asum);
		
		sc.close();
	}
}
