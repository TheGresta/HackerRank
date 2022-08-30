/*
Input Format

There are 3 lines of numeric input:
The first line has a double, "meal cost" (the cost of the meal before tax and tip).
The second line has an integer, "tip percent" (the percentage of "meal cost" being added as tip).
The third line has an integer, "tax percent" (the percentage of "meal cost" being added as tax).

Sample Input

12.00
20
8

Sample Output

15
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double total_cost = 
        ((meal_cost * tip_percent) / 100) +
        ((meal_cost * tax_percent) / 100) +
        meal_cost;
        
        System.out.print(Math.round(total_cost));
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

        Result.solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();
    }
}
