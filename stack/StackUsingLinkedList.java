package stack;

import java.util.Scanner;

class StackNode{
    
    int data;
    StackNode next;
    
    StackNode top=null;
    
    
    StackNode(int data,StackNode next){
        this.data = data;
        this.next = next;
    }
    
    StackNode(){
        
    }
    
    public void push(Scanner in){
        System.out.print("Enter the value:");
        int val = in.nextInt();
        StackNode node = new StackNode(val,top);
        top = node;
    }
    
    public void pop(){
        
        if(top==null){
            System.out.println("Stack UnderFlow");
        }else{
            int val = top.data;
            System.out.println("Popped Element: " + val);
            top = top.next;
        }
    }
    
    public void peek(){
        if(isEmpty()){
            System.out.println("Stack UnderFlow");
        }else{
            System.out.println("Top Element: " + top.data);
        }
    }
    
    public boolean isEmpty(){
        return top==null;
    }
    
    public void display(){
    	if(isEmpty()){
            System.out.println("Stack is Empty");
            return;
    	}
        StackNode temp = top;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
}

public class StackUsingLinkedList {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    StackNode s = new StackNode();
	    
	    while(true){
	        System.out.println("1. Push \n2. Pop \n3. Peek \n4. Is Empty \n5. Display \n6. Exit");
	        System.out.print("Enter your Choice:");
	        int ch = in.nextInt();
	        
	        switch(ch){
	            case 1:
	                s.push(in);
	                break;
	            case 2:
	                s.pop();
	                break;
	            case 3:
	                s.peek();
	                break;
	            case 4:
	                System.out.println(s.isEmpty());
	                break;
	            case 5:
	                s.display();
	                break;
	            case 6:
	            	in.close();
	            	return;
	            default:
	            	System.out.println("Invalid Choice");
	        }
	    }

	}
}
