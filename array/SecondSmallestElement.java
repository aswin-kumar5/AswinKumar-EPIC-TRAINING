package array;

public class SecondSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {7,4,6,8,2,9};
		int smallest=Integer.MAX_VALUE,second_smallest=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<smallest) {
				second_smallest=smallest;
				smallest=arr[i];
			}
			else if(arr[i]<second_smallest && arr[i]!=second_smallest) {
				second_smallest=smallest;
			}
		}
		
		
		if(second_smallest==Integer.MIN_VALUE) {
			System.out.println("There is No Second Smallest Element");
		}else {
			System.out.println("Second Smallest Element: "+second_smallest);
		}
	}
}
