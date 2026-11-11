package numbers;

public class SumDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=1234,sum=0,rem;
		
		while(n>0) {
			rem=n%10;
			sum+=rem;
			n/=10;
		}
		
		System.out.println(sum);
	}
}
