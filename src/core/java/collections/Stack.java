package core.java.collections;

public class Stack {

	static int MAX = 100;
	int[] arr = new int[MAX];
	int top;

	public Stack() {
		top = -1;
	}

	boolean isEmpty() {
		return top < 0;
	}

	boolean push(int data) {
		if (top < MAX) {
			top = top + 1;
			arr[top] = data;
			System.out.println(data + " pushed to the stack.");
			return true;
		}
		System.out.println("Stack is full");
		return false;
	}

	int pop() {
		if (isEmpty()) {
			System.out.println("No element Exist.");
		}
		top = top - 1;
		int element = arr[top];
		System.out.println(element + " popped out of the stack.");
		return element;
	}

	int peek() {
		if (isEmpty()) {
			System.out.println("No element Exist.");
		}
		return arr[top];
	}
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(10);
		stack.push(50);
		System.out.println("Peek Value: " + stack.peek());
		stack.pop();
	}
}
