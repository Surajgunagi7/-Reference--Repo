package pract;

import java.util.Arrays;

class GenericStack<T> {
    private int maxSize;
    private T[] stackArray;
    private int top;

    public GenericStack(int size) {
        maxSize = size;
        // Creating array of type T
        stackArray = (T[]) new Object[maxSize];
        top = -1;
    }

    public void push(T item) {
        if (!isFull()) {
            stackArray[++top] = item;
        } else {
            System.out.println("Stack is full. Cannot push element: " + item);
        }
    }

    public T pop() {
        if (!isEmpty()) {
            T item = stackArray[top];
            stackArray[top--] = null; // Remove reference to object for garbage collection
            return item;
        } else {
            System.out.println("Stack is empty. Cannot pop.");
            return null;
        }
    }

    public T peek() {
        if (!isEmpty()) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty. No element to peek.");
            return null;
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    @Override
    public String toString() {
        return "GenericStack{" +
                "maxSize=" + maxSize +
                ", stackArray=" + Arrays.toString(stackArray) +
                ", top=" + top +
                '}';
    }
}

public class StackDemo {
    public static void main(String[] args) {
        // Integer stack
        GenericStack<Integer> intStack = new GenericStack<>(5);
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);
        System.out.println("Integer Stack:");
        System.out.println("Peek: " + intStack.peek());
        System.out.println("Pop: " + intStack.pop());
        System.out.println("Peek after pop: " + intStack.peek());

        // String stack
        GenericStack<String> stringStack = new GenericStack<>(3);
        stringStack.push("Hello");
        stringStack.push("World");
        System.out.println("\nString Stack:");
        System.out.println("Peek: " + stringStack.peek());
        System.out.println("Pop: " + stringStack.pop());
        System.out.println("Peek after pop: " + stringStack.peek());
    }
}
