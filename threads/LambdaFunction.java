package threads;

public class LambdaFunction {
	public static void main(String[] args) {
		
		Thread t1 = new Thread(()->{
			System.out.println("Hello");
		});
		
		Thread t2 = new Thread(()->{
			System.out.println("Hi");
		});
		
		System.out.println("one");
		t1.start();
		t2.start();
		System.out.println("Two");
	}
}
