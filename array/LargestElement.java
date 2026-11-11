package array;

public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {7,4,6,8,2,9};
		int largest=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		
		System.out.println("Largest Element: "+largest);
	}
}
