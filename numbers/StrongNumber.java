package numbers;

public class StrongNumber {
	
	static int  factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=145,rem,sum=0,num=n;
		
		while(n>0) {
			rem=n%10;
			sum+=factorial(rem);
			n/=10;
		}
		
		if(num==sum) {
			System.out.println("Strong Number");
		}else {
			System.out.println("Not a Strong Number");
		}

	}

}
