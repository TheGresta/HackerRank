/*
There are three lines of output:
For the first line, sum the lengths "A" of "B" and .
For the second line, write Yes if "A" is lexicographically greater than "B" otherwise print No instead.
For the third line, capitalize the first letter in both "A" and "B" and print them on a single line, separated by a space.

Sample Input 0

hello
java

Sample Output 0

9
No
Hello Java
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String s1 = read.nextLine();
        String s2 = read.nextLine();
        read.close();
        
        System.out.println(s1.length() + s2.length());
        
        char sc1 = s1.charAt(0);
        char sc2 = s2.charAt(0);
        String line1 = "";
        
        line1 = (sc1 > sc2) ? "Yes" : "No";
        System.out.println(line1);
        
        s1 = s1.substring(0, 1).toUpperCase() + s1.substring(1);
        s2 = s2.substring(0, 1).toUpperCase() + s2.substring(1);
        
        System.out.println(s1 + " " + s2);
    }
}