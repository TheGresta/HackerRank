/*
n = 125
The binary representation of 125(10) is 1111101(2). In base 10, there are 5 and 1 consecutive ones in two groups. Print the maximum, 5.

Sample Input 1

5

Sample Output 1

1

Sample Input 2

13

Sample Output 2

2
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
    public static void prt(int num){
        String bin = Integer.toBinaryString(num);
        int max=0, count=0;
        
        for(int i=0; i<bin.length(); i++){
            if(bin.charAt(i) == '1'){
                count++;
                max = (count > max) ? count : max;
            }else
                count = 0;
        }
    
        System.out.println(max);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        
        prt(n);
    }
}


