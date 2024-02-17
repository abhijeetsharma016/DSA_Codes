package com.GFG.LinkList;

public class Q1_SimpleLinkedList {
    public static void main(String[] args){
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.next = temp2;
        System.out.print(head.Data+"-->"+temp1.Data+"-->"+temp2.Data);
    }
}
class Node{
    int Data;
     Node next;
    Node(int Data){
        this.Data = Data;
        next = null;
    }
}
