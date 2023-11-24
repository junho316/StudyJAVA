package com.javaStudy.stack;

public class ArrayStack implements Stack {
	private int top;
	private int stackSize;
	private char itemArray[];

	public ArrayStack() {
		top = -1;
	}

	public ArrayStack(int stackSize) {
		this.stackSize = stackSize;
		this.itemArray = new char[stackSize];
	}

	@Override
	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top == this.stackSize - 1);
	}

	@Override
	public void push(char item) {
		if (isFull()) {
			System.out.println("Inserting fail Array Stack is full");
		} else {
			itemArray[top + 1] = item;
			top++;
			System.out.println("Inserted Item : " + item);
		}

	}

	@Override
	public char pop() {
		if (isEmpty()) {
			System.out.println("Deleting fail! Array Stack is empty!!");
		} else {
			char popItem = itemArray[top];
			char temp[] = new char[itemArray.length];
			for (int i = 0; i < top; i++) {
				temp[i] = itemArray[i];
			}
			itemArray = temp;
			top--;
			return popItem;
		}
		return 0;
	}

	@Override
	public void delete() {
		if (isEmpty()) {
			System.out.println("Deleting fail! Array Stack is empty!!");
		} else {
			this.itemArray = new char[stackSize];
			top = -1;
		}
	}

	@Override
	public char peek() {
		if (isEmpty()) {
			System.out.println("Peeking fail! Array Stack is empty!!");
			return 0;
		} else {
			return itemArray[top];
		}
	}

	public void printStack() {
		if (isEmpty()) {
			System.out.printf("Array Stack is empty!! %n %n");
		} else {
			System.out.printf("Array Stack>>");
			for (int i = 0; i <= top; i++) {
				System.out.printf("%c ", itemArray[i]);

			}
			System.out.println();
		}
	}

}
