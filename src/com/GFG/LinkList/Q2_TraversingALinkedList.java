package com.GFG.LinkList;

public class Q2_TraversingALinkedList {
    public static void main(String[] args) {
        Node2 Head = new Node2(10);
        Head.next = new Node2(20);
        Head.next.next = new Node2(30);
        Head.next.next.next = new Node2(40);
        traverseList(Head);
    }

    public static void traverseList(Node2 Head) {
        Node2 temp = Head;
        while (temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
    }
}
class Node2{
    int data;
    Node2 next;
    Node2(int data){
        this.data = data;
        this.next = null;
    }
}
