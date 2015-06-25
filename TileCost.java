/* Find Cost of Tile to Cover W x H Floor - Calculate the total 
 * cost of tile it would take to cover a floor plan of width and 
 * height, using a cost entered by the user.
 * 
 * Problem found at:
 * https://github.com/karan/Projects
 * 
 * Solution by: Jamie McGibbon
 * TechnicalCafe.com
 */

import java.util.Scanner;

public class TileCost {

	public static void main(String[] args) {
		
		//create variables for floor length, width, and price, as well as total cost
		double length, width, price, cost;
		
		//instantiate object of Scanner class to get user input
		Scanner input = new Scanner(System.in);
		
		//prompt user to enter price per sq. foot of floor
		System.out.println("Please enter the cost per sq. ft. of flooring.");
		
		//scan for price per sq. ft. of flooring
		price = input.nextDouble();
		
		//prompt user to enter floor length
		System.out.println("Please enter the floor length.");
		
		//scan for floor length
		length = input.nextDouble();
		
		//prompt user to enter floor width
		System.out.println("Please enter the floor width.");
		
		//scan for floor width
		width = input.nextDouble();
		
		//calculation to determine cost of floor
		cost = price * length * width;
		
		//print total cost to the screen
		System.out.println("For a floor with a length of " + length + " feet and a width of "+
							width + " feet, at a price of $" + price + " per foot, it would cost"
							+ " a total of $" + cost + ".");
		

	}

}
