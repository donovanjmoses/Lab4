/*----------------------------
// AUTHOR: DONOVAN MOSES
// FILENAME: LAB4.JAVA
// SPECIFICATION: A PROGRAM THAT PROMPTS THE USER TO CHOOSE A MENU OPTION THAT PERFORMS ARITHMETIC OPERATIONS
// FOR: CSE110
// TIME SPENT: 120 minutes
 ----------------------------*/

//Import Scanner Class
import java.util.Scanner;

public class Lab4 {
	public static void main(String[] args) {
		
		//Declare some variables you need
		int option;
		Scanner scan = new Scanner(System.in);
		do {
			//display the menu
			displayMenu();
			//Ask the user for one option
			option = scan.nextInt();
			switch (option) {
			//Define four cases for options. Don't forget "break".
			case 1 :
				System.out.println("Enter integer 'm': ");
				int m = scan.nextInt();
				int finalInteger = 0;
				for(int i = 1; i <= m; i++) {
					finalInteger = finalInteger + i;
					System.out.println(finalInteger);
				}
			break;
			
			case 2 :
				System.out.println("Enter a number: ");
				int number = scan.nextInt();
				System.out.println("The factorial of " + number + " is " + factorial(number));
			break;
			
			case 3 :
				System.out.println("Enter a number: ");
				int firstDigit = scan.nextInt();
				System.out.println("The leftmost digit of " + firstDigit + " is " + firstNumber(firstDigit));
			break;
			
			case 4 :
				System.out.print("Bye");
			break;
			default :
				displayMenu();
			}
		}
		while (option != 4);
	}
	
	//static method, factorial, calculates the factorial of a given integer input
	public static int factorial(int number) {
		if (number==0)
			return 1;
		
		return number*factorial(number - 1);
	}	
	
	//static method, firstNumber, returns the first digit in a given integer input
	public static int firstNumber(int firstDigit) {
		while (firstDigit >= 10)
			firstDigit /= 10;
		return firstDigit;
	}
	
		/**
		 * Print the menu
		 */	
	private static void displayMenu() {
		Scanner enterNumber = new Scanner(System.in);
		System.out.println("Please choose one option from the following menu: ");
		System.out.println("1) Calculate the sum of integers from 1 to m");
		System.out.println("2) Calculate the factorial of a give number");
		System.out.println("3) Display the leftmost digit of a given number");
		System.out.println("4) Quit");
	}
}
