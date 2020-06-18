package datastructs.stack;

public class StackArrayImpl {
	int size;
	int top;
	int[] stackArr;
	public StackArrayImpl(int size) {
		top = -1;
		this.size = size;
		this.stackArr = new int[size];
	}
	public boolean push(int x) {
		if(top>=(size-1)) {
			System.out.println("Reached Stack max size :: Overflow");
			return false;
		}
		else {
			stackArr[++top]=x;
			System.out.println(x + " : pushed to stack");
			return true;
		}
	}
	public int pop() {
		if(isEmpty()) {
			return -1;
		}
		else {
			int x = stackArr[top--];
			System.out.println(x+" : popped from stack");
			return x;
		}
	}
	public int peek() {
		if(isEmpty()) {
			return -1;
		}
		else {
			int x = stackArr[top];
			System.out.println(x + " : visited value");
			return x;
		}
	}
	public boolean isEmpty() {
		if(top<0) {
			System.out.println("Empty Stack");
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackArrayImpl stack  = new StackArrayImpl(10);
		System.out.println("Check if stack is empty : " + stack.isEmpty());
		stack.peek();
		stack.push(10);
		stack.push(20);
		stack.push(43);
		stack.push(53);
		stack.push(345);
		stack.peek();
		System.out.println("Check if stack is empty : " + stack.isEmpty());
		stack.push(65);
		stack.push(87);
		stack.push(45);
		stack.push(198);
		stack.push(33);
		stack.push(76);
		stack.peek();
		stack.pop();
		stack.push(76);
	}

}
