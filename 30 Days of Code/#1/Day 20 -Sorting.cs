/*
Task
Given an array, a, of size n distinct elements, sort the array in ascending order 
using the Bubble Sort algorithm above. Once sorted, print the following 3 lines:

1-Array is sorted in numSwaps swaps.
where numSwaps is the number of swaps that took place.
2-First Element: firstElement
where firstElement is the first element in the sorted array.
3-Last Element: lastElement
where lastElement is the last element in the sorted array.

Example

a=[4,3,1,2]

original a: 4 3 1 2
round 1  a: 3 1 2 4 swaps this round: 3
round 2  a: 1 2 3 4 swaps this round: 2
round 3  a: 1 2 3 4 swaps this round: 0

Sample Input 1

3
3 2 1

Sample Output 1

Array is sorted in 3 swaps.
First Element: 1
Last Element: 3
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



class Solution
{
    public static void Main(string[] args)
    {
        int n = Convert.ToInt32(Console.ReadLine().Trim());

        List<int> a = Console.ReadLine().TrimEnd().Split(' ').ToList().Select(aTemp => Convert.ToInt32(aTemp)).ToList();
        
        // Track number of elements swapped during a single array traversal  
        int numberOfSwaps = 0;

        for (int i = 0; i < a.Count; i++) {
            for (int j = 0; j < a.Count - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    int x = a[j];
                    a[j] = a[j+1];
                    a[j+1] = x;
                    numberOfSwaps++;
                }
            }
            
            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }
        
        Console.WriteLine($"Array is sorted in {numberOfSwaps} swaps.");
        Console.WriteLine($"First Element: {a.First()}");
        Console.WriteLine($"Last Element: {a.Last()}");
    }
}
