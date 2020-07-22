package gcdemos;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scnr = new Scanner(System.in);

		boolean shouldContinue = true;

		while(shouldContinue) {

			System.out.println("Hello, World !");
			System.out.println("Would you like to continue? (y/n)");
			
			String response = scnr.next();
			
			shouldContinue = response.equals("y");
		}
		
		System.out.println("Goodbye!");

		for (int number = 0; number <= 9; number++) {
			System.out.print(number + " ");

		}
		System.out.println("\nEnter a number: ");
		int input = scnr.nextInt();
		
		for (int number = input; number >= 0; number--) {
			System.out.print(number + " ");

		}
		
		}
		
	}
