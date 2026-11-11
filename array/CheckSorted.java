package array;

public class CheckSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,6,4,5};
		boolean isSorted = true;
		
		for(int i=1;i<arr.length;i++) {
			if(!(arr[i-1]<=arr[i])) {
				isSorted=false;
				break;
			}
		}
		
		if(isSorted) {
			System.out.println("The Array is Sorted");
		}else {
			System.out.println("The Array is not Sorted");
		}
	}
}
