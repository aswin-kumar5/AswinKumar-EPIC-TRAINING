package bitmanipulation;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String b = "101101";
		int power2 = 1;
		int result = 0;
		
		for(int i=b.length()-1;i>=0;i--) {
			if(b.charAt(i)=='1') {
				result+=power2;
			}
			power2*=2;
		}
		System.out.println(result);
	}
}
	
