/*
Sample Input

STDIN   Function
-----   --------
3       __elements[] size N = 3
1 2 5   __elements = [1, 2, 5]

Sample Output

4

The scope of the _elements array and maximumdifference integer is the entire class instance. 
The class constructor saves the argument passed to the constructor as the _elements instance variable (where the computeDifference method can access it).

To find the maximum difference, computeDifference checks each element in the array and finds the maximum difference between any 2 elements |1-2| = 1: 

|1-5| = 4
|2-5| = 3

The maximum of these differences is 4, so it saves the value 4 as the maximumDifference instance variable. 
The locked stub code in the editor then prints the value stored as maximumDifference, which is 4.
*/

using System;
using System.Linq;

class Difference
{
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements)
    {
        this.elements = elements;
    }

    public int computeDifference()
    {
        int maxElement = elements[0];
        int minElement = elements[0];

        for (int i = 0; i < elements.Length; i++)
        {
            if (elements[i] < minElement)
            {
                minElement = elements[i];

            }
            if (elements[i] > maxElement)
            {
                maxElement = elements[i];
            }
        }
        maximumDifference = Math.Abs(maxElement - minElement);
        return maximumDifference;
    }

} // End of Difference Class

class Solution
{
    static void Main(string[] args)
    {
        Convert.ToInt32(Console.ReadLine());

        int[] a = Console.ReadLine().Split(' ').Select(x => Convert.ToInt32(x)).ToArray();

        Difference d = new Difference(a);

        d.computeDifference();

        Console.Write(d.maximumDifference);
    }
}