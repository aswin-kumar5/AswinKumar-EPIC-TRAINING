package threads;

class BankAccount{
	
	float balance = 1000;
	
	void deposit(int amnt) {
		balance += amnt;
	}
	
	void withdraw(int amnt) {
		balance -= amnt;
	}
	
	void displayBalance() {
		System.out.println("Your Account Balance is " + balance);
	}	
}

class DepositThread extends Thread{
	
	BankAccount ba;
	
	DepositThread(BankAccount ba){
		this.ba = ba;
	}
	
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				
			}
			
			ba.deposit(1000);
		}
	}
}

class WithdrawTask implements Runnable{

	BankAccount ba;
	
	WithdrawTask(BankAccount ba){
		this.ba = ba;
	}
	
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				
			}
			ba.withdraw(500);
		}
	}
}


public class BankTransactionSystem {

	public static void main(String[] args) throws InterruptedException {
		
		BankAccount ba = new BankAccount();
		DepositThread dt = new DepositThread(ba);
		WithdrawTask wt = new WithdrawTask(ba);
		
		Thread t1 = new Thread(wt);
		
		dt.start();
		t1.start();
		dt.join();
		t1.join();
		
		ba.displayBalance();
		
	}
}
