package com.avanseus.test;

/**
 * Created by madan on 26/7/18
 */
public class QueueImplUsingArray {
    int array[];
    int front;
    int rear;
    int size;
    int capacity;

    public QueueImplUsingArray(int capacity) {
        this.capacity = capacity;
        this.front = this.size = 0;
        this.array = new int[capacity];
        this.rear = capacity-1;
    }

    public boolean isQueueFull(){
        return capacity == size;
    }

    public void enQueue(int value){
        if (!isQueueFull()){
            rear = (this.rear+1)%capacity;
            array[rear] = value;
            size++;
            System.out.println("value "+value+" is added to the queue.");
        }else {
            System.out.println("Queue is already full. Please dequeue and try again.");
        }
    }

    public boolean isQueueEmpty(){
        return size == 0;
    }

    public void deQueue(){
        if (!isQueueEmpty()){
            int value = array[front];
            front = (this.front+1)%capacity;
            size--;
            System.out.println("Value "+value+" is removed from the queue.");
        }else {
            System.out.println("Queue is already empty.");
        }
    }

    public int getRearElement(){
        if (!isQueueEmpty()){
            return array[rear];
        }
        return Integer.MIN_VALUE;
    }

    public int getFrontElementValue(){
        if (!isQueueEmpty()){
            return array[front];
        }
        return Integer.MIN_VALUE;
    }


    public static void main(String[] args) {
        int capacity = 6;
        QueueImplUsingArray queueImplUsingArray = new QueueImplUsingArray(capacity);
        queueImplUsingArray.enQueue(1);
        queueImplUsingArray.enQueue(2);
        queueImplUsingArray.deQueue();
        queueImplUsingArray.enQueue(3);
        queueImplUsingArray.enQueue(4);
        queueImplUsingArray.enQueue(5);
        queueImplUsingArray.enQueue(6);
        queueImplUsingArray.enQueue(7);
        System.out.println("Rear element value "+queueImplUsingArray.getRearElement());
        System.out.println("Front element value "+queueImplUsingArray.getFrontElementValue());
    }
}
