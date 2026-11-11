package subarray;

public class SubArrayTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,1,1,2,2,3,1};
		int k=3;
		int target = 4;
		
		for(int i=0;i<=arr.length-k;i++) {
			int sum = 0;
			for(int j=i;j<i+k;j++) {
				sum+=arr[j];
			}
			if(sum==target) {
				for(int j=i;j<i+k;j++) {
					System.out.print(arr[j]+" ");
				}
			}
			System.out.println();
		}
		
	}

}
