/*
The first line contains an integer,n , denoting the number of entries in the phone book.
Each of the n subsequent lines describes an entry in the form of 2 space-separated values on a single line. 
The first value is a friend's name, and the second value is an 8-digit phone number.

After the n lines of phone book entries, there are an unknown number of lines of queries. 
Each line (query) contains a name to look up, and you must continue reading lines until there is no more input.

Sample Input

3
sam 99912222
tom 11122222
harry 12299933
sam
edward
harry

Sample Output

sam=99912222
Not found
harry=12299933
*/
import java.io.*;
import java.util.*;

public class Solution {
    public static HashMap createNums(List<String> nums){
        HashMap<String, String> book = new HashMap<String, String>();
        
        for(int i=0; i<nums.size(); i++){
            String[] row = nums.get(i).split(" ");
            if(row.length == 2)
                book.put(row[0], row[1]);
        }
        return book;
    }
    public static void checkNums(HashMap<String, String> book, List<String> names){
        for(String x : names){
            if(book.containsKey(x))
                System.out.println(x + "=" + book.get(x));
            else
                System.out.println("Not found");
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> book = new HashMap<String, String>();
        List<String> nums = new ArrayList<String>();
        List<String> names = new ArrayList<String>();
        Scanner read = new Scanner(System.in);
        int row = read.nextInt();
        read.nextLine();
        
        while(row > 0){
            nums.add(read.nextLine());
            row--;
        }
        while(read.hasNext())
            names.add(read.nextLine());
            
        read.close();
        
        book = createNums(nums);
        checkNums(book, names);
    }
}
