/*
Task
Given an array, X, of N integers, calculate and print the respective mean, median, and mode on separate lines. 
If your array contains more than one modal value, choose the numerically smallest one.

Example

N = 6
X = [1,2,3,4,5,5]
The mean is 20/6 = 3.3.
The median is (3+4) / 2 = 3.5.
The mode is 5 because 5 occurs most frequently.

Sample Input

10
64630 11735 14216 99233 14470 4978 73429 38120 51135 67060

Sample Output

43900.6
44627.5
4978
*/

using System;
using System.Collections.Generic;
using System.Linq;
using System.IO;

class Statistics{
    protected int n;
    protected int[] x = {};
    
    public Statistics(int size, int[] arr){
        n = size;
        x = arr;        
    }
    
    public void display(){
        Array.Sort(x);
        this.displayMean();
        this.displayMedian();
        this.displayMode();
    }
    
    protected void displayMean(){
        double sum = (double)x.Sum() / n;
        Console.WriteLine(sum);
    }
    
    protected void displayMedian(){
        if(n % 2 != 0)
            Console.WriteLine((double)x[n/2]);
        else
            Console.WriteLine((double)(x[(n - 1) / 2] + x[n / 2]) / 2.0);
    }
    
    protected void displayMode(){
        int countMax = 0;
        int count = 0;
        int at = 0;
        for(int i=0; i<n-1; i++){
            count = 0;
            for(int j=i+1; j<n; j++){
                if(x[i] != x[j]){
                    break;
                }                    
                else{
                    count++;
                    if(count > countMax){
                        countMax = count;
                        at = j;
                    }                        
                }                
            }                        
        }
        Console.WriteLine((double)x[at]);
    }
}
class Solution {
    static void Main(String[] args) {
        var N = Convert.ToInt32(Console.ReadLine());
        
        int[] X = Console.ReadLine().Split(' ').Select(p => Convert.ToInt32(p)).ToArray();
        Statistics cs = new Statistics(N, X);
        cs.display();
    }
}
