package com.GFG.LinkList;

public class Q20_DeleteHeadOfACircularLinkedList {
    public static void main(String[] args) {
        Node20 head=new Node20(10);
        head.next=new Node20(20);
        head.next.next=new Node20(30);
        head.next.next.next=new Node20(40);
        head.next.next.next.next=head;
        head=delHead(head);
        printlist(head);
    }

    public static Node20 delHead(Node20 head){
        if(head == null){
            return head;
        }
        Node20 temp = head;
        temp.data = temp.next.data;
        temp.next = temp.next.next;
        return  temp;
    }
    public static void printlist(Node20 head){
        if(head==null)return;
        Node20 r=head;
        do{
            System.out.print(r.data+" ");
            r=r.next;
        }while(r!=head);
    }
}
class Node20 {
    int data;
    Node20 next;
    Node20(int data){
        this.data = data;
        this.next = null;
    }
}
