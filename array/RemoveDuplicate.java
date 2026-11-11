package array;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,2,5,1};
		int[] result = new int[arr.length];
		int size=0;
		
		for(int i=0;i<arr.length;i++) {
			
			boolean found = false;
					
			for(int j=0;j<size;j++) {
				if(arr[i]==result[j]) {
					found=true;
					break;
				}
			}
			
			if(!found) {
				result[size++]=arr[i];
			}
		}
		
		for(int i=0;i<size;i++) {
			System.out.print(result[i] + " ");
		}
	}
}
