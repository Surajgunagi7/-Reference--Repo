package sdmcet.cse.oop.thread.Calculator;

import java.util.Scanner;

class Addition extends Thread {
	private int num1;
	private int num2;
	
	public Addition(int num1,int num2) {
		this.num1 = num1;
		this.num2 = num2;
		start();
	}
	
	public void run() {
		System.out.println("Sum of " + this.num1 + " " + this.num2 + " : " + (this.num1 + this.num2));
	}
}

class Subtraction extends Thread {
	private int num1;
	private int num2;
	
	public Subtraction(int num1,int num2) {
		this.num1 = num1;
		this.num2 = num2;
		start();
	}
	
	public void run() {
		System.out.println("Difference of " + this.num1 + " " + this.num2 + " : " + (this.num1 - this.num2));
	}
}

class Multiplication extends Thread {
	private int num1;
	private int num2;
	
	public Multiplication(int num1,int num2) {
		this.num1 = num1;
		this.num2 = num2;
		start();
	}
	
	public void run() {
		System.out.println("Product of " + this.num1 + " " + this.num2 + " : " + (this.num1 * this.num2));
	}
}

class Division extends Thread {
	private int num1;
	private int num2;
	
	public Division(int num1,int num2) {
		this.num1 = num1;
		this.num2 = num2;
		start();
	}
	
	public void run() {
		System.out.println("Quotient of " + this.num1 + " " + this.num2 + " : " + (this.num1 / this.num2));
	}
}

public class CalculatorDemo {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Number - 1 :");
			int num1 = sc.nextInt();
			
			System.out.println("Enter Number - 2");
			int num2 = sc.nextInt();
			
			System.out.println("Enter the operation to Perform :");
			char operation = sc.next().charAt(0);
			
			if (operation == '+') {
				Addition add = new Addition(num1, num2);
				try  {
					add.join();
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else if (operation == '-') {
				Subtraction sub = new Subtraction(num1, num2);
				try  {
					sub.join();
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else if (operation == '*') {
				Multiplication mul = new Multiplication(num1, num2);
				try  {
					mul.join();
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else if(operation == '/') {
				Division div = new Division(num1, num2);
				try  {
					div.join();
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else {
				System.out.println("Invalid operation request");
			}
			
		}

}
