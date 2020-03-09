package Lab.Saturday;
import java.util.*;
/**
Calculate the cost of carpeting a room taking the values from the user
SaturdayLab1: Data types. Variables. Constants. 
Problem 6
Follow the Carpet class to create an interactive application. Instead of assigning
values to the length, width and price variables accept them from the user as
input. Save the revised class as InteractiveCarpet.java.
*/

public class Interactivecarpet {


	public static void main(String[] args) {
		
		double length, width, price ;
		//declare a variable of type Scanner and create an object
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter the width or the room");
		width = sc.nextDouble();
		
		System.out.println("==============================================");
		System.out.println("Please, enter the lenght or the room");
		length = sc.nextDouble();
		System.out.println("==============================================");
		System.out.println("Please, enter the price");
		price = sc.nextDouble();
		
		double area, cost;
		area = width * length;
		cost = area * price;
		
		String resultText = "The cost of the carpet ";
		String costText = "will cost You "; 
		
		System.out.println(resultText + "width: " + width + "and with the length " + length + costText + cost + "EUR ");
		
		
		
		
		
		
		
	}

}
