package bitmanipulation;

public class ClearIthBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5,i=2;
		int offMask = ~(1<<i);
		
		System.out.println(n & offMask);
	}

}
