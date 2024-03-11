package com.GFG.Stack;

public class Q3_LinkedListImplementationOfStack {
    public static void main(String[] args) {
        MyStack3 s=new MyStack3();
        s.push(5);
        s.push(10);
        s.push(20);
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
    }

    static class MyStack3 {
        Node1 head;
        int sz;

        MyStack3() {
            head = null;
            sz = 0;
        }
        void push(int x){
            Node1 temp=new Node1(x);
            temp.next=head;
            head=temp;
            sz++;
        }

        int pop(){
            if(head==null){return Integer.MAX_VALUE;}
            int res=head.data;
            Node1 temp=head;
            head=head.next;
            sz--;
            return res;
        }

        int peek(){
            if(head==null){return Integer.MAX_VALUE;}
            return head.data;
        }

        int size(){
            return sz;
        }

        boolean isEmpty(){
            return head==null;
        }
    }
}


    class Node1 {
        int data;
        Node1 next;

        Node1(int d) {
            data = d;
            next = null;
        }
    }