package tree;

import java.util.Scanner;

class Tree{
    
    int data;
    Tree left;
    Tree right;
    
    static Tree root = null;
    
    public Tree(Tree left,int data,Tree right){
        this.left = left;
        this.data = data;
        this.right = right;
    }
    
    public Tree(){
        
    }
    
    public void insertNode(Scanner in){
        
        System.out.println("Enter number of data to be inserted:");
        int n = in.nextInt();
        
        for(int i=1;i<=n;i++){
            int val = in.nextInt();
            
            Tree node = new Tree(null,val,null);
            
            if(root == null){
                root = node;
            }else{
                Tree temp = root;
                
                while(true){
                    if(val<temp.data){
                        if(temp.left == null){
                            temp.left = node;
                            break;
                        }
                        temp = temp.left;
                    }else{  
                        if(temp.right == null){
                            temp.right = node;
                            break;
                        }
                        temp = temp.right;
                    }
                }
            }
        }
    }
    
    public void displayData(Tree root){
        if(root==null){
            return ;
        }
        System.out.print(root.data + " ");
        displayData(root.left);
        displayData(root.right);
    }
    
    public Tree searchNode(int val,Tree temp){
        while(temp!=null){
            if(val==temp.data){
                return temp;
            }else if(val<temp.data){
                temp = temp.left;
            }else{
                temp = temp.right;
            }
        }
        
        return null;
    }
    
    public Tree searchParentNode(int val,Tree temp) {
    	Tree parentNode = null;
    	while(temp!=null) {
    		if(val==temp.data){
                parentNode = temp;
                break;
            }else if(val<temp.data){
            	parentNode = temp;
                temp = temp.left;
            }else{
            	parentNode = temp;
                temp = temp.right;
            }
    	}
    	
    	return parentNode;
    }
    
    public void deleteLeafNode(Tree node,Tree parentNode) {
    	if(parentNode.left==node) {
    		parentNode.left = null;
    	}else {
    		parentNode.right = null;
    	}
    }
    
    public void rightToLeftTemplate(Tree node,Tree parentNode) {
    	
    	Tree deleteNode = node;
    	
    }
    
    public void deleteNode(Scanner in){
        System.out.println("Enter number to be deleted:");
        int val = in.nextInt();
        
        Tree node = searchNode(val,root);
        Tree parentNode = searchParentNode(val,root); 
        		
        if(node == null){
            System.out.println("Element Not Found");
            return;
        }
         
        if(node.right==null && node.left==null) {
        	
        	// no child
        	deleteLeafNode(node,parentNode);
        	System.out.println("Leaf Node Deleted");
        	
        }else if(node.right!=null && node.left!=null) {
        	
        	// two child
        	
        	
        }else {
        	
        	// single child
        	if(paren)
        	
        }
        
        
    }
}

public class Main
{
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Tree tr = new Tree();
		
		 while(true){
	        System.out.println("1. Insert a Node \n2. Delete Node \n3. Display Data");
	        System.out.print("Enter Your Choice:");
	        int ch = in.nextInt();
	        
	        switch(ch){
	            case 1:
	                tr.insertNode(in);
	                break;
	            case 2:
	                tr.deleteNode(in);
	                break;
	            case 3:
	                tr.displayData(Tree.root);
	                System.out.println();
	                break;
	        }
	    }
	}
}

