package learnJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		getThirdElement();
//		sumOfNumbers();
//		numberOfValuesITheAList();
//		lastInList();
//		printNumbers();
		printNumbersInRange();

	}
	public static void getThirdElement() {
		//initializing scanner 
		Scanner scan = new Scanner(System.in);
		//initializing list
		ArrayList<String>list = new ArrayList<>();
		System.out.print("Enter a list of names: ");
		while(true) {
			String userInput = scan.nextLine();
			if(userInput.equals("")) {
				break;
			}
			else {
				
				list.add(userInput);
			}
		}
		System.out.println(list.get(2));
	}
	public static void sumOfNumbers() {
		//initialize scanner
		Scanner scan = new Scanner(System.in);
		//prompt user for numbers
		System.out.println("Enter a list of numbers. pressing 0 exits the list: ");
		
		//initialize array list
		ArrayList<Integer> numbers = new ArrayList<>();
		
		while(true) {
			String userInput = scan.nextLine();
			int myNums = Integer.valueOf(userInput);
			
			if(myNums == 0) {
				break;
			}
			else {
				
				numbers.add(myNums);
			}
			
			
		}
		int secondElement = numbers.get(1);
		int thirdElement = numbers.get(2);
		int sum = secondElement + thirdElement;
		
		System.out.print("The sum of second and third numbers is: " + sum);
	}
	public static void numberOfValuesITheAList() {
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<String> names = new ArrayList<>();
		
		System.out.println("Enter a list of names: ");
		
		while(true) {
			String input = scan.nextLine();
			
			if(input.equals("")) {
				break;
			}
			else {
				names.add(input);
			}
		}
		System.out.println("In total:" + names.size());
	}
	public static void lastInList() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a list of names: ");
		
		
		
		ArrayList<String> myList = new ArrayList<>();
		
		while(true) {
			String names = scan.nextLine();
			if(names.equals("")) {
				break;
				
			}
			else {
				myList.add(names);
			}
		}
		System.out.println(myList.get(0));
		
		System.out.println(myList.get(myList.size()-1));
	}
	
	public static void printNumbers() {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Integer> myNumbers = new ArrayList<>();
		
		System.out.println("Enter a list of numbers. -1 exits the loop: ");
		
		while(true) {
			int num = Integer.valueOf(scan.nextLine());
			
			if(num == -1) {
				break;
			}
			else {
				myNumbers.add(num);
			}
		}
		
		for(int i = 0; i<myNumbers.size(); i++) {
			
			System.out.println(myNumbers.get(i));
		}
		
	}
	public static void printNumbersInRange() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter start index: ");
		int startIndex = Integer.valueOf(scan.nextLine());
		
		System.out.print("Enter end index: ");
		int endIndex = Integer.valueOf(scan.nextLine());
		
		System.out.println("Enter Numbers: ");
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		while(true) {
			int num = Integer.valueOf(scan.nextLine());
			
			if(num == -1) {
				break;
			}else {
				numbers.add(num);
			}
		}
		
		for(int i =startIndex; i<=endIndex; i++) {
			System.out.println(numbers.get(i));
		}
		
	}

}
