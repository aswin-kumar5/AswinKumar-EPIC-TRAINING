package subarray;

public class PrintTargetSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {5,-1,1,2,1,-1,5,2,-3};
		int target = 4;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				int sum = 0;
				for(int k=i;k<=j;k++) {
					sum+=arr[k];
				}
				if(sum==target) {
//					System.out.print(i+" " + j);
					for(int k=i;k<=j;k++) {
						System.out.print(arr[k] + " " );
					}
					System.out.println();
				}
			}
		}
		
	}
}
