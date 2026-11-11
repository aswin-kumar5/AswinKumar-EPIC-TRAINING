package linkedlist.doubly;

import java.util.Scanner;

class DNode{
    
    DNode prev;
    int data;
    DNode next;
    
    DNode head = null,tail=null;
    
    public DNode(DNode prev,int data,DNode next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
    
    public DNode(){
        
    }
    
    public void insertNode(Scanner in){
        System.out.println("Enter number of data to be inserted:");
        int n = in.nextInt();
        
        for(int i=1;i<=n;i++){
            
            int val = in.nextInt();
            
            DNode node = new DNode(null,val,null);
            
            if(head==null){
                head = node;
            }else{
                tail.next = node;
                node.prev = tail;
            }
            tail = node;
            
        }
    }
    
    public void insertInHead(int val){
        
        DNode node = new DNode(null,val,head);
        if(head == null) {
        	tail = node;
        }else {
        	head.prev = node;
        }
        head = node;
    }
    
    public void insertInMiddle(int val,DNode temp){
        
        DNode node = new DNode(temp,val,temp.next);
        temp.next.prev = node;
        temp.next = node;
    }
    
    public void insertInTail(int val){
        
        DNode node = new DNode(tail,val,null);
        if(tail == null) {
        	head = node;
        }else {
        	tail.next = node;
        }
        tail = node;
    }
    
    public void insertNodeByPosition(Scanner in){
        System.out.println("Enter the value: ");
        int val = in.nextInt();
        System.out.println("Enter the position: ");
        int pos = in.nextInt();
        
        if(pos<=0) {
        	System.out.println("Invalid Position");
        	return;
        }
        
        if(pos==1) {
        	insertInHead(val);
        	return;
        }
        
        DNode temp = head;
         
        for(int i=0;i<pos-2 && temp!=null;i++){
        	temp = temp.next;
        }
        
        if(temp==null) {
        	System.out.println("Invalid Position");
        }else if(temp.next==null) {
        	insertInTail(val);
        }else {
        	insertInMiddle(val,temp);
        }
        
    }
    
    public void deleteNodeInHead(){
    	if(head.next==null) {
    		head=null;
    		tail=null;
    	}else {
	        head.next.prev = null;
	        head = head.next;
    	}
    }
    
    public void deleteNodeInMiddle(DNode temp){
        
        temp.next.next.prev = temp.next.prev;
        temp.next = temp.next.next;
        
    }
    
    public void deleteNodeInTail(){
    	if(tail.prev==null) {
    		head=null;
    		tail=null;
    	}else {
    		tail = tail.prev;
    		tail.next = null;
    	}
    }
    
    public void deleteNodeByPosition(Scanner in){
        
        System.out.println("Enter the position: ");
        int pos = in.nextInt();
        
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        
        if(pos<=0) {
        	System.out.println("Invalid Position");
        	return;
        }
        
        if(pos==1) {
        	deleteNodeInHead();
        	return;
        }
        
       
        DNode temp = head;
        
        for(int i=0;i<pos-2 && temp!=null;i++){
        	temp = temp.next;
        }
        
        if(temp==null || temp.next==null) {
        	System.out.println("Invalid Position");
        }else if(temp.next.next==null) {
        	deleteNodeInTail();
        }else {
        	deleteNodeInMiddle(temp);
        }
    }
    
    public void displayData(){
    	
    	if (head == null) {
            System.out.println("List is empty");
            return;
        }
    	
        DNode temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    
    public void displayDataInReverse(){
    	if (head == null) {
            System.out.println("List is empty");
            return;
        }
    	
        DNode temp = tail;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.prev;
        }
    }
    
}

public class DoublyLinkedList{
	public static void main(String[] args) {
	    
	    Scanner in = new Scanner(System.in);
	    DNode li = new DNode();
	    
	    while(true){
	        System.out.println("1. Insert a Node \n2. Insert Node by Position \n3. Delete Node by Position \n4. Display Data \n5. Display Data in Reverse \n6. Exit");
	        System.out.print("Enter Your Choice:");
	        int ch = in.nextInt();
	        
	        switch(ch){
	            case 1:
	                li.insertNode(in);
	                break;
	            case 2:
	                li.insertNodeByPosition(in);
	                break;
	            case 3:
	                li.deleteNodeByPosition(in);
	                break;
	            case 4:
	                li.displayData();
	                break;
	            case 5:
	                li.displayDataInReverse();
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

