package array;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {5,4,3,2,1};
		
		for(int i=1;i<arr.length;i++) {
			int j=i;
			while(j>0 && arr[j]<arr[j-1]) {
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
				j--;
 			}
		}
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
		
	}
}
