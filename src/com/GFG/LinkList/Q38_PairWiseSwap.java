package com.GFG.LinkList;


        import java.lang.*;

class Node{
    int data;
    Node39 next;
    Node(int x){
        data=x;
        next=null;
    }
}

class Q38_PairWiseSwap {

    public static void main(String args[])
    {
        Node39 head=new Node39(1);
        head.next=new Node39(2);
        head.next.next=new Node39(3);
        head.next.next.next=new Node39(4);
        head.next.next.next.next=new Node39(5);
        printlist(head);
        head=pairwiseSwap(head);
        printlist(head);

    }

    static Node39 pairwiseSwap(Node39 head){
        if(head==null||head.next==null)
            return head;
        Node39 curr=head.next.next;
        Node39 prev=head;
        head=head.next;
        head.next=prev;
        while(curr!=null&&curr.next!=null){
            prev.next=curr.next;
            prev=curr;
            Node39 next=curr.next.next;
            curr.next.next=curr;
            curr=next;
        }
        prev.next=curr;
        return head;
    }

    public static void printlist(Node39 head){
        Node39 curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }System.out.println();
    }
}

