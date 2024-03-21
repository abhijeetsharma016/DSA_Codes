package com.GFG.Stack;


import java.util.Stack;

class Q12_getMinInStack {

    Stack<Integer> ms;
    Stack<Integer> as;

    Q12_getMinInStack(){
        ms=new Stack<>();
        as=new Stack<>();
    }

    void push(int x) {

        if(ms.isEmpty() ) {
            ms.add(x);as.add(x);return;
        }

        ms.add(x);

        if(as.peek()>=ms.peek())
            as.add(x);
    }

    void pop() {

        if(as.peek()==ms.peek())
            as.pop();
        ms.pop();

    }

    int top() {
        return ms.peek();
    }

    int getMin() {
        return as.peek();
    }
}

class GFG {

    public static void main(String[] args)
    {
        Q12_getMinInStack s=new Q12_getMinInStack();;
        s.push(4);
        s.push(5);
        s.push(8);
        s.push(1);
        s.pop();

        System.out.print(" Minimum Element from Stack: " + s.getMin() );

    }
}

