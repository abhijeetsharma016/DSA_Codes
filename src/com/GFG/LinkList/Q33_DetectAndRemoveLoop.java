package com.GFG.LinkList;

class Node33 {
    int data;
    Node33 next;
    Node33(int x){
        data=x;
        next=null;
    }
}


public class Q33_DetectAndRemoveLoop {
    public static void main(String[] args){
        Node33 head=new Node33(15);
        head.next=new Node33(10);
        head.next.next=new Node33(12);
        head.next.next.next=new Node33(20);
        head.next.next.next.next=head.next;
        detectRemoveLoop(head);
    }
    static void detectRemoveLoop(Node33 head)
    {   Node33 slow= head,fast = head;

        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }
        if(slow!=fast)
            return;
        slow=head;
        while(slow.next!=fast.next){
            slow=slow.next;
            fast=fast.next;
        }
        fast.next=null;
    }

    public static void detectAndRemoveLoopFromLinkedList(Node33 head){

    }
    public static void printlist(Node33 head){
        Node33 curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }System.out.println();
    }
}
