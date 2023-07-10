package com.rajesh.app;

public class Pattern_4 {

	public static void main(String[] args) {

		printPattern1stWay(5);
		printPattern2ndWay(5);
		printPattern3rdWay(5);
	}

	private static void printPattern1stWay(int num) {

		for (int row = 1; row <= num; row++) {
			for (int col = row; col <= num; col++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void printPattern2ndWay(int num) {
		for (int row = 0; row < num; row++) {
			for (int col = 0; col < num; col++) {
				if (col >= num - row - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	private static void printPattern3rdWay(int num) {
		for (int row = 1; row <= num; row++) {
			for (int col = num; col >= 1; col--) {
				if (row >= col) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
