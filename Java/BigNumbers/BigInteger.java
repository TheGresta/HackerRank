/*
In this problem, you have to add and multiply huge numbers! These numbers are so big that you can't contain them in any ordinary data types like a long integer.

Use the power of Java's BigInteger class and solve this problem.

Sample Input

1234
20

Sample Output

1254
24680
*/

import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String s1 = read.nextLine();
        String s2 = read.nextLine();
        read.close();
        
        BigInteger bi1, bi2, bi3, bi4;
        
        bi1 = new BigInteger(s1);
        bi2 = new BigInteger(s2);
        
        bi3 = bi1.add(bi2);
        bi4 = bi1.multiply(bi2);
        
        System.out.println(bi3);
        System.out.println(bi4);
    }
}


