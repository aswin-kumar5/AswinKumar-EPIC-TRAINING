package array;

public class CommonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,3,9,7};
		int[] brr = {9,8,6,4};
		
		System.out.println("Common Elements in given arrays");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<brr.length;j++) {
				if(arr[i]==brr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
	}
}
