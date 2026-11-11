package billing;

import java.util.Scanner;

import controller.CustomerController;
import controller.ProductController;
import services.CustomerService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		CustomerService cc = new CustomerController();
		ProductController pc = new ProductController();
		
		while(true) {
			System.out.println("1. Create Customer \n2. Display Customer \n3. Update Customer \n4. Display Customer \n5. Create Product \n6. Display Product");
			System.out.println("Enter Your Choice: ");
			int ch = in.nextInt();
			
			switch(ch) {
			case 1:
				cc.createCustomer();
				break;
			case 2:
				cc.displayCustomer();
				break;
			case 3:
				cc.updateCustomer();
				break;
			case 4:
				cc.deleteCustomer();
				break;
			case 5:
				pc.createProduct();
				break;
			case 6:
				pc.displayProduct();
				break;
			}
		}
		
	}
}
