package numbers;

public class SpyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=123,rem,product=1,sum=0;
		
		while(n>0) {
			rem=n%10;
			sum+=rem;
			product*=rem;
			n/=10;
		}
		
		if(sum==product) {
			System.out.println("Spy Number");
		}else {
			System.out.println("Not a Spy Number");
		}
	}
}
