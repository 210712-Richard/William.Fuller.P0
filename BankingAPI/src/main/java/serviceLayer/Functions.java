package serviceLayer;

import java.util.Scanner;

public class Functions{
	int balance= 0;
	int withdrawlAmt=0;
	int depositAmt= 0;		
	static int newBalance = 0;
	static Scanner inputMoney = new Scanner(System.in);
	
		public static void main(String[]args) {
			
			deposit(40,0);
			withdraw(3, 40);
		 
	}
		

	
		
		public static int deposit( int depositAmt,int balance) {
			
			System.out.println("How much would you like to deposit");
			System.out.println("you deposited: $" + depositAmt);
			System.out.println("New Balance:$" + (depositAmt+balance));
			return newBalance = (int) (depositAmt + balance);
		}
		
		public static int withdraw( int withdrawlAmt, int balance) {
			
			System.out.println("how much would you like to withdraw");
			System.out.println("You withdrew: $" + withdrawlAmt);
			System.out.println ("New Balance:$" +(balance - withdrawlAmt));
			return newBalance = (int)(balance-withdrawlAmt);
			
		
	}
		
}
