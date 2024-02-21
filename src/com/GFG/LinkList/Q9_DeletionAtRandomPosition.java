package com.GFG.LinkList;

import java.util.Scanner;

public class Q9_DeletionAtRandomPosition {
    public static void main(String[] args) {
        Node9 head = new Node9(10);
        head.next = new Node9(20);
        head.next.next = new Node9(30);
        head.next.next.next = new Node9(40);
        head.next.next.next.next = new Node9(50);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index: ");
        int positionToDelete = sc.nextInt();

        head = deleteNodeAtIndex(head, positionToDelete);

        for (Node9 temp = head; temp != null; temp = temp.next) {
            System.out.print(temp.data + " ");
        }
    }
    public static Node9 deleteNodeAtIndex(Node9 head, int pos){
        if (head == null) {
            return null;
        }
        // If position is 0, then delete the head
        if (pos == 0) {
            return head.next;
        }

        Node9 temp = head;
        Node9 prevNode = head;
        for(int i =0;prevNode!=null && i<pos-1;i++){
            prevNode = prevNode.next;
        }

        if (prevNode == null || prevNode.next == null) {
            return head;
        }

        prevNode.next = prevNode.next.next;
        return head;
    }
}

class Node9 {
    int data;
    Node9 next;
    Node9(int data){
        this.data = data;
        Node9 next = null;
    }
}