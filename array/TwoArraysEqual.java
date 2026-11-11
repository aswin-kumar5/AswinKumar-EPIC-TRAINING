package array;

public class TwoArraysEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3};
		int[] brr = {1,2,3};
		
		if(arr.length!=brr.length) {
			System.out.println("The Given Arrays are not equal");
		}else {
			boolean isEqual = true;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]!=brr[i]) {
					isEqual=false;
					break;
				}
			}
			
			if(isEqual) {
				System.out.println("The Given Arrays are equal");
			}else {
				System.out.println("The Given Arrays are not equal");
			}
		}
		
		
	}
}
