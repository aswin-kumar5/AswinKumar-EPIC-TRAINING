package numbers;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=121,rev=0,rem,num=n;
		
		while(n>0) {
			rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		
		if(num==rev) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}

	}

}
