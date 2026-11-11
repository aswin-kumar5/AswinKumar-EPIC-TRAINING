package array;

public class MaxSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10,20,30,40,50};
		int target = 50;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]+arr[j]==target) {
					System.out.println(arr[i] + " " + arr[j]);
				}
			}
		}
	}
}
