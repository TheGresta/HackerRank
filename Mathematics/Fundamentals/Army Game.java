/*
Example

n=2
m=3

Packages can be dropped at the corner between cells (0, 0), (0, 1), (1, 0) and (1, 1) to supply 4 bases. 
Another package can be dropped at a border between (0, 2) and (1, 2). This supplies all bases using 2 packages.

Sample Input 0

2 2

Sample Output 0

1
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
    public static int gameWithCells(int n, int m) {
        return ((int) Math.ceil(n / 2.0) * (int) Math.ceil(m / 2.0));
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        int result = Result.gameWithCells(n, m);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
