package threads;

class Data extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("class1: "+i);
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}

class Data1 extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("class2: "+i);
			try {
				Thread.sleep(2000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}

public class JoinMethod {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		
		Data d1 = new Data();
		Data1 d2 = new Data1();
		d1.start();
		
		d1.join();
		d2.start();
		d2.join();
		

	}

}
