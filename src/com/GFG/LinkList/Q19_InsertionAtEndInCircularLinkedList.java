package com.GFG.LinkList;


class Node19 {
    int data;
    Node19 next;
    Node19(int d){
        data=d;
        next=null;
    }
}



public class Q19_InsertionAtEndInCircularLinkedList {

    public static void main(String args[])
    {
        Node19 head=new Node19(10);
        head.next=new Node19(20);
        head.next.next=new Node19(30);
        head.next.next.next=head;
        head=insertEnd(head,15);
        printlist(head);

    }

    public static void printlist(Node19 head){
        if(head==null)return;
        Node19 r=head;
        do{
            System.out.print(r.data+" ");
            r=r.next;
        }while(r!=head);
    }

    static Node19 insertEnd(Node19 head, int x){
        Node19 temp=new Node19(x);
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