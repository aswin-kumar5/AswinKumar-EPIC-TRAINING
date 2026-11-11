package array;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,2,5,1};
		
		for(int i=0;i<arr.length;i++) {
			int count=1;
			boolean alreadyVisited = false;
			
			for(int k=0;k<i;k++) {
				if(arr[i]==arr[k]) {
					alreadyVisited=true;
					break;
				}
			}
			
			if(alreadyVisited) {
				continue;
			}
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count>1) {
				System.out.println(arr[i]);
			}
		}
		
	}
}
