package patterns.star;

public class Heart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n = 10;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i-1;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=(2*n)-(2*i+1);j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
	}
}
