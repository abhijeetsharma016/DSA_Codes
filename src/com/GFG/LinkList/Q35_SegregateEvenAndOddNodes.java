package com.GFG.LinkList;

class Node35 {
    int data;
    Node35 next;
    Node35(int x){
        data=x;
        next=null;
    }
}
public class Q35_SegregateEvenAndOddNodes {
    public static void main(String[] args){
        Node35 head=new Node35(17);
        head.next=new Node35(15);
        head.next.next=new Node35(8);
        head.next.next.next=new Node35(12);
        head.next.next.next.next=new Node35(10);
        head.next.next.next.next.next=new Node35(5);
        head.next.next.next.next.next.next=new Node35(4);
        printlist(head);
        head=segregate(head);
        printlist(head);
    }

    public static Node35 segregate(Node35 head) {
        Node35 eS = null, eE = null, oS = null, oE = null;
        for(Node35 curr = head;curr!= null;curr = curr.next){
            if(curr.data %2 == 0){
                if(eS == null){
                    eS = curr;
                    eE = curr;
                }
                else{
                    eE.next = curr;
                    eE = eE.next;
                }
            }
            if(curr.data %2 != 0){
                if(oS == null){
                    oS = curr;
                    oE = curr;
                }
                else{
                    oE.next = curr;
                    oE = oE.next;
                }
            }
        }
        eE.next = oS;
        oE.next = null;
        return eS;
    }

    public static void printlist(Node35 head) {
        Node35 curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
