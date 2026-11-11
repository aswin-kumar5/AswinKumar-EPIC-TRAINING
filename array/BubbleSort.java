package array;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2,9,7,5,3};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				} 
			}
		}
		
		System.out.println("Sorted Array:");
		for(int num : arr) {
			System.out.print(num + " ");
		}
	}
}
