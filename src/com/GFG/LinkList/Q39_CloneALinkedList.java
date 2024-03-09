package com.GFG.LinkList;


class Node39
{
    int data;
    Node39 next,random;
    Node39(int x)
    {
        data = x;
        next = random = null;
    }
}
class Q39_CloneALinkedList{

    public static void print(Node39 start)
    {
        Node39 ptr = start;
        while (ptr!=null)
        {
            System.out.println ( "Data = " + ptr.data + ", Random  = "+ ptr.random.data );
            ptr = ptr.next;
        }
    }

    public static Node39 clone(Node39 head)
    {
        Node39 next,temp;
        for(Node39 curr = head; curr!=null;){
            next=curr.next;
            curr.next=new Node39(curr.data);
            curr.next.next=next;
            curr=next;
        }
        for(Node39 curr = head; curr!=null; curr=curr.next.next){
            curr.next.random=(curr.random!=null)?(curr.random.next):null;
        }

        Node39 original = head, copy = head.next;

        temp = copy;

        while (original!=null && copy!=null)
        {
            original.next =
                    original.next!=null? original.next.next : original.next;

            copy.next = copy.next!=null?copy.next.next:copy.next;
            original = original.next;
            copy = copy.next;
        }

        return temp;
    }
    public static void main(String[] args)
    {
        Node39 head = new Node39(10);
        head.next = new Node39(5);
        head.next.next = new Node39(20);
        head.next.next.next = new Node39(15);
        head.next.next.next.next = new Node39(20);

        head.random = head.next.next;
        head.next.random=head.next.next.next;
        head.next.next.random=head;
        head.next.next.next.random=head.next.next;
        head.next.next.next.next.random=head.next.next.next;

        System.out.print( "Original list : \n");
        print(head);

        System.out.print( "\nCloned list : \n");
        Node39 cloned_list = clone(head);
        print(cloned_list);
    }
}

