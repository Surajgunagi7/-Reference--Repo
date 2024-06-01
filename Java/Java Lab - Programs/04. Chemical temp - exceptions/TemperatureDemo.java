

class TemperatureException extends Exception {
	private String title;

	public TemperatureException(String title) {
		this.title = title;
	}

	public String toString() {
		return title;
	}
}

public class TemperatureDemo {
	public static void main(String[] args) {

		int temperature = 30;

		if (temperature > 300) {
			try {
				throw new TemperatureException("Temperature Exceeding the 300 mark");
			} catch (TemperatureException t) {
				t.printStackTrace();
			}
		} else if (temperature < 100) {
			try {
				throw new TemperatureException("Temperature is Dropping below 100");
			} catch (TemperatureException t) {
				t.printStackTrace();
			}
		} else {
			System.out.println("Temperature is Nominal");
		}
	}
}