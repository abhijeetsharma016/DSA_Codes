package com.GFG.LinkList;

import java.util.HashSet;

class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}

public class Q36_IntersectionPointOfTwoLinkedList {
    public static void printlist(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        Node newNode;

        Node head1 = new Node(10);

        Node head2 = new Node(3);

        newNode = new Node(6);
        head2.next = newNode;

        newNode = new Node(9);
        head2.next.next = newNode;

        newNode = new Node(15);
        head1.next = newNode;
        head2.next.next.next = newNode;

        newNode = new Node(30);
        head1.next.next = newNode;

        head1.next.next.next = null;

        printlist(head1);
        printlist(head2);
        System.out.print(getIntersectionUsingHashSet(head1, head2));
    }

    public static int getIntersectionUsingHashSet(Node head1, Node head2) {
        HashSet<Node> s = new HashSet<>();
        Node curr = head1;
        while(curr!=null){
            s.add(curr);
            curr = curr.next;
        }
        curr = head2;
        while(curr!= null){
            if(s.contains(curr)){
                return curr.data;
            }
            s.add(curr);
            curr = curr.next;
        }
        return -1;
    }
}
