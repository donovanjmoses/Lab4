/*----------------------------
// AUTHOR: DONOVAN MOSES
// FILENAME: LAB4.JAVA
// SPECIFICATION: A PROGRAM THAT PROMPTS THE USER TO CHOOSE A MENU OPTION THAT PERFORMS ARITHMETIC OPERATIONS
// FOR: CSE110
// TIME SPENT:
 ----------------------------*/

//Import Scanner Class
import java.util.Scanner;

public class Lab4 {
	public static void main(String[] args) {
		
		//Declare some variables you need
		//
		int option = 1;
		Scanner choice = new Scanner(System.in);
		do {
			//display the menu
			displayMenu();
			option = choice.nextInt();
			//Ask the user for one option
			//
			
			switch (option){
				//Define four cases for options. Don't forget "break".
			case 1 :
			
			break;
			
			default : 
				
			}
		}
		while (option !=4);
		
		
		/**
		 * Print the menu
		 */
	}	
	private static void displayMenu() {
		Scanner enterNumber = new Scanner(System.in);
		System.out.println("Please choose one option from the following menu: ");
		System.out.println("1) Calculate the sum of integers from 1 to m");
		System.out.println("2) Calculate the factorial of a give number");
		System.out.println("3) Display the leftmost digit of a given number");
		System.out.println("4) Quit");
	}
}
