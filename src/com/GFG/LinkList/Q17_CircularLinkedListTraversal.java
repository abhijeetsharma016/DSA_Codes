package com.GFG.LinkList;

public class Q17_CircularLinkedListTraversal {
    public static void main(String[] args){
        Node16 head=new Node16(10);
        head.next=new Node16(5);
        head.next.next=new Node16(20);
        head.next.next.next=new Node16(15);
        head.next.next.next.next=head;
        printlist(head);
    }
    public static void printlist(Node16 head){
        if(head == null) return;
        System.out.print(head.data+ " ");
        for(Node16 r = head.next; r!= head; r = r.next){
            System.out.print(r.data + " ");
        }
    }
}
