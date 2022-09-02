/*
Given an integer, "n" , print its first "10" multiples. 
Each multiple "n x i" should be printed on a new line in the form: n x i = result.
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
    public static void prt(int n, int x){
        if(x == 11)
            return;
        System.out.println(n + " x " + x + " = " + (n*x));
        prt(n, x+1);   
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        prt(n, 1);
    }
}
