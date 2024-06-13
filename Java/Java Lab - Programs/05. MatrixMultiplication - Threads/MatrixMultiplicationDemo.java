package Thread.Pract;

import java.util.*;

class MatrixMultiplier extends Thread {
	private final int[][] matrixA;
	private final int[][] matrixB;
	private final int[][] resultMatrix;
	private final int row;
	private final int col;

	public MatrixMultiplier(int[][] matrixA, int[][] matrixB, int[][] resultMatrix, int row, int col) {
		this.matrixA = matrixA;
		this.matrixB = matrixB;
		this.resultMatrix = resultMatrix;
		this.row = row;
		this.col = col;
	}

	public void run() {
		int sum = 0;
		for (int i = 0; i < matrixA[row].length; i++) {
			sum += matrixA[row][i] * matrixB[i][col];
		}
		resultMatrix[row][col] = sum;
	}
}

class InvalidMatrixOrderException extends Exception {
	private String title;

	InvalidMatrixOrderException(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return title;
	}

}

public class MatrixMultiplicationDemo {

	static public void read(int[][] matrix) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the order of the Matrix A:");
		int m = sc.nextInt();
		int n = sc.nextInt();
		System.out.println("Enter the order of the Matrix A:");
		int p = sc.nextInt();
		int q = sc.nextInt();

		if (n != p) {
			try {
				throw new InvalidMatrixOrderException("Invalid Order of the Matrix");
			} catch (InvalidMatrixOrderException imo) {
				imo.printStackTrace();
				System.exit(0);
			}
		}

		int[][] matrixA = new int[m][n];
		int[][] matrixB = new int[p][q];
		int[][] resultMatrix = new int[m][q];

		System.out.println("Enter the " + (m * n) + " elements of MatrixA: ");
		read(matrixA);

		System.out.println("Enter the " + (p * q) + " elements of MatrixB: ");
		read(matrixB);
		// Create threads for each element of the result matrix
		Thread[][] threads = new Thread[m][q];
		for (int i = 0; i < matrixA.length; i++) {
			for (int j = 0; j < matrixB[0].length; j++) {
				threads[i][j] = new MatrixMultiplier(matrixA, matrixB, resultMatrix, i, j);
				threads[i][j].start();
			}
		}

		// Wait for all threads to finish
		try {
			for (int i = 0; i < matrixA.length; i++) {
				for (int j = 0; j < matrixB[0].length; j++) {
					threads[i][j].join();
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Display the result matrix
		System.out.println("Result Matrix:");
		for (int i = 0; i < resultMatrix.length; i++) {
			for (int j = 0; j < resultMatrix[0].length; j++) {
				System.out.print(resultMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
