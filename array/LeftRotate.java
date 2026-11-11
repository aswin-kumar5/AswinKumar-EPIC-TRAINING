 package array;

public class LeftRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2,9,7,5,3};
		int n=2;
		
		for(int i=1;i<=n;i++) {
			int num = arr[0];
			for(int j=0;j<arr.length-1;j++) {
				arr[j]=arr[j+1];
			}
			arr[arr.length-1]=num;
		}
		
		System.out.println("Left Rotated Array by " + n + " times:");
		for(int num : arr) {
			System.out.print(num + " ");
		}
	}
}
