package com.GFG.LinkList;

import java.lang.*;

class Node15 {
    int data;
    Node15 prev;
    Node15 next;
    Node15(int d){
        data=d;
        prev=null;
        next=null;
    }
}

class Q15_DeleteTheLastNodeOfDoublyLinkedList {

    public static void main(String args[])
    {
        Node15 head=new Node15(10);
        Node15 temp1=new Node15(20);
        Node15 temp2=new Node15(30);
        head.next=temp1;
        temp1.prev=head;
        temp1.next=temp2;
        temp2.prev=temp1;
        head=delLast(head);
        printlist(head);

    }

    static Node15 delLast(Node15 head){
        if(head==null)return null;
        if(head.next==null){
            return null;
        }
        Node15 curr=head;
        while(curr.next!=null)
            curr=curr.next;
        curr.prev.next=null;
        return head;

    }

    public static void printlist(Node15 head){
        Node15 curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }System.out.println();
    }
}