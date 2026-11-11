package array;

public class SmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {7,4,6,8,2,9};
		int smallest = Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<smallest) {
				smallest = arr[i];
			}
		}
		
		System.out.println("Smallest Element: "+smallest);
	}
}
