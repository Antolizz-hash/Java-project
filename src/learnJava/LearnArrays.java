package learnJava;

import java.util.Scanner;

public class LearnArrays {

	public static void main(String[] args) {
		int[] numbers = {5,1,3,4,2};
		
		// TODO Auto-generated method stub
//		swapArrays();
//		sumOfNumbersInArray(numbers);
//		printNeatly(numbers);
		printArrayInStars(numbers);

	}
	
	public static void swapArrays() {
		
		int[] arr = new int[5];
		
		arr[0] = 1;
		arr[1] = 3;
		arr[2] = 5;
		arr[3] = 7;
		arr[4] = 9;
		
		for(int i =0; i<arr.length; i++) {
			
			System.out.println(arr[i]);
		}
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter two indices to swap: ");
		int index1 = Integer.valueOf(scan.nextLine());
		int index2 = Integer.valueOf(scan.nextLine());
		
		//swapping
		int temp = arr[index1];
		arr[index1] =arr[index2];
		arr[index2] = temp;
		
		for(int j =0; j<arr.length; j++) {
			
			
			System.out.println(arr[j]);
		}
		
	}
	
	public static int sumOfNumbersInArray(int[] arr) {
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
		return sum;
	}
	public static void printNeatly(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
			if(i<arr.length-1) {
				System.out.print(",");
			}
			
		}
		
		
	}
	public static void printArrayInStars(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			
			for(int j =0; j<arr[i];j++) {
				
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}
