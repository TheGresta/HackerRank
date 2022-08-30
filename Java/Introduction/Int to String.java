/*
You are given an integer "n", you have to convert it into a string.

Please complete the partially completed code in the editor. 
If your code successfully converts "n" into a string "s" the code will print "Good job". Otherwise it will print "Wrong answer".

Sample Input 0

100

Sample Output 0

Good job
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int x = read.nextInt();
        try{
            String s = String.valueOf(x);
            System.out.println("Good job");
        }catch(Exception e){
            System.out.println("Wrong answer");
        }
    }
}