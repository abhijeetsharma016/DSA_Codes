package com.GFG.Searching;

import java.util.Arrays;
import java.util.Scanner;

// A Java program to find floor(sqrt(x)
public class Q11_SquareRoot {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element");
        int elememnt = sc.nextInt();
        System.out.println("The closest floor number is: " + floorSqrt(elememnt));
    }


    public static int floorSqrt(int element) {
        int low = 0;
        int high = element / 2, ans = 0;
        while (low <= high) {
            int mid = (low+high)/2;
            if(mid==(element/mid)){
                return mid;
            }
            else if(mid<(element/mid)){
                /* Here basically if we multiply mid with itself so
		there will be integer overflow which will throw
		tle for larger input so to overcome this
		situation we can use long or we can just divide
		the number by mid which is same as checking
		mid*mid < x*/
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid-1;

            }
        }
        return ans;
    }
}
