package com.avanseus.test;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by madan on 26/7/18
 */
public class QueueImplUsingLinkedList {
    public QNode front, rear;

    public QueueImplUsingLinkedList() {
        this.front = null;
        this.rear = null;
    }

    class QNode{
        private int key;
        private QNode next;

        public QNode(int key) {
            this.key = key;
            this.next = null;
        }
    }

    public void enQueue(int key){
        QNode temp = new QNode(key);
        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }
        this.rear.next = temp;
        this.rear = temp;
        System.out.println("value "+key+" is added to the queue.");
    }

    public void deQueue(){
        if (this.front != null){
            QNode temp = this.front;
            this.front = this.front.next;
            if (this.front == null) this.rear = null;
            System.out.println("Value "+temp.key+" is removed from the queue.");
        }
    }

    public int getRearElement(){
        if (this.rear != null){
            return this.rear.key;
        }
        return Integer.MIN_VALUE;
    }

    public int getFrontElementValue(){
        if (this.front != null){
            return this.front.key;
        }
        return Integer.MIN_VALUE;
    }

    public static void main(String[] args){
        QueueImplUsingLinkedList queueImplUsingLinkedList = new QueueImplUsingLinkedList();
        queueImplUsingLinkedList.enQueue(1);
        queueImplUsingLinkedList.enQueue(2);
        queueImplUsingLinkedList.deQueue();
        queueImplUsingLinkedList.enQueue(3);
        queueImplUsingLinkedList.enQueue(4);
        queueImplUsingLinkedList.enQueue(5);
        queueImplUsingLinkedList.enQueue(6);
        queueImplUsingLinkedList.enQueue(7);
        System.out.println("Rear element value "+queueImplUsingLinkedList.getRearElement());
        System.out.println("Front element value "+queueImplUsingLinkedList.getFrontElementValue());
    }
}
