package queue;

import java.util.Scanner;

class CircularQueueImplementation{
    
    int n = 3;
    int[] circularQueue = new int[n];
    int front = -1,rear = -1;
    
    public void enQueue(Scanner in){
        if((rear+1)%n==front){
            System.out.println("Queue OverFlow");
        }else{
            if(front==-1){
                front=0;
            }
            System.out.println("Enter a value:");
            rear = (++rear)%n;
            circularQueue[rear] = in.nextInt();
         }
    }
    
    public void deQueue(){
        if(front==-1){
            System.out.println("Queue UnderFlow");
        }else{
            System.out.println("Deleted Data is: " + circularQueue[front]);
            if(front==rear){
                front = -1;
                rear = -1;
           }else {
        	   front = (front+1)%n;
           }
       
        }
    }
    
    public void peek(){
        if(front==-1){
            System.out.println("Queue UnderFlow");
        }else{
            System.out.println("Top Element is: " + circularQueue[front]);
        }
    }
    
    public void display(){
        if(front==-1){
            System.out.println("Queue is Empty");
        }else{
            int i = front;
            while(true) {
            	System.out.print(circularQueue[i] + " ");
            	if(i==rear) {
            		break;
            	}
            	i = (i+1)%n;
            }
            System.out.println();
        }
    }
    
}

public class CircularQueue {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    CircularQueueImplementation qi = new CircularQueueImplementation();
	    
	    while(true){
	        System.out.println("1. EnQueue \n2. DeQueue \n3. Peek \n4. Display \n5. Exit");
	        System.out.print("Enter your Choice:");

	        switch(in.nextInt()){
	            case 1:
	                qi.enQueue(in);
	                break;
	            case 2:
	                qi.deQueue();
	                break;
	            case 3:
	                qi.peek();
	                break;
	            case 4:
	                qi.display();
	                break;
	            case 5:
	            	in.close();
	            	return;
	            default:
	            	System.out.println("Invalid Choice");
	        }
	    }
	}
}
