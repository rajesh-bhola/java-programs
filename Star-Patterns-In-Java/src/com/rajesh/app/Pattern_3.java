package com.rajesh.app;

public class Pattern_3 {

	public static void main(String[] args) {

		System.out.println("1st way");
		printPattern1stWay(5);
		System.out.println();

		System.out.println("2nd way");
		printPattern2ndWay(5);
		System.out.println();

		System.out.println("3rd way");
		printPattern3rdWay(5);
		System.out.println();

		System.out.println("4th way");
		printPattern4thWay(5);
		System.out.println();

	}

	public static void printPattern1stWay(int num) {
		for (int row = 1; row <= num; row++) {
			for (int col = num; col >= row; col--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void printPattern2ndWay(int num) {
		for (int row = num; row >= 1; row--) {
			for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void printPattern3rdWay(int num) {
		for (int row = num; row >= 1; row--) {
			System.out.println("* ".repeat(row));
		}
	}

	public static void printPattern4thWay(int num) {
		for (int row = 1; row <= num; row++) {
			StringBuilder pattern = new StringBuilder();
			for (int col = num; col >= row; col--) {
				pattern.append("* ");
			}
			System.out.println(pattern.toString());
		}
	}
}
