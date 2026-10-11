package stack;

import java.util.Scanner;

class StackImplement{
	
	int[] stack = new int[3];
    int top = -1;
    int n = stack.length;
    
    public void push(Scanner in){
        
        if(top>=n-1){
            System.out.println("Stack OverFlow");
        }else{
        	System.out.print("Enter the value:");
            stack[++top] = in.nextInt();
        }
    }
    
    public void pop(){
        
        if(top==-1){
            System.out.println("Stack UnderFlow");
        }else{
            int val = stack[top--];
            System.out.println("Popped Element: " + val);
        }
    }
    
    public void peek(){
        if(isEmpty()){
            System.out.println("Stack UnderFlow");
        }else{
            int val = stack[top];
            System.out.println("Top Element: " + val);
        }
    }
    
    public boolean isEmpty(){
        return top==-1;
    }
    
    public void display(){
    	if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
    	
        for(int i=top;i>=0;i--){
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}

public class StackImplementation {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    StackImplement s = new StackImplement();
	    
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
