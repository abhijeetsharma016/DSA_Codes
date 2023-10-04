/* Function to calculate x raised to the power y in
 * O(logn)*/
package com.GFG.Maths;
class Q12_ComputingPower {
    /* Function to calculate x raised to the power y */
    public static int power(int x, int y){
        if(y==0){
            return 1;
        }
        int temp = power(x, y/2);
        if(y%2 == 0){
            temp = temp*temp;
        }
        else{
            temp= x*temp*temp;
        }
        return temp;
    }

    // Driver code
    public static void main(String[] args)
    {
        int x = 2;
        int y = 3;

        // Function call
        System.out.printf("%d", power(x, y));
    }
}