package sdmcet.cse.oop.advance;

public class Advanced {
	public double sinCalculate(double degree) {
		return Math.sin(Math.toRadians(degree));
	}
	public double cosCalculate(double degree) {
		return Math.cos(Math.toRadians(degree));
	}
	public double tanCalculate(double degree) {
		return Math.tan(Math.toRadians(degree));
	}
	
	int primaryDiagonal(int arr[][]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j) {
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
