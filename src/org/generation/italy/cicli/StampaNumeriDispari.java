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
		
		for (int i = 0; i < userArray.length; i++) {
			
			userArray[i] = r.nextInt(100);
			
			if (((userArray[i] % 2) != 0) && (i == 0)) {
				
				System.out.println("Odd numbers: ");
				System.out.println(userArray[i]);
			} else if (userArray[i] % 2 == 1) {
				
				System.out.println(userArray[i]);
			}
		}
		
		in.close();
	}

}
