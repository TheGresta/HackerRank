/*
You are updating the username policy on your company's internal networking platform. 
According to the policy, a username is considered valid if all the following constraints are satisfied:

*The username consists of 8 to 30 characters inclusive. If the username consists of less than 8 or greater than 30 characters, then it is an invalid username.
*The username can only contain alphanumeric characters and underscores (_). Alphanumeric characters describe the character set consisting of lowercase characters [a-z], uppercase characters [A-Z], and digits [0-9].
*The first character of the username must be an alphabetic character, i.e., either lowercase [a-z] character  or uppercase character [A-Z].

Input Format

The first line of input contains an integer "n", describing the total number of usernames. 
Each of the next "n" lines contains a string describing the username. The locked stub code reads the inputs and validates the username.

Output Format

For each of the usernames, the locked stub code prints Valid if the username is valid; otherwise Invalid each on a new line.

Sample Input 0

8
Julia
Samantha
Samantha_21
1Samantha
Samantha?10_2A
JuliaZ007
Julia@007
_Julia007

Sample Output 0

Invalid
Valid
Valid
Invalid
Invalid
Valid
Invalid
Invalid

*/

import java.io.*;
import java.util.*;

public class Solution {
    static void rtr(String s){        
        if(s.matches("^[a-zA-Z][a-zA-Z0-9_]{7,29}$")){
            System.out.println("Valid");
            return;
        }
        System.out.println("Invalid");
        return;
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int row = read.nextInt();
        read.nextLine();
        
        while(row > 0){
            String line = read.nextLine();
            rtr(line);
            row--;
        }
        
        read.close();
    }
}
