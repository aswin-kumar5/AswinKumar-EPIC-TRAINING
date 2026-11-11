package array;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,6,0,5};
		int n = arr.length,sum=0;
		int total_sum = n*(n+1)/2;
		
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		
		int Mnum = total_sum-sum;
		
		System.out.println("Missing Number: "+Mnum);
		
	}
}
