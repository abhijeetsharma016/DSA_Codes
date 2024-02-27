package com.GFG.LinkList;

import java.lang.*;

class Node21 {
    int data;
    Node21 next;
    Node21(int d){
        data=d;
        next=null;
    }
}

class Q21_DeleteKthNodeOfACircularLinkedList {

    public static void main(String args[])
    {
        Node21 head=new Node21(10);
        head.next=new Node21(20);
        head.next.next=new Node21(30);
        head.next.next.next=new Node21(40);
        head.next.next.next.next=head;
        head=deleteKth(head,3);
        printlist(head);

    }

    public static void printlist(Node21 head){
        if(head==null)return;
        Node21 r=head;
        do{
            System.out.print(r.data+" ");
            r=r.next;
        }while(r!=head);
    }

    static Node21 deleteKth(Node21 head, int k){
        if(head==null)return head;
        if(k==1)return deleteHead(head);
        Node21 curr=head;
        for(int i=0;i<k-2;i++)
            curr=curr.next;
        curr.next=curr.next.next;
        return head;
    }

    static Node21 deleteHead(Node21 head){
        if(head==null)return null;
        if(head.next==head)
            return null;
        head.data=head.next.data;
        head.next=head.next.next;
        return head;
    }
}
