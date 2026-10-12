package queue;

import java.util.Scanner;

class QueueImplementation{
    
    int n = 6;
    int[] queue = new int[n];
    int front = -1,rear = -1;
    
    public void enQueue(Scanner in){
        if(rear == n-1){
            System.out.println("Queue OverFlow");
        }else{
            if(front == -1){
                front = 0;
            }
            System.out.println("Enter a Value: ");
            queue[++rear] = in.nextInt();
        }
    }
    
    public void deQueue(){
        if(front == -1){
            System.out.println("Queue is UnderFlow");
        }else{
            System.out.println("Deleted Data is: " + queue[front++]);
            if(front>rear){
                front = -1;
                rear = -1;
            }
        }
    }
    
    public void peek(){
        if(front == -1){
            System.out.println("Queue is UnderFlow");
        }else{
            System.out.println(queue[front]);
        }
    }
    
    public void display(){
        if(front==-1){
            System.out.println("Queue is Empty");
        }else{
            for(int i=front;i<=rear;i++){
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }
    
}

public class LinearQueue {

	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
		 QueueImplementation qi = new QueueImplementation();
		    
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
