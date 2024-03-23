package com.GFG.Stack;


 import java.io.*;
import java.util.*;

    class MyStack14 {

        Stack<Integer> s;
        int min;

        MyStack14(){
            s=new Stack<>();
        }

        void push(int x) {

            if(s.isEmpty() ) {
                min=x;
                s.add(x);
            }
            else if(x<=min){
                s.add(x-min);
                min=x;
            }else{
                s.add(x);
            }
        }

        int pop() {

            int t=s.peek();s.pop();
            if(t<=0){
                int res=min;
                min=min-t;
                return res;
            }else{
                return t;
            }
        }

        int peek() {
            int t=s.peek();
            return ((t<=0)? min : t);
        }

        int getMin() {
            return min;
        }
    }

    class Q13_getMinStackWith1AuxSpaceOnlyPositive {

        public static void main(String[] args)
        {
            MyStack14 s=new MyStack14();;
            s.push(4);
            s.push(5);
            s.push(8);
            s.push(1);
            s.pop();

            System.out.print(" Minimum Element from Stack: " + s.getMin() );

        }
    }