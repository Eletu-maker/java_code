import java.util.Scanner;
import java.util.ArrayList;
public class ArraySnack{
	public static void main(String[] args){
	Scanner entries = new Scanner(System.in);
	System.out.println("Enter amount of values in an array");
	int amount = entries.nextInt();
	int[] array = new int[amount];
	System.out.println("Enter values in an array");
	int pList= (amount/2);
	int begining  = -1;
	int end= amount;
	int resversed = amount-1;
	int counts =0;
	for(int count = 0; count < amount; count++){
	array[count] = entries.nextInt();
}
	
	int largest= Integer.MIN_VALUE;
	int total =0;
	for(int count=0; count < array.length; count++){
	if( array[count] > largest ) largest = array[count];
}
	System.out.println("The largest number is "+ largest);

	for(int count=0; count < array.length; count++){
	System.out.print(array[count] + " " );
}
	System.out.print( "\n" );
	for(int count=resversed; count >= 0; count--){
	System.out.print(array[count] + " ");
}
	System.out.print( "\n" );

	System.out.print("enter the element you wanna check: ");
	int askValue = entries.nextInt();
	int value = askValue -1;
	if ( value >4 ||  value <0  ) System.out.println("out of reach");
	else{ System.out.println(array[value]);}

	System.out.print("list of odd number: ");
	for(int odd:array){
	if(odd %2 == 1)System.out.print(odd+ " ");
}
	System.out.print( "\n" );
	System.out.print("list of even number: ");
	for(int even:array){
	if(even %2 == 0)System.out.print(even+ " ");
}
	System.out.print( "\n" );
	for(int number : array){
	total += number;
	
}
	System.out.println("the total of the list: " + total );
	


	while (counts < pList){
	
	if (amount % 2 == 0 )System.out.println("array is a not palindrome");
	
	else if (array[begining+= 1] != array[end -=1])
	System.out.println("array is a not palindrome");
	else if (array[begining+= 1] == array[end -=1]){
 	System.out.println("array is a  palindrome");}
	
	counts++;
}
	int index =0;
	String[] arrayList1 = {"a","b","c"};
	int[]  arrayList2 = {1,2,3};
 	String[] newarrayList2 = new String[arrayList2.length];
	 
	for (int i = 0; i < arrayList2.length; i++) {
            newarrayList2[i] = String.valueOf(arrayList2[i]);
	
        }
	
	String[] addedArray = new String[newarrayList2.length + arrayList1.length];
	
	for(int i = 0; i <arrayList1.length; i++ ){
	addedArray[i] = arrayList1[i];
	System.out.print(addedArray[i]);
}

	for(int count = 3; count <addedArray.length; count++ ){
	addedArray[count] = newarrayList2[index++];
	System.out.println(addedArray[count]);
}
	ArrayList<String> ArrayList = new ArrayList<>();
	ArrayList.add("a");
        ArrayList.add("1");
        ArrayList.add("b");
        ArrayList.add("2");
        ArrayList.add("c");
        ArrayList.add("3");

	System.out.print(ArrayList);
}
}
