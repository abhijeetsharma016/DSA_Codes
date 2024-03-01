package com.GFG.LinkList;


import java.lang.*;

class Node27 {
    int data;
    Node27 next;
    Node27(int x){
        data=x;
        next=null;
    }
}

class Q27_RecursiveReverseOfLinkedList {

    public static void main(String args[])
    {
        Node27 head=new Node27(10);
        head.next=new Node27(20);
        head.next.next=new Node27(30);
        printlist(head);
        head=recRevL(head,null);
        printlist(head);

    }

    static Node27 recRevL(Node27 curr, Node27 prev){
        if(curr==null)return prev;
        Node27 next=curr.next;
        curr.next=prev;
        return recRevL(next,curr);
    }

    public static void printlist(Node27 head){
        Node27 curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }System.out.println();
    }
}