package threads;

class MyData4{
    synchronized void waitMethod(){
        System.out.println("Before Wating");
        try{
            wait();
        }
        catch(Exception e){
            
        }
        
        System.out.println("Resumed");
    }
    synchronized void notifyMethod(){
        System.out.println("NOTIFY IS TRIGGERED");
        try{
            notifyAll();
        }
        catch(Exception e){
            
        }
    }
}

public class WaitNotifyMethods{
    public static void main(String[] a) throws InterruptedException{
        MyData4 md = new MyData4();
        
        Thread t1 = new Thread(()->{
            md.waitMethod();
        });
        Thread t3 = new Thread(()->{
            md.waitMethod();
        });
        Thread t2 = new Thread(()->{
            md.notifyMethod();
        });
        
        t1.start();
        t3.start();
        Thread.sleep(2000);
        t2.start();
    }
}















