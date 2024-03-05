package com.GFG.LinkList;

public class Q32_DetectLoopUsingFloydCycle {
    public static void main(String[] args) {
        Node32 head=new Node32(15);
        head.next=new Node32(10);
        head.next.next=new Node32(12);
        head.next.next.next=new Node32(20);
        head.next.next.next.next=head.next;
        if (isLoop(head))
            System.out.print("Loop found");
        else
            System.out.print("No Loop");
    }

    public static boolean isLoop(Node32 head){
        Node32 slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}
class Node32 {
    int data;
    Node32 next;
    Node32(int x){
        data=x;
        next=null;
    }
}