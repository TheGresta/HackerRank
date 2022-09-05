/*
Given an array, A , of N integers, print A's elements in reverse order as a single line of space-separated numbers.

Sample Input

4
1 4 3 2

Sample Output

2 3 4 1
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
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        bufferedReader.close();
        
        Collections.reverse(arr);
        
        for(int x : arr)
            System.out.print(x + " ");
    }
}

