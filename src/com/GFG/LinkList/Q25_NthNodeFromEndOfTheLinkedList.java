package com.GFG.LinkList;

import java.lang.*;

class Node25 {
    int data;
    Node25 next;
    Node25(int x){
        data=x;
        next=null;
    }
}

class Q25_NthNodeFromEndOfTheLinkedList {

    public static void main(String args[])
    {
        Node25 head=new Node25(10);
        head.next=new Node25(20);
        head.next.next=new Node25(30);
        head.next.next.next=new Node25(40);
        head.next.next.next.next=new Node25(50);
        printlist(head);
        System.out.print("Nth node from end of Linked List: ");
        printNthFromEnd(head,2);

    }

    static void printNthFromEnd(Node25 head, int n){
        if(head==null)return;
        Node25 first=head;
        for(int i=0;i<n;i++){
            if(first==null)return;
            first=first.next;
        }
        Node25 second=head;
        while(first!=null){
            second=second.next;
            first=first.next;
        }
        System.out.print(second.data);
    }

    public static void printlist(Node25 head){
        Node25 curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }System.out.println();
    }
} 
