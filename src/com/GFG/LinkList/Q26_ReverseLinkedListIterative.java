package com.GFG.LinkList;


        import java.lang.*;

class Node26{
    int data;
    Node26 next;
    Node26(int x){
        data=x;
        next=null;
    }
}

class Q26_ReverseLinkedListIterative {

    public static void main(String args[])
    {
        Node26 head=new Node26(10);
        head.next=new Node26(20);
        head.next.next=new Node26(30);
        printlist(head);
        head=reverse(head);
        printlist(head);

    }

    static Node26 reverse(Node26 head){
        Node26 curr=head;
        Node26 prev=null;
        while(curr!=null){
            Node26 next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

    public static void printlist(Node26 head){
        Node26 curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }System.out.println();
    }
}
