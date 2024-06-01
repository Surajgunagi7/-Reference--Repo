package sdmcet.cse.oops.basicMath;

public class Basic {

	public boolean primeCheck(int number) {
		if (number <= 1)
			return false;

		if (number > 0 && number <= 3)
			return true;

		if (number % 2 == 0 || number % 3 == 0)
			return false;

		for (int i = 5; i * i <= number; i = i + 6) {
			if (number % i == 0 || number % (i + 2) == 0)
				return false;
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