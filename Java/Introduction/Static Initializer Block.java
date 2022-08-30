/*
Output Format

If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: 
Breadth and height must be positive" without quotes.

Sample input 1

1
3

Sample output 1

3

Sample input 2

-1
2

Sample output 2

java.lang.Exception: Breadth and height must be positive
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int b = read.nextInt();
        int h = read.nextInt();
        
        if(b < 1 || h < 1){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }else{
            System.out.println(b*h);
        }        
    }
}