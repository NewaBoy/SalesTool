package com.test.github;

public class SalesData {

	int data[] = { 0, 4, 12 };

	public void display() {
		System.out.println("Data: ");
		for (int i = 0; i < data.length; i++) {
			System.out.println("Next value: " + data[i]);
		}
	}

}
