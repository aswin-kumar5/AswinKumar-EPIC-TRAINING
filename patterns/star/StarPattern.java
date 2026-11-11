package patterns.star;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		
		for(int i=1;i<=2*n-1;i++) {
			for(int j=1;j<=2*n-1;j++) {
				if(i==n || j==n) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}

		


		
	}
}
