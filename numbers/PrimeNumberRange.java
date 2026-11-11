package numbers;

public class PrimeNumberRange {
	
	static boolean isPrime(int n) {
		if(n==1) {
			return false;
		}
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=1,b=100;
		
		for(int i=a;i<=b;i++) {
			if(isPrime(i)) {
				System.out.println(i +" "); 	
			}
		}
	}
}
