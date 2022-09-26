/*
Task
Consider a database table, Emails, which has the attributes First Name and Email ID. 
Given N rows of data simulating the Emails table, print an alphabetically-ordered list of people whose email address ends in @gmail.com.

Sample Input

6
riya riya@gmail.com
julia julia@julia.me
julia sjulia@gmail.com
julia julia@gmail.com
samantha samantha@gmail.com
tanya tanya@gmail.com

Sample Output

julia
julia
riya
samantha
tanya
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
        var names = new List<string>();
        int N = Convert.ToInt32(Console.ReadLine().Trim());

        for (int NItr = 0; NItr < N; NItr++)
        {
            string[] firstMultipleInput = Console.ReadLine().TrimEnd().Split(' ');

            string firstName = firstMultipleInput[0];

            string emailID = firstMultipleInput[1];
            
            if(emailID.EndsWith("@gmail.com"))
                names.Add(firstName);
        }
        
        names.Sort();
        
        foreach(string name in names)
            Console.WriteLine(name);
    }
}
