package sdmcet.cse.oop.collections;

import java.util.*;

public class StackDemo {

	public static void main(String[] args) {

		Stack<Integer> st = new Stack<Integer>();

		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);

		System.out.println("Peek: " + st.peek());

		System.out.println("\nStack Elements: " + st);

		// No exceptions
		// Pop on a empty generates an exceptions
		try {
			st.pop();
			st.pop();
			st.pop();
			st.pop();
			st.pop();

			System.out.println("Stack Elements: " + st);
			st.pop();
		} catch (EmptyStackException es) {
			System.out.println("\n!!EXCEPTION: Cannot pop on a Empty stack!");
		}

	}

}
