package com.GFG.LinkList;


import java.lang.*;

class Node22 {
    int data;
    Node22 prev;
    Node22 next;
    Node22(int d){
        data=d;
        prev=null;
        next=null;
    }
}

class Q22_CircularDoublyLinkedList {

    public static void main(String args[])
    {
        Node22 head=new Node22(10);
        Node22 temp1=new Node22(20);
        Node22 temp2=new Node22(30);
        head.next=temp1;
        temp1.next=temp2;
        temp2.next=head;
        temp2.prev=temp1;
        temp1.prev=head;
        head.prev=temp2;
        head=insertAtHead(head,5);
        printlist(head);

    }

    public static void printlist(Node22 head){
        if(head==null)return;
        Node22 r=head;
        do{
            System.out.print(r.data+" ");
            r=r.next;
        }while(r!=head);
    }

    static Node22 insertAtHead(Node22 head, int x){
        Node22 temp=new Node22(x);
        if(head==null){
            temp.next=temp;
            temp.prev=temp;
            return temp;
        }
        temp.prev=head.prev;
        temp.next=head;
        head.prev.next=temp;
        head.prev=temp;
        return temp;
    }
}