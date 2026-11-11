package console;

import java.util.Scanner;

public class Customer {
	
	int cusId;
	String cusName;
	String cusPhno;
	int cusAge;
	
	int index=0;
	
	Customer[] cusArr = new Customer[100];
	
	Customer() {
	
	}
	
	Customer(int id,String name, String phno, int age){
		this.cusId = id;
		this.cusName = name;
		this.cusPhno = phno;
		this.cusAge = age;
	}
	
	void createCustomer() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter Customer Name:");
		String name = in.nextLine();
		System.out.print("Enter Customer Phone no:");  
		String phno; 
		while(true) {
			phno = in.nextLine();
			try {
				if(phno.length()!=10) {
					throw new Exception();
				}
				else {
					break;
				}
			}catch(Exception e) {
				System.out.println("Enter the valid phno:");
			}
		}
		
		System.out.print("Enter Customer Age:");
		int age;
		while(true) {
			 age = in.nextInt();
			try {
				if(age>18) {
					throw new ArithmeticException();
				}
				else {
					break;
				}
			}catch(Exception e) {
				System.out.println("Enter the Valid Age:");
			}
		}
		Customer cus = new Customer(index,name,phno,age);	
		cusArr[index++] = cus;
		
		System.out.println("Customer Created Successfully");
	}
	
	void displayCustomer() {
		for(int i=0;i<index;i++) {
			System.out.println("Customer Id: " + cusArr[i].cusId); 
            System.out.println("Name: "+ cusArr[i].cusName);
            System.out.println("Ph No: "+ cusArr[i].cusPhno);
            System.out.println("Age: "+ cusArr[i].cusAge);
		}
	}
	
	void getCustomerById() {
		 Scanner in = new Scanner(System.in);
	        System.out.print("Enter Product ID :");
	        int id = in.nextInt();
	        if (id >= 0 && id < index){
	        	System.out.println("Customer Id: " + cusArr[id].cusId); 
	            System.out.println("Name: "+ cusArr[id].cusName);
	            System.out.println("Ph No: "+ cusArr[id].cusPhno);
	            System.out.println("Age: "+ cusArr[id].cusAge);
	        }else{
	            System.out.println("Customer not Found");
	        }
	}

}




