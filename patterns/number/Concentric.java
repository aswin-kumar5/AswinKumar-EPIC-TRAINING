package patterns.number;

public class Concentric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=7;
		
		for(int i=0;i<n;i++) {
			int value = 0 ;
			for(int j=0;j<n;j++) {
				if(i<=n/2) {
					if(j<=i) {
						System.out.print(++value + " ");
					}else if(i+j>=n) {
						System.out.print(--value + " ");
					}else {
						System.out.print(value + " ");
					}
				}
				else {
					if(i+j<n) {
						System.out.print(++value + " ");
					}else if(j>i) {
						System.out.print(--value + " ");
					}else {
						System.out.print(value + " ");
					}
				}
			}
			
			System.out.println(); 
		}
		
		
		
		
		
	}
}
