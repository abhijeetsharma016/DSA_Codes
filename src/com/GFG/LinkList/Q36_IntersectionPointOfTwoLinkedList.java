package com.GFG.LinkList;

import java.util.HashSet;

class Node36 {
    int data;
    Node36 next;
    Node36(int x){
        data=x;
        next=null;
    }
}

public class Q36_IntersectionPointOfTwoLinkedList {
    public static void printlist(Node36 head) {
        Node36 curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        Node36 newNode;

        Node36 head1 = new Node36(10);

        Node36 head2 = new Node36(3);

        newNode = new Node36(6);
        head2.next = newNode;

        newNode = new Node36(9);
        head2.next.next = newNode;

        newNode = new Node36(15);
        head1.next = newNode;
        head2.next.next.next = newNode;

        newNode = new Node36(30);
        head1.next.next = newNode;

        head1.next.next.next = null;

        printlist(head1);
        printlist(head2);
        System.out.print(getIntersectionUsingHashSet(head1, head2));
    }



    public static int getIntersectionUsingHashSet(Node36 head1, Node36 head2) {
        HashSet<Node36> s = new HashSet<>();
        Node36 curr = head1;
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
