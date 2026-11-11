package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.CustomerModel;
import services.CustomerService;

public class CustomerController implements CustomerService {

	int id = 0;
	ArrayList<CustomerModel> cusArr = new ArrayList<>(); 
	CustomerModel cm = new CustomerModel();
	
	public void createCustomer() {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Customer Name:");
		String name = in.nextLine();
		System.out.print("Enter the Customer Mail Id:");
		String mailId = in.nextLine();
		
		CustomerModel cm = new CustomerModel(name,mailId,id);
		cusArr.add(cm);
		id++;	
		
		System.out.println("Customer Added Successfully");
	}

	public void displayCustomer() {
		
		for(CustomerModel data : cusArr) {
			System.out.println("Customer Id: " + data.getCusId());
			System.out.println("Customer Name: " + data.getCusName());
			System.out.println("Customer Mail Id: " + data.getCusMailId());
			
		}
	}
		
	public void updateCustomer() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the Cutomer Id to update: ");
		int id = in.nextInt();
		
		System.out.println("1. Change Name \n2. Change MailId \n3. Change Name and MailId");
		System.out.print("Enter your choice: ");
		int ch = in.nextInt();
		in.nextLine();
		
		switch(ch) {
			case 1:
				changeName();
				break;
			case 2:
				changeMailId();
				break;
			case 3:
				changeName();
				changeMailId();
				break;
			}
		}
		
	public void deleteCustomer() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the customer id:");
		int id = in.nextInt();
		
		int index=0;
		for(CustomerModel data : cusArr) {
			if(data.getCusId()==id) {
				cusArr.remove(index);
				System.out.println("Customer Removed Successfully");
				break;
			}
			index++;
		}
	}
		
	public void changeName() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the name:");
		String name = in.nextLine();
		cusArr.get(id).setCusName(name);
	}
	
	public void changeMailId() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the mail id:");
		String mailId = in.nextLine();
		cusArr.get(id).setCusMailId(mailId);
	}
	
	
		
}
