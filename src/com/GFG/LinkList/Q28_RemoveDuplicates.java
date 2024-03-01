package com.GFG.LinkList;

class Node28 {
    int data;
    Node28 next;

    Node28(int d) {
        data = d;
        next = null;
    }
}

class Q28_RemoveDuplicates {
    Node28 head;

    void removeDuplicates() {
        Node28 temp = head;
        while (temp != null && temp.next != null) {
            if (temp.data == temp.next.data) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
    }

    public void push(int new_data) {
        Node28 new_node28 = new Node28(new_data);
        new_node28.next = head;
        head = new_node28;
    }

    void printList() {
        Node28 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Q28_RemoveDuplicates llist = new Q28_RemoveDuplicates();
        llist.push(20);
        llist.push(13);
        llist.push(13);
        llist.push(11);
        llist.push(11);
        llist.push(11);

        System.out.print("List before removal of duplicates: ");
        llist.printList();

        llist.removeDuplicates();

        System.out.println("List after removal of duplicates: ");
        llist.printList();
    }
}
