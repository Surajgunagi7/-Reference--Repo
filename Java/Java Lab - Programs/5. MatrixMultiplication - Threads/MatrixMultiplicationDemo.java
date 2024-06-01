
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

public class MatrixMultiplicationDemo {
	public static void main(String[] args) {
		int[][] matrixA = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] matrixB = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };
		int[][] resultMatrix = new int[matrixA.length][matrixB[0].length];

		// Create threads for each element of the result matrix
		Thread[][] threads = new Thread[matrixA.length][matrixB[0].length];
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
