package Lab.Saturday;
import java.util.Scanner;
//**
//SaturdayLab1: Data types. Variables. Constants.
 //calculates:
// -- the number of boxes required to pack eggs
// -- the number of leftover eggs 
//Problem 5
// Read the next problem, and then identify the input, the processing and the output.
//John the farmer has asked his son with collecting the eggs from the
// chicken cage each morning and putting them in boxes of 1 dozen eggs each.
// Unfortunately, John's son Joe is having trouble working out how many boxes
 //he will need each morning. You have been asked to develop a java application
// to allow Joe to enter the number of eggs he has collected. The application
// should then calculate and display how many boxes can be filled and how
// many eggs Joe will have leftover. Hint: there are 12 eggs in 1 dozen.

public class Eggs {


	public static void main(String[] args) {
		//declare constant named dozen
		final int dozen = 12;
		
		//declare a variable of type int
		int eggsCount, boxesCount, eggsLeftover;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter nummber of eggs colected");
		eggsCount = sc.nextInt();
		//calculate the number of boxes needod for eggs 
		boxesCount = eggsCount / dozen;
System.out.println("==============================================");
System.out.println("Number of Boxes needed to store a dozen eggs: "+boxesCount);

//calculate the number of remaining eggs
eggsLeftover = eggsCount % dozen;
System.out.println("Number of remaining eggs; " + eggsLeftover);

	//calculate the number of left over eggs
		
	}

}
