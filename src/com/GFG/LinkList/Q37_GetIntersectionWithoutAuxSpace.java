package com.GFG.LinkList;


public class Q37_GetIntersectionWithoutAuxSpace {
    static Node37 head1, head2;
    static class Node37{
        int data;
        Node37 next;
        Node37(int data){
            this.data = data;
            next = null;
        }
    }
    public static void main(String[] args){
        Q37_GetIntersectionWithoutAuxSpace list = new Q37_GetIntersectionWithoutAuxSpace();

        head1 = new Node37(3);
        head1.next = new Node37(6);
        head1.next.next = new Node37(9);
        head1.next.next.next = new Node37(15);
        head1.next.next.next.next = new Node37(30);

        head2 = new Node37(10);
        head2.next = head1.next.next.next;
        printlist(head2);

        System.out.println(list.getNode());
    }

    public static void printlist(Node37 head) {
        Node37 curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    //we get the difference between number of nodes as d,
    // then we move the counter of longest list to next node until we reach the difference, then we traverse both list togather until nodes match
    public int getNode() {
        int count1 = count(head1);
        int count2 = count(head2);
        int d;
        if (count1 > count2) {
            d = count1 - count2;
            return _getIntesectionNode(d, head1, head2);
        } else {
            d = count2 - count1;
            return _getIntesectionNode(d, head2, head1);
        }
    }


    public int _getIntesectionNode(int d, Node37 head1, Node37 head2) {
        for (int i = 0; i < d; i++) {

            head1 = head1.next;
        }
        while (head1 != null && head2 != null) {
            if (head1 == head2) {
                return head1.data;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return -1;
    }

    //counts the number of nodes
    public int count(Node37 head) {
        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
        }
        return count;
    }
}
