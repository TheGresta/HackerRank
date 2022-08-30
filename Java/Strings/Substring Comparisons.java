/*
Given a string "s" and an integer "k" complete the function so that it finds the lexicographically smallest and largest substrings of length "k".

Function Description

Complete the getSmallestAndLargest function in the editor below.

getSmallestAndLargest has the following parameters:

*string s: a string
*int k: the length of the substrings to find

Returns

*string: the string ' + "\n" + ' where and are the two substrings

Input Format

The first line contains a string denoting  "s".
The second line contains an integer denoting "k".

Sample Input 0

welcometojava
3

Sample Output 0

ava
wel

*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int k = scanner.nextInt();
        String minSubstring = line.substring(0,k);
        String maxSubstring = line.substring(0,k);
        for (int i = 1; i < line.length()-k+1; i++) {
            String sub = line.substring(i,i+k);
            if (sub.compareTo(minSubstring) < 0) {
                minSubstring = sub;
            }
            if (sub.compareTo(maxSubstring) > 0) {
                maxSubstring = sub;
            }
        }
        System.out.println(minSubstring);
        System.out.println(maxSubstring);     
    }
}

