package numbers;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=6;
		
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.print(i+" ");
			}
		}
	}

}
