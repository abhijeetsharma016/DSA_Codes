/*

//Solving with recurssion: Time complexity O(n) space complexity O(n);
package com.Q10_PowerSetUsingBitwise.Maths;
import java.sql.SQLOutput;
import java.util.Scanner;
class fact {

    public int fact(int a) {
        int result = a;
        if (result == 0) {
            return 1;
        }
        return result*fact(result-1);//will be stored in stack
    }
}
class Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        fact f = new fact();
        System.out.println(f.fact(a));
    }
}*/

//Solving with loop: Time complixity O(n), Auxalary Space O(1)

package com.GFG.Maths;

import java.util.Scanner;

public class Q3_Factorial {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int fact =1;
    while(a!=0) {
        fact = fact*a;
        --a;
    }
        System.out.println(fact);
    }
}
