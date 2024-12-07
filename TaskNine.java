public class TaskNine{
	public static void main(String[] args){
	int multipleOfFour = 1;
	int multipleOfEight = 1;
	int sumOfFour =0;
	int sumOfEight =0;
	int sumOfBoth= 0;
	int squareOfBoth=0;
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
squareOfBoth = sumOfBoth * sumOfBoth;
System.out.println(squareOfBoth);
}
}