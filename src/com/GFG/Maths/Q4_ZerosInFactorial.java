/*
package com.GFG.Maths;

import java.util.Scanner;

class ZerosInfact{
    int count = 0;
    int fact = 1;
    public int Myfact(int n){
        while(n!=0){
            fact *= n;
            n--;
        }
        while(fact%10 == 0){
            count++;
            fact = fact/10;
        }
        return count;
    }
}
public class ZerosInFactorial {
    public static void main(String[] args) {
        ZerosInfact z = new ZerosInfact();
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(z.Myfact(n));
    }
}
*/


//Alternate and better methrod
// see the zeros are formend by 2x5 now the amount of multiples of 5 till the number is always less than 2
//hence we only count no of 5. Also the number which are power of 5 hole one extra 5 i.e 25 = 5*5; hence if
// the number/5 is multiple of 25 then it will hold one extra 5. eg 125. Remember 126! = 126*125..., 127! = 127*126*125...

package com.GFG.Maths;

import java.util.Scanner;

class ZerosInfact{
    int res =0;
    public int Zeros(int n){
    for(int i =5; i<n;i = i*5) {
        System.out.println("Only of understanding purpose " + n/i);
        // if a number/5 is also getting devided by 25
        // that means it holds one extra 5. i.e 125 = 5*25, same with 125 i.e 625 = 125*5.
        res = res+n/i;
    }
    return res;
    }
}
class ZerosInFactorial{
    public static void main(String[] args) {
        ZerosInfact z = new ZerosInfact();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(z.Zeros(n));
    }
    }