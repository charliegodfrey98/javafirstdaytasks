package com.qa.HelloWorldExample;

public class ExamResults {
	public static void main(String[] args) {
		int p = 150;
		int b = 150;
		int c = 150;
		System.out.printf("Physics ", Physics(p));
		System.out.printf("Physics ", p);
		System.out.println(Biology(b));
		System.out.printf("Biology ", b);
		System.out.println(Chemistry(c));
		System.out.printf("Chemistry ", c);
		System.out.println(Total(c, b, p));
		System.out.println(Percentage(c, b, p));

	}

	public static int Physics(int p) {
		return p;
	}

	public static int Biology(int b) {
		return b;
	}

	public static int Chemistry(int c) {
		return c;
	}

	public static int Total(int p, int b, int c) {
		return p + b + c;
	}

	public static int Percentage(int p, int b, int c) {
		return (p + b + c) * 100 / 450;

	}

}
