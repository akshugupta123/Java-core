package com.learning.core.day4sessionmorning;

class MyNode {
    int data;
    MyNode next;

    public MyNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class MyQueue {
    private MyNode front, rear;

    public MyQueue() {
        this.front = this.rear = null;
    }

    public void enqueue(int item) {
        MyNode newNode = new MyNode(item);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        int item = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return item;
    }

    public void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        MyNode temp = front;
        System.out.print("Elements in queue: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class D04P095 {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.enqueue(89);
        queue.enqueue(99);
        queue.enqueue(109);
        queue.enqueue(209);
        queue.enqueue(309);

        queue.display();

        queue.dequeue();
        queue.dequeue();

        System.out.print("After removing two elements: ");
        queue.display();
    }
}
