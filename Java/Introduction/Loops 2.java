/*
Input Format

The first line contains an integer, "q", denoting the number of queries.
Each line "i" of the "q" subsequent lines contains three space-separated integers describing the respective,
"ai", "bi" and "ni" values for that query.

Output Format

For each query, print the corresponding series on a new line. 
Each series must be printed in order as a single line of "n" space-separated integers.

Sample Input

2
0 2 10
5 3 5

Sample Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98

*/

import java.io.*;
import java.util.*;
import java.lang.Math;

public class Solution {
    public static void rtr(int a, int b, int n){
        int x = a;
        for(int k=0;k<n;k++){
            x += (int)(b * (Math.pow(2, k)));
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int row = read.nextInt();
        read.nextLine();
        
        while(row > 0){
            int a = read.nextInt();
            int b = read.nextInt();
            int n = read.nextInt();
            
            rtr(a, b, n);
            System.out.println();
            row--;
        }
        read.close();
    }
}
