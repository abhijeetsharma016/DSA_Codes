package com.GFG.LinkList;

import java.lang.*;

class Node14 {
    int data;
    Node14 prev;
    Node14 next;
    Node14(int d){
        data=d;
        prev=null;
        next=null;
    }
}

class Q14_DeleteHeadOfADoublyLinkedList {

    public static void main(String args[])
    {
        Node14 head=new Node14(10);
        Node14 temp1=new Node14(20);
        Node14 temp2=new Node14(30);
        head.next=temp1;
        temp1.prev=head;
        temp1.next=temp2;
        temp2.prev=temp1;
        head=delHead(head);
        printlist(head);

    }

    static Node14 delHead(Node14 head){
        if(head==null)return null;
        if(head.next==null){
            return null;
        }
        else{
            head=head.next;
            head.prev=null;
            return head;
        }
    }

    public static void printlist(Node14 head){
        Node14 curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }System.out.println();
    }
}