package com.GFG.LinkList;

public class Q3_RecursionTraversingOfALinkedList {
    public static void main(String[] args){
        Node3 Head = new Node3(10);
        Head.next = new Node3(20);
        Head.next.next = new Node3(30);
        Head.next.next.next = new Node3(40);
        Node3 temp = Head;
        traverseList(Head, temp);
    }

    public static void traverseList(Node3 Head, Node3 temp) {
        if(temp == null){
            return;
        }
        System.out.print(temp.data + "--> ");
        traverseList(Head, temp.next);
    }
}
class Node3{
    int data;
    Node3 next;
    Node3(int data){
        this.data = data;
        this.next = null;
    }
}
