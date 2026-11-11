package exception;

import java.util.Scanner;

class PhNumberNotValidException extends Exception{

	PhNumberNotValidException(String string) {
		super(string);
	}
	
	
}

class StoreData {
	void display(String phno) throws PhNumberNotValidException {
		if(phno.length()!=10) {
			throw new PhNumberNotValidException("The Phno is not valid");
		}else {
			System.out.println("Phone Number is Valid");
		}
	}
}

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		StoreData sd = new StoreData();

		try {
			System.out.println("Enter your Phone Number:");
			String phno = sc.next();
			sd.display(phno);	
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
