package console;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Customer cus = new Customer();
		Product pr = new Product();
		Bill bill = new Bill();
		while(true) {
			System.out.println("1. Create Customer \n2.Display Customer \n3.Get Customer By Id \n4.Create Product \n5.Display Product \n6.Get Product By Id \n7.Create Bill \n8.Display Bill");
			System.out.print("Enter your choice:");
			int ch = sc.nextInt();
			
			switch(ch) {
			case 1:
				cus.createCustomer();
				break;
			case 2:
				cus.displayCustomer();
				break;
			case 3:
				cus.getCustomerById();
				break;
			case 4:
				pr.createProduct();
				break;
			case 5:
				pr.displayProduct();
				break;
			case 6:
				pr.getProductById();
				break;
			case 7:
				bill.createBill(pr);
				break;
			case 8:
				bill.displayBill(pr);
				break;
			}
			
		}
		
		//sc.close();

	}

}
