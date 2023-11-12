/*
//Using left shift operator
// Java program to check if k-th bit of a given number is set or not
package com.Q10_PowerSetUsingBitwise.BitMagic;
class Q4_kthBitOfNumberNisSetOrNot {
	public static void isKthBitSet(int n, int k)
	{
		if ((n & (1 << (k - 1))) > 0)
			System.out.print("SET");
		else
			System.out.print("NOT SET");
	}

	// Driver code
	public static void main(String[] args)
	{
		int n = 5, k = 1;

		// Function call
		isKthBitSet(n, k);
	}
}
*/


//Using right shift operator
package com.GFG.BitMagic;
class Q4_kthBitOfNumberNisSetOrNot {
	static void isKthBitSet(int n, int k) {
		if (((n >> (k - 1)) & 1) > 0)
			System.out.println("SET");
		else
			System.out.println("NOT SET");
	}

	// Driver code
	public static void main(String[] args) {
		int n = 5, k = 1;

		// Function call
		isKthBitSet(n, k);
	}
}