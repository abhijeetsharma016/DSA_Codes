package com.GFG.LinkList;

public class Q16_CircularLinkedList {
    public static void main(String args[])
    {
        Node16 head=new Node16(10);
        head.next=new Node16(5);
        head.next.next=new Node16(20);
        head.next.next.next=new Node16(15);
        head.next.next.next.next=head;
    }
}
class Node16{
    int data;
    Node16 next;
    Node16(int data){
        this.data = data;
    }
}