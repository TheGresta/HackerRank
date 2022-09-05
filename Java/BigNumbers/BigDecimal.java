/*
Java's BigDecimal class can handle arbitrary-precision signed decimal numbers. Let's test your knowledge of them!
Given an array, s , n of  real number strings, sort them in descending order — but wait, there's more! 
Each number must be printed in the exact same format as it was read from stdin, meaning that .1 is printed as .1, and 0.1 is printed as 0.1. 
If two numbers represent numerically equivalent values, then they must be listed in the same order as they were received as input).
Complete the code in the unlocked section of the editor below. You must rearrange array s's elements according to the instructions above.

Sample Input

9
-100
50
0
56.6
90
0.12
.12
02.34
000.000

Sample Output

90
56.6
50
02.34
0.12
.12
0
000.000
-100
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void prt(List<String> lines){
        List<Double> values = new ArrayList<Double>();
        
        for(String s : lines){
            try{
                values.add(Double.parseDouble(s));
            }catch(Exception e){}
        }
        
        Collections.sort(values);
        Collections.reverse(values);
        
        for(int i=0; i<values.size(); i++){
            double curValue = values.get(i);
            for(int j=0; j<lines.size(); j++){
                try{
                    if(Double.parseDouble(lines.get(j)) == curValue){
                        System.out.println(lines.get(j));
                        lines.remove(lines.get(j));
                        break;
                    }                        
                }catch(Exception e){}
            }
        }
    }

    public static void main(String[] args) {
        List<String> line = new ArrayList<String>();
        Scanner read = new Scanner(System.in);
        int row = read.nextInt();
        read.nextLine();
        
        while(row > 0){
            String s = read.nextLine();
            line.add(s);
            row--;
        }
        read.close();
        
        prt(line);
    }
}


