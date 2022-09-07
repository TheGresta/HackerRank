/*
The first line contains an integer, n, denoting the number of sets of points.
Each of the n subsequent lines contains four space-separated integers that 
describe the respective values of px, py, qx, and qy defining points p = (px,py) and q = (qx,qy).

Sample Input

2
0 0 1 1
1 1 2 2

Sample Output

2 2
3 3
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
    public static List<Integer> findPoint(int px, int py, int qx, int qy) {
        List<Integer> result = new ArrayList<Integer>();
        result.add(qx + (qx - px));
        result.add(qy + (qy - py));
        return result;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, n).forEach(nItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int px = Integer.parseInt(firstMultipleInput[0]);

                int py = Integer.parseInt(firstMultipleInput[1]);

                int qx = Integer.parseInt(firstMultipleInput[2]);

                int qy = Integer.parseInt(firstMultipleInput[3]);

                List<Integer> result = Result.findPoint(px, py, qx, qy);

                bufferedWriter.write(
                    result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                    + "\n"
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}

