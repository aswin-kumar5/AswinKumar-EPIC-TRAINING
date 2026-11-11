package numbers;

public class HarshadNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=18,num=n,rem,sum=0;
		
		while(n>0) {
			rem=n%10;
			sum+=rem;
			n/=10;
		}
		
		if(num%sum==0) {
			System.out.println("Harshad Number");
		}else {
			System.out.println("Not a Harshad Number");
		}
	}
}
