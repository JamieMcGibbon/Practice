/* Reverse a String - Enter a string and the
 * program will reverse it and print it out.
 * 
 * Problem found at:
 * https://github.com/karan/Projects
 * 
 * Solution by: Jamie McGibbon
 * TechnicalCafe.com
 */

//import Scanner class
import java.util.Scanner;

public class ReverseString {

	//create variable to hold String (input by user)
	static String userInput;
	
	public static void main(String[] args) {
		
		//prompt user for String to be reversed
		System.out.println("Please enter a String for reversal.");
		
		//instantiate object of Scanner class to get user input
		Scanner input = new Scanner(System.in);
		
		//get user input
		userInput = input.nextLine();
		
		//call reverseString method, using "userInput" as the
		//input parameter, and print the result to the screen
		System.out.println(reverseString(userInput));	

	}
	
	public static String reverseString(String input){
		
		//get String length and store in a variable
		int strLength = userInput.length();
		
		//create char array to hold separated String
		char[] reversedString = new char[strLength];
		
		//iterate over the String and separate it into its individual characters,
		//which will be stored in the "reversedString" array
		for(int i = 0; i < strLength; i++){
			
			//set "letter" equal to the current character of the String that is being
			//iterated over by the loop (starting at the front of the String)
			char letter = userInput.charAt(i);
			
			//add individual letters to the "back" of the "reversedString" array, in order
			//to reverse the String
			reversedString[(strLength - 1) - i] = letter;
			
		}
		
		//create new String variable, called "result", to hold the reversed String, which
		//was converted from type "char" back to a String
		String result = new String(reversedString);
		
		//return the reversed String
		return result;
		
	}

}
