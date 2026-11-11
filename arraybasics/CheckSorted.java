package arraybasics;

public class CheckSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,5,4,5};
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				System.out.println(false);
				return;
			}
		}
		
		System.out.println(true);
		
		
	}
}
