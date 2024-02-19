package com.GFG.LinkList;

public class Q4_InsertionAtTheBeginning {
    public static void main(String[] args){
        Node4 head = new Node4(10);
        Node4 temp = head;
        temp.next = new Node4(20);
        temp = temp.next;
        temp.next = new Node4(30);
        temp = temp.next;
        temp.next = new Node4(40);
        temp = head;
        while(temp!= null){
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("");
        head = insertAtBeginning(50, head);
        temp = head;
        while(temp!= null){
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
    }
    public static Node4 insertAtBeginning(int data, Node4 head){
        Node4 temp = new Node4(data);
        temp.next = head;
        return temp;
    }
}
class Node4{
    int data;
    Node4 next;
    Node4(int data){
        this.data = data;
        this.next = null;
    }
}
