package learnJava;
import java.util.Scanner;

public class Message {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		
		String userInput = scan.next();
		int age = Integer.parseInt(userInput);
		if(age>=18) {
			System.out.println("You are an adult");
		}
		else {
			System.out.println("You are not an adult");
		}

	}

}
