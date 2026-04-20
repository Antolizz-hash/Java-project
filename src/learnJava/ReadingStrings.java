package learnJava;

import java.util.Scanner;

public class ReadingStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
//		System.out.println("Give a word: ");
//		
//		String word = scan.nextLine();
//		
//		if(word.equals("true")) {
//			System.out.println("You got it right");
//		}
//		else {
//			System.out.print("Try again");
//		}
//		login();
//		splitString();
//		checkContains();
		firstWords();
	
		

	}
	public static void login() {
		Scanner scan = new Scanner(System.in);
		String username = "alex";
		String password = "sunshine";
		
		System.out.println("Enter username: ");
		String userName = scan.nextLine();
		System.out.println("Enter password: ");
		String passWord = scan.nextLine();
		
		if(userName.equals(username) && passWord.equals(password)) {
			System.out.println("You have successfully logged in!");
		}
		else {
			System.out.println("Invalid username or password!");
		}
	}
	public static void splitString() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String text = scan.nextLine();
		
		String splitText[]= text.split(" ");
		
		if(text.equals("")) {
			System.out.print("halted");
		}
		else {
			
			for(int i =0; i<splitText.length; i++) {
				System.out.println(splitText[i]);
			}
		}
		
	}
	public static void checkContains() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String: ");
		String input = scan.nextLine();
		if(input.equals("")) {
			System.out.print("halted");
		}
		else {
			String splitText[] = input.split(" ");
			for(int i =0;i<splitText.length;i++) {
				if(splitText[i].contains("av")) {
					System.out.println(splitText[i]);
				}
//				System.out.println(splitText[i]);
			}
		}
	}
	public static void firstWords() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		
		String input = scan.nextLine();
		
		String pieces[] = input.split(" ");
		
		System.out.println(pieces[pieces.length-1]);
	}
	

}
