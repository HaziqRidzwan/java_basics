package java_basics;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.print("Insert Number: ");
		//int i = number.nextInt();

		/*
		 * while (i <= 5) { 
		 * System.out.println("Hello World!"); 
		 * i++; }
		 */
		
		/*
		 * do { System.out.println("Hello World!"); 
		 * i++; } 
		 * while (i<=5);
		 */
		
		for (int i = number.nextInt(); i <= 5; i++) {
			System.out.println("Hello World!");
		}
	}

}
