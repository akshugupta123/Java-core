package com.learning.core.day4sessionmorning;

public class D04P096 {
    public static class CircularQueue {
        private int maxSize;
        private int[] queue;
        private int front;
        private int rear;
        private int currentSize;

        public CircularQueue(int size) {
            maxSize = size;
            queue = new int[maxSize];
            front = 0;
            rear = -1;
            currentSize = 0;
        }

        public void enqueue(int item) {
            if (isFull()) {
                System.out.println("Queue is full. Cannot enqueue " + item);
                return;
            }
            rear = (rear + 1) % maxSize;
            queue[rear] = item;
            currentSize++;
        }

        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int removedItem = queue[front];
            front = (front + 1) % maxSize;
            currentSize--;
            return removedItem;
        }

        public void display() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            System.out.print("Elements in circular queue: ");
            int count = 0;
            int i = front;
            while (count < currentSize) {
                System.out.print(queue[i] + " ");
                i = (i + 1) % maxSize;
                count++;
            }
            System.out.println();
        }

        public boolean isEmpty() {
            return currentSize == 0;
        }

        public boolean isFull() {
            return currentSize == maxSize;
        }
    }

    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(5);

        circularQueue.enqueue(14);
        circularQueue.enqueue(13);
        circularQueue.enqueue(22);
        circularQueue.enqueue(-8);

        circularQueue.display();

        circularQueue.dequeue();

        System.out.print("After removing first element: ");
        circularQueue.display();
    }
}
