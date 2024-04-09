package com.learning.core.day4sessionmorning;

class Queue {
    private int front, rear, capacity;
    private int[] queue;

    public Queue(int capacity) {
        this.capacity = capacity;
        this.front = this.rear = -1;
        this.queue = new int[capacity];
    }

    public void enqueue(int item) {
        if (rear == capacity - 1) {
            System.out.println("Queue is full. Cannot enqueue " + item);
            return;
        }
        if (front == -1)
            front = 0;
        queue[++rear] = item;
        System.out.println("Enqueued: " + item);
    }

    public int dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return -1;
        }
        int item = queue[front++];
        System.out.println("Dequeued: " + item);
        return item;
    }

    public void display() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Elements in queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}

public class D04P094 {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        queue.display();

        queue.dequeue();

        queue.display();
    }
}
