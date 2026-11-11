package numbers;

public class ProductDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=1234,product=1,rem;
		
		while(n>0) {
			rem=n%10;
			product*=rem;
			n/=10;
		}
		
		System.out.println(product);
	}

}
