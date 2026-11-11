package arraybasics;

public class ElementsEqual {
	
	static boolean isEqual(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			if(arr[0]!=arr[i]) {
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {4,4,4,5};
		
		System.out.println(isEqual(arr));
		
	}

}
