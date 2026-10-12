package queue;

import java.util.Scanner;


class DoubleEndedQueueImplementation{
	
	int n = 3;
    int[] queue = new int[n];
    int front = -1,rear = -1;
    
    public void insertFront(Scanner in){
        if(rear == n-1){
            System.out.println("Queue OverFlow");
        }else{
            if(front == -1){
                front = 0;
            }
            System.out.println("Enter a Value: ");
            int val = in.nextInt();
            rear++;
            for(int i=rear;i>0;i--){
                queue[i] = queue[i-1];
            }
            queue[0] = val;
        }
        
    }
    
    public void insertRear(Scanner in){
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
    
    public void deleteFront(){
        if(front == -1){
            System.out.println("Queue is UnderFlow");
        }else{
            System.out.println("Deleted Data: " + queue[front]);
            for(int i=front;i<rear;i++){
                queue[i] = queue[i+1];
            }
            queue[rear--] = 0;
            if(rear==-1){
                front = -1;
                rear = -1;
            }
        }
    }
    
    public void deleteRear(){
        if(front == -1){
            System.out.println("Queue is UnderFlow");
        }else{
            System.out.println("Deleted Data: " + queue[rear--]);
            if(rear==-1){
                front = -1;
                rear = -1;
            }
        }
    }
    
    public void peekFront(){
        if(front == -1){
            System.out.println("Queue is UnderFlow");
        }else{
            System.out.println(queue[front]);
        }
    }
    
    public void peekRear(){
        if(front == -1){
            System.out.println("Queue is UnderFlow");
        }else{
            System.out.println(queue[rear]);
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

public class DoubleEndedQueue {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    DoubleEndedQueueImplementation dq = new DoubleEndedQueueImplementation();
	    
	    while(true){
	        System.out.println("1. Insert in Front \n2. Insert in Rear \n3. Delete in Front \n4. Delete in Rear \n5. Peek Front \n6. Peek Rear \n7. Display \n8. Exit");
	        System.out.print("Enter your Choice:");

	        switch(in.nextInt()){
	            case 1:
	                dq.insertFront(in);
	                break;
	            case 2:
	                dq.insertRear(in);
	                break;
	            case 3:
	                dq.deleteFront();
	                break;
	            case 4:
	                 dq.deleteRear();
	                 break;
	            case 5:
	                 dq.peekFront();
	                 break;
	            case 6:
	                 dq.peekRear();
	                 break;
	            case 7:
	                 dq.display();
	                 break;
	            case 8:
	            	in.close();
	            	return;
	            default:
	            	System.out.println("Invalid Choice");
	        }
	    }

	}

}
