/*
A person is getting ready to leave and needs a pair of matching socks. 
If there are n colors of socks in the drawer, how many socks need to be removed to be certain of having a matching pair?

Example n = 2

There are 2 colors of socks in the drawer. If they remove 2 socks, they may not match. The minimum number to insure success is 3.

Function Description

Complete the maximumDraws function in the editor below.
maximumDraws has the following parameter:

*int n: the number of colors of socks

Returns

*int: the minimum number of socks to remove to guarantee a matching pair.

Sample Input

2
1
2

Sample Output

2
3

Explanation
Case 1 : Only 1 color of sock is in the drawer. Any 2 will match.
Case 2 : 2 colors of socks are in the drawer. The first two removed may not match. 
At least 3 socks need to be removed to guarantee success.
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

    /*
     * Complete the 'maximumDraws' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int maximumDraws(int n)
    {
        return n+1;
    }

}

class Solution
{
    public static void Main(string[] args)
    {
        TextWriter textWriter = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

        int t = Convert.ToInt32(Console.ReadLine().Trim());

        for (int tItr = 0; tItr < t; tItr++)
        {
            int n = Convert.ToInt32(Console.ReadLine().Trim());

            int result = Result.maximumDraws(n);

            textWriter.WriteLine(result);
        }

        textWriter.Flush();
        textWriter.Close();
    }
}

