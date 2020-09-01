package project1;

//import
import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		
		//asking for user input
		System.out.println("Please pick a sign.");
		System.out.println("Type 1 for addition, 2 for subtraction, 3 for multiplication, and 4 for division");
		double userSign = input.nextDouble();
		
		System.out.println("Please enter the first number.");
		double a = input.nextDouble();
		
		System.out.println("Please enter the second number.");
		double b = input.nextDouble();
				
		
		
		
		//calculations
			if(userSign == 1) {
				double output =  a+b;
					System.out.println(a + " + " + b + " = " + output);
			}
			else if (userSign == 2) {
				double output =  a-b;
					System.out.println(a + " - " + b + " = " + output);
			}
			else if (userSign == 3) {
				double output =  a*b;
					System.out.println(a + " x " + b + " = " + output);
			}
			else if (userSign == 4) {
				double output =  a/b;
					System.out.println(a + " / " + b + " = " + output);
			}
			else {
					System.out.println("OOPS something went wrong, please choose an actual number");
			}
		}

		//1 is addition
		//2 is subtraction
		//3 is multiplication
		//4 is division
		
	}

