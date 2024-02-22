package com.GFG.LinkList;



    class Node11{
        int data;
        Node11 prev;
        Node11 next;
        Node11(int d){
            data=d;
            prev=null;
            next=null;
        }
    }

    class Q11_InsertAtBeginningInDoubly {

        public static void main(String args[])
        {
            Node11 head=new Node11(10);
            Node11 temp1=new Node11(20);
            Node11 temp2=new Node11(30);
            head.next=temp1;
            temp1.prev=head;
            temp1.next=temp2;
            temp2.prev=temp1;
            head=insertBegin(head,5);
            printlist(head);

        }

        static Node11 insertBegin(Node11 head,int data){
            Node11 temp=new Node11(data);
            temp.next=head;
            if(head!=null)head.prev=temp;
            return temp;
        }

        public static void printlist(Node11 head){
            Node11 curr=head;
            while(curr!=null){
                System.out.print(curr.data+" ");
                curr=curr.next;
            }System.out.println();
        }
    }
