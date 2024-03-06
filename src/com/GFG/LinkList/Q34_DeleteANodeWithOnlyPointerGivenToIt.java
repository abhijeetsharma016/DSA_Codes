package com.GFG.LinkList;

public class Q34_DeleteANodeWithOnlyPointerGivenToIt {
    public static void main(String[] args) {
        Node34 head = new Node34(10);
        head.next = new Node34(20);
        Node34 ptr = new Node34(30);
        head.next.next = ptr;
        head.next.next.next = new Node34(40);
        head.next.next.next.next = new Node34(25);
        printlist(head);
        head = deleteNode(head, ptr);
        printlist(head);
    }

    public static Node34 deleteNode(Node34 head, Node34 ptr){
        Node34 temp = ptr;
        ptr.data = ptr.next.data;
        ptr.next = ptr.next.next;

        return head;
    }

    public static void printlist(Node34 head) {
        Node34 curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();

    }
}
class Node34 {
    int data;
    Node34 next;
    Node34(int x){
        data=x;
        next=null;
    }
}


