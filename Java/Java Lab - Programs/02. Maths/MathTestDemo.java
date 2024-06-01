package sdmcet.cse.oop.main;

import sdmcet.cse.oop.advance.*;
import sdmcet.cse.oops.basicMath.Basic;

class Matrix {
	int primaryDiagonal(int arr[][]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					sum = sum + arr[i][i];
				}
			}
		}
		return sum;
	}

	int secondaryDiagonal(int arr[][]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i][arr.length - i - 1];
		}

		return sum;
	}
}

public class MathTestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		
		Basic b1 = new Basic();
		
		if (b1.primeCheck(5)) {
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

		Matrix m1 = new Matrix();
		System.out.println("Primary Diagonal : " + m1.primaryDiagonal(matrix));
		System.out.println("Primary Diagonal : " + m1.secondaryDiagonal(matrix));
	}

}