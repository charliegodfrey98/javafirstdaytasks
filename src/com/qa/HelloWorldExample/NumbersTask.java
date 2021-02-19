package com.qa.HelloWorldExample;

public class NumbersTask {
	static String[] tens = { "", "teen", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninty" };
	static String[] num = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
	static String[] elevenTwelve = { "", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
			"seventeen", "eighteen", "nineteen" };

	public static void main(String[] args) {
		int p = 90;
		if (p == 10 || p == 11 || p == 12 || p == 13 || p == 14 || p == 15 || p == 16 || p == 17 || p == 18
				|| p == 19) {
			ten(p);
		} else {
			numbers(p);
		}
	}

	public static void numbers(int p) {
		int smalllnum = p % 10;
		int teennum = p / 10;
		String s = num[smalllnum];
		String b = tens[teennum];
		System.out.println(b + s);

	}

	public static void ten(int p) {
		int smallnum = p % 10;
		int teennum = p / 10;
		int weirdnumbers = smallnum + teennum;
		String weirdmethod = elevenTwelve[weirdnumbers];
		System.out.println(weirdmethod);
	}

}
