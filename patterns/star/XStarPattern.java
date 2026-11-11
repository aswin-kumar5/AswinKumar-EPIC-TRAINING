package patterns.star;

public class XStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int n=3;
//		
//		for(int i=1;i<2*n;i++) {
//			for(int j=1;j<2*n;j++) {
//				if(j==i || j==2*n-i) {
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println("");
//		}  
		
		String s = "Hello";
		int k=0,n=s.length();
		for(int i=1;i<2*n;i++) {
			for(int j=1;j<2*n;j++) {
				if(j==i) {
					System.out.print(s.charAt(k++));
				}else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		} 
		
	}
}
