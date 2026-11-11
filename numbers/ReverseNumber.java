package numbers;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=1234,rev=0,rem;
		
		while(n>0) {
			rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		
		System.out.println(rev);

	}

}
