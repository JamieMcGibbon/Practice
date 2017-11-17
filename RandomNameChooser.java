import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		//create an ArrayList to hold names
		ArrayList<String> nameList = new ArrayList<String>();
		
		//instantiate object of the Scanner class to get names from user
		Scanner scan = new Scanner(System.in);
		
		//get names using the "scan" object of the Scanner class.
		boolean keepScanning = true;
		while(keepScanning){
			
			System.out.println("Please enter a name (or \"exit\" to stop).");
			
			String name = scan.nextLine();
			
			if(name.toLowerCase().equals("exit")){
				keepScanning = false;
			}
			else{
				nameList.add(name);
			}	
		}
		
		//print the name list using a "for loop"
		System.out.println("\nName List:\n");
		
		for(int i = 0; i < nameList.size(); i++){
			System.out.println(nameList.get(i));
		}
		
		//generate random number between 0 and ArrayList.size()
		int randomNum = (int)(Math.random() * ((nameList.size()) + 1));
		
		//get random name, using the random number generator above to select a number
		//that will be used as the index for the ArrayList
		String randomName = nameList.get(randomNum);
		
		//print the random name
		System.out.println("\nRandom Name: ");
		System.out.println(randomName);
		
		

	}

}
