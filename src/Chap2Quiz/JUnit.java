package Chap2Quiz;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class JUnit {

	@Test
	void test() {
			calculationMethods a = new calculationMethods();
			if ((a.monthlyPayment(35000.0, 0, .1, 60.0) > 700.0 && (a.monthlyPayment(35000.0, 0, .1, 60.0) < 800)))
			{
				
			}
			else
			{
				System.out.println("test 1 failed");
			}
			
			if ((a.spentOnInterest(35000.0, 0, .1, 60.0) > 9000.0 && (a.spentOnInterest(35000.0, 0, .1, 60.0) < 10000.0)))
			{
				
			}
			else
			{
				System.out.println("test 2 failed");
			}
	}
}
