/*
Task
Given an integer, N, print its first  10 multiples. Each multiple  (where ) should be printed on a new line in the form: N x i = result.

Input Format

A single integer, N.

Output Format

Print  lines of output; each line "i" (where 1<= i <= 10) contains the "result" of "N" x "i" in the form:N x i
N x i = result.

Sample Input

2

Sample Output

2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20
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
    
    public static void rtr(int N, int i){
    if(i != 11){
        System.out.println(N+" x "+i+" = "+(N*i));
        rtr(N , i+1);
    }
    return;
}
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        
        rtr(N, 1);
    }
}
