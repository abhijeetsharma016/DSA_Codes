package com.GFG.LinkList;


        import java.lang.*;

class Node38{
    int data;
    Node38 next;
    Node38(int x){
        data=x;
        next=null;
    }
}

class Q38_PairWiseSwap {

    public static void main(String args[])
    {
        Node38 head=new Node38(1);
        head.next=new Node38(2);
        head.next.next=new Node38(3);
        head.next.next.next=new Node38(4);
        head.next.next.next.next=new Node38(5);
        printlist(head);
        head=pairwiseSwap(head);
        printlist(head);

    }

    static Node38 pairwiseSwap(Node38 head){
        if(head==null||head.next==null)
            return head;
        Node38 curr=head.next.next;
        Node38 prev=head;
        head=head.next;
        head.next=prev;
        while(curr!=null&&curr.next!=null){
            prev.next=curr.next;
            prev=curr;
            Node38 next=curr.next.next;
            curr.next.next=curr;
            curr=next;
        }
        prev.next=curr;
        return head;
    }

    public static void printlist(Node38 head){
        Node38 curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }System.out.println();
    }
}

