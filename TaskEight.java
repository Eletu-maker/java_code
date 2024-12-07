public class TaskEight{
	public static void main(String[] args){
	int multipleOfFour = 1;
	int multipleOfEight = 1;
	int sumOfFour =0;
	int sumOfEight =0;
	int sumOfBoth= 0;
	for(int count=1; count<6; count++){
	int number =4;
	
	multipleOfFour *= number;
	sumOfFour += multipleOfFour;
	

}

for(int count=1; count<6; count++){
	int number =8;
	
	multipleOfEight *= number;
	sumOfEight += multipleOfEight;
	

}	
sumOfBoth= sumOfEight + sumOfFour;
System.out.println(sumOfBoth);
}
}