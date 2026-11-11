package numbers;

import java.util.Scanner;

public class Lcm {

	
	static int gcd(int a, int b ) {
		
		while(a!=0 && b!=0) {
			if(a>b) {
				a=a%b;
			}else {
				b=b%a;
			}
		}
		
		return (a!=0)?a:b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println((a*b)/gcd(a,b));
		
		
		sc.close();
	}
}
