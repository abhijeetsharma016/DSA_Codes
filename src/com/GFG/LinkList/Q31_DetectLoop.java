package com.GFG.LinkList;

import java.util.HashSet;

public class Q31_DetectLoop {
    public static void main(String[] args) {
        Node31 head=new Node31(15);
        head.next=new Node31(10);
        head.next.next=new Node31(12);
        head.next.next.next=new Node31(20);
        head.next.next.next.next=head.next;
        if (isLoop(head))
            System.out.print("Loop found");
        else
            System.out.print("No Loop");
    }

    public static boolean isLoop(Node31 head) {
        HashSet<Node31> table = new HashSet<>();
        while(head!=null){
            if (table.contains(head)) {
                return true;
            }
            table.add(head);
            head= head.next;
        }
        return false;
    }
}
class Node31 {
    int data;
    Node31 next;
    Node31(int x){
        data=x;
        next=null;
    }
}
