package console;

import java.util.Scanner;

public class Product {
	
		int proId;
	    String proName;
	    int proPrice;
	    int proStock;
	    Product[] proArr = new Product[100];
	    
	    int index = 0;
	    
	    Product(){
	        
	    }
	    
	    Product(int proId,String proName,int proPrice,int proStock){
	    	this.proId = proId;
	        this.proName = proName;
	        this.proPrice = proPrice;
	        this.proStock = proStock;
	    }
	        
	    void createProduct(){
	        Scanner in = new Scanner(System.in);
	        System.out.print("Enter the Product name:");
	        String name = in.nextLine();
	        System.out.print("Enter the Product price:");
	        int price = in.nextInt();
	        System.out.print("Enter the Product stock:");
	        int stock = in.nextInt();
	        Product pro = new Product(index,name,price,stock);
	        proArr[index++] = pro ;
	        
	        System.out.println("Product Created Successfully");
	        
	    }
	    
	    void displayProduct(){
	        for (int i = 0; i < index ;i++){
	            System.out.println("Product ID: " + i);
	            System.out.println("Product Name: " + proArr[i].proName);
	            System.out.println("Product Price: " + proArr[i].proPrice);
	            System.out.println("Product Stock: " + proArr[i].proStock);
	        }
	    }
	    
	   void getProductById(){
	        Scanner in = new Scanner(System.in);
	        System.out.print("Enter Product ID :");
	        int id = in.nextInt();
	        if(id >= 0 && id < index){
	            System.out.println("Name: "+ proArr[id].proName);
	            System.out.println("Price: "+ proArr[id].proPrice);
	            System.out.println("Stock: " + proArr[id].proStock);
	        }else{
	            System.out.println("Product not Found");
	        }
	       
	   }
}