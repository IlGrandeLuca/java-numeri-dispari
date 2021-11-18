package org.generation.italy.cicli;

import java.util.Scanner;
import java.util.Random;

public class StampaNumeriDispari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		
		System.out.print("Enter array length: ");
		int position = in.nextInt();
		int[] userArray = new int[position];
		
		// Counter
		int oddNumbers = 0;
		int evenNumbers = 0;
		
		int sum = 0;
		
		// Write random numbers in the array
		for (int i = 0; i < userArray.length; i++) {
			
			userArray[i] = r.nextInt(100);
			
			// Sum of number between 10 and 50
			if ((userArray[i] > 10) && (userArray[i] < 50)) {
				
				sum += userArray[i];
			}
			
			// Check odd numbers
			if (((userArray[i] % 2) != 0) && (i == 0)) {
				
				System.out.println("Odd numbers: ");
				System.out.println(userArray[i]);
				oddNumbers += 1;
			} else if (userArray[i] % 2 == 1) {
				
				System.out.println(userArray[i]);
				oddNumbers += 1;
			} else {
				
				evenNumbers += 1;
			}
		}
		
		// Print results
		//evenNumbers = userArray.length - oddNumbers;
		System.out.println("Odd numbers: " + oddNumbers);
		System.out.println("Even numbers: " + evenNumbers);
		System.out.println("Sum of numbers between 10 and 50: " + sum);
		
		in.close();
	}

}
