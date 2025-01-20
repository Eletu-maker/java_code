import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
public class StudentGrade {
	public static void main(String[] args) {
	Scanner entries = new Scanner(System.in);
	List<ArrayList<Integer>> arrayListGroup = new ArrayList<>();
	List<ArrayList<Integer>> arraySubject = new ArrayList<>();
	ArrayList<Integer> arrayTotal =  new ArrayList<>();
	ArrayList<Integer> arrayTotalCopy =  new ArrayList<>();
	ArrayList<Integer> arrayPosition =  new ArrayList<>();
	ArrayList<Integer> arrayhighest = new ArrayList<>();
	ArrayList<Integer> arraylowest = new ArrayList<>();
	ArrayList<Integer> arraySubjecTotal = new ArrayList<>();
	ArrayList<Integer> arrayPass =  new ArrayList<>();
	ArrayList<Integer> arrayFail =  new ArrayList<>();
	int total = 0;
	boolean validInput = false;
	System.out.println("How many student do u have");
	int student  = 0;
	    while (!validInput) { 
            
            try {
                student = entries.nextInt();
                if (student < 1) { 
                    System.out.println("Unacceptable value: enter a number greater than zero.");
                } else {
                    validInput = true; 
                }
            } catch (InputMismatchException e) {
                System.out.println("Unacceptable value: please enter a valid number.");
                entries.next();
            }  
        }
	

	System.out.println("How many subject do u have");
	int subject = 0;
	validInput = false;
	  while (!validInput) { 
            
            try {
                subject = entries.nextInt();
                if (subject < 1) { 
                    System.out.println("Unacceptable value: enter a number greater than zero.");
                } else {
                    validInput = true; 
                }
            } catch (InputMismatchException e) {
                System.out.println("Unacceptable value: please enter a valid number.");
                entries.next();
            }
        }
	
	for (int studentNumber = 0; studentNumber < student; studentNumber++) {

	arrayListGroup.add(new ArrayList<>());
	int studentCount =  studentNumber+1;

	for(int subjectNumber = 0; subjectNumber<subject; subjectNumber++){

	int subjectCount = subjectNumber + 1;
	System.out.println("Enter score for student"+ studentCount);
	System.out.println("Enter score for subject"+subjectCount);

	int score = 0;
	validInput = false;
	  while (!validInput) { 
            
            try {
                score = entries.nextInt();
		while(score < 0 || score > 100){
		System.out.println("invaild number: enter between 0 - 100");
		score = entries.nextInt();
}
                if (score < 0) { 
                    System.out.println("invaild number: enter between 0 - 100.");
                } else {
                    validInput = true; 
                }
            } catch (InputMismatchException e) {
                System.out.println("Unacceptable value: please enter a valid number.");
                entries.next();
            }
        }
	
	System.out.println("saved");

	
	total += score;
	
	if (subjectNumber == subject-1 ){
	arrayTotal.add(total);
	arrayTotalCopy.add(total);
	total =0;
	
	}
	if (studentNumber != student-1 ){
	if (subjectNumber == subject-1 ){
	
	System.out.println("Next student");
	}
	}
	 

	arrayListGroup.get(studentNumber).add(score);
	
	}
}
	int pos = 0;
	while(pos < student){
	arrayPosition.add(0);
	pos++;
}
	

	

	int highestPosition =0;
	int Position =1;

	for(int postionPlacement =0; postionPlacement < student; postionPlacement++){
	highestPosition =Collections.max(arrayTotalCopy);
	for(int index =0; index < student; index++){
	if (arrayTotalCopy.get(index) ==highestPosition){
	arrayPosition.set(index,Position);
	arrayTotalCopy.set(index,0);
	
	
}
}
	Position++;
	highestPosition =0;
}



	
	
	System.out.print("Student          ");
	
	for(int subjectNumber = 1; subjectNumber<=subject; subjectNumber++){
	System.out.print("SUB"+subjectNumber+"       " );
}

 	System.out.println("TOT      AVE       POS ");
 

 







	for (int studentCount = 0; studentCount < student; studentCount++){
	int number = studentCount + 1;
	System.out.print("Student"+number+"         " );
	int count =0;
	while (count < subject){
	System.out.print(arrayListGroup.get(studentCount).get(count)+"         ");
	count++;
}
	System.out.print(arrayTotal.get(studentCount)+"       ");
	System.out.print(arrayTotal.get(studentCount)/subject+"        ");
	System.out.print(arrayPosition.get(studentCount));
	System.out.println();
	

	
}


	



	
	int arrange= 0;
	int sumSubject =0;
	for (int subjectNumber = 0; subjectNumber < subject; subjectNumber++){
	
	arraySubject.add(new ArrayList<>());
	for (int studentNumber = 0; studentNumber < student; studentNumber++){
	arrange = arrayListGroup.get(studentNumber).get(subjectNumber);
	arraySubject.get(subjectNumber).add(arrange);
	
	 sumSubject += arraySubject.get(subjectNumber).get(studentNumber);
}
	

	
}
	

	int highest =0;
	int subjectSum=0;
	for (int subjectNumber = 0; subjectNumber < subject; subjectNumber++){
	
	highest = Collections.max(arraySubject.get(subjectNumber));
	arrayhighest.add(highest);
	for(int subjectLoop:arraySubject.get(subjectNumber)){
	subjectSum +=subjectLoop;
	
}
	arraySubjecTotal.add(subjectSum);
	subjectSum =0;
}


	
	int lowest = 0;
	for (int subjectNumber = 0; subjectNumber < subject; subjectNumber++){
	
	lowest = Collections.min(arraySubject.get(subjectNumber));
	arraylowest .add(lowest);
	

}
	
	
	
	int passed=0;
	int failed =0;
	for (int subjectNumber = 0; subjectNumber < subject; subjectNumber++){
	for (int studentCount = 0; studentCount < student; studentCount++){
	if (arraySubject.get(subjectNumber).get(studentCount) > 50){
	passed++;
}	else{
	failed++;
}
	
}
	arrayPass.add(passed);
	arrayFail.add(failed);
	 passed=0;
	 failed =0;

}

	

	int highestFailed = Collections.max(arrayFail);
	int highestPassed = Collections.max(arrayPass);


	int hardestSubject = 0;
	int easiestSubject = 0;
	for(int subjectNumber = 0; subjectNumber < subject; subjectNumber++){
	if (arrayFail.get(subjectNumber) == highestFailed){
	hardestSubject = subjectNumber;
}
	if (arrayPass.get(subjectNumber) == highestPassed){
	easiestSubject = subjectNumber;
}

}

	
	System.out.println();
	System.out.println("SUBJECT SUMMARY");
	int number =1;
	int indexlowestScoringStudent =0;
	int indexhighestScoringStudent =0;
	int lowestScoringStudent =0;
	int highestScoringStudent =0;
	for (int subjectNumber = 0; subjectNumber < subject; subjectNumber++){
	int subjectName = subjectNumber + number;
	
	for (int studentNumber =0; studentNumber < student;studentNumber++){
	if(arraySubject.get(subjectNumber).get(studentNumber) == arrayhighest.get(subjectNumber)){
	 highestScoringStudent = studentNumber + 1;
}
	if(arraySubject.get(subjectNumber).get(studentNumber) == arraylowest.get(subjectNumber)){
	lowestScoringStudent = studentNumber + 1;
}
}
	

	System.out.println("subject"+ subjectName );
	System.out.println("Highest scoring student is: student "+highestScoringStudent+" scoring "+arrayhighest.get(subjectNumber));
	System.out.println("lowest scoring student is: student  "+lowestScoringStudent+" scoring "+arraylowest.get(subjectNumber));
	System.out.println("Total Score is: " + arraySubjecTotal.get(subjectNumber));
	System.out.println("average Score is: " + arraySubjecTotal.get(subjectNumber)/student);
	System.out.println("Number of passes: " + arrayPass.get(subjectNumber));
	System.out.println("Number of fails: " + arrayFail.get(subjectNumber));
	System.out.println();
}
	System.out.println();
	System.out.println();
	int realhardestSubject = hardestSubject +1;
	int realeasiestSubject = easiestSubject +1;
	System.out.println("The hardest subject is Subject "+ realhardestSubject +" with " +highestFailed+" failures");
	System.out.println("The easiest subject is Subject "+ realeasiestSubject +" with " +highestPassed+" passes");
	


	int overallHighest = Collections.max(arrayhighest);
	int overallLowest = Collections.min(arraylowest);
	
	int geToverallHighestStudent = 0;
	int geToverallLowestStudent = 0;
	int geToverallHighestSubject = 0;
	int geToverallLowestSubject = 0;
	int bestGraduatingScore = Collections.max(arrayTotal);
	int worstGraduatingScore = Collections.min(arrayTotal);

	for (int studentNumber = 0; studentNumber < student; studentNumber++) {
	for(int subjectNumber = 0; subjectNumber<subject; subjectNumber++){
	if (arrayListGroup.get(studentNumber).get(subjectNumber) == overallHighest){
	geToverallHighestStudent = studentNumber;
	geToverallHighestSubject = subjectNumber;
}
	if (arrayListGroup.get(studentNumber).get(subjectNumber) == overallLowest){
	geToverallLowestStudent = studentNumber;
	geToverallLowestSubject = subjectNumber;
}
}
}
	int classTotalScore = 0;
	for(int count =0; count < student;count++){
	classTotalScore += arrayTotal.get(count);
}

	int overallHighestStudent = geToverallHighestStudent +1;
	int overallLowestStudent = geToverallLowestStudent +1;
	int overallHighestSubject = geToverallHighestSubject +1;
	int overallLowestSubject = geToverallLowestSubject +1;

	System.out.println("The overall Highest score is scored by Student "+overallHighestStudent+" in subject "+overallHighestSubject+" scoring "+ overallHighest);
	System.out.println("The overall Lowest score is scored by Student "+overallLowestStudent+" in subject "+overallLowestSubject+" scoring "+overallLowest);
int bestGraduatingStudent =0;
int worstGraduatingStudent =0;
for(int count=0 ; count < student; count++){
if (arrayTotal.get(count) == worstGraduatingScore){
worstGraduatingStudent = count +1;
}
if (arrayTotal.get(count) == bestGraduatingScore){
bestGraduatingStudent = count +1;
}
}
	

	System.out.println("""
======================================================================================


CLASS SUMMARY

======================================================================================
""");
System.out.println("Best Graduating Student is: Student "+bestGraduatingStudent +" scoring "+ bestGraduatingScore);
System.out.println("""
======================================================================================


!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
""");

System.out.println("Worst Graduating Student is: Student "+ worstGraduatingStudent+" scoring "+ worstGraduatingScore);
System.out.println("""
!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


======================================================================================
""");
System.out.println("Class total score is: "+classTotalScore);
System.out.println("Class Average score is: "+classTotalScore/student);


System.out.println("======================================================================================");



















}
}



