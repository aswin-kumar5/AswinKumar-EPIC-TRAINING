package array;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {5,8,9,1,3};
		
		for(int i=0;i<arr.length-1;i++) {
			
			for(int j=i+1;j<=arr.length-1;j++) {
				
				if(arr[j]<arr[i]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		for(int i :arr) {
			System.out.print(i + " ");
		}
		
	}
}
