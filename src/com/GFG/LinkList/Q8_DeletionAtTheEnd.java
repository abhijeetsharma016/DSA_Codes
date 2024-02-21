package com.GFG.LinkList;

public class Q8_DeletionAtTheEnd {
    public static void main(String[] args){
        Node8 head = new Node8(10);
        head.next = new Node8(20);
        head.next.next = new Node8(30);
        head.next.next.next = new Node8(40);
        head.next.next.next.next = new Node8(50);
        head = deleteFromEnd(head);
        Node8 temp = head;
        while(temp != null){
            System.out.print(temp.data + "--> ");
            temp = temp.next;
        }
    }
    public static Node8 deleteFromEnd(Node8 head){
        Node8 temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
}

class Node8 {
    int data;
    Node8 next;
    Node8(int data){
        this.data = data;
    }
}