package oops.basicMath;

public class Basic {

	public boolean primeCheck(int number) {
		if (number <= 1)
			return false;

		for (int i = 2; i < number / 2; i++) {
			if (number % i== 0) {
				return false;
			}
		}
		return true;
	}

	public int sumCalculate(int number) {
		int sum = 0;

		while (number != 0) {
			int digit = number % 10;
			sum += digit;
			number /= 10;
		}
		return sum;
	}
}
