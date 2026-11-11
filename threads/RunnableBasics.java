package threads;


class employee{
	
}

class MyData1 extends employee implements Runnable{
	public void run() {
		System.out.println("Print Data");
	}
}

public class RunnableBasics {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyData1 t1 = new MyData1();
		Thread th = new Thread(t1);
		
		th.start();
		
		/*
		 * here since we extended runnable inteface we can't give t1.start as it's not defined
		 * so we create a object for thread class and pass object of MyData1 so when we give th.start the thread gets started 
		 */
		
		System.out.println("In Main Thread");
		
		/*
		 * use case of multiple inheritance
		 */
		
		
	}
}
