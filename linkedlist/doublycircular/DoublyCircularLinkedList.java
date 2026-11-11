package linkedlist.doublycircular;

import java.util.Scanner;

class DCNode{
    
    DCNode prev;
    int data;
    DCNode next;
    
    DCNode head = null,tail=null;
    
    public DCNode(DCNode prev,int data,DCNode next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
    
    public DCNode(){
        
    }
    
    public void insertNode(Scanner in){
        System.out.println("Enter number of data to be inserted:");
        int n = in.nextInt();
        
        for(int i=1;i<=n;i++){
            
            int val = in.nextInt();
            
            DCNode node = new DCNode(null,val,null);
            
            if(head==null){
                head = node;
            }else{
                tail.next = node;
                node.prev = tail;
            }
            tail = node;
            tail.next = head;
            head.prev = tail;
            
        }
    }
    
    public void insertInHead(int val){
        
        DCNode node = new DCNode(tail,val,head);
        head.prev = node;
        head = node;
        tail.next = head;
        
    }
    
    public void insertInMiddle(int val,DCNode temp){

        DCNode node = new DCNode(temp,val,temp.next);
        temp.next.prev = node;
        temp.next = node;
        
    }
    
    public void insertInTail(int val){
        
        DCNode node = new DCNode(tail,val,head);
        tail.next = node;
        tail = node;
        head.prev = tail;
        
    }
    
    public void insertNodeByPosition(Scanner in){
        System.out.println("Enter the value: ");
        int val = in.nextInt();
        System.out.println("Enter the position: ");
        int pos = in.nextInt();
        boolean flag = true;
        DCNode temp = head;
        
        for(int i=0;i<pos-2;i++){
            if(temp.next!=head){
                temp = temp.next;
            }else{
                flag = false;
                break;
            }
        }
        
        if(flag){
            if(pos==1){
                insertInHead(val);
            }else if(temp.next==head){
                insertInTail(val);
            }else{
                insertInMiddle(val,temp);
            }
        }else{
            System.out.println("Invalid Position");
        }
    }
    
    public void deleteNodeInHead(){
        head.next.prev = tail;
        head = head.next;
        tail.next = head;
    }
    
    public void deleteNodeInMiddle(DCNode temp){
        temp.next.next.prev = temp.next.prev;
        temp.next = temp.next.next;
    }
    
    public void deleteNodeInTail(){
        tail.prev.next = head;
        tail = tail.prev;
        head.prev = tail;
        
    }
    
    public void deleteNodeByPosition(Scanner in){
        
        System.out.println("Enter the position: ");
        int pos = in.nextInt();
        
        boolean flag = true;
        DCNode temp = head;
        
        for(int i=0;i<pos-2;i++){
            if(temp.next.next!=head){
                temp = temp.next;
            }else{
                flag = false;
                break;
            }
        }
        
        if(flag){
            if(pos==1){
                deleteNodeInHead();
            }else if(temp.next.next == head){
                deleteNodeInTail();
            }else{
                deleteNodeInMiddle(temp);
            }
        }else{
            System.out.println("Invalid Position");
        }
    }
    
    public void displayData(){
        DCNode temp = head;
        do{
            System.out.println(temp.data);
            temp = temp.next;
        }while(temp!=head);
    }
    
    public void displayDataInReverse(){
        DCNode temp = tail;
        do{
            System.out.println(temp.data);
            temp = temp.prev;
        }while(temp!=tail);
    }
    
}

public class DoublyCircularLinkedList {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	    DCNode li = new DCNode();
	    
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
