import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
public class CheckOutApp{
	public static void main(String[] args){
	Scanner entries = new Scanner(System.in);
	LocalDate Date = LocalDate.now();
	ArrayList<String> item = new ArrayList<>();
	ArrayList<Integer> quantity = new ArrayList<>();
	ArrayList<Double> price = new ArrayList<>();
	ArrayList<Double> total = new ArrayList<>();
	
	double sumTotal = 0;
	System.out.println("what is the customer,s name");
	String name = entries.nextLine();
	String repeat;
	int number =0;
	do{
	System.out.println("what did the user buy?");
	String userbuy = entries.nextLine();
	item.add(userbuy);
	System.out.println("how many pieces?");
	int pieces = entries.nextInt();
	quantity.add(pieces);
	System.out.println("how much per unit?");
	double howMuch = entries.nextDouble();
	price.add(howMuch);
	double totalPrice = pieces * howMuch;
	total.add(totalPrice);
	sumTotal += totalPrice;
	System.out.println("add more items?");
	 entries.nextLine();
	repeat = entries.nextLine();
	number ++;
	if (!repeat.equals("yes") && !repeat.equals("no")){
	System.out.println("wrong option: enter either yes or no");
	repeat = entries.nextLine();
	
	
}
	}while(repeat.equals("yes"));

	
	System.out.println("what is your name");
	String cashier = entries.nextLine();
	System.out.println("how much discount will he get?");
	double discount = entries.nextDouble();
	System.out.println("how much did the customer give to you?");
	double amountPaid = entries.nextDouble();
	double VAT = sumTotal * 0.175;
	double billTotal = sumTotal - discount + VAT;
	double balance = Math.abs(billTotal - amountPaid);
	
	
	
	System.out.println("""
SEMICOLON STORES
MAIN BRANCH
LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
TEL: 03293828343
""");
System.out.println("Date :" + Date);
System.out.println("Cashier :" + cashier);
System.out.println("Customer name :" + name );
System.out.println(""" 
===========================================================================
                          ITEM           QTY       PRICE         TOTAL(NGN)
---------------------------------------------------------------------------
""");
	for(int count = 0; count < number; count++){
System.out.println("                    "+ item.get(count) +"          "+quantity.get(count) +"       "+ price.get(count) +"        "+ total.get(count) );
};
	
System.out.println("------------------------------------------------------------------------------");
System.out.println("                 Sub Total:      "+ sumTotal);
System.out.println("                  Discount:      "+ discount);
System.out.println("               VAT @ 17.5%:      "+ VAT);
System.out.println("==============================================================================");
System.out.println("                 Bill Total:      "+ billTotal);
System.out.println("                Amount Paid:      "+ amountPaid);
System.out.println("                    Balance:      "+ balance);
System.out.println("==============================================================================");
System.out.println("                     THANK YOU FOR YOUR PATRONAGE                             ");
System.out.println("==============================================================================");
}
}