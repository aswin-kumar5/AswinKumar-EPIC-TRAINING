package numbers;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=1634,sum=0,rem,num=n;
		int temp=n;
		int count=0;
		
		//count digits
		while(temp>0) {
			count++;
			temp/=10;
		}
		
		while(n>0) {
			rem=n%10;
			sum=sum+(int)Math.pow(rem, count);
			n/=10;
		}
		
		if(num==sum) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("Not an Armstrong Number");
		}
	}

}
