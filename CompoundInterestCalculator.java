import java.util.Scanner;
public class CompoundInterestCalculator{
	public static void main(String[] args){
	Scanner entries = new Scanner(System.in);
	System.out.println("Compound Interest Calculator");
	System.out.println();
	System.out.print("Enter initial Investment: ");
	double initialInvestment =  entries.nextDouble();
	System.out.print("Enter Monthly Contribution: ");
	double MonthlyContribution =  entries.nextDouble();
	System.out.print("Enter Length of Time in Year: ");
	double TimeinYear =  entries.nextDouble();
	System.out.print("Enter Interest Rate in percentage: ");
	double InterestRatePerc =  entries.nextDouble();
	
	double compound = 0;
	double InterestRate= InterestRatePerc / 100;
	int plan = 0;

do{
	System.out.print("""
	
		COMPOUND FREQUENCY PLAN

1. Daily
2. Weekly
3. Monthly
4. Quarterly
5. Half a year
6. A year


""");
	double initial = 0;
	double numberOFMonthINYear= 12 *TimeinYear;
	double total = 0;
	double rN = 0;
	double power = 0;
	double math =0;
	double contributionPower = 0;
	double contributionSubstraction = 0;
	double contributionDivision = 0;
	double contribution = 0;
	double totalContributions = 0;
	double compoundInterest = 0;
	System.out.print("pick a plan: ");
 plan = entries.nextInt();
	switch(plan){
		case 1:
	System.out.println("Daily");
	compound = 365;
	rN = InterestRate / compound;
	power = compound *TimeinYear;
	math = 1 + rN;
	initial = initialInvestment * Math.pow(math, power);
	System.out.println("Growth of the Initial Investment: "+initial);
	contributionPower =  Math.pow(math, compound*TimeinYear);
	contributionSubstraction = contributionPower - 1;
	contributionDivision = contributionSubstraction / rN;
	contribution = MonthlyContribution * contributionDivision;
	System.out.println("Growth of Monthly Contributions: "+contribution);
	total = initial + contribution;
	System.out.println("Total Amount: "+total);
	totalContributions = MonthlyContribution * numberOFMonthINYear;
	compoundInterest = total - initialInvestment - totalContributions;
	System.out.println("Compound Interest: "+compoundInterest);
	

		break;
		case 2:
	System.out.println("Weekly");
	compound = 52;
	rN = InterestRate / compound;
	power = compound *TimeinYear;
	math = 1 + rN;
	initial = initialInvestment * Math.pow(math, power);
	System.out.println("Growth of the Initial Investment: "+initial);
	contributionPower =  Math.pow(math, compound*TimeinYear);
	contributionSubstraction = contributionPower - 1;
	contributionDivision = contributionSubstraction / rN;
	contribution = MonthlyContribution * contributionDivision;
	System.out.println("Growth of Monthly Contributions: "+contribution);
	total = initial + contribution;
	System.out.println("Total Amount: "+total);
	totalContributions = MonthlyContribution * numberOFMonthINYear;
	compoundInterest = total - initialInvestment - totalContributions;
	System.out.println("Compound Interest: "+compoundInterest);
	
		break;
		case 3:
	System.out.println("Monthly");
	compound = 12;
	rN = InterestRate / compound;
	power = compound *TimeinYear;
	math = 1 + rN;
	initial = initialInvestment * Math.pow(math, power);
	System.out.println("Growth of the Initial Investment: "+initial);
	contributionPower =  Math.pow(math, compound*TimeinYear);
	contributionSubstraction = contributionPower - 1;
	contributionDivision = contributionSubstraction / rN;
	contribution = MonthlyContribution * contributionDivision;
	System.out.println("Growth of Monthly Contributions: "+contribution);
	total = initial + contribution;
	System.out.println("Total Amount: "+total);
	totalContributions = MonthlyContribution * numberOFMonthINYear;
	compoundInterest = total - initialInvestment - totalContributions;
	System.out.println("Compound Interest: "+compoundInterest);
	
		break;
		case 4:
	System.out.println("Quarterly");
	compound = 3;
	rN = InterestRate / compound;
	power = compound *TimeinYear;
	math = 1 + rN;
	initial = initialInvestment * Math.pow(math, power);
	System.out.println("Growth of the Initial Investment: "+initial);
	contributionPower =  Math.pow(math, compound*TimeinYear);
	contributionSubstraction = contributionPower - 1;
	contributionDivision = contributionSubstraction / rN;
	contribution = MonthlyContribution * contributionDivision;
	System.out.println("Growth of Monthly Contributions: "+contribution);
	total = initial + contribution;
	System.out.println("Total Amount: "+total);
	totalContributions = MonthlyContribution * numberOFMonthINYear;
	compoundInterest = total - initialInvestment - totalContributions;
	System.out.println("Compound Interest: "+compoundInterest);
	
		break;
		case 5:
	System.out.println("Half a year");
	compound = 2;
	rN = InterestRate / compound;
	power = compound *TimeinYear;
	math = 1 + rN;
	initial = initialInvestment * Math.pow(math, power);
	System.out.println("Growth of the Initial Investment: "+initial);
	contributionPower =  Math.pow(math, compound*TimeinYear);
	contributionSubstraction = contributionPower - 1;
	contributionDivision = contributionSubstraction / rN;
	contribution = MonthlyContribution * contributionDivision;
	System.out.println("Growth of Monthly Contributions: "+contribution);
	total = initial + contribution;
	System.out.println("Total Amount: "+total);
	totalContributions = MonthlyContribution * numberOFMonthINYear;
	compoundInterest = total - initialInvestment - totalContributions;
	System.out.println("Compound Interest: "+compoundInterest);
	
		break;
		case 6:
	System.out.println("A year");
	compound = 1;
	rN = InterestRate / compound;
	power = compound *TimeinYear;
	math = 1 + rN;
	initial = initialInvestment * Math.pow(math, power);
	System.out.println("Growth of the Initial Investment: "+initial);
	contributionPower =  Math.pow(math, compound*TimeinYear);
	contributionSubstraction = contributionPower - 1;
	contributionDivision = contributionSubstraction / rN;
	contribution = MonthlyContribution * contributionDivision;
	System.out.println("Growth of Monthly Contributions: "+contribution);
	total = initial + contribution;
	System.out.println("Total Amount: "+total);
	totalContributions = MonthlyContribution * numberOFMonthINYear;
	compoundInterest = total - initialInvestment - totalContributions;
	System.out.println("Compound Interest: "+compoundInterest);
	
		break;
}
	if(plan > 6) System.out.print("invaild response");



} while(plan > 6);





}




}