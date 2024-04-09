package com.learning.core.day4sessionmorning;

class Node {
    double data;
    Node next;

    public Node(double data) {
        this.data = data;
        this.next = null;
    }
}

public class D04P092 {
    private Node top;

    public D04P092() {
        this.top = null;
    }

    public void push(double value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    public double pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return Double.NaN;
        } else {
            double poppedValue = top.data;
            top = top.next;
            return poppedValue;
        }
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void display() {
        Node temp = top;
        System.out.print("The elements of the stack are: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        D04P092 stack = new D04P092();

        // Pushing elements onto the stack
        stack.push(10.0);
        stack.push(20.0);
        stack.push(30.0);
        stack.push(40.0);

        // Displaying the stack
        stack.display();

        // Popping twice
        System.out.println("After popping twice: " + stack.pop() + " " + stack.pop() + " " + stack.pop());
    }
}
