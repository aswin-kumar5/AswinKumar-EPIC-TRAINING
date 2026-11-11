package bitmanipulation;

public class CheckPower2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=0,count=0;
		
		while(n>0) {
			n = n & (n-1);
			count++;
		}
		
		if(count==1) {
			System.out.println("It's a power of 2");
		}
		else {
			System.out.println("Not a power of 2");
		}
		
		//Alternate way
		/* 
			if(n>0 && n!=0 && ((n&(n-1))==0)){
            	return true;
        	}
        	return false;
        */
		
		
	}
}
