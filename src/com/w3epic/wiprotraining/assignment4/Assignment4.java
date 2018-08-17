/*
Write a class MathOperation which accepts integers from command line. 
Create an array using these parameters. Loop through the array and obtain the sum and 
average of all the elements. 
Display the result. 
Check for various exceptions that may arise like ArithmeticException, NumberFormatException, and so on.
For example: The class would be invoked as follows: 
C:>java MathOperation 1900, 4560, 0, 32500

 * */

package com.w3epic.wiprotraining.assignment4;

import java.util.InputMismatchException;

public class Assignment4 {

	public static void main(String[] args) {
		int n = args.length;
		
		for (int i = 0; i < n; i++)
			if (args[i].charAt(args[i].length() - 1) == ',') 
				args[i] = args[i].replace(",", "");
		
		//System.out.println(Arrays.toString(args));
		
		int[] arr = new int[n];

		int sum = 0;
		double avg = 0;
		
		try {
			for (int i = 0; i < n; i++)
				arr[i] = Integer.parseInt(args[i]);
			
			for (int i = 0; i < n; i++)
				sum += arr[i];
			
			avg = sum / n;
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException");
		}
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
		
	}

}
