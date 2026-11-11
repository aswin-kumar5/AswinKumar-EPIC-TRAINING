package arraybasics;

public class SumOfEvenIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {5,8,9,2,3,1};
		int sum=0;
		
		for(int i=0;i<arr.length;i+=2) {
			sum+=arr[i];
		}
		
		System.out.println("Sum of Even Index: " + sum);
		
	}

}
