package com.GFG.LinkList;

public class Q41_MergeTwoSortedLinkedList {
    public static void main(String[] args) {
        Node41 a=new Node41(10);
        a.next=new Node41(20);
        a.next.next=new Node41(30);
        Node41 b=new Node41(5);
        b.next=new Node41(35);
        printlist(sortedMerge(a,b));
    }

    public static Node41 sortedMerge(Node41 a, Node41 b) {
        Node41 head, tail;
        if(a == null){
            return b;
        } else if (b == null) {
            return a;
        }
        if(a.data<b.data){
            head = a;
            tail = a;
            a = a.next;
        }
        else{
            head = b;
            tail = b;
            b = b.next;
        }

        while(a != null && b!= null){
            if (a.data < b.data) {
                tail.next = a;
                tail = a;
                a = a.next;
            }
            else{
                tail.next = b;
                tail = b;
                tail.next = b;
            }
        }
        if(a!= null){
            while (a != null) {
                tail.next = a;
                tail=a;
                a = a.next;
            }
        }
        else{
            while(b != null){
                tail.next = b;
                tail = b;
                b = b.next;
            }
        }
        return head;
    }

    public static void printlist(Node41 head){
        Node41 curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }System.out.println();
    }
}

class Node41 {
    int data;
    Node41 next;
    Node41(int x){
        data=x;
        next=null;
    }
}
