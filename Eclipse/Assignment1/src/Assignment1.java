
import java.util.Scanner;
public class Assignment1 {
	public static void main(String[] args){
		
		double payment, balance;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Pleane Enter Your Monthly Mortgage Payment:");
		payment = keyboard.nextInt();
		System.out.println("Now Enter the Amount You still owe: ");
		balance = keyboard.nextInt();
		
		System.out.print("Your Montly Payment is "+ "$" + payment );
		System.out.println(", and your Balance is "+ "$" + balance );
		
		
		balance = (double) (balance * 0.0749 / 12.00);
		payment = payment - balance;
		
		System.out.println("Amount of Interests You Pay on Each Payment: "+ "$" + balance );
		
		System.out.println("The amount that Goes to Principle:" + "$" + payment  );
		
	}

}
