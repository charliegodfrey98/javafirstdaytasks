package com.qa.HelloWorldExample;

public class loopspractice {

	public static void main(String[] args) {
		for (int i = 100; i <= 200; i++) {
			System.out.println(i);
		}

		for (int i = 100; i <= 200; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " -");
			} else {
				System.out.println(i + " *");
			}
		}

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++)
				System.out.println(i);
		}

	}

}
