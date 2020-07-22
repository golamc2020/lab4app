package gcdemos;


import java.util.Scanner;
public class NewClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
	
		System.out.println("Enter the range");
		int range = scnr.nextInt();
		
		if (range >=90) {
			System.out.println("A");
		}else if ((range >=80)&&(range<=90)) {
			System.out.println("B");
		}else if ((range >=70)&&(range<=80)) {
			System.out.println("C");
		}else if ((range >=60)&&(range<=70)) {
			System.out.println("D");
		}else {System.out.println("E");
	}
char grade = 'A';
		
		switch (grade) {
		case 'A':
			System.out.println("90+");
			break;
		case 'B':
			System.out.println("80+");	
			break;
		case 'C':
			System.out.println("70+");
			break;
		case 'D':
			System.out.println("60+");
			break;
		case 'E':
			System.out.println("Bellow 60");	
			
		}
	}
	
}
