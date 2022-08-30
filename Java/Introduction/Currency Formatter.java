/*
US: formattedPayment
India: formattedPayment
China: formattedPayment
France: formattedPayment

Output Format

On the first line, print US: u where "u" is "payment" formatted for US currency.
On the second line, print India: i where "i" is "payment" formatted for Indian currency.
On the third line, print China: c where "c" is "payment" formatted for Chinese currency.
On the fourth line, print France: f, where "f" is "payment" formatted for French currency.

Sample Input

12324.134

Sample Output

US: $12,324.13
India: Rs.12,324.13
China: ￥12,324.13
France: 12 324,13 €
*/

import java.io.*;
import java.util.*;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double number = sc.nextDouble();
        DecimalFormat IndianCurrencyFormat = new DecimalFormat("##,##,###.00");
        
        String formattedStr = NumberFormat.getCurrencyInstance(Locale.US).format(number);

        System.out.println("US: " + formattedStr);
        System.out.println("India: Rs." + IndianCurrencyFormat.format(number));
        formattedStr = NumberFormat.getCurrencyInstance(Locale.CHINA).format(number);
        System.out.println("China: " + formattedStr);
        formattedStr = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(number);
        System.out.println("France: " + formattedStr);     
    }
}
