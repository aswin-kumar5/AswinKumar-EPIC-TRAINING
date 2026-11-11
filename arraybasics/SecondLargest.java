package arraybasics;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {7,2,3,6,5,8};
		
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(largest<arr[i]) {
				secondLargest = largest;
				largest = arr[i];
			}else if(secondLargest<arr[i] && arr[i]!=largest) {
				secondLargest = arr[i];
			}
		}
		
		System.out.println("Largest Element: " + largest);
		System.out.println("Second Largest Element: " + secondLargest);
	}
}
