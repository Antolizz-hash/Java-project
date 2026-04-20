package learnJava;

import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Give Points (0-100): ");
		String userInput = scan.nextLine();
		int grade = Integer.parseInt(userInput);
		
		if(grade<0) {
			System.out.println("Grade: Impossible");
		}
		else if(grade<=49) {
			System.out.println("Grade: Failed");
		}
		else if(grade<=59) {
			System.out.println("Grade: 1");
		}
		else if(grade<=69) {
			System.out.println("Grade: 2");
		}
		else if(grade<=79) {
			System.out.println("Grade: 3");
		}
		else if(grade<=89) {
			System.out.println("Grade: 4");
		}
		else if(grade<=100) {
			System.out.println("Grade: 5");
		}
		else {
			System.out.println("Grade: Incredible!");
		}
	}

}
