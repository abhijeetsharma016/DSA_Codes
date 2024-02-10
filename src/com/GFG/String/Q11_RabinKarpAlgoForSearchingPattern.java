package com.GFG.String;

import java.util.*;
import java.io.*;
import java.lang.*;

class Q11_RabinKarpAlgoForSearchingPattern {
    static final int d=256;// d is the number of characters in
    // the input alphabet
    static final int q=101;//q is like hash size(101 is large prime number
    static void RBSearch(String pat,String txt,int M, int N){
        //take example of changing 123 to 234, so we can do (123 - 100)*10 +4
        //h is like 100 and d is like 10 for computing hashing
        int h = 1;
        int patHash = 0;
        int txtHash = 0;
        for(int i =0;i<M-1; i++){
            h = (h*d)%q;//computing value of h
        }

        for(int i=0; i<M;i++){
            patHash = ((d*patHash)+pat.charAt(i))%q;
            txtHash = ((d*txtHash)+txt.charAt(i))%q;
        }
        for(int i =0; i<=N-M; i++){
            if(patHash == txtHash){
                int j;
                for(j =0; j<M;j++){
                    if(pat.charAt(j) != txt.charAt(i+j)){
                        break;
                    }
                }
                if(j==M){
                    System.out.println("Fount At index: " + i);
                }
            }

            //calculate next rolling hash
            //to understand compare it to what we do to convert 123 to 234
            if(i<N-M){
                txtHash = (d * (txtHash - txt.charAt(i) * h) + txt.charAt(i + M)) % q;

                // We might get negative value of t, converting it
                // to positive
                if(txtHash<0){
                    txtHash += q;
                }
            }
        }


    }

    public static void main(String args[])
    {   String txt = "GEEKS FOR GEEKS";String pat="GEEK";
        System.out.println("All index numbers where pattern found: ");
        RBSearch(pat,txt,4,15);
    }
}