package numbers;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=5,b=10;
		
		//Using Temporary Variable
		int temp=a;
		a=b;
		b=temp;
		System.out.println("a = "+a+"\tb = "+b);
		
		//Using + & - operator
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a = "+a+"\tb = "+b);
		
		//Using * & / operator
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("a = "+a+"\tb = "+b);
		
	}

}
