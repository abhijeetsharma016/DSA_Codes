package com.GFG.LinkList;

public class Q1_SimpleLinkedList {
    public static void main(String[] args){
        Node1 head = new Node1(10);
        Node1 temp1 = new Node1(20);
        Node1 temp2 = new Node1(30);
        head.next = temp1;
        temp1.next = temp2;
        System.out.print(head.Data+"-->"+temp1.Data+"-->"+temp2.Data);
    }
}
class Node1 {
    int Data;
     Node1 next;
    Node1(int Data){
        this.Data = Data;
        next = null;
    }
}
