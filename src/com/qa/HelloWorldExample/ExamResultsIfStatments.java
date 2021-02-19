package com.qa.HelloWorldExample;

public class ExamResultsIfStatments {
	public static void main(String[] args) {
		int p = 150;
		int b = 150;
		int c = 150;
		System.out.println(Physics(p));
		System.out.println(p);
		System.out.println(PhysicsPercentage(p));
		System.out.println(Biology(b));
		System.out.println(b);
		System.out.println(BiologyPercentage(b));
		System.out.println(Chemistry(c));
		System.out.println(c);
		System.out.println(ChemistryPercentage(c));
		System.out.println(Total(c, b, p));
		System.out.println(Percentage(c, b, p));
		System.out.println(PassFail(c, b, p));
		System.out.println(OverAllPassFail(c, b, p));

	}

	public static int Physics(int p) {
		System.out.println("Physics");
		return p;
	}

	public static int PhysicsPercentage(int p) {
		int Phperc = p * 100 / 150;
		System.out.println("Physics percentage");
		return Phperc;
	}

	public static int Biology(int b) {
		System.out.println("Biology");
		return b;
	}

	public static int BiologyPercentage(int b) {
		int Bioperc = b * 100 / 150;
		System.out.println("Biology percentage");
		return Bioperc;
	}

	public static int Chemistry(int c) {
		System.out.println("Chemistry");
		return c;
	}

	public static int ChemistryPercentage(int c) {
		int Chemperc = c * 100 / 150;
		System.out.println("Chemistry percentage");
		return Chemperc;
	}

	public static int Total(int p, int b, int c) {
		System.out.println("Total");
		return p + b + c;
	}

	public static int Percentage(int p, int b, int c) {
		int SUM = (p + b + c) * 100 / 450;
		System.out.println("Percentage");
		return SUM;

	}

	public static int PassFail(int p, int b, int c) {
		int perc = (p + b + c) * 100 / 450;
		if (perc > 60) {
			System.out.println("you have passed your thank the elder gods");
			return perc;
		} else {
			System.out.println("you failed, go consult with the elder gods");
			return perc;
		}

	}

	public static int OverAllPassFail(int p, int b, int c) {
		int Chemperc2 = c * 100 / 150;
		int Bioperc2 = b * 100 / 150;
		int Phperc2 = p * 100 / 150;
		int totalperc = (p + b + c) * 100 / 450;
		if (Chemperc2 > 60 && Bioperc2 > 60 && Phperc2 > 60) {
			System.out.println("you have proven worthy of the elder gods");
			return totalperc;
		} else {
			System.out.println("you have failed again consult with more elder gods");
			return totalperc;
		}
	}

}