package arraybasics;

public class CountOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {74,5,6,24,14,32};
		int evenCount=0,oddCount=0;
		
		 for(int num : arr) {
			 if(num%2==0) {
				 evenCount++;
			 }else {
				 oddCount++;
			 }
		 }
		
		 System.out.println("Even Count: " + evenCount);
		 System.out.println("Odd Count: " + oddCount);
		 
	}

}
