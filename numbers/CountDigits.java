package numbers;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1234,count=0;
		
		while(n>0) {
			count++;
			n/=10;
		}
		
		System.out.println(count);
	}

}
