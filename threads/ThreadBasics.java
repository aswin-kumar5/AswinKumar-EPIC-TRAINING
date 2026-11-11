package threads;

class MyData extends Thread{
	// contains task
	public void run() {
		System.out.println("Print Data");
	}
}

public class ThreadBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * There are 2 threads main & mydata
		 */
		
		MyData t1 = new MyData();
		t1.start();
		/*
		 * here we start the thread MyData so 2 threads are running concurrently...
		 */
		System.out.println("In Main Thread");
		
		/*
		MyData t1 = new MyData();
		t1.run(); 
		// here the normal method calling is done so only one thread is running that is main so output will be Print Data and then In Main Thread 
		System.out.println("In Main Thread");
		*/
		
	}

}
