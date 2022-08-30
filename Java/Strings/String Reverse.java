/*
Given a string "A", print Yes if it is a palindrome, print No otherwise.

Sample Input

madam

Sample Output

Yes
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void rtr(String s){
        int x = 0;
        int y = s.length()-1;
        
        while(x < y){
            if(s.charAt(x) != s.charAt(y)){
                System.out.println("No");
                return;
            }                
            x++;
            y--;
        }
        System.out.println("Yes");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        
        rtr(s);
    }
}