/*
int[] myArray = new int[4];

Sample Input

5
10
20
30
40
50

Sample Output

10
20
30
40
50

Explanation

When we save each integer to its corresponding index in "a", we get "a" = [10,20,30,40,50]. 
The locked code prints each array element on a new line from left to right.
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
        int row = read.nextInt();
        int[] arr = new int[row];
        int at = 0;
        
        while(row > 0){
            arr[at] = read.nextInt();
            row--;
            at++;
        }
        
        for(int x : arr)
            System.out.println(x);
    }
}


