/*
Function Description

Complete the isAnagram function in the editor.

isAnagram has the following parameters:

* string a: the first string
* string b: the second string

Returns

* boolean: If "a" and "b" are case-insensitive anagrams, return true. Otherwise, return false.

Input Format

The first line contains a string "a".
The second line contains a string "b".

Sample Input 0

anagram
margana

Sample Output 0

Anagrams

Sample Input 1

anagramm
marganaa

Sample Output 1

Not Anagrams
*/

public class Solution {
    public static void rtr(String a, String b){
        if(a.length() != b.length()){
            System.out.println("Not Anagrams");
            return;
        }
        
        char[] aList = a.toUpperCase().toCharArray();
        char[] bList = b.toUpperCase().toCharArray();
        
        Arrays.sort(aList);
        Arrays.sort(bList);
        
        for(int x=0;x<a.length();x++){
            try{
                if(Character.toUpperCase(aList[x]) !=
                Character.toUpperCase(bList[x])){
                    System.out.println("Not Anagrams");
                    return;
                }                  
            }catch(Exception e){
                System.out.println("Not Anagrams");
                return;
            }
        }
        System.out.println("Anagrams");
        return;
    }

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String a= scan.nextLine();
        String b= scan.nextLine();
        scan.close();
        rtr(a, b);
    }
}