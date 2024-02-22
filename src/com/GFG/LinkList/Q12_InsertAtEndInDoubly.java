package com.GFG.LinkList;

public class Q12_InsertAtEndInDoubly {
    public static void main(String[] args) {
        Node12 head = new Node12(10);
        Node12 temp1 = new Node12(20);
        Node12 temp2 = new Node12(30);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;

        head = insertEnd(head,40);
        printlist(head);
    }
    static Node12 insertEnd(Node12 head, int data){
        Node12 temp=new Node12(data);
        if(head==null)return temp;
        Node12 curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
        temp.prev=curr;
        return head;
    }

    public static void printlist(Node12 head){
        Node12 curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }System.out.println();
    }
}
class Node12{
    int data;
    Node12 next;
    Node12 prev;
    Node12(int data){
        this.data = data;
        next = null;
        prev = null;
    }
}