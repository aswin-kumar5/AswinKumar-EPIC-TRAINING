package array;

public class MaximumDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {7,2,3,5,9,4};
		int smallest = Integer.MAX_VALUE;
		int largest=Integer.MIN_VALUE;
		int diff;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
			if(arr[i]<smallest) {
				smallest = arr[i];
			}
		}
		
		diff = largest - smallest;
		
		System.out.println(diff);
	}
}
