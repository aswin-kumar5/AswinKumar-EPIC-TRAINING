package numbers;

public class AutomorphicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=25,sq=n*n,rem;
		boolean isAuto=true;
		
		while(n>0 && sq>0) {
			rem=n%10;
			if(sq%10!=rem) {
				isAuto=false;
				break;
			}
			n/=10;
			sq/=10;
		}
		
		if(isAuto) {
			System.out.println("Automorphic Number");
		}else {
			System.out.println("Not a Automorphic Number");
		}
		
	}
}
