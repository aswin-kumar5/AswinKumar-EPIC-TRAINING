package arraybasics;

public class MaximumIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {7,5,3,1,2,4};
		
		int max = Integer.MIN_VALUE;
		int index = -1;
		
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max = arr[i];
				index = i;
			}
		}
		
		System.out.println("Maximum Element: " + max);
		System.out.println("Index of Maximum Element: " + index);
		
	}
}