/*
Task
Given an integer, , perform the following conditional actions:

*If  is odd, print Weird
*If  is even and in the inclusive range of 2 to 5, print Not Weird
*If  is even and in the inclusive range of 6 to 20, print Weird
*If  is even and greater than 20, print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int x = read.nextInt();        
        read.close();
               
        if(x % 2 == 0){
            if(x >= 2 && x <= 5)
                System.out.println("Not Weird");
            else if(x >= 6 && x <= 20)
                System.out.println("Weird");
            else
                System.out.println("Not Weird");
        } 
        else
            System.out.println("Weird");
    }
}