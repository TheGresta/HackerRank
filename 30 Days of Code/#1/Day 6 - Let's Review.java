/*
Sample Input

2
Hacker
Rank

Sample Output

Hce akr
Rn ak
*/
import java.io.*;
import java.util.*;

public class Solution {
    public static void rtr(String s){
        String s1 = "", s2 = "";
        
        for(int i=0; i<s.length(); i++){
            String at = String.valueOf(s.charAt(i));
            if(at != "" && at != " "){
                if(i % 2 == 0)
                    s1 += at;
                else
                    s2 += at;
            }    
        }
        
        System.out.println(s1 + " " + s2);
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int row = read.nextInt();
        read.nextLine();
        
        while(row > 0){
            rtr(read.nextLine());
            row--;
        }
        read.close();
    }
}
