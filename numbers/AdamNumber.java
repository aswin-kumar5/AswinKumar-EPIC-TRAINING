package numbers;

public class AdamNumber {

	static int reverse (int n) {
		int digit,rev=0;
		while(n>0) {
			digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}
		return rev;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 12;
		
		int n_sq = n*n;
		
		int rev = reverse(n);
		int rev_sq = rev*rev;
		
		if(n_sq==reverse(rev_sq)) {
			System.out.println("Adam Number");
		}else {
			System.out.println("Not a Adam Number");
		}
	}
}
