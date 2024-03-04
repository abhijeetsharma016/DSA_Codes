package com.GFG.LinkList;
/*Our Task: Given a Linked List, the task is to Reverse Linked List in Groups of size k

Example:

I/P: 10->20->30->40->50           k=3
O/P: 30->10->20->50->40

I/P: 1->2->3->4->5->6->7->8       k=3
O/P: 3->2->1->6->5->4->8->7

I/P: 1->2->3->4->5->6->7->8       k=5
O/P: 5->4->3->2->1->8->7->6 */

public class Q29_LinkedALinkedListInGroupsOfSizeK_Recursive {
    public static void main(String[] args) {
        Node29 head=new Node29(10);
        head.next=new Node29(20);
        head.next.next=new Node29(30);
        head.next.next.next=new Node29(40);
        head.next.next.next.next=new Node29(50);
        head.next.next.next.next.next=new Node29(60);
        head.next.next.next.next.next.next=new Node29(70);
        printlist(head);
        head=reverseK(head,3);
        printlist(head);
    }


    public static void printlist(Node29 head){
        Node29 curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }System.out.println();
    }

    public static Node29 reverseK(Node29 head, int k) {
        Node29 curr = head, next = null, prev = null;
        int count = 0;
        while (curr != null && count<k){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        if(next != null){
            Node29 rest_head = reverseK(next, k);
            head.next = rest_head;
        }
        return prev;
    }
}
class Node29 {
    int data;
    Node29 next;

    Node29(int data) {
        this.data = data;
        next = null;
    }
}