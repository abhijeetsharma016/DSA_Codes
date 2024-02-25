package com.GFG.LinkList;


class Node18 {
    int data;
    Node18 next;
    Node18(int d){
        data=d;
        next=null;
    }
}

public class Q18_InsertionAtBeginningInCircularLinkedList {

    public static void main(String args[])
    {
        Node18 head=new Node18(10);
        head.next=new Node18(20);
        head.next.next=new Node18(30);
        head.next.next.next=head;
        head=insertEnd(head,15);
        printlist(head);

    }

    public static void printlist(Node18 head){
        if(head==null)return;
        Node18 r=head;
        do{
            System.out.print(r.data+" ");
            r=r.next;
        }while(r!=head);
    }

    static Node18 insertEnd(Node18 head, int x){
        Node18 temp=new Node18(x);
        if(head==null){
            temp.next=temp;
            return temp;
        }
        else{
            temp.next=head.next;
            head.next=temp;
            int t=head.data;
            head.data=temp.data;
            temp.data=t;
            return temp;
        }
    }
}