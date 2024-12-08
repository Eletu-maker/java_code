import java.util.Scanner;
public class Kata{
	public static void main(String[] args){
	Scanner entries= new Scanner(System.in);
	System.out.print("Enter a number: ");
	int isEven= entries.nextInt();
	if( isEven % 2 ==0) System.out.println("Number is even");
	else{System.out.println("Number is odd");}

	System.out.print("Enter a prime number: ");
	int primeNumber = entries.nextInt();
	
	int flag =0;
	int count =2;
	if(primeNumber ==0 || primeNumber == 1){
		System.out.println(primeNumber + " is not prime.");
}
	else{
	
	while( count < primeNumber){
		if(primeNumber % count ==0){
	System.out.println(primeNumber + " is not prime.");
		flag = 1;
	
		break;
}
	  count++;
}
	if (flag == 0){
	System.out.println(primeNumber + " is prime.");
	
}

}




    	System.out.println("Enter two new number for Subtractions");
	System.out.println("Enter first number");
	int firstNumber = entries.nextInt();
	System.out.println("Enter second number");
	int secondNumber = entries.nextInt();
	int subtractedNumber= firstNumber - secondNumber;
	if(subtractedNumber < 0){
	System.out.println("Answer is "+Math.abs(subtractedNumber));
}
	else{
	System.out.println("Answer is "+subtractedNumber);
}

	System.out.println("Enter two new number for Quotient");
	System.out.println("Enter first number");
	int quotientfirstNumber = entries.nextInt();
	System.out.println("Enter second number");
	int quotientsecondNumber = entries.nextInt();
	double quotient= 0;
	if(quotientsecondNumber == 0){
		quotient= 0;
	System.out.println("Answer is "+quotient);	
} 
	else{
		quotient= (double)quotientfirstNumber/quotientsecondNumber;
	System.out.println("Answer is "+quotient);
}
	
	System.out.println("Enter number to get the factor");
	int factor = entries.nextInt();
	int divisible = factor;
	System.out.println("factoer of "+factor+" are");
	while(divisible > 0){
		if(factor % divisible ==0){
	
		System.out.println(divisible);
}
		divisible--;
}
	
	
	System.out.println("Enter number to check if it a Square");
	int SquareNumber = entries.nextInt();
	double Square = (double)Math.pow(SquareNumber,0.5);
	
	if(Square % 1 !=0){
		System.out.println("false");
}
	else{
		System.out.println("true");
}

	System.out.println("Enter 5 digist number to check the palindrome");
	int fiveDigistNumber = entries.nextInt();
	int firstMode = 0;
	int fourDigistNumber=0;
	int secondMode = 0;
	
	int twoDigistNumber=0;
	int forthMode = 0;
	int fifthMode = 0;

	firstMode=fiveDigistNumber%10;
	fourDigistNumber= fiveDigistNumber/10;
	secondMode = fourDigistNumber% 10;
	twoDigistNumber = fourDigistNumber/ 100;
	forthMode= twoDigistNumber%10;
	fifthMode= twoDigistNumber/10;
	
	

	if(firstMode == fifthMode &&  secondMode == forthMode){
		System.out.println(fiveDigistNumber + " is a palindrome");
}
	else{
		System.out.println(fiveDigistNumber + " is a not palindrome");
}
	System.out.println("Enter factorial of number");
	int factorialNumber = entries.nextInt();
	int factorialAnswer = 1;
	System.out.println("Factorial of "+factorialNumber+" is");
	while(factorialNumber > 0){
	factorialAnswer *= factorialNumber;
	factorialNumber--;
}
	
	System.out.println(factorialAnswer);
	

	System.out.println("Enter number to get the Square");
	int getTheSquare = entries.nextInt();
	int SquaredDigist = getTheSquare * getTheSquare;
	System.out.println(getTheSquare + " squared is " + SquaredDigist);
}
}