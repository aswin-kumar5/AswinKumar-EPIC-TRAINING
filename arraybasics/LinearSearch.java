package arraybasics;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {5,7,8,9,10};
		int target = 5;
		boolean isFound = false;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				System.out.println("Element found at Position: " + i);
				isFound = true;
			}
		}
		
		if(!isFound) {
			System.out.print("Element Not Found");
		}
		
		
	}
}
