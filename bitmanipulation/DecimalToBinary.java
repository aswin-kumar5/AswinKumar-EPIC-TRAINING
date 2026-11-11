package bitmanipulation;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=45;
		String b= "";
		
		while(n>0) {
			int x=n%2;
			b=x+b;
			n/=2;
		}
		
		System.out.println(b);
	}

}
