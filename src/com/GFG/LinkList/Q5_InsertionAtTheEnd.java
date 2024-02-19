package com.GFG.LinkList;

public class Q5_InsertionAtTheEnd {
    public static void main(String[] args){
        Node5 head = new Node5(10);
        head.next = new Node5(20);
        head.next.next = new Node5(30);
        head.next.next.next = new Node5(40);
        Node5 temp = head;
        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("");

        head = insertAtEnd(head, 50);
        temp = head;
        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
    }
    public static Node5 insertAtEnd(Node5 head, int data){
        Node5 temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node5(data);
        return head;
    }

}
class Node5{
    int data;
    Node5 next;
    Node5(int data){
        this.data = data;
        this.next = null;
    }
}
