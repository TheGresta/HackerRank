/*
Given an integer,"n", perform the following conditional actions:

*If "n" is odd, print Weird
*If "n" is even and in the inclusive range of 2 to 5, print Not Weird
*If "n" is even and in the inclusive range of 6 to 20, print Weird
*If "n" is even and greater than 20, print Not Weird
Complete the stub code provided in your editor to print whether or not "n" is weird.

Sample Input 0

3

Sample Output 0

Weird

Sample Input 1

24

Sample Output 1

Not Weird
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
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        
        String ans="";
       if(N%2==1){
           ans = "Weird";
       }
           else{
               if(N>2 && N<=5){
                   ans = "Not Weird";
               }
               if(N>5 && N<=20){
                   ans = "Weird";
               }
               else{
                   ans = "Not Weird";
               }
            }
        System.out.println(ans);       
    }
}

