package com.GFG.Trees;

import java.lang.*;

class Node2
{
    int key;
    Node2 left;
    Node2 right;
    Node2(int k){
        key=k;
        left=right=null;
    }
}


class Q2_InorderTraversal {

    public static void main(String args[])
    {
        Node2 root=new Node2(10);
        root.left=new Node2(20);
        root.right=new Node2(30);
        root.right.left=new Node2(40);
        root.right.right=new Node2(50);

        inorder(root);
    }

    public static void inorder(Node2 root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);
        }
    }
}