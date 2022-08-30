/*
Sample Input

Welcome to 30 Days of Code!

Sample Output

Hello, World. 
Welcome to 30 Days of Code!
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Hello, World.");
        System.out.println(read.nextLine());        
        read.close();
    }
}