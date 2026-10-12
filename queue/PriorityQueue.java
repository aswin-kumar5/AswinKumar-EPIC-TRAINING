package queue;

import java.util.Scanner;

class PriorityQueueImplementation{
	
	int n = 6;
    int[] queue = new int[n];
    int[] priority = new int[n];
    int front = -1,rear = -1;
    
    public void enQueue(Scanner in){
        if(rear==n-1){
            System.out.println("Queue OverFlow");
        }else{
            System.out.println("Enter a value:");
            int value = in.nextInt();
            System.out.println("Enter priority:");
            int pri = in.nextInt();
            
            if(front==-1){
                front = 0;
                rear = 0;
                queue[rear] = value;
                priority[rear] = pri;
            }else{
                
                int i = rear;
                
                while(i>=0 && pri<priority[i]){
                    queue[i+1] = queue[i];
                    priority[i+1] = priority[i];
                    i--;
                }
                
               queue[i+1] = value;
               priority[i+1] = pri;
               rear++;
            }
        }
    }
    
    public void deQueue(){
        if(front == -1){
            System.out.println("Queue is UnderFlow");
        }else{
            System.out.println("Deleted Data: " + queue[front]);
            for(int i=front;i<rear;i++){
                queue[i] = queue[i+1];
                priority[i] = priority[i+1];
            }
            
            queue[rear] = 0;
            priority[rear] = 0;
            rear --;
            
            if(rear==-1){
                front=-1;
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

public class PriorityQueue {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    PriorityQueueImplementation qi = new PriorityQueueImplementation();
	    
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
