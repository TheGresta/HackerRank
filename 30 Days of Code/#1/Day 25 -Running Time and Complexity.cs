/*
Sample Input

3
12
5
7

Sample Output

Not prime
Prime
Prime
*/

using System;
using System.Collections.Generic;
using System.IO;
class Solution {
    static bool isPrime(int n, int i)
    {
        if(n <= 2)
            return (n == 2) ? true : false;
        
        if(n % i == 0)
            return false;
        
        if(i * i > n)
            return  true;
        
        return isPrime(n, i + 1);
    }
    
    static void Main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution */
        List<int> lines = new();
        var row = Int32.Parse(Console.ReadLine());
        
        while(row > 0)
        {
            lines.Add(Int32.Parse(Console.ReadLine()));
            row--;
        }
        
        foreach(int value in lines)
        {
            if(isPrime(value, 2))
                Console.WriteLine("Prime");
            else
                Console.WriteLine("Not prime");
        }
    }
}	
