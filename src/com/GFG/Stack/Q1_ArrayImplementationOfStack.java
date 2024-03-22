package com.GFG.Stack;

public class Q1_ArrayImplementationOfStack {
    public static void main(String[] args) {
        MyStack13 s = new MyStack13(5);
        s.push(5);
        s.push(10);
        s.push(20);
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
    }


}
class MyStack{
    int arr[];
    int cap;
    int top;
    MyStack(int c) {
        top = -1;
        cap = c;
        arr = new int[cap];
    }

    public void push(int data){
        if (top == cap - 1) {
            System.out.println("Stack is full");
            return;
        }
        top++;
        arr[top] = data;
    }

    public int pop(){
        if(top == -1){
            System.out.print("Stack is empty");
            return Integer.MIN_VALUE;
        }
        int res=arr[top];
        top--;
        return res;
    }

    public int peek(){
        if(top==-1){System.out.println("Stack is Empty");return Integer.MIN_VALUE;}
        return arr[top];
    }

    int size(){
        return (top+1);
    }

    boolean isEmpty(){
        return top==-1;
    }
}