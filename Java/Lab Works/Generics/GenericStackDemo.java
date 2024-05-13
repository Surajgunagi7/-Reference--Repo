package sdmcet.cse.oop.generics;

import java.util.Arrays;

class Stack<T> {
	T stack[];
	int top;
	
	Stack(T stack[]) {
		this.top = -1;
		this.stack = stack;
		
	}

	void push(T element) {

		stack[++top] = element;
	}
	
	T pop() {
		return stack[top--];
	}
	
	void display() {
		System.out.println("Stack Elements : ");
		
	}
}
public class GenericStackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = new Integer[10];
		Stack<Integer> stk = new Stack<Integer>(a);
		
		stk.push(10);
		stk.push(20);
		System.out.println(stk.pop());
		stk.display();
	}

}
