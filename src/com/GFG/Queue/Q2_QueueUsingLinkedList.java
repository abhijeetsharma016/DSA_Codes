package com.GFG.Queue;


import java.lang.*;
class Q2_Node {
    int key;
    Q2_Node next;


    public Q2_Node(int key)
    {
        this.key = key;
        this.next = null;
    }
}


class Q2_Queue {
    Q2_Node front, rear;

    public Q2_Queue()
    {
        this.front = this.rear = null;
    }


    void enqueue(int key)
    {


        Q2_Node temp = new Q2_Node(key);


        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }


        this.rear.next = temp;
        this.rear = temp;
    }


    void dequeue()
    {

        if (this.front == null)
            return;


        Q2_Node temp = this.front;
        this.front = this.front.next;


        if (this.front == null)
            this.rear = null;
    }
}


public class Q2_QueueUsingLinkedList {
    public static void main(String[] args)
    {
        Q2_Queue q = new Q2_Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.dequeue();
        q.dequeue();
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.dequeue();
        System.out.println("Queue Front : " + q.front.key);
        System.out.println("Queue Rear : " + q.rear.key);
    }
}

