package array;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int[] arr = {2,9,7,5,3};
		int search = sc.nextInt();
		boolean isFound=false;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==search) {
				isFound=true;
				System.out.println("Element found at index position: " + i);
				break;
			}
		}
		
		if(!isFound) {
			System.out.println("Search Element Not Found");
		}
		
		sc.close();
	}
}
