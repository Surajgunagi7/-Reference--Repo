package cse.main;

import cse.advance.*;
import oops.basicMath.Basic;

public class MathTestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		Basic b1 = new Basic();

		if (b1.primeCheck(11)) {
			System.out.println("It is Prime number");
		} else {
			System.out.println("It is not Prime number");
		}
		System.out.println("Sum : " + b1.sumCalculate(120));

		Advanced a1 = new Advanced();
		System.out.println("Sin : " + a1.sinCalculate(90.0));
		System.out.println("Cos : " + a1.cosCalculate(0));
		System.out.println("tan : " + a1.tanCalculate(45.0));
		System.out.println();

		System.out.println("Primary Diagonal : " + a1.primaryDiagonal(matrix));
		System.out.println("Primary Diagonal : " + a1.secondaryDiagonal(matrix));
	}

}
