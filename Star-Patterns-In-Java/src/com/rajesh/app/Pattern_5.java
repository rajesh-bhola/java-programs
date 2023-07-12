package com.rajesh.app;

public class Pattern_5 {

	public static void main(String[] args) {

		printPattern1stWay(5);
		printPattern2ndWay(5);

	}

	private static void printPattern1stWay(int num) {

		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(" ");
			}
			for (int col = row; col <= num; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void printPattern2ndWay(int num) {
		for (int row = 1; row <= num; row++) {
			for (int col = 1; col <= num; col++) {
				if (col < row) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
