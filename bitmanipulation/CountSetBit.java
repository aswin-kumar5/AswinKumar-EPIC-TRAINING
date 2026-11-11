package bitmanipulation;

public class CountSetBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5,count=0;
		
		while(n>0) {
			n = n & (n-1);
			count++;
		}
		
		System.out.println(count);
		
	}
}
