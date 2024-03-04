package com.GFG.LinkList;

public class Q30_LinkedALinkedListInGroupsOfSizeK_Iterative {
    public static void main(String[] args){
        Node30 head=new Node30(10);
        head.next=new Node30(20);
        head.next.next=new Node30(30);
        head.next.next.next=new Node30(40);
        head.next.next.next.next=new Node30(50);
        head.next.next.next.next.next=new Node30(60);
        head.next.next.next.next.next.next=new Node30(70);
        printlist(head);
        head=reverseK(head,3);
        printlist(head);
    }

    public static void printlist(Node30 head){
        Node30 curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }System.out.println();
    }

    public static Node30 reverseK(Node30 head, int k){
        Node30 prevFirst = null, curr = head;
        boolean firstPass = true;
        while(curr != null){
            Node30 first = curr, prev = null;
            int count = 0;
            while(curr!=null && count<k){
                Node30 next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
                count++;
            }
            if(firstPass){
                head = prev;
                firstPass = false;
            }
            else{
                prevFirst.next = prev;
            }
            prevFirst = first;
        }
        return head;
    }
}

class Node30 {
    int data;
    Node30 next;

    Node30(int data) {
        this.data = data;
        next = null;
    }
}