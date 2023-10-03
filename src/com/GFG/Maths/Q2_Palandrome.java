// Solving with 2 arrays, Time complexity O(n), Space complexity O(n)
/*
package com.GFG.Maths;
import java.util.Arrays;
import java.util.Scanner;
public class Palandrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        String s = Integer.toString(a);
        int len = s.length();
        int [] arr = new int[len];
        int [] revarr = new int[len];

        for(int i = 0; a!=0; i++){
            arr[i] = a%10;
            a = a/10;
        }
        int i =0;
        for(int j = arr.length -1; j>=0; j--){
            revarr[i] = arr[j];
            i++;
        }
        if(Arrays.equals(revarr, arr)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
*/

//Simpler methord, Time complexity O(log(n)), space complexity = O(1)
package com.GFG.Maths;
import java.util.Scanner;
class palandrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sc.nextInt();
        int reverse =0;
        int temp = num;
        while(temp >0){
            int ld = temp % 10;
            System.out.print(ld);
            reverse = reverse*10 + ld;
            temp = temp/10;
        }
        if(reverse == num){
            System.out.println(" is Palandrome");
        }
        else{
            System.out.println(" is Not palandrome");
        }
    }
}
