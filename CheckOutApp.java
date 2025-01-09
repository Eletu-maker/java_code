import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Scanner;

public class CheckOutApp {
    public static void main(String[] args) {
        Scanner entries = new Scanner(System.in);
        LocalDate Date = LocalDate.now();
        ArrayList<String> item = new ArrayList<>();
        ArrayList<Integer> quantity = new ArrayList<>();
        ArrayList<Double> price = new ArrayList<>();
        ArrayList<Double> total = new ArrayList<>();

	
	
	double sumTotal = 0;
	System.out.println("what is the customer's name");
	String name = entries.nextLine();
	String repeat;
	int number =0;
	boolean validInput = false;
	do{
	System.out.println("what did the user buy?");
	String userbuy = entries.nextLine();
	item.add(userbuy);
	System.out.println("How many pieces?");
 	 int pieces = 0;
        

        while (!validInput) { 
            
            try {
                pieces = entries.nextInt();
                if (pieces < 1) { 
                    System.out.println("Unacceptable value: enter a number greater than zero.");
                } else {
                    validInput = true; 
                }
            } catch (InputMismatchException e) {
                System.out.println("Unacceptable value: please enter a valid number.");
                entries.next();
            }
        }

	quantity.add(pieces);  
	 validInput = false;
	System.out.println("how much per unit?");
	double howMuch = 0;
	
	while(!validInput){
		try {
		
		howMuch = entries.nextDouble();
		if(howMuch < 1){
		System.out.println("Unacceptable value: enter a number greater than zero.");
}  else {
	validInput = true; 
}
} catch (InputMismatchException e) {
                System.out.println("Unacceptable value: please enter a valid number.");
                entries.next();
            }

}
price.add(howMuch);
	validInput = false;
	double priceTotal = howMuch * pieces;
	total.add(
priceTotal);
	sumTotal += priceTotal;
	System.out.println("add more items?");
	 entries.nextLine();
	repeat = entries.nextLine();
	number ++;
	while (!repeat.equalsIgnoreCase("yes") && !repeat.equalsIgnoreCase("no")){
	System.out.println("wrong option: enter either yes or no");
	repeat = entries.nextLine();
	
	
}
	}while(repeat.equalsIgnoreCase("yes"));

	
	System.out.println("what is your cashier name");
	String cashier = entries.nextLine();
	System.out.println("how much discount will he get?");
	double discount = 0;
	while(!validInput){
	try{
	discount = entries.nextDouble();
	if(discount < 0){
	System.out.println("invalid option");
} else { 
validInput= true;

}
} catch(InputMismatchException e){
	System.out.println("Unacceptable value: please enter a valid number.");
                entries.next();

}

}
	double VATfull = sumTotal * 0.175;
	double VAT = Math.ceil(VATfull * 100)/ 100.0;	
	double billTotal = sumTotal - discount + VAT;
	double balance = 0;
	double amountPaid = 0;	
	System.out.println("""
SEMICOLON STORES
MAIN BRANCH
LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
TEL: 03293828343
""");
System.out.println("Date :" + Date);
System.out.println("Cashier :" +  cashier);
System.out.println("Customer name :" + name );
System.out.println(""" 
===========================================================================
                          ITEM           QTY       PRICE         TOTAL(NGN)
---------------------------------------------------------------------------
""");
	for(int count = 0; count < number; count++){
System.out.println("                        "+ item.get(count) +"          "+quantity.get(count) +"       "+ price.get(count) +"        "+ total.get(count) );
};
	
System.out.println("------------------------------------------------------------------------------");
System.out.println("                 Sub Total:      "+ sumTotal);
System.out.println("                  Discount:      "+ discount);
System.out.println("               VAT @ 17.5%:      "+ VAT);
System.out.println("                 Bill Total:     "+ billTotal);
System.out.println("==============================================================================");
System.out.println("          THIS IS NOT A RECIEPT KINDLY PAY" + billTotal);
System.out.println("==============================================================================");
double balance2decimal;
do {System.out.println("how much did the customer give to you?");
	amountPaid = entries.nextDouble();
	balance = amountPaid - billTotal ;
	 balance2decimal = Math.ceil(balance*100)/100;
	if (balance<0){
	System.out.println("insufficient fund, guy are u broke?");

}
}while(balance<0);
System.out.println(""" 
===========================================================================
                          ITEM           QTY       PRICE         TOTAL(NGN)
---------------------------------------------------------------------------
""");
	for(int count = 0; count < number; count++){
System.out.println("                        "+ item.get(count) +"          "+quantity.get(count) +"       "+ price.get(count) +"        "+ total.get(count) );
};
	
System.out.println("------------------------------------------------------------------------------");
System.out.println("                 Sub Total:      "+ sumTotal);
System.out.println("                  Discount:      "+ discount);
System.out.println("               VAT @ 17.5%:      "+ VAT);
System.out.println("                 Bill Total:     "+ billTotal);
System.out.println("==============================================================================");


System.out.println("                Amount Paid:      "+ amountPaid);
System.out.println("                    Balance:      "+ balance2decimal);
System.out.println("==============================================================================");
System.out.println("                     THANK YOU FOR YOUR PATRONAGE                             ");
System.out.println("==============================================================================");

}
}