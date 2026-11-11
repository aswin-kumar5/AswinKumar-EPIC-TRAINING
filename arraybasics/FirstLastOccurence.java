package arraybasics;

public class FirstLastOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {5,3,8,5,6};
		int target = 5;
		int first=-1,last=-1;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				if(first==-1) {
					first = i;
				}
				last =i;
			}
		}
		
		
		System.out.println("First Occurence: " + first);
		System.out.println("Last Occurence: "+ last);
		
	}
}
