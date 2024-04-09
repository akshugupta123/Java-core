package com.learning.core.day4sessionmorning;

class Stack {
    private int maxSize;
    private String[] stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new String[maxSize];
        top = -1;
    }

    public void push(String value) {
        if (top < maxSize - 1) {
            top++;
            stackArray[top] = value;
            System.out.println("Pushed: " + value);
        } else {
            System.out.println("Stack is full. Cannot push " + value);
        }
    }

    public String pop() {
        if (top >= 0) {
            String value = stackArray[top];
            top--;
            return value;
        } else {
            System.out.println("Stack is empty");
            return null;
        }
    }
}

public class D04P091 {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        
        stack.push("Hello");
        stack.push("world");
        stack.push("Java");
        stack.push("Programming");

        System.out.println("After Pushing 4 Elements: " + stack.pop() + " " + stack.pop() + " " + stack.pop());

        stack.push("java");

        System.out.println("After a Pop: " + stack.pop() + " " + stack.pop());
    }
}
