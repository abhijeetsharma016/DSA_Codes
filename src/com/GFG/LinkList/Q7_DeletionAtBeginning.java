package com.GFG.LinkList;

import java.util.Scanner;

public class Q7_DeletionAtBeginning {
    public static void main(String[] args) {
        Node7 head = new Node7(10);
        head.next = new Node7(20);
        head.next.next = new Node7(30);
        head.next.next.next = new Node7(40);
        Scanner sc = new Scanner(System.in);
        head = deletionAtBeginning(head);
        Node7 temp = head;
        while(temp != null){
            System.out.print(temp.data + "--> ");
            temp = temp.next;
        }
    }
    public static Node7 deletionAtBeginning(Node7 head){
        head = head.next;
        return head;
    }
}
class Node7{
    int data;
    Node7 next;
    Node7(int data){
        this.data = data;
        this.next = null;
    }
}
