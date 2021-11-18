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
		int oddNumbers = 0;
		int evenNumbers = 0;
		int sum = 0;
		
		for (int i = 0; i < userArray.length; i++) {
			
			userArray[i] = r.nextInt(100);
			
			if (((userArray[i] % 2) != 0) && (i == 0)) {
				
				System.out.println("Odd numbers: ");
				System.out.println(userArray[i]);
				oddNumbers += 1;
			} else if (userArray[i] % 2 == 1) {
				
				System.out.println(userArray[i]);
				oddNumbers += 1;
			}
		}
		
		evenNumbers = userArray.length - oddNumbers;
		System.out.println("Odd numbers: " + oddNumbers);
		System.out.println("Even numbers: " + evenNumbers);
		
		in.close();
	}

}
