package learnJava;

import java.util.Scanner;

public class Looping {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		System.out.println("How many times: ");
//		int numberOfTimes = Integer.valueOf(scan.nextLine());
//		
//		for(int i =1;i<=numberOfTimes;i++) {
//			printText();
//		}
//		countNumbers();
//		printUntilNumber(2);
//		printFromNumberToOne(2);
//		division(3,5);
//		divisibleByThreeInRange(2,10);
//		int result =returnUno();
		printSquare(10);
		
		
	}
	
	public static void inputNumber() {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("Give a number: ");
			int num = Integer.valueOf(scan.nextLine());
			
			if(num <0) {
				System.out.println("Unsuitable Number"+ " ");
				continue;
			}
			if(num == 0) {
				break;
			}
			System.out.println(num*num );
			
		}
		
	}
	
	public static void inputString() {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("Shall we carry on?:");
			String input = scan.nextLine();
			if(input.equalsIgnoreCase("no")) {
				break;
			}
		}
		
	}
	public static void readNumbers() {
		Scanner scan = new Scanner(System.in);
		
		int numbers = 0;
		int negative = 0;
		
		while(true) {
			System.out.println("Give a number: ");
			
			int num = Integer.valueOf(scan.nextLine());
			
			if(num == 0) {
				break;
			}
			else if(num<0) {
				negative++;
			}
			else {
				numbers++;
			}
		}
		System.out.println("Number of negative numbers: "+ negative);
	}
	public static void addNumbers() {
		Scanner scan = new Scanner(System.in);
		double sum = 0;
		double numbers = 0;
		double average = 0.0;
		
		while(true) {
			System.out.println("Give a number: ");
			
			double num = Double.valueOf(scan.nextLine());
			
			if(num == 0) {
				break;
			}
			else if(num>0 || num<0) {
				numbers++;
				sum+=num;
				average = sum/numbers;
			}
		}
//		System.out.println("Number of numbers: " + numbers);
//		System.out.println("Sum of numbers: " + sum);
		System.out.println("Average of numbers: " + average);
	}
	public static void countNumbers() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = Integer.valueOf(scan.nextLine());
		
		for(int i =num ;i<=100;i++) {
			System.out.println(i);
		}
	}
	public static void printText() {
		System.out.println("In a hole in the ground there lived a method ");
	}
	public static void printUntilNumber(int number) {
		int i =1;
		while(i<=number) {
			System.out.println(i);
			i++;
		}
	}
	public static void printFromNumberToOne(int number) {
		int i = number;
		while(i>=1) {
			System.out.println(i);
			i--;
		}
	}
	public static void division(int numerator, int denominator) {
		double result = (double)numerator/ denominator;
		System.out.println(result);
	}
	public static void divisibleByThreeInRange(int beginning,int end) {
		for(int i =beginning;i<=end;i++) {
			if(i%3==0) {
				System.out.println(i);
			}
		}
	}
	public static int returnUno() {
		return 1;
	}
	
	public static void printStars() {
		System.out.print("*");
		
	}
	public static void printSquare(int size) {
		for(int row=1; row<=size; row++) {
			
			for(int spaces=1; spaces<=size-row; spaces++) {
				System.out.print(" ");
			}
			for(int stars =1; stars<=(2*row-1); stars++) {
				
				printStars();
			}
			System.out.println();
	}
		for(int trunk =1;trunk<=2; trunk++) {
			for(int space=1; space<size-2; space++) {
				System.out.print(" ");
			}
			for(int star =1; star<=3; star++) {
				printStars();
			}
			System.out.println();
		}
	}

}
