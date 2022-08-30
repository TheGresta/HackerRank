/*
Sample Input

12
4.0
is the best place to learn and practice coding!

Sample Output

16
8.0
HackerRank is the best place to learn and practice coding!
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int i = 4;
        String s = "HackerRank ";

        int i2=scan.nextInt();
        double d2=scan.nextDouble();
        scan.nextLine();
        String s2=scan.nextLine();

        System.out.println(i+i2);
        System.out.println(i+d2);
        System.out.println(s+s2);
    }
}
