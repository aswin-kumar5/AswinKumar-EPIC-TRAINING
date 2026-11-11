package bitmanipulation;

public class CheckIthBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5,i=2;
		int cMask = 1<<i;
		
		if( (n&cMask) ==0) {
			System.out.println("OFF");
		}
		else {
			System.out.println("ON");
		}
		
	}
}
