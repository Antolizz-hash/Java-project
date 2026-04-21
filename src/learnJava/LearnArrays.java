package learnJava;

import java.util.Scanner;

public class LearnArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swapArrays();

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

}
