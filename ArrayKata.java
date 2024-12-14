import java.util.Scanner;
import java.util.ArrayList;

public class ArrayKata{
	public static void main(String[] args){
	Scanner entries = new Scanner(System.in);
	System.out.print("enter amount of value you want in the array: ");
	int amount = entries.nextInt();
	
	ArrayList<Integer> arrayKata = new ArrayList<Integer>();
	
	 for(int count=0;count < amount; count++ ){
	arrayKata.add(entries.nextInt());
	
}
	System.out.println(arrayKata);
System.out.println();
	int largest = Integer.MIN_VALUE;
	for(int count =0; count < amount; count++){
	if(arrayKata.get(count) > largest ) largest = arrayKata.get(count);
}
	System.out.println("the maximum number is "+largest);
	System.out.println();
	int smallest = Integer.MAX_VALUE;
	for(int count =0; count < amount; count++){
	if(arrayKata.get(count) < smallest ) smallest = arrayKata.get(count);
}
	System.out.println("the minimum number is "+smallest);
System.out.println();
	int total = 0;
	for(int count =0; count < amount; count++){
	total +=arrayKata.get(count);
}
	System.out.println("the total number is "+total);
System.out.println();
	int evenTotal = 0;
	for(int count =0; count < amount; count++){
	if(arrayKata.get(count) % 2 ==0)
	evenTotal += arrayKata.get(count);
}
	System.out.println("the total even number is "+evenTotal);	
System.out.println();

	int oddTotal = 0;
	for(int count =0; count < amount; count++){
	if(arrayKata.get(count) % 2 ==1)
	oddTotal += arrayKata.get(count);
}
	System.out.println("the total odd number is "+oddTotal);	
System.out.println();


	int evenNumber = 0;
	for(int count =0; count < amount; count++){
	if(arrayKata.get(count) % 2 ==0 && arrayKata.get(count) !=0)
	evenNumber++;
}
	System.out.println("the number of even integer are "+evenNumber);	
System.out.println();
	int oddNumber = 0;
	for(int count =0; count < amount; count++){
	if(arrayKata.get(count) % 2 ==1)
	oddNumber++;
}
	System.out.println("the number of odd integer are "+oddNumber);	
System.out.println();
	ArrayList<Integer> n0OfEvenNumber = new ArrayList<Integer>();
	for (int number : arrayKata) {
    if (number % 2 == 0) 
	
	n0OfEvenNumber.add(number);
}
	System.out.println("Array of even number: "+ n0OfEvenNumber);
	System.out.println();
	ArrayList<Integer> n0OfOddNumber = new ArrayList<Integer>();

	for (int number : arrayKata) {
    if (number % 2 == 1)
	
	n0OfOddNumber.add(number);
}
	System.out.println("Array of odd number: "+n0OfOddNumber);
	System.out.println();
	ArrayList<Integer> squareNumber = new ArrayList<Integer>();
	for (int number : arrayKata) {
    int square = number * number;
	
	squareNumber.add(square);
}
		System.out.println("Array of square number: "+squareNumber);
	


}
}
