/*
Input Format

The first line contains an integer,"T", denoting the number of test cases.
Each test case, "T", is comprised of a single line with an integer, "n", which can be arbitrarily large or small.

Output Format

For each input variable "n" and appropriate primitive "dataType", you must determine if the given primitives are capable of storing it. 
If yes, then print:

n can be fitted in:
* dataType

n can't be fitted anywhere.

Sample Input

5
-150
150000
1500000000
213333333333333333333333333333333333
-100000000000000
Sample Output

-150 can be fitted in:
* short
* int
* long
150000 can be fitted in:
* int
* long
1500000000 can be fitted in:
* int
* long
213333333333333333333333333333333333 can't be fitted anywhere.
-100000000000000 can be fitted in:
* long
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int row = read.nextInt();
        for (int i = 0; i < row; i++) {
            try {
                long x = read.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(read.next() + " can't be fitted anywhere.");
            }
        }
        read.close();
    }
}
