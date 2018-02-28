package Chap2Quiz;

public class calculationMethods {

	public double monthlyPayment(double totalPrice, double downPayment, double interestRate, double loanLengthMonths)
	{
		return ((totalPrice - downPayment)*
				((interestRate/12)*Math.pow((1 + (interestRate/12)), loanLengthMonths))) /
				(Math.pow(1 + (interestRate/12), loanLengthMonths) - 1);
	}
	public double spentOnInterest(double totalPrice, double downPayment, double interestRate, double loanLengthMonths)
	{
		return loanLengthMonths * monthlyPayment(totalPrice, downPayment, interestRate, loanLengthMonths) - (totalPrice - downPayment);
	}
}
// total price
// down payment
// length of loan
// interest rate for loan