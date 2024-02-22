package com.GFG.LinkList;

public class Q10_DoublyLinkedList {
    public static void main(String[] args) {
        Node10 head = new Node10(10);
        head.next = new Node10(20);
        head.next.next = new Node10(30);
        head.next.next.next= new Node10(40);
        head.next.prev = head;
        head.next.next.prev= head.next;
        head.next.next.next.prev = head.next.next;
        printlist(head);
    }
    public static void printlist(Node10 head){
        Node10 curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }System.out.println();
    }
}


class Node10{
    int data;
    Node10 next;
    Node10 prev;
    Node10(int data){
        this.data = data;
    }
}