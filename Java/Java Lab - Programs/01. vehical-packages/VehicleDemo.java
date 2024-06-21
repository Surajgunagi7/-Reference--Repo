
class Vehicle {
	private String engineNumber;
	private String chassisNumber;
	private String manufacturer;

	public Vehicle(String engineNumber, String chassisNumber, String manufacturer) {
		this.engineNumber = engineNumber;
		this.chassisNumber = chassisNumber;
		this.manufacturer = manufacturer;
	}

	public void displayInfo() {
		System.out.println("Engine Number: " + engineNumber);
		System.out.println("Chassis Number: " + chassisNumber);
		System.out.println("Manufacturer: " + manufacturer);
	}
}

class Car extends Vehicle {
	private int wheels;

	public Car(int wheels, String engineNumber, String chassisNumber, String manufacturer) {
		super(engineNumber, chassisNumber, manufacturer);
		this.wheels = wheels;
	}
	public void displayInfo() {
		System.out.println("Wheels Number: " + wheels);
		super.displayInfo();
	}
}

class Bike extends Vehicle {
	private int wheels;
	public Bike(int wheels, String engineNumber, String chassisNumber, String manufacturer) {
		super(engineNumber, chassisNumber, manufacturer);
		this.wheels = wheels;
	}
	
	public void displayInfo() {
		System.out.println("Wheels Number: " + wheels);
		super.displayInfo();
	}
}

class Truck extends Vehicle {
	private int wheels;
	public Truck(int wheels, String engineNumber, String chassisNumber, String manufacturer) {
		super(engineNumber, chassisNumber, manufacturer);
		this.wheels = wheels;
	}
	
	public void displayInfo() {
		System.out.println("Wheels Number: " + wheels);
		super.displayInfo();
	}
}

public class VehicleDemo {
	public static void main(String[] args) {

		Car myCar = new Car(4, "12345", "C123", "Toyota");
		Bike myBike = new Bike(2, "67890", "B456", "Honda");
		Truck myTruck = new Truck(8, "54321", "T789", "Ford");

		System.out.println("Car Information:");
		myCar.displayInfo();
		System.out.println("\nBike Information:");
		myBike.displayInfo();
		System.out.println("\nTruck Information:");
		myTruck.displayInfo();
	}
}
