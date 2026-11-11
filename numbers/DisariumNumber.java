package numbers;

public class DisariumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 89;
		int temp=n,num=n,count=0;
		int sum=0;
		
		while(temp>0) {
			temp/=10;
			count++;
		}
		
		while(n>0) {
			int digit = n%10;
			sum=sum+(int) Math.pow(digit, count--);
			n=n/10;
		}
		
		if(num==sum) {
			System.out.println("Disarium Number");
		}else {
			System.out.println("Not a Disarium Number");
		}
		
		
		
	}
}
