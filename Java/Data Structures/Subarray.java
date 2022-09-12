/*
We define the following:

* A subarray of an n-element array is an array composed from a contiguous block of the original array's elements. 
For example, if array=[1,2,3], then the subarrays are [1], [2], [3], [1,2], [1,3], and [1,2,3]. 
Something like [1,3] would not be a subarray as it's not a contiguous subsection of the original array.

* The sum of an array is the total sum of its elements.
- An array's sum is negative if the total sum of its elements is negative.
- An array's sum is positive if the total sum of its elements is positive.

Given an array of n integers, find and print its number of negative subarrays on a new line.

Sample Input

5
1 -2 4 -5 1

Sample Output

9
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void convertList(int[] arr){
        int count = 0;
        int rtr = 0;
        int sz = arr.length;
        
        for(int i=0; i<sz; i++){
            for(int j=sz-1; j>=i; j--){
                for(int x=i; x<=j; x++){
                    count += arr[x];
                }
                if(count < 0)
                    rtr++;
                count = 0;
            }       
        }
        System.out.println(rtr);
    }
    

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int sz = read.nextInt();
        read.nextLine();        
        String[] s = read.nextLine().split(" ");
        int[] arr = new int[sz];
        read.close();        
        
        for(int i=0; i<sz; i++)
            arr[i] = Integer.parseInt(s[i]);
            
        convertList(arr);
    }
}

