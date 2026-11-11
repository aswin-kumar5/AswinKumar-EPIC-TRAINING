package array;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5,6,7};
		int search = 5;
		boolean isFound=false;
		int low=0,high=arr.length-1;
		
		while(low<=high) {
			int mid = low + (high-low)/2;
			if(arr[mid]<search) {
				low=mid+1;
			}else if(arr[mid]>search) {
				high=mid-1;
			}else {
				System.out.println("Element found at position "+(mid+1));
				isFound=true;
				break;
			}
		}
		
		if(!isFound) {
			System.out.println("Search Element not found");
		}
		
	}
}
