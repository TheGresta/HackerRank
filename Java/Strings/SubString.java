/*
Input Format

The first line contains a single string denoting "s".
The second line contains two space-separated integers denoting the respective values of" start" and "end".

Output Format

Print the substring in the inclusive range from "start" to "end-1".

Sample Input

Helloworld
3 7

Sample Output

lowo
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String line = read.nextLine();
        int x1 = read.nextInt();
        int x2 = read.nextInt();
        read.close();
        
        System.out.println(line.substring(x1, x2));
    }
}
