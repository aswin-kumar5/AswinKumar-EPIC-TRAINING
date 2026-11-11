package arraybasics;

public class ThirdLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {7,2,3,6,5,8};
		
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		int thirdLargest = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(largest<arr[i]) {
				thirdLargest = secondLargest;
				secondLargest = largest;
				largest = arr[i];
			}else if(secondLargest<arr[i] && arr[i]!=largest) {
				thirdLargest = secondLargest;
				secondLargest = arr[i];
			}else if(thirdLargest<arr[i] && arr[i]!=largest && arr[i]!=secondLargest) {
				thirdLargest = arr[i];
			}
		}
		
		System.out.println("Largest Element: " + largest);
		System.out.println("Second Largest Element: " + secondLargest);
		System.out.println("Third Largest Element: " + thirdLargest);
		
	}
}
