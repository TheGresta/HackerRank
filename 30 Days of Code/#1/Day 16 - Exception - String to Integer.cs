/*
Output Format

Print the parsed integer value of S, or Bad String if S cannot be converted to an integer.

Sample Input 0

3

Sample Output 0

3

Sample Input 1

za

Sample Output 1

Bad String
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
        string S = Console.ReadLine();

        try
        {
            Console.WriteLine(int.Parse(S));
        }
        catch (Exception e)
        {
            Console.WriteLine("Bad String");
        }
    }
}
