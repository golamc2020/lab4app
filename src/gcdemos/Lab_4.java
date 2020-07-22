package gcdemos;

import java.util.Scanner;

public class Lab_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scnr = new Scanner(System.in);
		
		int num;
		int square;
		int cube;
		boolean calculations= true;
		String response;
		
		while (calculations) {
		
		System.out.println("Enter a number: ");	
		num=scnr.nextInt();
		
		System.out.println("Number\tSquared\tCubed");
		System.out.println("======\t=======\t=====");
		
		for (int i=1;i<=num;i++) {
			
		square = i*i;
		cube = i*i*i;
		System.out.println(i+"\t"+square+"\t"+cube);	
		
		}
		
		System.out.println("Continue? (yes/no): ");
		response=scnr.next();
		
		if (response.equalsIgnoreCase("no")) {
		
		calculations=false;
		
		System.out.println("Goodbye !! ");
			
		}
		
		}
		
		

	}

}
