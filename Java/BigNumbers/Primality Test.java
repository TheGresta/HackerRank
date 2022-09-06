/*
Sample Input

13

Sample Output

prime
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);
        BigInteger n = read.nextBigInteger();
        read.close();
        
        System.out.println( n.isProbablePrime(1000) ? "prime" : "not prime");
    }
}



