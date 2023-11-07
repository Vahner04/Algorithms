package org.example.task6;

public class CustomQueue {
    private int[] data;
    private int head;
    private int tail;

    public CustomQueue(int capacity){
        data = new int[capacity];
        head = -1;
        tail = -1;
    }

    public void enqueue(int element) {
        if (tail == data.length - 1) {
            throw new RuntimeException("Queue is full");
        }
        if (isEmpty()) {
            head = 0;
        }
        data[++tail] = element;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        int element = data[head++];
        if (head > tail) {

            head = -1;
            tail = -1;
        }
        return element;
    }
    public boolean isEmpty() {
        return head == -1;
    }

    public int size() {
        if (isEmpty()) {
            return 0;
        }
        return tail - head + 1;
    }

    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
