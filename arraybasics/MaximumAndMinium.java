package arraybasics;

public class MaximumAndMinium {
	
	public static void main(String[] args) {
		
		int[] arr = {5,2,3,7,9};
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		
		System.out.println("Maximum: " + max);
		System.out.println("Minimum: " + min);
	}
}
