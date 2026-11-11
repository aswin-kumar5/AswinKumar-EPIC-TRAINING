package numbers;

public class KaprekarNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=297;
		int sq = n*n;
		int temp = n,digit=0;
		int lpart,rpart;
		
		if(n==1) {
			digit=1;
		}else {
			while(temp>0) {
				temp/=10;
				digit++;
			}
		}
		
		int divisor = (int) Math.pow(10, digit);
		
		rpart = sq%divisor;
		lpart = sq/divisor;
		
		if(n==lpart+rpart) {
			System.out.println("Kaprekar Number");
		}else {
			System.out.println("Not a Kaprekar Number");
		}
		

		
	}
}
