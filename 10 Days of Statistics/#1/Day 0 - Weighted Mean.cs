/*
Task
Given an array, X, of N integers and an array, W, representing the respective weights of X's elements, 
calculate and print the weighted mean of X's elements. 
Your answer should be rounded to a scale of 1 decimal place (i.e., 12.3 format).

Example

X = [1,2,3]
W = [5,6,7]

The array of values X[i] * W[i] = [5,12,21]. Their sum is 38. The sum of W = 18. 
The weighted mean is 38/18 = 2.11111111... . Print 2.1 and return.

Sample Input

STDIN           Function
-----           --------
5               X[] and W[] size n = 5
10 40 30 50 20  X = [10, 40, 30, 50, 20]  
1 2 3 4 5       W = [1, 2, 3, 4, 5]

Sample Output

32.0
*/

using System.CodeDom.Compiler;
using System.Collections.Generic;
using System.Collections;
using System.ComponentModel;
using System.Diagnostics.CodeAnalysis;
using System.Globalization;
using System.IO;
using System.Linq;
using System.Reflection;
using System.Runtime.Serialization;
using System.Text.RegularExpressions;
using System.Text;
using System;

class Result
{
    public static void weightedMean(List<int> X, List<int> W)
    {
        double sumXW = 0;
        for (int i = 0; i < X.Count; i++)
        {
            sumXW += (X[i] * W[i]);
        }
        sumXW /= ((double)W.Sum());

        var result = String.Format("{0:0.0}", sumXW);

        Console.WriteLine(result);
    }

}

class Solution
{
    public static void Main(string[] args)
    {
        int n = Convert.ToInt32(Console.ReadLine().Trim());

        List<int> vals = Console.ReadLine().TrimEnd().Split(' ').ToList().Select(valsTemp => Convert.ToInt32(valsTemp)).ToList();

        List<int> weights = Console.ReadLine().TrimEnd().Split(' ').ToList().Select(weightsTemp => Convert.ToInt32(weightsTemp)).ToList();

        Result.weightedMean(vals, weights);
    }
}
