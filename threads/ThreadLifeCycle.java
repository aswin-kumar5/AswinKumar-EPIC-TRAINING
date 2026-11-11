package threads;

//class MyData2 extends Thread{
//	public void run() {
//		
//	}
//}
//
//public class ThreadLifeCycle {
//
//	public static void main(String[] args) throws InterruptedException {
//		// TODO Auto-generated method stub
//		
//		MyData2 t1 = new MyData2();
//		
//		System.out.println(t1.getState());
//		t1.start();
//		System.out.println(t1.getState());
//		t1.join();
//		System.out.println(t1.getState());
//	}
//}

class MyData2 extends Thread{
    
    public void run(){
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            
        }
    }
}

public class ThreadLifeCycle{

	public static void main(String[] args) throws InterruptedException {
	
	    MyData2 t1 = new MyData2();
	    System.out.println(t1.getState());
		t1.start();
		Thread.sleep(1000);
		System.out.println(t1.getState());
	}

}