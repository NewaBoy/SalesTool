package com.test.github;

public class Main {

	public static void main(String[] args) {

		SalesData data = new SalesData();
		data.display();

		System.out.println("Test One");
		System.out.println("Test Two");

		displayGreeting();

		System.out.println("Version 2.0");
		System.out.println("fix release v2.0 with v2.1");
		
	}

	private static void displayGreeting() {
		System.out.println("Hello Happy Sales People!!!");
		System.out.println("This app shows sales data.");
		System.out.println("**************************");

	}

}
