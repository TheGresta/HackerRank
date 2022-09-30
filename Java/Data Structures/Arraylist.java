/*
Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature. Try to solve this problem using Arraylist.

You are given n lines. In each line there are zero or more integers. 
You need to answer a few queries where you need to tell the number located in y^th position of x^th line.

Take your input from System.in.

Sample Input

5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5

Sample Output

74
52
37
ERROR!
ERROR!
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        List<List<Integer>> lines = new ArrayList<List<Integer>>();
        int n = read.nextInt();
        for (int i = 0; i < n; i++) {
            List<Integer> line = new ArrayList<Integer>();
            int d = read.nextInt();
            for (int j = 0; j < d; j++) {
                line.add(read.nextInt());
            }
            lines.add(line);
        }

        int q = read.nextInt();
        for (int i = 0; i < q; i++) {
            int x = read.nextInt();
            int y = read.nextInt();
            if (y > lines.get(x - 1).size()) {
                System.out.println("ERROR!");
            } else {
                System.out.println(lines.get(x - 1).get(y - 1));
            }
        }

        read.close();
    }
}

