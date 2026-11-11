package array;

public class MergeTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3};
		int[] brr = {4,5};
		int[] crr = new int[arr.length+brr.length];
		
		for(int i=0;i<arr.length;i++) {
			crr[i]=arr[i];
		}
		for(int i=0;i<brr.length;i++) {
			crr[arr.length+i]=brr[i];
		}
		
		for(int num:crr) {
			System.out.print(num + " ");
		}
	}
}
