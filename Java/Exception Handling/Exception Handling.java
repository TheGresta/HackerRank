/*
Sample Input 0

3 5
2 4
0 0
-1 -2
-1 3

Sample Output 0

243
16
java.lang.Exception: n and p should not be zero.
java.lang.Exception: n or p should not be negative.
java.lang.Exception: n or p should not be negative.

Explanation 0

* In the first two cases, both n and p are postive. So, the power function returns the answer correctly.
* In the third case, both n and p are zero. So, the exception, "n and p should not be zero.", is printed.
* In the last two cases, at least one out of n and p is negative. 
So, the exception, "n or p should not be negative.", is printed for these two cases.
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static int power(int n, int p) throws Exception{
        if(n < 0 || p < 0){
            throw new Exception ("n or p should not be negative.");
        }else if(n==0 && p ==0){
            throw new Exception("n and p should not be zero.");
        }
    
         else {
            return ((int)Math.pow(n,p));
        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        while (read.hasNextInt()) {
            int n = read.nextInt();
            int p = read.nextInt();
            
            try {
                System.out.println(power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}