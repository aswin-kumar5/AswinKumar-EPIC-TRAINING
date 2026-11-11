package console;

abstract class Payment{
	int tId;
	String cusName;
	double amount;
	
	Payment(int id, String name, int amount){
		this.tId = id;
		this.cusName = name;
		this.amount = amount;
	}
	
	void paymentDetails() {
		System.out.println("Transaction Id: " + this.tId);
		System.out.println("Customer Name: " + this.cusName);
		System.out.println("Amount: " + this.amount);
	}
	
	abstract boolean validatePayment();
	abstract void processPayment();
	abstract void calculateTransactionFee();
	abstract void cashback();
	abstract void finalAmount();
}

class CreditCardPayment extends Payment  {
	
	String cardNo;
	double transFee;
	double cashback;
	double finalAmnt;
	
	CreditCardPayment(int tid, String name, int amount,String cardNo) {
		super(tid, name, amount);
		this.cardNo = cardNo;
	}
	
	@Override
	boolean validatePayment() {
		if(cardNo.length()==20) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	void processPayment() {
		if(validatePayment()) {
			this.calculateTransactionFee();
			this.cashback();
			this.finalAmount();
		}else {
			System.out.println("Invalid Card Number");
		}
	}
	
	@Override
	void calculateTransactionFee() {
		this.transFee = (2.0/100) * amount;
	}
	
	@Override
	void cashback() {
		this.cashback = (5.0/100) * amount;
	}
	
	@Override
	void finalAmount() {
		this.finalAmnt=amount+transFee-cashback;
		System.out.println("Final Amount: " + finalAmnt);
	}
}

class UpiPayment extends Payment{

	String upiId;
	double transFee;
	double cashback;
	double finalAmnt;
	
	UpiPayment(int id, String name, int amount,String upiId) {
		super(id, name, amount);
		this.upiId = upiId;
	}
	
	boolean validatePayment() {
		if(upiId.length()==12) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	void processPayment() {
		if(validatePayment()) {
			this.calculateTransactionFee();
			this.cashback();
			this.finalAmount();
		}else {
			System.out.println("Invalid Card Number");
		}
	}
	
	@Override
	void calculateTransactionFee() {
		this.transFee = (0.5/100) * amount;
	}
	
	@Override
	void cashback() {
		this.cashback = (2.0/100) * amount;
	}
	
	
	@Override
	void finalAmount() {
		this.finalAmnt = amount+transFee-cashback;
		System.out.println("Final Amount: " + finalAmnt);
	}
}

class NetBanking extends Payment{

	String accNo;
	double transFee;
	double cashback;
	double finalAmnt;
	
	NetBanking(int id, String name, int amount,String accNo) {
		super(id, name, amount);
		this.accNo = accNo;
	}
	
	@Override
	boolean validatePayment() {
		if(accNo.length()==12) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	void processPayment() {
		if(validatePayment()) {
			this.calculateTransactionFee();
			this.cashback();
			this.finalAmount();
		}else {
			System.out.println("Invalid Card Number");
		}
	}
	
	@Override
	void calculateTransactionFee() {
		this.transFee = (1.0/100) * amount;
	}
	
	@Override
	void cashback() {
		this.cashback = (1.0/100) * amount;
	}
	
	
	@Override
	void finalAmount() {
		this.finalAmnt = amount+transFee-cashback;
		System.out.println("Final Amount: " + finalAmnt);
	}
}


public class Ecommerce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Payment ccp = new CreditCardPayment(1,"Aswin",100,"12345678901234567890"); 
		Payment upi = new UpiPayment(2,"Sanjay",100,"123456789012");
		Payment nb = new NetBanking(3,"Mohith",100,"123456789012");
		
		ccp.paymentDetails();
		ccp.processPayment();
		
		upi.paymentDetails();
		upi.processPayment();
		
		nb.paymentDetails();
		nb.processPayment();
		

	}

}
