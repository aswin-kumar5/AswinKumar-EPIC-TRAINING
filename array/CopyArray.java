package array;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {8,7,3,1,5};
		int[] brr = new int[arr.length];
		
		System.out.println("Original Array");
		for(int num : arr) {
			System.out.print(num + " ");
		}
		
		for(int i=0;i<arr.length;i++) {
			brr[i]=arr[i];
		}
		
		System.out.println("\nCopied Array");
		for(int num : brr) {
			System.out.print(num + " ");
		}
		
	}
}
