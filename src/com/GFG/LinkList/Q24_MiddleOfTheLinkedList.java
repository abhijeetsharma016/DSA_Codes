package com.GFG.LinkList;

public class Q24_MiddleOfTheLinkedList {
    public static void main(String[] args){
        Node24 head=new Node24(10);
        head.next=new Node24(20);
        head.next.next=new Node24(30);
        head.next.next.next=new Node24(40);
        head.next.next.next.next=new Node24(50);
        printlist(head);
        System.out.print("Position of element in Linked List: ");
        printMiddle(head);
    }
    public static void printMiddle(Node24 head){
        if(head == null){
            System.out.println("");
            System.out.print("No head found");
        }
        Node24 slow = head;
        Node24 fast = head;
        while(fast!= null && fast.next != null){
            slow = slow.next;//its important to write this first to handel even case
            fast = fast.next.next;
        }
        System.out.print(slow.data);
    }


    public static void printlist(Node24 head){
        while(head!=null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println("");
    }
}
class Node24 {
    int data;
    Node24 next;
    Node24(int data){
        this.data = data;
    }
}
