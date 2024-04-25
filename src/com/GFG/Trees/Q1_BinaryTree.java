package com.GFG.Trees;

import java.lang.*;

class Node
{
    int key;
    Node2 left;
    Node2 right;
    Node(int k){
        key=k;
        left=right=null;
    }
}

class Q1_BinaryTree {

    public static void main(String args[])
    {
        Node2 root=new Node2(10);
        root.left=new Node2(20);
        root.right=new Node2(30);
        root.left.left=new Node2(40);
    }
}