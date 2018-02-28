package Chap2Quiz;
import java.util.Scanner;
public class scanning {
	public static void main(String[] args) {
		Scanner s = new Scanner ( System.in );
		// total price
		// down payment
		// length of loan
		// interest rate for loan
		System.out.print("Enter Total Price: ");
	      double totalPrice = s.nextDouble();
	      System.out.print("Enter Down Payment: ");
	      double downPayment = s.nextDouble();
	      System.out.print("Enter Length of Loan (in months): ");
	      double loanLengthMonths = s.nextDouble();
	      System.out.print("Enter Interest Rate for Loan (.00 to 1): ");
	      double interestRate = s.nextDouble();
	      
	      calculationMethods yourCar = new calculationMethods();     
	      System.out.println("Monthly Payment Amount is: $" + yourCar.monthlyPayment(totalPrice, downPayment, interestRate, loanLengthMonths));
	      System.out.println("Total Spent on Interest Is: $" + yourCar.spentOnInterest(totalPrice, downPayment, interestRate, loanLengthMonths));
	}
}
