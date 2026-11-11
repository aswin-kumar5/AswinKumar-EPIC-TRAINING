package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.ProductModel;

public class ProductController {

	int id = 0;
	ArrayList<ProductModel> proArr = new ArrayList<>();
	
	public void createProduct() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the Product Name: ");
		String name = in.nextLine();
		System.out.print("Enter the Product Price: ");
		int price = in.nextInt();
		System.out.print("Enter the Product Stcok: ");
		int stock = in.nextInt();
		
		ProductModel pm = new ProductModel(name,price,stock,id);
		proArr.add(pm);
		id++;
		
		System.out.println("Product Created Successfully");
	}
	
	public void displayProduct() {
		for(ProductModel data : proArr) {
			System.out.println("Product Id: " + data.getProId());
			System.out.println("Product Name: " + data.getProName());
			System.out.println("Product Price: " + data.getProPrice());
			System.out.println("Product Stock: " + data.getProStock());
		}
	}
	
}
