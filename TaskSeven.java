public class TaskSeven{
	public static void main(String[] args){
	int multipleOfFour = 1;
	int multipleOfEight = 1;
	int sumOfFour =0;
	int sumOfEight =0;
	for(int count=1; count<6; count++){
	int number =4;
	
	multipleOfFour *= number;
	sumOfFour += multipleOfFour;
	

}
System.out.println(sumOfFour);
for(int count=1; count<6; count++){
	int number =8;
	
	multipleOfEight *= number;
	sumOfEight += multipleOfEight;
	

}	
System.out.println(sumOfEight);
}
}