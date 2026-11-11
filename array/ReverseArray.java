package array;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {8,6,3,1,5};
		int l=0,r=arr.length-1;
		
		System.out.println("Original Array:");
		for(int num : arr) {
			System.out.print(num + " ");
		}
		
		while(l<r) {
			int temp = arr[r];
			arr[r] = arr[l];
			arr[l] = temp;
			
			l++;
			r--;
		}
		
		System.out.println("\nReversed Array:");
		for(int num : arr) {
			System.out.print(num + " ");
		}
	}
}
