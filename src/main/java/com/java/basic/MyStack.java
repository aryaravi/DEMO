package com.java.basic;

public class MyStack {
	int a[];
	int top, size, len;

	/* Constructor for arrayStack */
	public MyStack(int n) {
		size = n;
		len = 0;
		a = new int[size];
		top = -1;
	}

	/* Function to check if stack is empty */
	public boolean isEmpty() {
		return top == -1;
	}

	/* Function to check if stack is full */
	public boolean isFull() {
		return top == size - 1;
	}

	/* Function to get the size of the stack */
	public int getSize() {
		return len;
	}

	/* Function to check the top element of the stack */
	public int peek() {

		if (isEmpty())
			System.out.println("the stack is empty");
		else
			return a[top];
		return len;

	}

	/* Function to add an element to the stack */
	public void push(int i) {
		if (top + 1 >= size)

			if (top + 1 < size)
				a[++top] = i;
		len++;
	}

	/* Function to delete an element from the stack */
	public int pop() {
		if (isEmpty())

			len--;
		return a[top--];
	}

	/* Function to display the status of the stack  */
	public void display() {
		System.out.print("Stack = ");
		if (len == 0) {
			System.out.print("Empty\n");
			return;
		}
		for (int i = top; i >= 0; i--)
			System.out.print(a[i] + " ");
		System.out.println();
	}
}
