package how.to.use.eclipse;
// THIS PROGRAMME CREATE A MORTGAGE CALCULATOR THAT CALCULATE MORTGAGES.
import java.util.Scanner;
import java.text.NumberFormat;

public class MortgageCalculator {

	public static void main(String[] args) {
		final byte Months_In_years = 12;
		final byte Percent = 100;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Principal:");
		int principal = input.nextInt();
		
		System.out.print("Annual Interest Rate:");
		float annualInterest = input.nextFloat();
		float monthlyInterest = annualInterest/Percent/Months_In_years;
		
		System.out.print("Period (Years):");
		byte years = input.nextByte();
		int numberOfPayments = years * Months_In_years;
		
		double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)) / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
		
		String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
		System.out.printf("Your monthly mortgage is:" +  mortgageFormatted);	
		
	}
	
}
	

