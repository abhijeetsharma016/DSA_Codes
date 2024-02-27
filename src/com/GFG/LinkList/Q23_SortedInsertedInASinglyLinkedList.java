package com.GFG.LinkList;

public class Q23_SortedInsertedInASinglyLinkedList {
    public static void main(String[] args){
        Node23 head = null;
        head = insertData(head,10);
        head = insertData(head, 20);
        head = insertData(head,30);
        head = insertData(head,40);
        head = insertData(head,1);//corner case
        printList(head);
    }
    public static Node23 insertData(Node23 head, int data){
        Node23 temp = new Node23(data);
        Node23 traverse = head;
        if(head == null){
            return temp;
        }
        if(data<head.data){
            return insertAtHead(head, data);
        }

        while(traverse.next != null && traverse.next.data<= temp.data){
            traverse = traverse.next;
        }
        temp.next = traverse.next;
        traverse.next = temp;
        return head;
    }
    public static Node23 insertAtHead(Node23 head,int data){
        Node23 temp = new Node23(data);
        temp.next = head.next;
        head.next = temp;

        //swap the data of both nodes
        temp.data = head.data;
        head.data = data;
        return head;
    }
    public static void printList(Node23 head){
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println("");
    }
}
class Node23{
    int data;
    Node23 next;
    Node23(int data){
        this.data = data;
    }
}