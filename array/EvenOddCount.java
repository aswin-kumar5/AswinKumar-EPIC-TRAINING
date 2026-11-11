package array;

public class EvenOddCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {11,22,33,44,55};
		int EvenCount=0,OddCount=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				EvenCount++;
			}else {
				OddCount++;
			}
		}
		
		System.out.println("Even Count: " + EvenCount);
		System.out.println("Odd Count: " + OddCount);
	}
}
