package queue;

import java.util.Scanner;

class QueueNode{
	
	int data;
    QueueNode next;
    
    QueueNode front=null,rear=null;
    
    public QueueNode(int data,QueueNode next) {
    	this.data = data;
    	this.next = next;
    }
    
    public QueueNode() {
    	
    }
    
    public void enQueue(Scanner in) {
    	System.out.print("Enter the value:");
        int val = in.nextInt();
        QueueNode node = new QueueNode(val,null);
        
        if(front==null) {
        	front = node;
        }else {
        	rear.next = node;
        }
        rear = node;
    }
    
    public void deQueue() {
    	if(front==null) {
    		System.out.println("Queue Underflow");
    	}else {
    		System.out.println("Deleted Data: " + front.data);
    		front = front.next;
    	}
    }
    
    public void peek() {
    	if(front==null) {
    		System.out.println("Queue Underflow");
    	}else {
    		System.out.println(front.data);
    	}
    }
    
    public void display() {
    	QueueNode temp = front;
    	while(temp!=null) {
    		System.out.print(temp.data + " ");
    		temp = temp.next;
    	}
    	System.out.println();
    }
}


public class LinearQueueUsingLinkedList {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		QueueNode li = new QueueNode();
		    
		    while(true){
		        System.out.println("1. EnQueue \n2. DeQueue \n3. Peek \n4. Display \n5. Exit");
		        System.out.print("Enter your Choice:");

		        switch(in.nextInt()){
		            case 1:
		                li.enQueue(in);
		                break;
		            case 2:
		                li.deQueue();
		                break;
		            case 3:
		                li.peek();
		                break;
		            case 4:
		                li.display();
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
