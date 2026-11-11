package array;

public class ArrayAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2,4,6,8,10};
		int sum=0,avg;
		
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		
		avg = sum/arr.length;
		
		System.out.println(avg);
	}
}
