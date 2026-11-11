package console;

import java.util.Scanner;

public class Bill {

	int billId;
	int cusId;
	int proCount;
	int grandTotal;
	BillProduct bp;
	Bill[] billArr = new Bill[100];
	
	int index=0;
	
	Bill(){
		
	}
	
	Bill(int billId,int cusId,int n,BillProduct billPro){
		this.billId = billId;
		this.cusId = cusId;
		this.proCount = n;
		this.bp = billPro;
	}
	
	void createBill(Product pr) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Customer Id:");
		int cId = in.nextInt();
		System.out.print("Enter the number of products:");
		int n = in.nextInt();
		
		BillProduct billPro = new BillProduct();
		for(int i=0;i<n;i++) {
			System.out.print("Enter the Product Id: ");
			int pId = in.nextInt();
			System.out.print("Enter the Product Quantity: ");
			int pQuan = in.nextInt();
			pr.proArr[pId].proStock -= pQuan;
			BillProduct bplist = new BillProduct(pId,pQuan);
			billPro.billProArr[i] = bplist;
		}
		
		Bill bill = new Bill(index,cId,n,billPro);
		billArr[index++] = bill;
	}
	
	void displayBill(Product pr) {
		for(int i=0;i<index;i++) {
			System.out.println("Bill Id: " + billArr[i].billId);
			System.out.println("Customer Id: " + billArr[i].cusId);
			for(int j=0;j<billArr[i].proCount;j++) {
				System.out.println("Product " + j+1 );
				int id = billArr[i].bp.billProArr[j].proId;
				int quantity = billArr[i].bp.billProArr[j].proQuan;
				System.out.println("Product ID: " + id);
				System.out.println("Product Name: " + pr.proArr[id].proName);
				int totalCost = quantity * pr.proArr[id].proPrice;
				System.out.println("Product Price: " + totalCost);
				
			}
		}
	}

}

class BillProduct{
	
	int proId;
	int proQuan;
	
	BillProduct[] billProArr = new BillProduct[100];
	
	BillProduct(){
		
	}
	
	BillProduct(int pId,int pQuan){
		this.proId = pId;
		this.proQuan = pQuan;
	}
	
	
}
