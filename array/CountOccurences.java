package array;

import java.util.Scanner;

public class CountOccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {9,5,8,6,4,3,2,5};
		int search = sc.nextInt();
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==search) {
				count++;
			}
		}
		
		System.out.println("Element "+search+" occurs: "+count);
		
		sc.close();
	}
}
