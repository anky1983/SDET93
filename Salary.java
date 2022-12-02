package assignments;

import java.util.Scanner;

public class Salary {
double basicPay, boa, bonus, pf, monthlyGross, yearlyGross, monthlyTax, monthlyTakeHome;
int taxRate;
char typeTaxRate;

public Salary(double basPay, double b_o_a, double bon, char tyTaxRate) {
	basicPay = basPay;
	boa = b_o_a;
	bonus = bon;
	typeTaxRate = tyTaxRate;
}

//Calculate tax rate and monthly take home pay salary
public void calcMonthlyTakeHomeSalary() 
{
	
	//Calculate PF
	pf = basicPay * 0.12;
	
	//Calculate monthly gross salary
	monthlyGross = basicPay - pf;
	
	//Calculate yearly gross
	yearlyGross = monthlyGross * 12;
	
	//Calculate tax rate and monthly tax
	if(yearlyGross <= 250000)
		taxRate = 0;
	else if(yearlyGross > 250000 && yearlyGross <= 500000)
		taxRate = 5;
	else if(yearlyGross > 500000 && yearlyGross <= 750000) 
	{
		if(typeTaxRate == 'E')
			taxRate = 20;
		else if(typeTaxRate == 'N')
			taxRate = 10;
	}
	else if(yearlyGross > 750000 && yearlyGross <= 1000000) 
	{
		if(typeTaxRate == 'E')
			taxRate = 20;
		else if(typeTaxRate == 'N')
			taxRate = 15;
	}
	else if(yearlyGross > 1000000 && yearlyGross <= 1250000) 
	{
		if(typeTaxRate == 'E')
			taxRate = 30;
		else if(typeTaxRate == 'N')
			taxRate = 20;
	}
	else if(yearlyGross > 1250000 && yearlyGross <= 1500000) 
	{
		if(typeTaxRate == 'E')
			taxRate = 30;
		else if(typeTaxRate == 'N')
			taxRate = 25;
	}
	else if(yearlyGross >1500000)
		taxRate = 30;
	
	monthlyTax = yearlyGross*taxRate/12;
	
	//Calculate monthly take home salary
	monthlyTakeHome = monthlyGross - monthlyTax;
	System.out.println("The monthly take home salary for is: " + monthlyTakeHome);
}

public static char getTypeTaxRate() {
	Scanner input = new Scanner(System.in);
	System.out.println(" Type E for existing tax rate and N for new tax rate: ");
	char tyTaxRa = input.next().charAt(0);
	return tyTaxRa;
}
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Employee level 1:");
	char tyTaxRate1 = getTypeTaxRate();
	Salary EmpLev1 = new Salary(7000, 5000, 2000,tyTaxRate1);
	EmpLev1.calcMonthlyTakeHomeSalary();
	
	System.out.println();
	System.out.println("Employee level 2:");
	char tyTaxRate2 = getTypeTaxRate();
	Salary EmpLev2 = new Salary(10000, 7000, 2500, tyTaxRate2);
	EmpLev2.calcMonthlyTakeHomeSalary();
	
	System.out.println();
	System.out.println("Employee level 3:");
	char tyTaxRate3 = getTypeTaxRate();
	Salary EmpLev3 = new Salary(12000, 9000, 3000, tyTaxRate3);
	EmpLev3.calcMonthlyTakeHomeSalary();
	
	System.out.println();
	System.out.println("Employee level 4:");
	char tyTaxRate4 = getTypeTaxRate();
	Salary EmpLev4 = new Salary(15000, 10000, 3500, tyTaxRate4);
	EmpLev4.calcMonthlyTakeHomeSalary();

}
}
