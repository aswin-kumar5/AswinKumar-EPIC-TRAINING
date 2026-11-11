package patterns.number;

public class NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		
		for(int i=1;i<=n;i++) {
			int k=1;
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=2*i-1;j++) {
				if(j<n) {
					System.out.print(k + " ");
					k++;
				}else {
					k--;
					System.out.print(k + " ");
				}
				
			}
			System.out.println("");
		}
		
	}
}
