package com.GFG.LinkList;

import java.util.Scanner;

public class Q6_InsertionAtARandomPosition {
    public static void main(String[] args) {
        Node6 head = new Node6(10);
        head.next = new Node6(20);
        head.next.next = new Node6(30);
        head.next.next.next = new Node6(40);
        head.next.next.next.next = new Node6(50);

        System.out.println("enter position: ");
        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();
        System.out.print("Eneter the data: ");
        int data = sc.nextInt();
        head = InsertAtRandomPosition(head, pos, data);
        Node6 temp = head;
        while(temp != null){
            System.out.print(temp.data+ "--> ");
            temp = temp.next;
        }
    }
    public static Node6 InsertAtRandomPosition(Node6 head, int pos, int data){
        Node6 newNode = new Node6(data);
        Node6 temp = head;
        Boolean flag = true;
            int count = 0;
            if(pos == 1){
                newNode.next = head;
                head = newNode;
                return head;
            }
            while (count != pos - 2) {
                if(temp == null){
                    System.out.println("position dosen't exist");
                    flag = false;
                    break;
                }
                temp = temp.next;
                count++;
            }
            if(flag) {
                newNode.next = temp.next;
                temp.next = newNode;
            }
            return head;
        }
    }
class Node6{
    int data;
    Node6 next;
    Node6(int data){
        this.data = data;
    }
}