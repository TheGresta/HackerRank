/*
Task
The AdvancedArithmetic interface and the method declaration for the abstract divisorSum(n) method are provided for you in the editor below.

Complete the implementation of Calculator class, which implements the AdvancedArithmetic interface. 
The implementation for the divisorSum(n) method must return the sum of all divisors of n.

Example

n=25
The divisors of 25 are 1,5,25. Their sum is 31.

n=20
The divisors of 20 are 1,2,4,5,10,20 and their sum is 42.

Sample Input

6

Sample Output

I implemented: AdvancedArithmetic
12
*/

using System;
public interface AdvancedArithmetic{
    int divisorSum(int n);
}

public class Calculator : AdvancedArithmetic
{
    public int divisorSum(int n)
    {
        int x = 1;
        int sum = 0;
        
        while(n >= x){
            if(n % x == 0)
                sum += x;
            x++;
        }
        
        return sum;
    }
}

class Solution{
    static void Main(string[] args){
        int n = Int32.Parse(Console.ReadLine());
      	AdvancedArithmetic myCalculator = new Calculator();
        int sum = myCalculator.divisorSum(n);
        Console.WriteLine("I implemented: AdvancedArithmetic\n" + sum); 
    }
}