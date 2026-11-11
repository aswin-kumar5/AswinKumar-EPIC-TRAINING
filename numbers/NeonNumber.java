package numbers;

public class NeonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=9,sq=n*n,rem,sq_sum=0;
		
		while(sq>0) {
			rem=sq%10;
			sq_sum+=rem;
			sq/=10;
		}
		
		if(n==sq_sum){
			System.out.println("Neon Number");
		}else {
			System.out.println("Not a Neon Number");
		}
	}
}
