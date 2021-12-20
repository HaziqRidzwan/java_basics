package java_basics;

import java.util.Scanner;

public class NestedLoop {

	public static void main(String[] args) {
		
		Scanner number = new Scanner(System.in);
		System.out.print("Select horizontal * amount: ");
		int k = Integer.parseInt(number.nextLine());
		
		Scanner number2 = new Scanner(System.in);
		System.out.print("Select vertical * amount: ");
		int l = Integer.parseInt(number2.nextLine());
		

		for (int i = 1; i <= l; i++) {
			for (int j = 1; j <= k; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
