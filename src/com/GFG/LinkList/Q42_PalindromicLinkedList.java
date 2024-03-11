package com.GFG.LinkList;

public class Q42_PalindromicLinkedList {
    public static void main(String[] args){
        Node head=new Node('g');
        head.next=new Node('f');
        head.next.next=new Node('g');
        if(isPalindrome(head))
            System.out.print("Yes");
        else
            System.out.print("No");
    }

    public static void printReversed(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }


 public static boolean isPalindrome(Node head){
        Node slow = head, fast = head;
        while(fast!= null && fast.next != null){
            fast= fast.next.next;
            slow = slow.next;
        }

        slow = reverseList(slow);

     printReversed(head);
        slow = slow.next;
     while (slow != null) {
         if(head.data != slow.data){
             return false;
         }
         head = head.next;
         slow = slow.next;
     }
     return true;
 }

    public static Node reverseList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node curr = head;
        Node next = head.next;
        Node prev = null;

        while(next != null){
            curr.next = prev;
            prev = curr;
            curr = next;
            next = next.next;
        }
        curr.next = prev;
        return curr;
    }
}
class Node{
    char data;
    Node next;
    Node(char x){
        data=x;
        next=null;
    }
}