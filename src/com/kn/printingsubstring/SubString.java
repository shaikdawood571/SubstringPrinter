package com.kn.printingsubstring;

import java.util.Scanner;

public class SubString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the String = ");
		String string = scan.next();
		System.out.println("Enter the break point = ");
		int length = scan.nextInt();

		for (int i = 0; i < string.length() - 1; i++) {
			for (int j = i; j < length + i; j++) {
				System.out.print(string.charAt(j));
			}
			if (length + i >= string.length()) {
				break;
			}
			System.out.println();
		}
		scan.close();
	}

}
