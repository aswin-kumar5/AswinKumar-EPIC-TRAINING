package threads;

class Counter{
	int count=0;
	
	synchronized public void incrementCount() {
		count++;
	}
}

class MyThread extends Thread{
	Counter count;//obj
	MyThread(Counter count){
		this.count = count;
	}
	public void run() {
		
//		System.out.println("Sleeping");
//		
//		try {
//			Thread.sleep(1000);
//		}
//		catch(InterruptedException e) {
//			
//		}
		
		for(int i=0;i<100000;i++) {
			count.incrementCount();
		}
	}
}


public class Main {

	public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter();
		MyThread t1 = new MyThread(c); 
		MyThread t2 = new MyThread(c); 
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(c.count);
		
	}
}
