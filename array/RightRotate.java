package array;

public class RightRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2,9,7,5,3};
		int n=2;
		
		for(int i=1;i<=n;i++) {
			int num = arr[arr.length-1];
			for(int j=arr.length-1;j>0;j--) {
				arr[j]=arr[j-1];
			}
			arr[0]=num;
		}
		
		System.out.println("Right Rotated Array by " + n + " times:");
		for(int num : arr) {
			System.out.print(num + " ");
		}
		
	}
}
