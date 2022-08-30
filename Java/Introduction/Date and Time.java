/*
Input Format

A single line of input containing the space separated month, day and year, respectively, in  "MM-dd-YYY"  format.

Sample Input

08 05 2015

Sample Output

WEDNESDAY
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
    public static String findDay(int month, int day, int year) {
        String date = "";
         
        date += String.valueOf(day);
        date += "/";
        date += String.valueOf(month);
        date += "/";
        date += String.valueOf(year); 
        
        try{
            Date dateT = new SimpleDateFormat("dd/MM/yyyy").parse(date); 
            Format simpleformat = new SimpleDateFormat("EEEE");
            return simpleformat.format(dateT).toUpperCase();
        }catch(Exception e){}
        return date;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
