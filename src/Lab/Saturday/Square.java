package Lab.Saturday;
/**
Calculates the area of a square given a side SaturdayLab1: Data types. Variables. Constants. Problem 2
Write a java program that declares a variable to represent the side of a square.
The side of the square is 7 units. Compute and display the area of the square.
Save the program as Square.java */

public class Square {

	public static void main(String[] args) {
		
		//declaire the variables to represent side 
		int side;
		
		//input 
		side = 7;
		//processing

		// to store and calculate the area of the square
		int area;
		area = side * side;
		
		//output
		System.out.println("The area of the square is: " + area);
		
	}

}
