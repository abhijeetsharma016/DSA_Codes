package com.GFG.LinkList;

public class Q13_ReverseADoublyLinkedList {
    public static void main(String[] args){
        Node13 head = new Node13(10);
        Node13 temp1 = new Node13(20);
        Node13 temp2 = new Node13(30);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;

        head = reverseDoublyLinkedList(head);
        printlist(head);
    }
    public static void printlist(Node13 head){
        Node13 curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }System.out.println();
    }

    static Node13 reverseDoublyLinkedList(Node13 head){
        if(head==null || head.next == null) return head; //head.next is important to check as if we dont do it prev.prev will be null in last line
        Node13 prev = null, curr = head;
        while(curr != null){
            prev = curr.prev;
            curr.prev = curr.next;
            curr.next = prev;

            curr= curr.prev; //after reversing curr.prev means curr.next
        }
        return prev.prev;
    }
}
class Node13{
    int data;
    Node13 next;
    Node13 prev;
    Node13(int data){
        this.data = data;
        next = null;
        prev = null;
    }
}