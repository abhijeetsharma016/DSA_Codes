package com.GFG.String;

public class Q16_LexicographicRankOfAString {
    public static final int CHAR = 256;
    public static void main(String[] args) {
        String str = "STRING";
        System.out.print(lexRank(str));
    }

    public static int lexRank(String str) {
        int n = str.length();
        int mul = fact(n);
        int res = 1;
        int[] count = new int[CHAR];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        for(int i =1; i<CHAR;i++){
            count[i] += count[i-1];
        }
        for(int i=0; i<str.length();i++){
            //For "STRING" we get 4*5! + 4*4! + 3*3! + 1 *2! + 1*1!, here constant is no
            // of correctors smaller than the given string which occurs after the position of given charector

            mul = mul / (n - i);  // this is to calculate 5! or 4! or 3! or 2! or 1! based on the given loop,
                                 // (just take whole factorial and divide it with current n-number)
            res = res+count[str.charAt(i)-1]*mul;

            for(int j =i; j<CHAR;j++){
                count[j]--;// after each  calculation we fix the position and reduce 1 from number of occurrence after the given number
            }
        }
        return res;
    }

    public static int fact(int n) {
        return (n <= 1) ? 1 : n * fact(n - 1);
    }
}
